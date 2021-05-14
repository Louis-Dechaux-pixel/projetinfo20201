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

    public int getId() {
        return id;}
    public void setId(int id) {
        this.id = id;}
    public Noeud getDebut() {
        return debut;}
    public void setDebut(Noeud debut) {
        this.debut = debut;}
    public Noeud getFin() {
        return fin;}
    public void setFin(Noeud fin) {
        this.fin = fin;}
    public Type getTypebarre() {
        return typebarre;}
    public void setTypebarre(Type typebarre) {
        this.typebarre = typebarre;}
    
    public Barre(){
    this.id= 5;
    this.debut = null;
    this.fin = null;
    this.typebarre = new Type();    
    }
    
    public class Type {
    protected int id;
    protected double prix;
    protected double longmax;
    protected double longmin;
    protected double resmax;
    protected double resmin;    

        public int getId() {
            return id;}
        public double getPrix() {
            return prix;}
        public double getLongmax() {
            return longmax;}
        public double getLongmin() {
            return longmin;}
        public double getResmax() {
            return resmax;}
        public double getResmin() {
            return resmin;}
        
    public Type(){
        this.id= 5;
        System.out.println("definissez la long max");
        this.longmax = Lire.d();
        System.out.println("definissez la long min");
        this.longmin = Lire.d();
        System.out.println("definissez la res max");
        this.resmax = Lire.d();
        System.out.println("definissez la res min");
        this.resmin = Lire.d();
        System.out.println("definissez le prix");
        this.prix = Lire.d();
        
    }
    public String toString(){
       return "identifiant: "+this.id+"\n longeur max: "+this.longmax+"\n longmin: "+this.longmin+"\n resmin: "+this.resmin+"\n resmax: "+this.resmax+"\n prix: "+this.prix ;}
    }
    public String toString(){
    return "identifiant"+this.id+"\n debut noeud :"+this.debut+"\n fin noeud: "+this.fin+"\n type:  "+this.typebarre.toString();
    }
    
    
}
