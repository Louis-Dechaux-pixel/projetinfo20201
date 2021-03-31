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
public class barre {
    private String id;
    private noeud debut;
    private noeud fin;
    protected type typebarre;
    
    
    public class type {
    protected String id;
    protected double prix;
    protected double longmax;
    protected double longmin;
    protected double resmax;
    protected double resmin;    
    }
}
