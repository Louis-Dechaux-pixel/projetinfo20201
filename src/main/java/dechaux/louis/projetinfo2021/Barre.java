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

    protected int id;
    protected Noeud debut;
    protected Noeud fin;
    protected Type typebarre;

    public Barre(int a,Noeud debut,Noeud fin){
    this.id=a;
    this.debut=debut;
    this.fin=fin;
    this.typebarre=new Type();
    //typebarre.TAcier();  
    }
            
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Noeud getDebut() {
        return debut;
    }

    public void setDebut(Noeud debut) {
        this.debut = debut;
    }

    public Noeud getFin() {
        return fin;
    }

    public void setFin(Noeud fin) {
        this.fin = fin;
    }

    public Type getTypebarre() {
        return typebarre;
    }

    public void setTypebarre(Type typebarre) {
        this.typebarre = typebarre;
    }

    public Barre() {
        this.id = 5;
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
            return id;
        }

        public double getPrix() {
            return prix;
        }

        public double getLongmax() {
            return longmax;
        }

        public double getLongmin() {
            return longmin;
        }

        public double getResmax() {
            return resmax;
        }

        public double getResmin() {
            return resmin;
        }

        public Type() {
            this.id=0;
            this.longmax=0;
            this.longmin=0;
            this.resmax=0;
            this.resmin=0;
            this.prix=0;    
        }
        public Type(int a) {
            this.id = a;
            System.out.println("definissez la long max");
            this.longmax = Lire.d();
            System.out.println("definissez la long min");
            this.longmin = Lire.d();
            System.out.println("definissez la res max");
            this.resmax = Lire.d();
            System.out.println("definissez la res min");
            this.resmin = Lire.d();
            System.out.println("definissez le prix");
            this.prix = Lire.d();}

        public Type TAcier(){
       Type Acier = new Type();
        Acier.id = 1;
        Acier.longmax = 1000;
        Acier.longmin = 10;
        Acier.resmax = 100;
        Acier.resmin = 1;
        Acier.prix = 50;
      return Acier;  
    }
        
        
        public String toString() {
            return "identifiant: " + this.id + "\n longeur max: " + this.longmax + "\n longmin: " + this.longmin + "\n resmin: " + this.resmin + "\n resmax: " + this.resmax + "\n prix: " + this.prix;
        }
    }

    public String toString() {
        return "identifiant" + this.id + "\n debut noeud :" + this.debut + "\n fin noeud: " + this.fin + "\n type:  " + this.typebarre.toString();
    }

    /*public double distancePoint(Noeud p) {
        double x1 = this.debut.getPx();
        double y1 = this.debut.getPy();
        double x2 = this.fin.getPx();
        double y2 = this.fin.getPy();
        double x3 = p.getPx();
        double y3 = p.getPy();
            NoeudSimple p4;
        int a =1000;
            p4 = new NoeudSimple(a,x1,y1);
            return p4.distancePoint(p);
            
        }*/
    }

