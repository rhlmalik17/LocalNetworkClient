package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class Controller {

    @FXML
    private ListView<Button> MenuList;

    @FXML
    public void initialize(){

//        MenuList.setCellFactory(new Callback<ListView<HBox>, ListCell<HBox>>() {
//            @Override
//            public ListCell<HBox> call(ListView<HBox> hBoxListView) {
//                ListCell<HBox> cell = new ListCell<HBox>(){
//                    @Override
//                    public void updateItem(HBox item,boolean empty)
//                    {
//                        super.updateItem(item,empty);
//                        if(empty)
//                        {
//                            setText(null);
//                        }else {
//                            item.getChildren().get(0).setStyle("-fx-text-fill: white");
//                        }
//                    }
//                };
//                return cell;
//            }
//        });


    }

}
