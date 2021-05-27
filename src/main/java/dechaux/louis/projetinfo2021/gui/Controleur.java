/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dechaux.louis.projetinfo2021.gui;

import dechaux.louis.projetinfo2021.*;
import static java.lang.Double.max;
import static java.lang.Double.min;
import static java.lang.Math.abs;
import javafx.event.ActionEvent;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

/**
 *
 * @author ldenner01
 */
public class Controleur {
    private int état = 10;
    protected TreilliPane vue;
    public int a=0;
    public int b=0;
    public int m=0;
    public double pos1X;
    public double pos1Y;
    public double pos2X;
    public double pos2Y;
    
    
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
       //System.out.println(this.pos1X+" "+this.pos1Y+" "+this.pos2X+" "+this.pos2Y+" "+px+" "+py);
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
       else if(this.état==30){
       double px =t.getX();
       double py =t.getY();
       int g=this.vue.Treilli.terraincontenue.size();
       for(int i=0;i<g;i++){
       Terrain te = this.vue.Treilli.terraincontenue.get(i);
       double xb1,xa1,xb2,xa2,xb3,xa3,ya1,yb1,ya2,yb2,ya3,yb3;
       if(te.getP2localisationx()>te.getP1localisationx()){
       xb1 =te.getP2localisationx();
       xa1 =te.getP1localisationx();
       yb1 =te.getP2localisationy();
       ya1 =te.getP1localisationy();}
       else{
       xb1 =te.getP1localisationx();
       xa1 =te.getP2localisationx();
       yb1 =te.getP1localisationy();
       ya1 =te.getP2localisationy(); 
       }
       double coeff1 = (yb1-ya1)/(xb1-xa1);
       double beta1 = te.getP1localisationy()-(coeff1 * te.getP1localisationx());
       for (double x1=xa1; x1<xb1; x1++){
         double y1=x1*coeff1+beta1;
         System.out.println(coeff1+" c1 "+x1+" "+y1+" "+abs(x1-px)+" "+abs(y1-py));
           if (abs(x1-px)<5 && abs(y1-py)<5){
            System.out.println("trouvé");
            Appui appui = new Appui(a,px,coeff1*px+beta1,this.vue.Treilli.terraincontenue.get(i));
            this.vue.Treilli.noeudcontenue.add(appui);
            a++;
            this.vue.cDessin.drawAppui(appui);
            break;    
           }} 
       if(te.getP3localisationx()>te.getP2localisationx()){
       xb2 =te.getP3localisationx();
       xa2 =te.getP2localisationx();
       yb2 =te.getP3localisationy();
       ya2 =te.getP2localisationy();}
       else{
       xb2 =te.getP2localisationx();
       xa2 =te.getP3localisationx();
       yb2 =te.getP2localisationy();
       ya2 =te.getP3localisationy(); 
       }    
       double coeff2 = (yb2-ya2)/(xb2-xa2);
       double beta2 = te.getP2localisationy()-(coeff2 * te.getP2localisationx());
       for (double x2=xa2; x2<xb2; x2++){
         double y2=(x2)*(coeff2)+(beta2);
         System.out.println(coeff2+" c2 "+x2+" "+y2+" "+abs(x2-px)+" "+abs(y2-py));
           if (abs(x2-px)<5 && abs(y2-py)<5){
            System.out.println("trouvé");
            Appui appui = new Appui(a,px,coeff2*px+beta2,this.vue.Treilli.terraincontenue.get(i));
            this.vue.Treilli.noeudcontenue.add(appui);
            a++;
            this.vue.cDessin.drawAppui(appui);
            break;    
           }} 
       if(te.getP1localisationx()>te.getP3localisationx()){
       xb3 =te.getP1localisationx();
       xa3 =te.getP3localisationx();
       yb3 =te.getP1localisationy();
       ya3 =te.getP3localisationy();}
       else{
       xb3 =te.getP3localisationx();
       xa3 =te.getP1localisationx();
       yb3 =te.getP3localisationy();
       ya3 =te.getP1localisationy(); 
       }    
       double coeff3 = (yb3-ya3)/(xb3-xa3);
       double beta3 = te.getP3localisationy()-(coeff3 * te.getP3localisationx());
       for (double x3=xa3; x3<xb3; x3++){
         double y3=(x3)*(coeff3)+(beta3);
         System.out.println(coeff1+" c1 "+x3+" "+y3+" "+abs(x3-px)+" "+abs(y3-py));
           if (abs(x3-px)<5 && abs(y3-py)<5){
            System.out.println("trouvé");
            Appui appui = new Appui(a,px,coeff3*px+beta3,this.vue.Treilli.terraincontenue.get(i));
            this.vue.Treilli.noeudcontenue.add(appui);
            a++;
            this.vue.cDessin.drawAppui(appui);
            break;    
           }}
       
       
       
       
       
       
       
       }                
       System.out.println("arrivé a la fin");
       }
       
       
       
       
       else if (this.état==40){   
       Noeud proche = noeudproche(t.getX(),t.getY());
       if (proche!= null){
      this.pos1X=proche.getPx();
      this.pos1Y=proche.getPy();
       }    
       else {
       this.pos1X=t.getX();
       this.pos1Y=t.getY();
       }
       this.changeEtat(41);
       }
       else if (this.état==41){
       double px2;
       double py2;
       Noeud proche = noeudproche(t.getX(),t.getY());
       if (proche != null){
       px2 = proche.getPx();
       py2 = proche.getPy();
       }
       else { px2 = t.getX();
        py2 = t.getY();
       }
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
    
   public Noeud noeudproche(double px, double py){
     int d=this.vue.Treilli.noeudcontenue.size();
       for(int k=0;k<d;k++){
       Noeud no = this.vue.Treilli.noeudcontenue.get(k);
       double PX = no.getPx();
       double PY = no.getPy();       
      if (abs(PX-px)<25 && abs(PY-py)<25){
       return no;
       }}
    return null;}

}
