/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dechaux.louis.projetinfo2021.gui;

import dechaux.louis.projetinfo2021.*;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author ldenner01
 */
public class Controleur {
    private int état;
    protected TreilliPane vue;
    int a=0;
    public Controleur(TreilliPane vue){
        this.vue = vue;
    }

    
    public void changeEtat(int nvEtat){
        if (nvEtat == 1){
            this.état=1;
        }
    }
    
    
    
    void clicDansZoneDessin(MouseEvent t) {
       
       double px = t.getX();
       double py = t.getY();
       Treilli model = this.vue.getTreilli();
       Noeud nclick = new NoeudSimple(a,px,py);
       model.noeudcontenue.add(nclick);
       a=a+1;
       this.vue.cDessin.drawNoeud(nclick);
       this.vue.redrawAll();
       
       
       
       
       
       
    }
    
}
