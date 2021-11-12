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
public class TP2_relation_1_PLAYOUST_VAZQUEZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
        Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
        Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");
        System.out.println("liste des voitures disponibles "+ uneClio +"\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
    }
    
}
