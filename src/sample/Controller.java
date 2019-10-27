package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;

public class Controller {

    @FXML
    private ListView<HBox> MenuList;

    @FXML
    public void initialize(){

       MenuList.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<HBox>() {
           @Override
           public void changed(ObservableValue<? extends HBox> observableValue, HBox hBox, HBox newItem) {
               Label obj = (Label) newItem.getChildren().get(1);
               String str = obj.getText();
           }
       });



    }

}
