/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dechaux.louis.projetinfo2021;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @author ivane
 */
public abstract class TriangleTerrain extends Terrain {

    protected Color couleur;

    protected int identificateur;
    protected Noeud t1;
    protected Noeud t2;
    protected Noeud t3;
    protected Barre s1;
    protected Barre s2;
    protected Barre s3;

    public TriangleTerrain(Color couleur) {
        this.couleur = couleur;
    }

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }

    public abstract void dessine(GraphicsContext context);

}
