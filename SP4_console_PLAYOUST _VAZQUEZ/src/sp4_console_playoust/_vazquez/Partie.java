package sp4_console_playoust._vazquez;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author anyavazquez
 */
public class Partie {
    
    
 Random generateurAleat = new Random ();
 Joueur ListeJoueurs [] = new Joueur[2];
 Joueur joueurCourant;
 Grille grilleJeu;
 Scanner sc = new Scanner(System.in);
 
 public Partie(Joueur j1,Joueur j2) {
     ListeJoueurs[0]=j1;
     ListeJoueurs[1]=j2;
}
 public void attribuerCouleursAuxJoueurs() {
     int ch_couleur = generateurAleat.nextInt(1);
     if (ch_couleur==0) {
         
         ListeJoueurs[0].affecterCouleur("Rouge");
         ListeJoueurs[1].affecterCouleur("Jaune");
         
     } else {
         
         ListeJoueurs[0].affecterCouleur("Jaune");
         ListeJoueurs[1].affecterCouleur("Rouge");
              }
     }
     
 
 
 public void initialiserPartie() {
     grilleJeu=new Grille();
     
     attribuerCouleursAuxJoueurs();
     
     for (int i=0;i<21;i++) {
         
        Jeton jR=new Jeton("Rouge");
        Jeton jJ=new Jeton("Jaune");
        if (ListeJoueurs[0].Couleur=="Rouge") {
         ListeJoueurs[0].ajouterJeton(jR);
         ListeJoueurs[1].ajouterJeton(jJ);
     }
        else {
            ListeJoueurs[1].ajouterJeton(jR);
            ListeJoueurs[0].ajouterJeton(jJ);
        }
 }
     for (int i=0; i<5;i++) {
         int ColAl=generateurAleat.nextInt(6);
         int LigAl=generateurAleat.nextInt(5);
         Cellule TrN =grilleJeu.CellulesJeu[LigAl][ColAl];
         while (TrN.presenceTrouNoir()==true) {
            ColAl=generateurAleat.nextInt(6);
            LigAl=generateurAleat.nextInt(5);
            TrN =grilleJeu.CellulesJeu[LigAl][ColAl];
         }
        grilleJeu.placerTrouNoir(LigAl, ColAl);
         
     }
 }    
 public void debuterPartie() {
     
     initialiserPartie();
     
     int P1J=generateurAleat.nextInt(1);
     joueurCourant=ListeJoueurs[P1J];
     
     while (grilleJeu.etreGagnantePourJoueur(ListeJoueurs[0])==false && grilleJeu.etreGagnantePourJoueur(ListeJoueurs[1])==false && grilleJeu.etreRemplie()==false){
         
         grilleJeu.afficherGrilleSurConsole();
         
         System.out.println("Voulez-vous jouer un jeton ou récuperer un jeton ?\n 1) Jouer\n 2) Récuperer");
         int commande=sc.nextInt();
         if (commande==1){
            System.out.println("Veuillez choisir une colonne");
            int col=sc.nextInt()-1;
            while (col>6 || col<0) {
                System.out.println("Erreur ! Veuillez choisir une colonne");
                col=sc.nextInt()-1;
            }
         
            Jeton jetonj=joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants-1];
            joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants-1]=null;
            joueurCourant.nombreJetonsRestants-=1;

            grilleJeu.ajouterJetonDansColonne(jetonj,col);
         }
        if (commande==2) {
            System.out.println("Veuillez saisir les coordonées du jeton\n Colonne : ");
            int colonne=sc.nextInt();
            System.out.println("Ligne");
            int ligne=sc.nextInt();
            Jeton Jrecup = grilleJeu.recupererJeton(colonne,ligne);
            if (Jrecup.Couleur!=joueurCourant.Couleur) {
                
            }
            grilleJeu.tasserGrille();
            if (grilleJeu.etreGagnantePourJoueur(ListeJoueurs[0])==true && grilleJeu.etreGagnantePourJoueur(ListeJoueurs[1])==true) {
                System.out.println("Le perdant est "+joueurCourant.Nom);
                return;
            }
            if (grilleJeu.etreGagnantePourJoueur(ListeJoueurs[0])) {
                System.out.println("Le gagnant est "+ListeJoueurs[0].Nom);
                return;
            }
            if (grilleJeu.etreGagnantePourJoueur(ListeJoueurs[1])) {
                System.out.println("Le gagnant est "+ListeJoueurs[1].Nom);
                return;
                }
            }
            if (joueurCourant==ListeJoueurs[0]) {
                    joueurCourant=ListeJoueurs[1];
                } else {
                    joueurCourant=ListeJoueurs[0];
                    }
     
     
    }
     System.out.println("Le perdant est "+joueurCourant.Nom);       
 }
}
  