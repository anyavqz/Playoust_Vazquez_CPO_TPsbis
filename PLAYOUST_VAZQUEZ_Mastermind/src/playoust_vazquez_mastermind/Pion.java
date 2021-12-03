/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playoust_vazquez_mastermind;

/**
 *
 * @author petitweb
 */
public class Pion {
    String couleur;
    public Pion(String color) {
        couleur=color;
    }
    
    public String lireCouleur() {
        return couleur;
    }
}
