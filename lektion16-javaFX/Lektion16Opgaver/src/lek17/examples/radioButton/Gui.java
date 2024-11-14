package lek17.examples.radioButton;

import javafx.scene.paint.Color;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


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

    private final Label lblText = new Label("Radiobutton example");
    private final ToggleGroup group = new ToggleGroup();

    private void initContent(GridPane pane) {
        pane.setGridLinesVisible(false);

        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

        HBox box = new HBox();
        pane.add(box, 0, 0);

        String[] colorStrings = {"Red", "Blue", "Green", "Black"};
        Color[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.BLACK};

        for (int i = 0; i < colors.length; i++) {
            RadioButton rb = new RadioButton();
            box.getChildren().add(rb);
            rb.setText(colorStrings[i]);

            rb.setUserData(colors[i]);
            rb.setToggleGroup(group);
            rb.setOnAction(event -> this.setLabelColor());
        }

        pane.add(lblText, 0, 1);
        GridPane.setHalignment(lblText, HPos.CENTER);

        RadioButton rb0 = (RadioButton) group.getToggles().get(0);
        rb0.setSelected(true);
        lblText.setTextFill(colors[0]);
    }

    private void setLabelColor() {
        RadioButton rb = (RadioButton) group.getSelectedToggle();
        Color color = (Color) rb.getUserData();
        lblText.setTextFill(color);
    }
}
