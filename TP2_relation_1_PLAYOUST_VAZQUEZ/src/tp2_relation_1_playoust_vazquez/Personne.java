/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_relation_1_playoust_vazquez;

/**
 *
 * @author petitweb
 */
public class Personne {
    String nom;
    String prenom;
    int nbVoitures;
    Voiture liste_voitures [];
    
    
    public Personne (String leNom, String lePrenom) { 
        nom = leNom;
        prenom = lePrenom;
        nbVoitures=0;
        liste_voitures = new Voiture[3];
        
    }
    
    public boolean ajouter_voiture( Voiture voiture_a_ajouter) {
            if (voiture_a_ajouter.Proprietaire!=null) {
                return false;
            }
            if (nbVoitures>=3) {
                return false;
            }
            liste_voitures[nbVoitures]=voiture_a_ajouter;
            nbVoitures+=1;
            voiture_a_ajouter.Proprietaire = this ;
            return true;
            
}

    
    @Override
    public String toString() {
        return nom+" "+prenom+" possède ";
    }
}
