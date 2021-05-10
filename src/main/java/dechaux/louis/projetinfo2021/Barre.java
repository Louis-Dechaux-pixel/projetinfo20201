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
public class Barre {
    private int id;
    private Noeud debut;
    private Noeud fin;
    protected Type typebarre;
    
    
    public class Type {
    protected int id;
    protected double prix;
    protected double longmax;
    protected double longmin;
    protected double resmax;
    protected double resmin;    
    
    public Type(){
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
    public String toString(){
       return "identifiant: "+id+"\n longeur max: "+longmax+"\n longmin: "+longmin+"\n resmin: "+resmin+"\n resmax: "+resmax+"\n prix: "+prix ;}
    }
    public String toString(){
    return "identifiant"+id+"\n debut noeud :"+debut+"\n fin noeud"+fin+"\n type"+this.typebarre.toString();
    }
    
    
}
