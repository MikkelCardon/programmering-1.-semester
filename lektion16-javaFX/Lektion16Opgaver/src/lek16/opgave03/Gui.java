package lek16.opgave03;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
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

        private final TextField indskud = new TextField();
        private final TextField rente = new TextField();
        private final TextField renteTilskrivning = new TextField();

    private double resultat = 0;
        private Label lblResultat = new Label(String.valueOf(resultat));



    private void initContent(GridPane pane){
        pane.setGridLinesVisible(false);

        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);
        /*  #################################################################### */

       Label lblIndskud = new Label("Indskud");
       pane.add(lblIndskud, 0,0);

       Label lblRente = new Label("Rente");
       pane.add(lblRente, 0,1);

       Label lblTilskrivninger = new Label("Antal rentetilskrivninger");
       pane.add(lblTilskrivninger, 0,2);


        pane.add(indskud, 1, 0);
        pane.add(rente, 1, 1);
        pane.add(renteTilskrivning, 1, 2);

        Button beregn = new Button("Beregn");
        pane.add(beregn, 1, 3);

        Label lblBeregning = new Label("Fremtidig værdi");
        pane.add(lblBeregning, 0,4);


        pane.add(lblResultat, 1,4);

        beregn.setOnAction(event -> beregnVærdi());
    }
        private void beregnVærdi(){
        double intRente = Integer.parseInt(rente.getText());
        double intTilskrivning = Integer.parseInt(renteTilskrivning.getText());
        double intIndskud = Integer.parseInt(indskud.getText());

        resultat = intIndskud * Math.pow(1+(intRente/100), intTilskrivning);
        lblResultat.setText(String.valueOf(resultat));
        }

}
