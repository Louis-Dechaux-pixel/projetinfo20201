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
 public class Appui extends Noeud {
        protected Terrain attache;
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
    

