package MainWindow;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Controller {

    public static Label connectionCheck = new Label();

    @FXML
    private ImageView minimize;

    @FXML
    private ListView<HBox> MenuList;

    @FXML
    public void initialize(){

        new ConnectionCheck().start();

        connectionCheck.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String old, String newItem) {
                if(newItem.equals("connected"))
                {
                    System.out.println("Wifi Connected!");
                }
                else
                {
                    System.out.println("Wifi Disconnected!");
                }
            }
        });

       MenuList.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<HBox>() {
           @Override
           public void changed(ObservableValue<? extends HBox> observableValue, HBox hBox, HBox newItem) {
               Label obj = (Label) newItem.getChildren().get(1);
               String str = obj.getText();
               System.out.println(str);
           }
       });

    }
    @FXML
    public void minimize()
    {
       Stage stage = (Stage) minimize.getScene().getWindow();
       stage.setIconified(true);
    }

    @FXML
    public void close()
    {
        Stage stage = (Stage) minimize.getScene().getWindow();
        stage.close();
    }

}
