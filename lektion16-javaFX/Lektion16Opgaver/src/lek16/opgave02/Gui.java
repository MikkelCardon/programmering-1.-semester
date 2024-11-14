package lek16.opgave02;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

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


    private int number = 0;
    private Label lblSum = new Label(String.valueOf(number));

    private void initContent(GridPane pane){
        pane.setGridLinesVisible(false);

        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

        Label lblNumber = new Label("Number ");
        pane.add(lblNumber, 0, 1);


        pane.add(lblSum, 1, 1);

        Button buttonPlus = new Button("+1");
        pane.add(buttonPlus, 3, 0);

        Button buttonMinus = new Button("-1");
        pane.add(buttonMinus, 3, 2);

        buttonPlus.setOnAction(event -> plusOne());

        buttonMinus.setOnAction(event -> minusOne());
    }

    private void plusOne(){
        number++;
        lblSum.setText(String.valueOf(number));
    }

    private void minusOne(){
        number--;
        lblSum.setText(String.valueOf(number));
    }
}
