package lek17.opgave04;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
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


    private final ArrayList<String> boys = new ArrayList<>();
    private final ArrayList<String> girl = new ArrayList<>();

    private final ListView<String> persons = new ListView<>();



    private final TextField textFieldName = new TextField();
    private final ToggleGroup group = new ToggleGroup();

    private void initContent(GridPane pane) {
        initPeople();
        pane.setGridLinesVisible(false);

        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

        Label lblname1 = new Label("Persons:");
        pane.add(lblname1,0,1);

        pane.add(persons, 1, 4);

        Button addName = new Button("Add");
        pane.add(addName, 3, 1);

        addName.setOnAction(event -> addName());

        pane.add(textFieldName, 0, 2);

        ChangeListener<String> listener = (ov, oldString, newString) -> this.selectionChanged();
        persons.getSelectionModel().selectedItemProperty().addListener(listener);

        HBox radioBox = new HBox();
        pane.add(radioBox, 0, 0);

        ArrayList[] gender = {boys, girl};
        String[] genderText = {"Boys", "girls"};


        for (int i = 0; i < gender.length; i++) {
            RadioButton rb = new RadioButton();
            radioBox.getChildren().add(rb);
            rb.setText(genderText[i]);
            rb.setToggleGroup(group);
            rb.setUserData(gender[i]);
            rb.setOnAction(event -> selectArrayList() );
        }
    }


    private void addName() {
        String name = textFieldName.getText().trim();
        RadioButton rb = (RadioButton) group.getSelectedToggle();

        ArrayList list = (ArrayList) rb.getUserData();
        list.add(name);
        persons.getItems().setAll(list);
    }



    private void selectionChanged(){
        RadioButton rb = (RadioButton) group.getSelectedToggle();

        ArrayList list = (ArrayList) rb.getUserData();
        persons.getItems().setAll(list);
    }

    private void initPeople(){
        boys.add("Mikkel");
        boys.add("Adam");

        girl.add("Sofie");
        girl.add("Mikkeline");
    }

    private void selectArrayList(){
        RadioButton rb = (RadioButton) group.getSelectedToggle();
        ArrayList list = (ArrayList) rb.getUserData();
        persons.getItems().setAll(list);
    }

}
