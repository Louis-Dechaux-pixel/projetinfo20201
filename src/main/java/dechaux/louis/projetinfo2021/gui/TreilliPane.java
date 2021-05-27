/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dechaux.louis.projetinfo2021.gui;

import dechaux.louis.projetinfo2021.*;
import dechaux.louis.projetinfo2021.Matrice;
import java.io.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

class TreilliPane extends BorderPane {
    
    public Treilli Treilli;
    protected Controleur controleur;

    public int a=2;
    protected Button bpoutre;
    protected RadioButton rbTerrain;
    protected RadioButton rbAppui;
    protected RadioButton rbNoeuds;
    protected RadioButton rbBarres;
    protected Button breset;
    protected Button bsauvegarde;

    public DessinCanvas cDessin;
    
    public TreilliPane(){
        this(new Treilli());
    }
    public TreilliPane(Treilli treilli) {
        this.Treilli = treilli;
        this.controleur = new Controleur(this);
        this.rbAppui = new RadioButton("Appui");
        this.rbAppui.setOnAction((t) -> {
            this.controleur.boutonAppui(t);});
        this.rbNoeuds = new RadioButton("Noeuds");
        this.rbNoeuds.setOnAction((t) -> {
            this.controleur.boutonNoeud(t);});
        this.rbBarres = new RadioButton("Barres");
        this.rbBarres.setOnAction((t) -> {
            this.controleur.boutonBarres(t);});
        this.rbTerrain = new RadioButton("Terrain");
        this.rbTerrain.setOnAction((t) -> {
            this.controleur.boutonTerrain(t);});
        
    ToggleGroup TG = new ToggleGroup();
        this.rbAppui.setToggleGroup(TG);
        this.rbBarres.setToggleGroup(TG);
        this.rbNoeuds.setToggleGroup(TG);
        this.rbTerrain.setToggleGroup(TG);

VBox vbGauche = new VBox(this.rbTerrain, this.rbNoeuds, this.rbAppui, this.rbBarres);
        this.rbTerrain.setSelected(true);
        this.setLeft(vbGauche);
        this.bpoutre = new Button("type de poutre");
        this.bpoutre.setOnAction((t)-> {
           Type poutre ;
           poutre = new Type(a);
           this.Treilli.typebarrecontenue.add(poutre);
           a++;
            });
        this.breset= new Button("reset");
        this.breset.setOnAction((t)-> {
            redrawAll();
            this.Treilli.terraincontenue.clear();
            this.Treilli.noeudcontenue.clear();
            this.Treilli.forcecontenue.clear();
            this.Treilli.barrecontenue.clear();
            });
        this.bsauvegarde = new Button("sauvegarde");
        this.bsauvegarde.setOnAction((t) -> {
            try {
                this.Treilli.sauvegarde(new File("sauvegarde.txt"));
            } catch (IOException ex) {
                System.out.println("erreur dans la sauvegarde "+ex);
            }
        });
        VBox vbDroit = new VBox(this.bsauvegarde,this.breset, this.bpoutre);
        this.setRight(vbDroit);

        this.cDessin = new DessinCanvas(this);
        this.setCenter(this.cDessin);
        this.controleur.changeEtat(1);
        Type tacier = new Type();
        tacier = tacier.TAcier();
        this.Treilli.typebarrecontenue.add(tacier);
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
public List<Type> getType() {
        return Treilli.getTypebarrecontenue();
    }
public Treilli getTreilli(){
    return this.Treilli;
}

public String calcul(){
String l = new String(); 
int g=this.Treilli.noeudcontenue.size();
Matrice calcul = new Matrice(2*g,2*g) ;
     for(int i=0;i<g;i++){
           Noeud no = this.Treilli.noeudcontenue.get(i);
           calcul.set(2*i, 1, no.getForce().getFx());
           calcul.set(2*i+1,1,no.getForce().getFy());
           }
 Matrice inconnue = new Matrice(2*g,1);
 
// inconnue = Matrice.creeVecteur();
 
        
        

return l ;
} 






}
