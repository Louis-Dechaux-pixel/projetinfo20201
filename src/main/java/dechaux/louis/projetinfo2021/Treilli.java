/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dechaux.louis.projetinfo2021;

import dechaux.louis.projetinfo2021.Barre.Type;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
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
    
    protected List<Barre> barrecontenue;
    protected List<Type> typebarrecontenue;
    protected List<Noeud> noeudcontenue;
    protected List<Terrain> terraincontenue;
    protected List<Force> forcecontenue;

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
    
}
