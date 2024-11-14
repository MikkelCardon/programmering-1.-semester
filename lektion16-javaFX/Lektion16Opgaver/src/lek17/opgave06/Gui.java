package lek17.opgave06;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;


public class Gui extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("GUI TEST");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    private void initContent(GridPane pane) {
        initPeople();
        pane.setGridLinesVisible(false);

        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);


        Slider red = new Slider(0, 255, 0);
        Slider green = new Slider(0, 255, 0);
        Slider blue = new Slider(0, 255, 0);

        pane.add(red,0,0);
        pane.add(green,0,1);
        pane.add(blue,0,2);


        red.valueProperty().addListener(event -> this.sliderValueChanged(pane, red, green, blue));
        green.valueProperty().addListener(event -> this.sliderValueChanged(pane, red, green, blue));
        blue.valueProperty().addListener(event -> this.sliderValueChanged(pane, red, green, blue));

//        ChangeListener<String> listener = (ov, oldString, newString) -> this.selectionChanged();
//        persons.getSelectionModel().selectedItemProperty().addListener(listener);



    }

    private void sliderValueChanged(GridPane pane, Slider red, Slider green, Slider blue) {
        String color = "#"+String.format("%02X",(int)red.getValue())+String.format("%02X",(int)green.getValue())+String.format("%02X",(int)blue.getValue());
        pane.setStyle("-fx-background: " + color);
    }


    private void addName() {

    }



//    private void selectionChanged(){
//        RadioButton rb = (RadioButton) group.getSelectedToggle();
//
//        ArrayList list = (ArrayList) rb.getUserData();
//        persons.getItems().setAll(list);
//    }

    private void initPeople(){
    }

//    private void selectArrayList(){
//        RadioButton rb = (RadioButton) group.getSelectedToggle();
//        ArrayList list = (ArrayList) rb.getUserData();
//        persons.getItems().setAll(list);
//    }
    
}
