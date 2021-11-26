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
                                            // Crétation des attributs de la classe Cellule

    /**
     * Constructeur de la classe Cellule. Affecte à ses attributs des valeurs par défaut.
     */
    public Cellule() {
        jetonCourant= null;
        trouNoir=false;
        desintegrateur=false;
    }                                      
    
    /**
     * Permet d'affecter un jeton
     * @param j : jeton a affecter
     * @return true ou false selon si la méthode s'est bien déroulée ou non
     */
    public boolean affecterJeton(Jeton j) {     
        if (jetonCourant==null) {
            jetonCourant=j;
            activerTrouNoir();
            recupererDesintegrateur();
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Renvoie une référence vers le jeton à récuperer 
     * @return jetonCourant
     */
    public Jeton recupererJeton() {
        return jetonCourant;
    }
    
    /**
     * Permet de lire la couleur du jeton compris dans la cellule
     * @return la couleur du jeton dans la cellule ou "vide" si il n'y a pas de jeton
     */
    public String lireCouleurDuJeton() {
        if (jetonCourant!=null) {
            return jetonCourant.Couleur;
        } else {
            return ("vide");
        }
        
    }
    
    /**
     *
     * @return
     */
    public boolean supprimerJeton() {
        if (jetonCourant!=null) {
            jetonCourant=null;
            return true;
        }
        return false;
    }
    
    public boolean placerTrouNoir() {
        if (trouNoir==false) {
            trouNoir=true;
            return trouNoir;
        } else {
            return false;
        }
        
    }
    
    public boolean placerDesintegrateur() {
        if (desintegrateur==false) {
            desintegrateur=true;
            return desintegrateur;
        } else {
            return false;
        }
    }
    
    public boolean presenceTrouNoir() {
        return trouNoir;
    }
    
    public boolean presenceDesintegrateur() {
        return desintegrateur;
    }
    
    public boolean recupererDesintegrateur() {
        if (desintegrateur == true) {
            desintegrateur = false;
            return true;
        }
        return false;
    }
    
    public boolean activerTrouNoir() {
        if (jetonCourant!=null && trouNoir==true) {
            jetonCourant=null;
            trouNoir = false;
            return true;
        }
        return false;
    }
    
    
}
