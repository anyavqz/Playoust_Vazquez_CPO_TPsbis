package sp4_console_playoust._vazquez;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author petitweb
 */
public class Cellule {
    Jeton jetonCourant;
    boolean trouNoir;
    boolean desintegrateur;
    
    public Cellule() {
        jetonCourant= null;
        trouNoir=false;
        desintegrateur=false;
    }
    
    public boolean affecterJeton(Jeton j) {     
        if (jetonCourant==null) {
            jetonCourant=j;
            return true;
        } else {
            return false;
        }
    }
    
    public Jeton recupererJeton() {
        return jetonCourant;
    }
    
    public String lireCouleurDuJeton() {
        if (jetonCourant!=null) {
            return jetonCourant.Couleur;
        } else {
            return ("vide");
        }
        
    }
    
    
    
    
}
