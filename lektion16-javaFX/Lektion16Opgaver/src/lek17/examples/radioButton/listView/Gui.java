//package lek17.Test.test.listView;
//
//import javafx.application.Application;
//import javafx.beans.value.ChangeListener;
//import javafx.geometry.HPos;
//import javafx.geometry.Insets;
//import javafx.scene.Scene;
//import javafx.scene.control.*;
//import javafx.scene.layout.GridPane;
//import javafx.scene.layout.HBox;
//import javafx.scene.paint.Color;
//import javafx.stage.Stage;
//import org.w3c.dom.Text;
//
//import java.util.ArrayList;
//
//
//public class Gui extends Application {
//    @Override
//    public void start(Stage stage) {
//        stage.setTitle("GUI TEST");
//        GridPane pane = new GridPane();
//        this.initContent(pane);
//
//        Scene scene = new Scene(pane);
//        stage.setScene(scene);
//        stage.show();
//    }
//
//    private final TextField tfInput = new TextField("Enter name");
//    private final ArrayList<Person> persons = new ArrayList<>();
//
//
//    private final ListView<Person> lwNames = new ListView<>(persons);
//
//
//
//    private void initContent(GridPane pane) {
//        pane.setGridLinesVisible(false);
//
//        pane.setPadding(new Insets(20));
//        // set horizontal gap between components
//        pane.setHgap(10);
//        // set vertical gap between components
//        pane.setVgap(10);
//
//        Label lblname1 = new Label("Name:");
//        pane.add(lblname1,0,0);
//
//        pane.add(tfInput, 1, 0);
//
//        Label lblname2 = new Label("Name:");
//        pane.add(lblname2,0,0);
//        pane.add(lwNames, 1, 1);
//
//        Button addName = new Button("Add");
//        pane.add(addName, 3, 1);
//
//        addName.setOnAction(event -> addAndSetName());
//
//        Button removeName = new Button("Remove");
//        pane.add(removeName, 1, 2);
//        removeName.setOnAction(event -> removeName());
//
//        persons.add(new Person("Jens", "Jensen", "jj@eaaa.dk"));
//        persons.add(new Person("Hans", "Hansen", "hh@eaaa.dk"));
//        persons.add(new Person("Pia", "Peters", "pp@eaaa.dk"));
//
//
//
//        ChangeListener<Person> listener =
//                (ov, oldPerson, newPerson) -> this.selectionChanged();
//        lwNames.getSelectionModel().selectedItemProperty()
//                .addListener(listener);
//    }
//
//    private void addAndSetName() {
//        persons.add(tfInput.getText());
//        lwNames.getItems().setAll(persons);
//    }
//
//    private void selectionChanged(){
//        String selected = lwNames.getSelectionModel().getSelectedItem();
//        if (selected != null){
//            tfInput.setText(selected);
//        }
//        else {
//            tfInput.clear();
//        }
//    }
//
//    private void removeName(){
//        int index = lwNames.getSelectionModel().getSelectedIndex();
//        names.remove(index);
//        lwNames.getItems().setAll(names);
//    }
//}