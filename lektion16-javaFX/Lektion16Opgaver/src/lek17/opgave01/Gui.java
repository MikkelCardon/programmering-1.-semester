package lek17.opgave01;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
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

    private final TextField textFieldName = new TextField("");
    private final TextField textFieldTitle = new TextField("");

    CheckBox checkBoxSenior = new CheckBox("Senior");



    private final ListView<Person> personListView = new ListView<>();
    private final ObservableList<Person> persons = personListView.getItems();




    private void initContent(GridPane pane) {
        initPeople();
        pane.setGridLinesVisible(false);

        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

        Label lblname1 = new Label("Navn:");
        pane.add(lblname1,0,0);

        Label lblname2 = new Label("Stilling:");
        pane.add(lblname2,0,1);

        pane.add(textFieldName, 1, 0);
        pane.add(textFieldTitle, 1, 1);
        pane.add(checkBoxSenior, 0, 2);


        pane.add(personListView, 1, 3);

        Button addName = new Button("Add");
        pane.add(addName, 3, 1);

        addName.setOnAction(event -> addName());



        ChangeListener<Person> listener =
                (ov, oldPerson, newPerson) -> this.selectionChanged(newPerson);
        personListView.getSelectionModel().selectedItemProperty()
                .addListener(listener);
    }

    private void addName() {
        String name = textFieldName.getText().trim();
        String title = textFieldTitle.getText().trim();
        boolean bool = checkBoxSenior.isSelected();

        if (!name.isEmpty() && !title.isEmpty()) {
            Person p = new Person(name, title, bool);
            persons.add(p);
        }
        else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Add person");
            alert.setHeaderText("Something wasnt correctly typed in");
            alert.setContentText("Try again");
            alert.show();
        }
    }

    private void selectionChanged(Person newPerson){

    }

    private void initPeople(){
        persons.add(new Person("Jens", "Jensen", false));
        persons.add(new Person("Hans", "Hansen", true));
        persons.add(new Person("Pia", "Peters", false));
    }
}