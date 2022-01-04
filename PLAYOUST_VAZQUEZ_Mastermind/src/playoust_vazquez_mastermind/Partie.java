/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playoust_vazquez_mastermind;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author anyavazquez
 */
public class Partie {
    Joueur player;
    Grille GrilleJeu;
    Pion [] CombiGagnante;
    Pion [] CombiCourante;
    Random generateurAleat = new Random ();
    
    /**
     *Constructeur de la classe Partie : Crée une combinaison gagnante et courante (qui va être modifié par l'utilisateur ensuite) de pions de couleur "" et une combinaison courante
     * Crée un joueur de Nom "".
     */
    public Partie() {
        CombiGagnante = new Pion [4];
        CombiCourante = new Pion [4];
        player = new Joueur("");
        for (int i=0;i<4;i++) {
            CombiGagnante[i] = new Pion("");
            CombiCourante[i] = new Pion("");
        }
    }    
    
    /**
     * Permet d'initialiser la partie : Crée une nouvelle grille, demande un nom et crée une combinaison gagnante aléatoire.
     */
    public void initialiserPartie(){
        GrilleJeu=new Grille();
        
        System.out.println("Veuillez saisir votre nom");
        Scanner sc = new Scanner(System.in);
        player.Nom = sc.nextLine();
        
        for (int i=0; i<4; i++) {
            int choixCouleur = generateurAleat.nextInt(7);
            if (choixCouleur==0) {
                CombiGagnante[i]=new Pion("Rose");
            }
            if (choixCouleur==1) {
                CombiGagnante[i]=new Pion("Jaune");
            }
            if (choixCouleur==2) {
                CombiGagnante[i]=new Pion("Vert");
            }
            if (choixCouleur==3) {
                CombiGagnante[i]=new Pion("Bleu");
            }
            if (choixCouleur==4) {
                CombiGagnante[i]=new Pion("Orange");
            }
            if (choixCouleur==5) {
                CombiGagnante[i]=new Pion("Gris");
            }
            if (choixCouleur==6) {
                CombiGagnante[i]=new Pion("Marron");
            }
            if (choixCouleur==7) {
                CombiGagnante[i]=new Pion("Turquoise");
            }
        }
        
    }
    
    /**
     * Permet de débuter et de jouer la partie. 
     */
    public void debuterPartie(){
        initialiserPartie();
        GrilleJeu.afficherGrillesurConsole();
        
        while (Gagnant(CombiGagnante,CombiCourante)==false && GrilleJeu.etreRemplie()==false) {
            
            CombiCourante=GrilleJeu.CreerCombi();
            
            GrilleJeu.ajouterCombinaison(CombiCourante);
            
            GrilleJeu.afficherGrillesurConsole();
            
            VerifComb(CombiGagnante,CombiCourante);
        }
        
        if (Gagnant(CombiGagnante,CombiCourante)==true) {
            System.out.print("Bravo " + player.Nom + " ! Vous avez gagné.");
        }         
        
        else {
            System.out.print("Vous avez perdu !\nLa bonne combinaison était : ");
            for (int i=0;i<4;i++) {
                System.out.print(CombiGagnante[i].lireCouleur()+" ");
            }
        }
    }
    
    /**
     * Permet de vérifier la combinaison du Joueur (CombiJ). Donne le nombre de pions bien placés et de pions mal placés.
     * @param CombiG : Combi gagnante crée par le programme
     * @param CombiJ : Dernière combinaison entrée par le joueur
     */
    public void VerifComb (Pion [] CombiG, Pion [] CombiJ) {
       
        int [] tabVerif = new int[2];
        tabVerif[0]=0;
        tabVerif[1]=0;
        
        
        boolean [] tabBool1= new boolean [4];
        boolean [] tabBool2 = new boolean [4];
        for (int i=0; i<4;i++) {
            tabBool1[i]=false;
            tabBool2[i]=false;
        }
        
        for (int i=0;i<4;i++) {
            if (CombiG[i].lireCouleur()==CombiJ[i].lireCouleur()) {
                tabVerif[0]+=1;
                tabBool1[i]=true;
                tabBool2[i]=true;        
            }
        }
        
        for (int i=0;i<4;i++) {
            for (int j=0;j<4;j++) {
                if (CombiJ[i].lireCouleur()==CombiG[j].lireCouleur()&& tabBool2[j]!=true && tabBool1[i]!=true) {
                    tabVerif[1]+=1;
                    tabBool1[i]=true;
                    tabBool2[j]=true;
                    break;
                }
            }
        }
        
        System.out.println("Vous avez "+ tabVerif[0]+ " pions bien placés et "+ tabVerif[1]+" pions mal placés");
    }
    
    /**
     * Permet de déterminer si le joueur est gagnant ou non. 
     * @param CombiG : Combi gagnante crée par le programme
     * @param CombiJ : Dernière combinaison entrée par le joueur
     * @return
     */
    public boolean Gagnant (Pion [] CombiG, Pion [] CombiJ) {
        
        boolean resultat= false;
        int res=0;
        
        for (int i=0;i<4;i++) {
            if (CombiG[i].lireCouleur()==CombiJ[i].lireCouleur()) {
                res+=1;
            }
        }
        if (res==4) {
            resultat=true;
        }
        return resultat;
    }
}
