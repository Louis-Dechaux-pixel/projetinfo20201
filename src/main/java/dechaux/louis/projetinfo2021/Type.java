/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dechaux.louis.projetinfo2021;

/**
 *
 * @author goula
 */
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
            this.longmax=1000;
            this.longmin=1;
            this.resmax=10000;
            this.resmin=1000;
            this.prix=2;    
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
    
    
    

