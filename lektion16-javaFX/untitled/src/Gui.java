import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.Locale;

public class Gui extends Application {

    @Override
    public void start(Stage stage){
        stage.setTitle("GUI TEST");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    private final TextField txfName = new TextField();
    private final TextArea txaDescription = new TextArea();

    private void initContent(GridPane pane){
        pane.setGridLinesVisible(false);

        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

        Label lblName = new Label("Name: ");
        pane.add(lblName, 0, 0);

        pane.add(txfName, 1, 0, 2, 1);

        //BUTTONS
        Button btnUppercase = new Button("Upper Case");
        pane.add(btnUppercase, 1, 1);
        GridPane.setMargin(btnUppercase, new Insets(10, 10, 0, 10));

        btnUppercase.setOnAction(event -> this.upperCaseAction());

        Button btnLowerCase = new Button("Lower Case");
        pane.add(btnLowerCase, 2, 1);
        GridPane.setMargin(btnLowerCase, new Insets(10, 10, 0, 10));

        btnLowerCase.setOnAction(event -> this.lowerCaseAction());

        CheckBox checkBox = new CheckBox("Upper case");
        //checkBox.setText("Upper case");
        pane.add(checkBox, 0, 1);

        checkBox.setOnAction(event -> {
            if (checkBox.isSelected()) {
                upperCaseAction();
            } else {
                lowerCaseAction();
            }
        });
    }







    private void upperCaseAction(){
        String name = txfName.getText().trim();
        txfName.setText(name.toUpperCase());
    }

    private void lowerCaseAction(){
        String name = txfName.getText().trim();
        txfName.setText(name.toLowerCase());
    }
}
