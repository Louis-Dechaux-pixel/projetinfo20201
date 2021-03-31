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
public class barre {
    private int id;
    private noeud debut;
    private noeud fin;
    protected type typebarre;
    
    
    public class type {
    protected int id;
    protected double prix;
    protected double longmax;
    protected double longmin;
    protected double resmax;
    protected double resmin;    
    
    public type(){
        this.id= 5;
        System.out.println("definissez la long max");
        this.longmax = Lire.d();
        System.out.println("definissez la long max");
        this.longmin = Lire.d();
        System.out.println("definissez la long max");
        this.resmax = Lire.d();
        System.out.println("definissez la long max");
        this.resmin = Lire.d();
        System.out.println("definissez la long max");
        this.prix = Lire.d();
        
    }
    
    }


}
