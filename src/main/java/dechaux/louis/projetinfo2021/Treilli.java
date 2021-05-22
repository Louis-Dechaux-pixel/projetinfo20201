/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dechaux.louis.projetinfo2021;

import dechaux.louis.projetinfo2021.Barre.Type;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import dechaux.louis.projetinfo2021.Lire;
/**
 *
 * @author ldechaux01
 */
public class Treilli {
    
    protected List<Barre> barrecontenue = new ArrayList(999) ;
    protected List<Type> typebarrecontenue = new ArrayList(999) ;
    protected List<Noeud> noeudcontenue = new ArrayList(999) ;
    protected List<Terrain> terraincontenue = new ArrayList(999) ;
    protected List<Force> forcecontenue = new ArrayList(999) ;

    public List<Barre> getBarrecontenue() {
        return barrecontenue;
    }

    public void setBarrecontenue(List<Barre> barrecontenue) {
        this.barrecontenue = barrecontenue;
    }

    public List<Type> getTypebarrecontenue() {
        return typebarrecontenue;
    }

    public void setTypebarrecontenue(List<Type> typebarrecontenue) {
        this.typebarrecontenue = typebarrecontenue;
    }

    public List<Noeud> getNoeudcontenue() {
        return noeudcontenue;
    }

    public void setNoeudcontenue(List<Noeud> noeudcontenue) {
        this.noeudcontenue = noeudcontenue;
    }

    public List<Terrain> getTerraincontenue() {
        return terraincontenue;
    }

    public void setTerraincontenue(List<Terrain> terraincontenue) {
        this.terraincontenue = terraincontenue;
    }

    public List<Force> getForcecontenue() {
        return forcecontenue;
    }

    public void setForcecontenue(List<Force> forcecontenue) {
        this.forcecontenue = forcecontenue;
    }
   public void save(Writer w) throws IOException{ 
       int b=terraincontenue.size();
       for(int i=0;i<b;i++){
           Terrain te = terraincontenue.get(i);
           w.append("Triangle;" + te.id + ";(" + te.p1localisationx + "," + te.p1localisationy + ");(" + te.p2localisationx + "," + te.p2localisationy + ");(" + te.p3localisationx + "," + te.p3localisationy+  ")"+ "\n");
       w.append("FINTRIANGLES \n");}
       int c=typebarrecontenue.size();
       for(int j=0;j<c;j++){
           Type ty = typebarrecontenue.get(j);
           w.append("TypeBarre" + ty.id + ";" + ty.prix + ";"+ ty.longmin + ";" + ty.longmax + ";"+ ty.resmax + ";"+ ty.resmin+ "\n" );
       w.append("FINCATALOGUES \n");}
       int d=noeudcontenue.size();
       for(int k=0;k<d;k++){
           Noeud no = noeudcontenue.get(k);
           if (no instanceof NoeudSimple){
             w.append("NoeudSimple"+ no.id + ";"+ no.px +";"+ no.py+"\n");
           }
           else if (no instanceof Appui){
             w.append("Appui"+ no.id + ";"+((Appui) no).attache.id +";"+ no.px +";"+ no.py+"\n");  
           }
           else 
            w.append("Noeud"+ no.id + ";"+ no.px +";"+ no.py+"\n");
           w.append("FINNOEUDS \n");}
       int e=barrecontenue.size();
       for(int l=0;l<e;l++){
           Barre ba = barrecontenue.get(l);
           w.append("Barre;" + ba.id + ";"+ba.debut.id+":"+ba.fin.id+";"+ba.typebarre.id+"\n");
       w.append("FINBARRES \n");
       }
   }
   
   
public void sauvegarde(File fout) throws IOException{
   try(BufferedWriter bout = new BufferedWriter(new FileWriter(fout))){
       this.save(bout);
   }    }}
    