/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_playoust_vazquez;

/**
 *
 * @author anyavazquez
 */
public class TP2_Bieres_PLAYOUST_VAZQUEZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //BouteilleBiere uneBiere = new BouteilleBiere() ;
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0 ,"Dubuisson") ;
        //uneBiere.Nom = "Cuvée des trolls"; 
        //uneBiere.degreAlcool = 7.0 ;
        //uneBiere.Brasserie = "Dubuisson";
        //uneBiere.ouverte = false;
        BouteilleBiere uneSecondeBiere = new BouteilleBiere("Leffe", 6.6 ,"Abbaye de Leffe") ;
        BouteilleBiere uneTroisiemeBiere = new BouteilleBiere("Kronenbourg", 4.2 ,"Obernai") ;
        BouteilleBiere uneQuatriemeBiere = new BouteilleBiere("Pietra", 6.0 ,"Brasserie de Pietra") ;
        BouteilleBiere uneCinquiemeBiere = new BouteilleBiere("Affligem", 6.8, "Abbaye bénédictine d'Affligem");
        BouteilleBiere uneSixiemeBiere = new BouteilleBiere("Heineken", 5.0, "Brasserie Neerlandaise");
        
        // affichage des étiquettes à l'écran
        uneBiere.lireEtiquette();
        uneSecondeBiere.lireEtiquette();
        uneTroisiemeBiere.lireEtiquette();
        uneQuatriemeBiere.lireEtiquette();
        
       
        uneSecondeBiere.Decapsuler(); // on applique la commande décapsuler à la seconde bière
        System.out.println(uneSecondeBiere.ouverte); //on regarde si la valeur de ouverte est bien mise à jour
        
        System.out.println(uneBiere) ;//affiche le type et l'adresse mémoire associée
        uneCinquiemeBiere.Decapsuler();
        System.out.println(uneCinquiemeBiere);
        System.out.println(uneSixiemeBiere);
        
        //BouteilleBiere uneSecondeBiere = new BouteilleBiere() ;
        //uneSecondeBiere.Nom = "Leffe";
        //uneSecondeBiere.degreAlcool = 6.6 ;
        //uneSecondeBiere.Brasserie = "Abbaye de Leffe";
        
    }
    
}
