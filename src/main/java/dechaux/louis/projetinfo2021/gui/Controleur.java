/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dechaux.louis.projetinfo2021.gui;

import dechaux.louis.projetinfo2021.*;
import javafx.event.ActionEvent;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

/**
 *
 * @author ldenner01
 */
public class Controleur {
    private int état;
    protected TreilliPane vue;
    int a=0;
    int b=0;
    int m=0;
    double pos1X;
    double pos1Y;
    double pos2X;
    double pos2Y;
    
    
    public Controleur(TreilliPane vue){
        this.vue = vue;
    }

    
    public void changeEtat(int nvEtat){
        
        
        if (nvEtat == 10){
            this.état=10;
        }
        if (nvEtat == 11){
            this.état=11;
            }
        if (nvEtat == 12){
            this.état=12;
            }
        
        
        if (nvEtat==20){
        this.état=20;
            
        }
        if (nvEtat==30){
        this.état=30;
    }
       
        if (nvEtat==40){
        this.état=40;
        }
         if (nvEtat==41){
        this.état=41;
        }
    }
    
    
    
    void clicDansZoneDessin(MouseEvent t) {
       if (this.état==10){
       this.pos1X=t.getX();
       this.pos1Y=t.getY();
       this.changeEtat(11);
       } 
       else if (this.état==11){
       this.pos2X=t.getX();
       this.pos2Y=t.getY();
       this.changeEtat(12);
       } 
       else if (this.état==12){
       double px = t.getX();
       double py = t.getY();
       Terrain terrain = new Terrain(m,this.pos1X,this.pos1Y,this.pos2X,this.pos2Y,px,py);
       System.out.println(this.pos1X+" "+this.pos1Y+" "+this.pos2X+" "+this.pos2Y+" "+px+" "+py);
       m++;
       this.vue.Treilli.terraincontenue.add(terrain);
       this.vue.cDessin.drawTerrain(terrain);
       this.changeEtat(10);
           
           
       } 
        
        
       else if (this.état==20){
       double px = t.getX();
       double py = t.getY();
       Noeud nclick = new NoeudSimple(a,px,py);
       this.vue.Treilli.noeudcontenue.add(nclick);
       a++;
       //this.vue.cDessin.setCouleur();
       this.vue.cDessin.drawNoeud(nclick);
       //this.vue.redrawAll();
        }
       else if (this.état==40){   
       this.pos1X=t.getX();
       this.pos1Y=t.getY();
       this.changeEtat(41);
       }
       else if (this.état==41){
       double px2 = t.getX();
       double py2 = t.getY();
       Noeud b1 = new NoeudSimple(a,this.pos1X,this.pos1Y);
       a++;
       this.vue.Treilli.noeudcontenue.add(b1);
       Noeud b2 = new NoeudSimple(a,px2,py2);
       a++;
       this.vue.Treilli.noeudcontenue.add(b2);
       Barre barre = new Barre(b,b1,b2);
       b++;  
       this.vue.Treilli.barrecontenue.add(barre);
       this.vue.cDessin.drawBarre(barre);
       this.changeEtat(40);  
       }
        
        
        
        
        
        
       
       
       
       
       
    }

    void boutonAppui(ActionEvent t) {
        this.changeEtat(30);
    }

    void boutonNoeud(ActionEvent t) {
        this.changeEtat(20);
    }

    void boutonBarres(ActionEvent t) {
        this.changeEtat(40);
    }

    void boutonTerrain(ActionEvent t) {
        this.changeEtat(10);
    }
    
}
