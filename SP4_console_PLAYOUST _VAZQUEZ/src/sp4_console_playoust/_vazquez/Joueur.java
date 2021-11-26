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
public class Joueur {
    
    String Nom;
    String Couleur; 
    int nombreJetonsRestants=0;
    int nombreDesintegrateurs;
    Jeton ListeJetons [] = new Jeton[21] ;
    
    /**
     * Constructeur de la classe Joueur. Attribue le nom rentré en paramètre au joueur
     * @param nomj : nom à affecter
     */
    public Joueur(String nomj) {
        Nom=nomj;
    }
    
    /**
     * Permet d'affecter une couleur au joueur
     * @param couleurj : couleur à affecter au joueur.
     */
    public void affecterCouleur(String couleurj) {
        Couleur=couleurj;
    }
    
    /**
     * Permet d'ajouter un jeton a la liste de jeton du joueur.
     * @param j : le jeton à ajouter à la liste.
     * @return true ou false si l'ajout s'est bien passé ou non.
     */
    public boolean ajouterJeton(Jeton j) {
        int i=0;
        while (ListeJetons[i]!=null) {
            i+=1;
            if (i==20) {
                return false;
            }
    }
        ListeJetons[i]=j;
        nombreJetonsRestants+=1;
        return true;
            }

    /**
     *Permet d'incrémenter le nombre de désintégrateurs.
     */
    public void obtenirDesintegrateur() {
        nombreDesintegrateurs+=1;
        }
    
    /**
     * Permet de désincrémenter le nombre de désintégrateurs.
     * @return true ou false si la méthode s'est bien passée ou non
     */
    public boolean utiliserDesintegrateur() {
        if (nombreDesintegrateurs>=1) {
            nombreDesintegrateurs-=1;
            return true;
        } 
        return false;
    }
            
}
        
    
    
    

