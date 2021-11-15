/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Random;
/**
 *
 * @author anyavazquez
 */
public class Partie {
    
    
 Random generateurAleat = new Random ();
 Joueur ListeJoueurs [] = new Joueur[2];
 Joueur joueurCourant;
 Grille grilleJeu;
 
 public Partie(Joueur j1,Joueur j2) {
     ListeJoueurs[0]=j1;
     ListeJoueurs[1]=j2;
}
 public void attribuerCouleursAuxJoueurs() {
     int ch_couleur = generateurAleat.nextInt(1);
     if (ch_couleur==0) {
         
         ListeJoueurs[0].affecterCouleur("Rouge");
         
     } else {
         
         ListeJoueurs[1].affecterCouleur("Jaune");
         
              }
     }
     
 
 
 public void initialiserPartie() {
     grilleJeu=new Grille();
     
     attribuerCouleursAuxJoueurs();
     Jeton jR=new Jeton("Rouge");
     Jeton jJ=new Jeton("Jaune");
     
     for (int i=0;i<21;i++) {
         ListeJoueurs[0].ajouterJeton(jR);
         ListeJoueurs[1].ajouterJeton(jJ);
     }
 }
     
 public void debuterPartie() {
     
    
}
     
     
     
     
 
 
}