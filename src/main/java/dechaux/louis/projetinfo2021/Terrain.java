/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dechaux.louis.projetinfo2021;

/**
 *
 * @author ldechaux01
 */
public class Terrain {
    protected double p1localisationx;
    protected double p1localisationy;
    protected double p2localisationx;
    protected double p2localisationy;
    protected double p3localisationx;
    protected double p3localisationy;

    public Terrain() {
        System.out.println("donner les coordonées des 3 point ( x puis y) ");
        
        this.p1localisationx = Lire.d();
        this.p1localisationy = Lire.d();
        this.p2localisationx = Lire.d();
        this.p2localisationy = Lire.d();
        this.p3localisationx = Lire.d();
        this.p3localisationy = Lire.d();
    }
    
    
    
public String toString(){
    return "point 1 localisation x :"+this.p1localisationx+"\n point 1 localisation y : "+this.p1localisationy+"\n point 2 localisation x :"+this.p2localisationx+"\n point 2 localisation y : "+this.p2localisationy+"\n point 3 localisation x :"+this.p3localisationx+"\n point 3 localisation y : "+this.p3localisationy;
    }}

