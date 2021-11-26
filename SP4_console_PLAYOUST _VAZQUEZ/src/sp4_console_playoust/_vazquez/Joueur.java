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
    Jeton ListeJetons [] = new Jeton[21] ;  // Creation des attributs de la classe joueur.
    
    public Joueur(String nomj) {
        Nom=nomj;
    }       // On construit la classe joueur en lui attribuant son nom qui est rentré dans les paramètres du constructeur.
    
    public void affecterCouleur(String couleurj) {
        Couleur=couleurj;
    }       // On affecte la couleur rentrée en paramètre au joueur
    
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
            }                           // On ajoute le jeton j dans la première case vide du tableau ListeJetons qui est parcouru entièrement.
                                        // On incrémente le nombre de jetons restants du joueur et on vérifie si l'ajout du jeton s'est bien déroulé


    public void obtenirDesintegrateur() {
        nombreDesintegrateurs+=1;
        }                                   // On incrémente le nombre de désintégrateurs.
    
    public boolean utiliserDesintegrateur() {
        if (nombreDesintegrateurs>=1) {
            nombreDesintegrateurs-=1;
            return true;
        } 
        return false;
    }
                                            // On désincrémente le nombre de désintégrateurs. On vérifie que la méthode la désincrémentation s'est bien passée.
        
}
        
    
    
    

