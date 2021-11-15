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
    
    
    public Personne (String leNom, String lePrenom) { 
        nom = leNom;
        prenom = lePrenom;
        
    }

    
    @Override
    public String toString() {
        return nom+" "+prenom+" possède ";
    }
}
