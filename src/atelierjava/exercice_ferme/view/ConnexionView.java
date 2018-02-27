/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.view;

import atelierjava.exercice_ferme.entite.Joueur;
import atelierjava.exercice_ferme.service.JoueurService;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import sun.print.resources.serviceui;

/**
 *
 * @author Formation
 */
public class ConnexionView extends GridPane {

    private Label lPseudo = new Label("Pseudo");
    private TextField tfPseudo = new TextField();
    private Label lMdp = new Label("Mot-de-passe");
    private PasswordField pfMdp = new PasswordField();
    private Button bConnexion = new Button("Connexion");

    public ConnexionView(BorderPane borderPaneDuParent) {

        this.add(lPseudo, 0, 0);
        this.add(tfPseudo, 1, 0);
        this.add(lMdp, 0, 1);
        this.add(pfMdp, 1, 1);
        this.add(bConnexion, 1, 2);

        bConnexion.setOnAction(e -> {

            try {

                String pseudoEntre = tfPseudo.getText();
                String mdpEntre = pfMdp.getText();

                JoueurService js = new JoueurService();
                js.connexion(pseudoEntre, mdpEntre);

                borderPaneDuParent.setCenter(new Label("Connexion réussi"));

            } catch (Exception exception) {

                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Erreur");
                alert.setHeaderText("Il s'est produit une erreur");
                alert.setContentText(exception.getMessage());

                alert.showAndWait();

            }

        });

    }
}
