/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.view;

import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

/**
 *
 * @author Formation
 */
public class VBoxRessource extends VBox {
    private Label NbreRessource = new Label ();
    
    private ImageView iImage = new ImageView("file:C:\\Users\\Formation.M2I-JAV5-04\\Documents\\NetBeansProjects\\atelier_java_m2i\\src\\img\\Carotte.png");

    public VBoxRessource(long nbRessource, String urlImage) {
        
        this.getChildren().add(this.iImage);
        this.getChildren().add(this.NbreRessource);
    }

    

   
}
