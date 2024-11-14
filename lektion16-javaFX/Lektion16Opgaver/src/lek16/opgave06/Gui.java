package lek16.opgave06;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
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


        pane.add(carsList,0,0);

        Button tilføjBil = new Button("Tilføj bil");
        pane.add(tilføjBil, 0,2);



        tilføjBil.setOnAction(event -> opretBilVindue());


    }



    /* NEW WINDOV */

    private ListView<Car> carsList = new ListView<Car>();

    private final TextField txtModel = new TextField();
    private final TextField txtPrisPrDag = new TextField();
    private final CheckBox checkbox = new CheckBox();

    private final String mærker[] = {"BMW", "AUDI", "TESLA", "Mercedes"};
    private final ComboBox cbMærke = new ComboBox(FXCollections.observableArrayList(mærker));



    private void opretBilVindue(){
        Stage stage = new Stage();

        stage.setTitle("Opret bil");
        GridPane pane = new GridPane();
        //this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();

        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);





        Label lblMærke = new Label("Mærke");
        pane.add(lblMærke, 0,0);

        pane.add(cbMærke,1, 0);

        Label lblModel = new Label("Model");
        pane.add(lblModel, 0,1);
        pane.add(txtModel, 1, 1);

        Label lblElektrisk = new Label("Elektrisk");
        pane.add(lblElektrisk, 0,2);


        pane.add(checkbox, 1, 2);

        Label lblPrisPrDag = new Label("Pris per dag");
        pane.add(lblPrisPrDag, 0,3);
        pane.add(txtPrisPrDag, 1, 3);

        Button opret = new Button("Opret");
        pane.add(opret, 1, 4);

        opret.setOnAction(event -> {
                    opretBil();
                    ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
        });




    }

    private void opretBil(){
        Car car = new Car(cbMærke.getValue().toString(), txtModel.getText(), checkbox.isSelected(), Integer.parseInt(txtPrisPrDag.getText()));
        carsList.getItems().add(car);
    }

}
