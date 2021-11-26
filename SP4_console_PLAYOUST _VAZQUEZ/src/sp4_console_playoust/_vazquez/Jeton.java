package sp4_console_playoust._vazquez;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anyavazquez
 */
public class Jeton {
    String Couleur;             // Création des attributs de la classe jeton
    
    public Jeton(String CouleurJeton) {
        Couleur=CouleurJeton;  
    }                                    // On construit la classe jeton à partir de la couleur du jeton   
    public String lireCouleur() {
        return Couleur;
    }                                   // Méthode qui retourne, garde en mémoire, la couleur du jeton.
}
