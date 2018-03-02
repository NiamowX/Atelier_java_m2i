/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierjava.exercice_ferme.view;

import javafx.scene.layout.GridPane;

/**
 *
 * @author Formation
 */
public class EcranJeuView extends GridPane{
    
    private VBoxRessource vbrCarot = new VBoxRessource(0, "file:C:\\Users\\Formation.M2I-JAV5-04\\Documents\\NetBeansProjects\\atelier_java_m2i\\src\\img\\Carotte.png");    
    private VBoxRessource vbrFermier = new VBoxRessource(0, "file:C:\\Users\\Formation.M2I-JAV5-04\\Documents\\NetBeansProjects\\atelier_java_m2i\\src\\img\\raoul.png");    
    private VBoxRessource vbrChevre = new VBoxRessource(0, "file:C:\\Users\\Formation.M2I-JAV5-04\\Documents\\NetBeansProjects\\atelier_java_m2i\\src\\img\\chèvreee.png");    
    private VBoxRessource vbrBle = new VBoxRessource(0, "file:C:\\Users\\Formation.M2I-JAV5-04\\Documents\\NetBeansProjects\\atelier_java_m2i\\src\\img\\blé.png");    
    private VBoxRessource vbrFromage = new VBoxRessource(0, "file:C:\\Users\\Formation.M2I-JAV5-04\\Documents\\NetBeansProjects\\atelier_java_m2i\\src\\img\\cheese.png");

    public EcranJeuView() {
    
    this.add(vbrCarot, 0, 0);
    this.add(vbrFermier, 1, 0);
    this.add(vbrChevre, 0, 1);
    this.add(vbrBle, 1, 1);
    this.add(vbrFromage, 0, 2);
        
    }
}
