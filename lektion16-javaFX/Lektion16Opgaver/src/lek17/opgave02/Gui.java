package lek17.opgave02;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



public class Gui extends Application {

    private DialogWindow dialogWindow;

    @Override
    public void start(Stage stage) {
        stage.setTitle("GUI TEST");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();

        dialogWindow = new DialogWindow("Create a person", stage);
    }


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

        Label lblname1 = new Label("Persons:");
        pane.add(lblname1,0,0);

        pane.add(personListView, 1, 3);

        Button addName = new Button("Add");
        pane.add(addName, 3, 1);

        addName.setOnAction(event -> addEvent());



        ChangeListener<Person> listener = (ov, oldPerson, newPerson) -> this.selectionChanged(newPerson);
        personListView.getSelectionModel().selectedItemProperty().addListener(listener);
    }


    private void addEvent() {
        dialogWindow.showAndWait();

        if (dialogWindow.getActualPerson() != null) {
            Person person = dialogWindow.getActualPerson();
            persons.add(dialogWindow.getActualPerson());
        }
    }



    private void selectionChanged(Person newPerson){

    }

    private void initPeople(){
        persons.add(new Person("Jens", "Jensen", false));
        persons.add(new Person("Hans", "Hansen", true));
        persons.add(new Person("Pia", "Peters", false));
    }

    public ListView<Person> getPersonListView() {
        return personListView;
    }

    public ObservableList<Person> getPersons() {
        return persons;
    }

}
