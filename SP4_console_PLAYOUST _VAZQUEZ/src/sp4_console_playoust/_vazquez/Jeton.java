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
    String Couleur;
    
    /**
     * Constructeur de la classe jeton. Affecte la couleur du jeton rentrée en paramètre au jeton
     * @param CouleurJeton : couleur à affecter
     */
    public Jeton(String CouleurJeton) {
        Couleur=CouleurJeton;  
    }

    /**
     * Permet de connaitre la couleur du jeton
     * @return la couleur du jeton
     */
    public String lireCouleur() {
        return Couleur;
    }
}
