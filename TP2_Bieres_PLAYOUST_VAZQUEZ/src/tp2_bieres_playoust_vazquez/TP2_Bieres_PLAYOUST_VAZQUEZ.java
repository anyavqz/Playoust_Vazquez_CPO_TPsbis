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
        
        // affichage des étiquettes à l'écran
        uneBiere.lireEtiquette();
        uneSecondeBiere.lireEtiquette();
        uneTroisiemeBiere.lireEtiquette();
        uneQuatriemeBiere.lireEtiquette();
        
        //BouteilleBiere uneSecondeBiere = new BouteilleBiere() ;
        //uneSecondeBiere.Nom = "Leffe";
        //uneSecondeBiere.degreAlcool = 6.6 ;
        //uneSecondeBiere.Brasserie = "Abbaye de Leffe";
        
    }
    
}
