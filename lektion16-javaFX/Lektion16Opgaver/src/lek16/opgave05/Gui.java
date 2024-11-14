package lek16.opgave05;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Gui extends Application{
    @Override
    public void start(Stage stage){
        stage.setTitle("GUI TEST");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }
    private final TextField nameInput = new TextField();
    private final TextArea textArea = new TextArea();
    ArrayList<String> names = new ArrayList<>();


    private void initContent(GridPane pane){
        pane.setGridLinesVisible(false);

        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);
        /*  #################################################################### */


        Label lblName = new Label("Name:");
        pane.add(lblName,0,0);

        pane.add(nameInput, 0, 1, 3, 1);

        Button addName = new Button("Add name");
        pane.add(addName, 0, 3);


        pane.add(textArea, 0, 4);
        textArea.setEditable(false);

        addName.setOnAction(event -> addName());
    }

    private void addName(){
        names.add(nameInput.getText());
        textArea.setText(printNames());
    }

    private String printNames(){
        StringBuilder sb = new StringBuilder();
        for (String name : names) {
            sb.append(name + "\n");
        }
        return sb.toString();
    }

//    public String toString(){
//        String names = "";
//
//
//    }
}
