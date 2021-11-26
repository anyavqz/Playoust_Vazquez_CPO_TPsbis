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
     Cellule tabDes [] = new Cellule[5];
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
         if (i<2) {
             tabDes[i]=grilleJeu.CellulesJeu[LigAl] [ColAl];
             grilleJeu.placerDesintegrateur(LigAl, ColAl);
         }
     }
     for (int j=0;j<3;j++) {
         int ColAl=generateurAleat.nextInt(6);
         int LigAl=generateurAleat.nextInt(5);
         while (grilleJeu.CellulesJeu[LigAl][ColAl].presenceDesintegrateur()==true) {
             ColAl=generateurAleat.nextInt(6);
             LigAl=generateurAleat.nextInt(5);
         }
         grilleJeu.placerDesintegrateur(LigAl, ColAl);
     }
 }    
 public void debuterPartie() {
     
     initialiserPartie();
     
     int P1J=generateurAleat.nextInt(1);
     joueurCourant=ListeJoueurs[P1J];
     
     while (grilleJeu.etreGagnantePourJoueur(ListeJoueurs[0])==false && grilleJeu.etreGagnantePourJoueur(ListeJoueurs[1])==false && grilleJeu.etreRemplie()==false){
         
         grilleJeu.afficherGrilleSurConsole();
         
         
         int ligne=-1;
         int colonne=-1;
         int commande=0;
         boolean Valide=false;
         while (Valide==false) {
             System.out.println("Voulez-vous jouer un jeton ou récuperer un jeton ou désintegrer un jeton ?\n 1) Jouer\n 2) Récuperer\n 3) Désintégrer \n Vous avez "+ joueurCourant.nombreDesintegrateurs+" désintégrateurs");
             commande=sc.nextInt();
             if (commande==1){
                 System.out.println("Veuillez choisir une colonne");
                 colonne=sc.nextInt()-1;
                 if ( colonne<=6 && colonne>=0 && grilleJeu.colonneRemplie(colonne)==false) {
                     Valide=true;
                    } else {
                     System.out.println("Erreur, choisissez une autre colonne");
                    }
                }
             
             if (commande==2) {
                 System.out.println("Veuillez saisir les coordonées du jeton\n Ligne : ");
                 ligne=sc.nextInt()-1;
                 System.out.println("Colonne");
                 colonne=sc.nextInt()-1;
                 if (grilleJeu.lireCouleurDuJeton(ligne-1,colonne-1)==joueurCourant.Couleur) {
                     Valide=true;
                    }
                }
             
             if (commande == 3) {
                 if (joueurCourant.nombreDesintegrateurs!=0) {
                    System.out.println("Veuillez saisir la ligne et la colonne du jeton a désintégrer.\nL: ");
                    ligne=sc.nextInt()-1;
                    System.out.println("C: ");
                    colonne=sc.nextInt()-1;
                    if (grilleJeu.celluleOccupee(ligne, colonne)==true && grilleJeu.lireCouleurDuJeton(ligne, colonne)!=joueurCourant.Couleur) {
                        Valide=true;
                        } 
                    else {
                        System.out.println("Vous ne pouvez pas désintegrer de case vide ou un de vos jetons ");
                        }
                    } 
                 else {
                     System.out.println("Vous n'avez pas de désintégrateurs");
                    }
                }
        }
         if (commande==1){
             
            Jeton jetonj=joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants-1];
            joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants-1]=null;
            joueurCourant.nombreJetonsRestants-=1;
            int i=5;
            while (grilleJeu.celluleOccupee(i, colonne)) {
                i--;
            }
            if (grilleJeu.CellulesJeu[i][colonne].presenceDesintegrateur()==true) {
                joueurCourant.obtenirDesintegrateur();
            }
            grilleJeu.ajouterJetonDansColonne(jetonj,colonne);
            
         }
        if (commande==2) {
            
            Jeton Jrecup=grilleJeu.recupererJeton(ligne-1,colonne-1);
            joueurCourant.ajouterJeton(Jrecup);
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
            if (commande == 3) {
            
                joueurCourant.utiliserDesintegrateur();
                grilleJeu.supprimerJeton(ligne, colonne);
                grilleJeu.tasserGrille();
                
            }
        
            if (joueurCourant==ListeJoueurs[0]) {
                    joueurCourant=ListeJoueurs[1];
                } else {
                    joueurCourant=ListeJoueurs[0];
                    }
        }
            if (grilleJeu.etreGagnantePourJoueur(ListeJoueurs[0])) {
                System.out.println("Le gagnant est "+ListeJoueurs[0].Nom);
            }
            if (grilleJeu.etreGagnantePourJoueur(ListeJoueurs[1])) {
                System.out.println("Le gagnant est "+ListeJoueurs[1].Nom);
                }
    
    }
 }     


  