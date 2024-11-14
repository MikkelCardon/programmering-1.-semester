package lek16.opgave01;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
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

    private final TextField txtfFornavn = new TextField();
    private final TextField txtfEfternavn = new TextField();
    private final TextField txtfFuldeNavn = new TextField();

    private void initContent(GridPane pane){
        pane.setGridLinesVisible(false);

        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

        Label fornavn = new Label("Fornavn");
        pane.add(fornavn, 0, 0);

        Label efternavn = new Label("Efternavn");
        pane.add(efternavn, 1, 0);


        pane.add(txtfFornavn, 0, 1);


        pane.add(txtfEfternavn, 1, 1);

        Label lblFuldeNavn = new Label("Fulde navn");
        pane.add(lblFuldeNavn, 0, 2);


        pane.add(txtfFuldeNavn, 0, 3, 2,1);

        Button kombiner = new Button("Kombiner");
        pane.add(kombiner, 0, 4);

        kombiner.setOnAction(event -> this.kominerMetode());
    }

    private void kominerMetode(){
        String fuldeNavn = txtfFornavn.getText().trim() + " " + txtfEfternavn.getText().trim();
        txtfFuldeNavn.setText(fuldeNavn);
    }
}
