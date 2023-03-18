package com.example.baal;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private VBox pnItems = null;
    @FXML
    private Button btnOverview;

    @FXML
    private Button btnOrders;

    @FXML
    private Button btnCustomers;

    @FXML
    private Button btnMenus;

    @FXML
    private Button btnPackages;

    @FXML
    private Button btnSettings;

    @FXML
    private Button btnSignout;

    @FXML
    private Pane pnlCustomer;

    @FXML
    private Pane pnlOrders;

    @FXML
    private Pane pnlOverview;

    @FXML
    private Pane pnlMenus;

   @Override
    public void initialize(URL location, ResourceBundle resources) {
        Node[] nodes = new Node[10];
        for (int i = 0; i < nodes.length; i++) {
            try {

                final int j = i;

                nodes[i] = FXMLLoader.load(getClass().getResource("Item.fxml"));

                //give the items some effect

                nodes[i].setOnMouseEntered(event -> {
                    nodes[j].setStyle("-fx-background-color : #0A0E3F");
                });
                nodes[i].setOnMouseExited(event -> {
                    nodes[j].setStyle("-fx-background-color : #02030A");
                });
                pnItems.getChildren().add(nodes[i]);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    /*@Override
    public void initialize(URL location, ResourceBundle resources) {
        Node[] nodes = new Node[10];
        for (int i = 0; i < nodes.length; i++) {
           HBox itmBox = new HBox(80);
           itmBox = setEverything(itmBox);
           itmBox.setPrefSize(53.0, 695.0);
           ImageView iv = new ImageView();
           iv.setFitHeight(31.0);
           iv.setFitWidth(25.0);
           iv.setPreserveRatio(true);
           iv.setPickOnBounds(true);
           Label tm = new Label();
           Label mnm = new Label();
           Label ds = new Label();

           tm.setPrefSize(198, 82);
           mnm.setPrefSize(85, 18);
           ds.setPrefSize(82, 18);

           tm.setText("time");
           mnm.setText("jjj");
           ds.setText("3");

           itmBox.getChildren().addAll(new HBox(iv, tm, mnm, ds));
           pnItems.getChildren().add(itmBox);

        }

    }*/

    private HBox setEverything(HBox itm)
    {
        //itm.setPrefHeight(53.0);
        itm.setPrefSize(53.0, 695.0);
        itm.setStyle("-fx-background-color: #02030A ");
        itm.setStyle("-fx-background-radius: 5 ");
        itm.setStyle("-fx-background-insets: 0 ");
        return itm;
    }



    public void handleClicks(ActionEvent actionEvent) {
        if (actionEvent.getSource() == btnCustomers) {
            pnlCustomer.setStyle("-fx-background-color : #1620A1");
            pnlCustomer.toFront();
            /*Media ple = new Media(new File("who-let-the-dogs-out-4720.mp3").toURI().toString());
            MediaPlayer mp = new MediaPlayer(ple);
            mp.play();*/
        }
        if (actionEvent.getSource() == btnMenus) {
            pnlMenus.setStyle("-fx-background-color : #53639F");
            pnlMenus.toFront();
        }
        if (actionEvent.getSource() == btnOverview) {
            pnlOverview.setStyle("-fx-background-color : #02030A");
            pnlOverview.toFront();
        }
        if(actionEvent.getSource()==btnOrders)
        {
            pnlOrders.setStyle("-fx-background-color : #464F67");
            pnlOrders.toFront();
        }
    }
}