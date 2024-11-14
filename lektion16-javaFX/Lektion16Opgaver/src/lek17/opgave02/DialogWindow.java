package lek17.opgave02;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class DialogWindow extends Stage {

    private Person actualPerson = null;

    public DialogWindow(String title, Stage owner) {
        this.initOwner(owner);
        this.initStyle(StageStyle.UTILITY);
        this.initModality(Modality.APPLICATION_MODAL);
        this.setMinHeight(100);
        this.setMinWidth(200);
        this.setResizable(false);
        this.setTitle(title);
        GridPane pane = new GridPane();
        this.initContent(pane);
        Scene scene = new Scene(pane);
        this.setScene(scene);
    }

    private final TextField textFieldName = new TextField("");
    private final TextField textFieldTitle = new TextField("");

    CheckBox checkBoxSenior = new CheckBox("Senior");

    private void initContent(GridPane pane){

        pane.setGridLinesVisible(false);

        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

        Label lblname1 = new Label("navn");
        pane.add(lblname1,0,0);

        Label lblname2 = new Label("Stilling:");
        pane.add(lblname2,0,1);

        pane.add(textFieldName, 1, 0);
        pane.add(textFieldTitle, 1, 1);
        pane.add(checkBoxSenior, 0, 2);

        Button addName = new Button("Add");
        pane.add(addName, 2, 0);

        addName.setOnAction(event -> addName());
    }

    private void addName() {
        String name = textFieldName.getText().trim();
        String title = textFieldTitle.getText().trim();
        boolean bool = checkBoxSenior.isSelected();

        if (!name.isEmpty() && !title.isEmpty()) {
            actualPerson = new Person(name, title, bool);
            textFieldName.clear();
            textFieldTitle.clear();
            textFieldName.requestFocus();
            DialogWindow.this.hide();
        }
        else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Add person");
            alert.setHeaderText("Something wasnt correctly typed in");
            alert.setContentText("Try again");
            alert.show();
        }
    }

    public Person getActualPerson() {
        return actualPerson;
    }

    public void clearActualPerson(){
        actualPerson = null;
    }
}
