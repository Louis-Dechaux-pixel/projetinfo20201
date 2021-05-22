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
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author ldenner01
 */
public class TreilliPane extends BorderPane {
    
    private Treilli Treilli;
    protected Controleur controleur;

    protected RadioButton rbSelect;
    protected RadioButton rbNoeuds;
    protected RadioButton rbBarres;

    protected Button bGrouper;
    protected Button bCouleur;

    protected DessinCanvas cDessin;
    
    public TreilliPane(){
        this(new Treilli());
    }
    public TreilliPane(Treilli treilli) {
        this.Treilli = treilli;
        this.controleur = new Controleur(this);
        this.rbSelect = new RadioButton("Select");
        this.rbNoeuds = new RadioButton("Noeuds");
        this.rbBarres = new RadioButton("Barres");

        VBox vbGauche = new VBox(this.rbSelect, this.rbNoeuds, this.rbBarres);
        this.setLeft(vbGauche);

        this.bGrouper = new Button("Grouper");
        this.bGrouper.setOnAction((t) -> {
        });
        this.bCouleur = new Button("Couleur");
        this.bCouleur.setOnAction((t) -> {
        });
        VBox vbDroit = new VBox(this.bGrouper, this.bCouleur);
        this.setRight(vbDroit);

        this.cDessin = new DessinCanvas(this);
        this.setCenter(this.cDessin);

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
