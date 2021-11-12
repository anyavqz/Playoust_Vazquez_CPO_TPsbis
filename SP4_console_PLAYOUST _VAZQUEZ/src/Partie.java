/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anyavazquez
 */
public class Partie {
 
 Joueur ListeJoueurs [] = new Joueur[2];
 Joueur joueurCourant;
 //Grille grilleJeu;
 
 public Partie(Joueur j1,Joueur j2) {
     ListeJoueurs[0]=j1;
     ListeJoueurs[1]=j2;
}
 public void attribuerCouleursAuxJoueurs() {
     int ch_couleur=Math.random();
     if (ch_couleur==0) {
         
         ListeJoueurs[0].Couleur="Rouge";
     } else {
         ListeJoueurs[1].Couleur="Jaune";
              }
     }
     
 }
 
 //public void initialiserPartie() {
     
 //}
 
//}
