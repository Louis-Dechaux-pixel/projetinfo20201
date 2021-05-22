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
public class main {
public static void main(String args[]) {
/* Barre res;
 res = new Barre();
 System.out.println(res.toString())  ;
 System.out.println("eh gilou passe moi le sauciflard");*/

Noeud n1;
Noeud n2;
n1= new Noeud(2,2.05255,2.02245);
n2= new Noeud(3,3.05255,3.02245);
Barre b1;
b1= new Barre(3,n1,n2);
b1.typebarre = Barre.Type.TAcier();
System.out.println(b1.typebarre.toString());
}}
