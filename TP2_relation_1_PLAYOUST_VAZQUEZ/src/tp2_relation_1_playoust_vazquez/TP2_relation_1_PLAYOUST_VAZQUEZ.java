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
        Voiture uneFerrari = new Voiture("Spider","Ferrari",8);
        System.out.println("liste des voitures disponibles "+ uneClio +"\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
        
        bob.liste_voitures[0] = uneClio ;
        bob.nbVoitures = 1 ;
        uneClio.Proprietaire = bob ;
        bob.liste_voitures[1] = uneAutreClio ;
        bob.nbVoitures = 2 ;
        uneAutreClio.Proprietaire = bob ;
        
        reno.liste_voitures[0] = une2008 ;
        reno.liste_voitures[1] = uneMicra ;
        reno.nbVoitures = 2 ;
        une2008.Proprietaire = reno ;
        uneMicra.Proprietaire = reno ;
        
        System.out.println("la premiere voiture de Bob est " +bob.liste_voitures[0] ) ;
        System.out.println("la deuxieme voiture de Bob est " +bob.liste_voitures[1] ) ;
        System.out.println("la premiere voiture de Reno est " +reno.liste_voitures[0] ) ;
        System.out.println("la deuxieme voiture de Reno est " +reno.liste_voitures[1] ) ;
        boolean res=reno.ajouter_voiture(une2008);
        System.out.println(res);
        res=reno.ajouter_voiture(uneFerrari);
        System.out.println(res);
        System.out.println("la troisieme voiture de Reno est " +reno.liste_voitures[2] ) ;
    }
    
    
}
