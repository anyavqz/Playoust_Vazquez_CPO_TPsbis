/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playoust_vazquez_mastermind;
import java.util.Random;

/**
 *
 * @author anyavazquez
 */
public class Partie {
    Joueur player;
    Grille GrilleJeu;
    Pion [] CombiGagnante;
    Random generateurAleat = new Random ();
    
    void initialiserPartie(){
        Pion [] CombiGagnante = new Pion [4];
        GrilleJeu=new Grille();
        
        for (int i=0; i<4; i++) {
            int choixCouleur = generateurAleat.nextInt(7);
            if (choixCouleur==0) {
                CombiGagnante[i].couleur="Rose";
            }
            if (choixCouleur==1) {
                CombiGagnante[i].couleur="Jaune";
            }
            if (choixCouleur==2) {
                CombiGagnante[i].couleur="Vert";
            }
            if (choixCouleur==3) {
                CombiGagnante[i].couleur="Bleu";
            }
            if (choixCouleur==4) {
                CombiGagnante[i].couleur="Orange";
            }
            if (choixCouleur==5) {
                CombiGagnante[i].couleur="Violet";
            }
            if (choixCouleur==6) {
                CombiGagnante[i].couleur="Marron";
            }
            if (choixCouleur==7) {
                CombiGagnante[i].couleur="Turquoise";
            }
        }
        
    }
    
    void debuterPartie(){
        initialiserPartie();
        
        
    }
    
    int [] VerifCombi (Pion[] CombiG, Pion[] CombiJ) {
        int OK = 0;
        int notOK =0;
        int [] tab = new int [2];
        return tab;
    }
    
}
