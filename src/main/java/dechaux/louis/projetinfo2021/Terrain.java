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
    protected int id;
    protected double p1localisationx;
    protected double p1localisationy;
    protected double p2localisationx;
    protected double p2localisationy;
    protected double p3localisationx;
    protected double p3localisationy;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getP1localisationx() {
        return p1localisationx;
    }

    public void setP1localisationx(double p1localisationx) {
        this.p1localisationx = p1localisationx;
    }

    public double getP1localisationy() {
        return p1localisationy;
    }

    public void setP1localisationy(double p1localisationy) {
        this.p1localisationy = p1localisationy;
    }

    public double getP2localisationx() {
        return p2localisationx;
    }

    public void setP2localisationx(double p2localisationx) {
        this.p2localisationx = p2localisationx;
    }

    public double getP2localisationy() {
        return p2localisationy;
    }

    public void setP2localisationy(double p2localisationy) {
        this.p2localisationy = p2localisationy;
    }

    public double getP3localisationx() {
        return p3localisationx;
    }

    public void setP3localisationx(double p3localisationx) {
        this.p3localisationx = p3localisationx;
    }

    public double getP3localisationy() {
        return p3localisationy;
    }

    public void setP3localisationy(double p3localisationy) {
        this.p3localisationy = p3localisationy;
    }
    

    public Terrain(int a,double b,double c, double d,double e,double f,double g){
     this.id=a;
     this.p1localisationx=b;
     this.p1localisationy=c;  
     this.p2localisationx=d;   
     this.p2localisationy=e;   
     this.p3localisationx=f;
     this.p3localisationy=g;
    }
    
    
    
    public Terrain(int a) {
        System.out.println("donner les coordonées des 3 point ( x puis y) ");
        this.id=a;
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

