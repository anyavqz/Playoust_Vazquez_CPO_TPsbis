/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_playoust_vazquez;

/**
 *
 * @author anyavazquez
 */
public class BouteilleBiere {
    String Nom;
    double degreAlcool;
    String Brasserie;
    boolean ouverte;
    
    public void lireEtiquette() {
        System.out.println("Bouteille de " + Nom +" (" + degreAlcool + " degres) \nBrasserie : " + Brasserie ) ;
    }
    
    
}




