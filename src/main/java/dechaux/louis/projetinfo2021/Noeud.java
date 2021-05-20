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
 * @author ldechaux01
 */
public class Noeud extends TriangleTerrain {

    protected Force force;
    protected int id;
    protected double px;
    protected double py;
    public static double RAYON_IN_DRAW = 5;

    public Noeud(Color couleur) {
        super(couleur);
    }

    public double getPx() {
        return px;
    }

    public void setPx(double px) {
        this.px = px;
    }

    public double getPy() {
        return py;
    }

    public void setPy(double py) {
        this.py = py;
    }

    public Force getForce() {
        return force;
    }

    public void setForce(Force force) {
        this.force = force;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void dessine(GraphicsContext context) {
        context.setFill(this.getCouleur());
        context.fillOval(this.px - RAYON_IN_DRAW, this.py - RAYON_IN_DRAW, 2 * RAYON_IN_DRAW, 2 * RAYON_IN_DRAW);

    }
}
