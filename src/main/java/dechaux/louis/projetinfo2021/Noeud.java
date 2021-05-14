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
public class Noeud {

    protected Force force;
    protected int id;

    public Force getForce() {
        return force;}
    public void setForce(Force force) {
        this.force = force;}
    public int getId() {
        return id;}
    public void setId(int id) {
        this.id = id;}
    
    public class noeud_simple extends Noeud {

        private double px;
        private double py;

        public double getPx() {
            return px;}
        public void setPx(double px) {
            this.px = px;}
        public double getPy() {
            return py;}
        public void setPy(double py) {
            this.py = py;}
        public noeud_simple(){
         this.px=0;
         this.py=0;
         this.id=5;
         this.force= new Force();
            
        }
    public String toString(){
    return "identifiant"+this.id+"\n force : "+this.force.toString()+"\n px: "+this.px+"\n py:  "+this.py;
    }}

    public class Appui extends Noeud {

        protected double px;
        protected double py;
        protected Terrain attache;

        public double getPx() {
            return px;}
        public void setPx(double px) {
            this.px = px;}
        public double getPy() {
            return py;}
        public void setPy(double py) {
            this.py = py;}
        public Terrain getAttache() {
            return attache;}
        public void setAttache(Terrain attache) {
            this.attache = attache;}
        
        public class Appui_simple extends Appui {
        public String toString(){
        return "identifiant"+this.id+"\n force : "+this.force.toString()+"\n px: "+this.px+"\n py:  "+this.py+"\n attache"+this.attache.toString();
        }}

        public class Appui_encastre extends Appui {
            public String toString(){
        return "identifiant"+this.id+"\n force : "+this.force.toString()+"\n px: "+this.px+"\n py:  "+this.py+"\n attache"+this.attache.toString();
        }
        }

        public class Appui_double extends Appui {
            public String toString(){
        return "identifiant"+this.id+"\n force : "+this.force.toString()+"\n px: "+this.px+"\n py:  "+this.py+"\n attache"+this.attache.toString();
        }
        }

        public class Appui_rouleau extends Appui {
            public String toString(){
        return "identifiant"+this.id+"\n force : "+this.force.toString()+"\n px: "+this.px+"\n py:  "+this.py+"\n attache"+this.attache.toString();
        }
        }
    }
}
