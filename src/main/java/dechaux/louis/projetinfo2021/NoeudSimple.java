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
public class NoeudSimple extends Noeud {

        public NoeudSimple(double px, double py){
         this.px=px;
         this.py=py;
         this.id=5;
         this.force= new Force();
            
        }
    public String toString(){
    return "identifiant"+this.id+"\n force : "+this.force.toString()+"\n px: "+this.px+"\n py:  "+this.py;
    }}