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
    
    /**
     * Constructeur de la classe Pion. Attribue à l'attribut couleur la couleur saisie en paramètre.
     * @param color
     */
    public Pion(String color) {
        couleur=color;
    }
    
    /**
     * Permet de garder en mémoire la couleur d'un pion.
     * @return
     */
    public String lireCouleur() {
        return couleur;
    }
}
