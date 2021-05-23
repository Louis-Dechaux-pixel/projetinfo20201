/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dechaux.louis.projetinfo2021.gui;

import dechaux.louis.projetinfo2021.*;
import java.util.List;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

class TreilliPane extends BorderPane {
    
    private Treilli Treilli;
    protected Controleur controleur;

    protected RadioButton rbTerrain;
    protected RadioButton rbAppui;
    protected RadioButton rbNoeuds;
    protected RadioButton rbBarres;

    protected Button bsauvegarde;

    public DessinCanvas cDessin;
    
    public TreilliPane(){
        this(new Treilli());
    }
    public TreilliPane(Treilli treilli) {
        this.Treilli = treilli;
        this.controleur = new Controleur(this);
        this.rbAppui = new RadioButton("Appui");
        this.rbNoeuds = new RadioButton("Noeuds");
        this.rbBarres = new RadioButton("Barres");
        this.rbTerrain = new RadioButton("Terrain");
    ToggleGroup TG = new ToggleGroup();
        this.rbAppui.setToggleGroup(TG);
        this.rbBarres.setToggleGroup(TG);
        this.rbNoeuds.setToggleGroup(TG);
        this.rbTerrain.setToggleGroup(TG);

VBox vbGauche = new VBox(this.rbTerrain, this.rbNoeuds, this.rbAppui, this.rbBarres);
        this.rbTerrain.setSelected(true);
        this.setLeft(vbGauche);

       
        this.bsauvegarde = new Button("sauvegarde");
        this.bsauvegarde.setOnAction((t) -> {
        
        });
        VBox vbDroit = new VBox(this.bsauvegarde);
        this.setRight(vbDroit);

        this.cDessin = new DessinCanvas(this);
        this.setCenter(this.cDessin);
        this.controleur.changeEtat(1);

    }
    public void redrawAll(){
        this.cDessin.redrawAll();
    }
    

    /**
     * @return the controleur
     */
    public Controleur getControleur() {
        return controleur;
    }

    /**
     * @return the terrain
     */
    public List<Terrain> getTerrain() {
        return Treilli.getTerraincontenue();
    }
public List<Noeud> getNoeud() {
        return Treilli.getNoeudcontenue();
    }
public List<Barre> getBarre() {
        return Treilli.getBarrecontenue();
    }
public List<Barre.Type> getType() {
        return Treilli.getTypebarrecontenue();
    }
public Treilli getTreilli(){
    return this.Treilli;
}
}
