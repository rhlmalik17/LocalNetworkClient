package MainWindow;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConnectionCheck extends Thread{


    @Override
    public void run()
    {
        try{
            while(true) {
                Process p = Runtime.getRuntime().exec("nmcli general status");
                BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
                reader.readLine();
                String line[] = reader.readLine().split(" ");
                String temp = line[0].trim();
                if(temp.equals("connected"))
                {
                    Controller.connectionCheck.setText("connected");
                }
                else {
                    Controller.connectionCheck.setText("disconnected");
                }
//                System.out.println(line[14]);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }



}
