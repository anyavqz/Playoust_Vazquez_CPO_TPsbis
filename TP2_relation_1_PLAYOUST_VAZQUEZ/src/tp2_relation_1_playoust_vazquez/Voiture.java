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
public class Voiture {
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne Proprietaire;
    
    
    public Voiture(String Mod, String Mq, int PCV) {
        Modele = Mod;
        Marque=Mq;
        PuissanceCV = PCV;
        Proprietaire=null;
    } 
    
    @Override
    public String toString () {
        return Modele+" de la marque "+Marque+" de puissance "+PuissanceCV;
    }
}
