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
    
    public Joueur(String nomj) {
        Nom=nomj;
    }
    
    public void affecterCouleur(String couleurj) {
        Couleur=couleurj;
    }
    
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


    public void obtenirDesintegrateur() {
        if (recupererDesintegrateur()==True)
        
}
        
}    
    
    

