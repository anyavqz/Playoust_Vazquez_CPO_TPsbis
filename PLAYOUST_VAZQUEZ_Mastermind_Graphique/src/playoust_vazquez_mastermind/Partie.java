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
    
    public Partie() {
        CombiGagnante = new Pion [4];
        CombiCourante = new Pion [4];
        
        for (int i=0;i<4;i++) {
            CombiGagnante[i] = new Pion("");
            CombiCourante[i] = new Pion("");
        }
    }    
    
    public void initialiserPartie(){
        GrilleJeu=new Grille();
        
        System.out.println("Veuillez saisir votre nom");
        Scanner sc = new Scanner(System.in);
        Joueur J1 = new Joueur(sc.nextLine());
        
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
    
    public void debuterPartie(){
        initialiserPartie();
        GrilleJeu.afficherGrillesurConsole();
        
        while (Gagnant(CombiCourante,CombiGagnante)==false && GrilleJeu.etreRemplie()==false) {
            
            CombiCourante=GrilleJeu.CreerCombi();
            
            GrilleJeu.ajouterCombinaison(CombiCourante);
            
            GrilleJeu.afficherGrillesurConsole();
            
            VerifComb(CombiGagnante,CombiCourante);
        }
        
        if (Gagnant(CombiCourante,CombiGagnante)==true) {
            System.out.print("Bravo " + player.Nom + " ! Vous avez gagn??.");
        }         
        
        else {
            System.out.print("Vous avez perdu !\nLa bonne combinaison ??tait : ");
            for (int i=0;i<4;i++) {
                System.out.print(CombiGagnante[i].lireCouleur()+" ");
            }
        }
    }
    
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
            if (tabBool1[i]==true) {
                break;
            }
            for (int j=0;j<4;j++) {
                if (CombiJ[i].lireCouleur()==CombiG[j].lireCouleur()&& tabBool2[j]!=true) {
                    tabVerif[1]+=1;
                    tabBool1[i]=true;
                    tabBool2[j]=true;
                    break;
                }
            }
        }
        
        System.out.println("Vous avez "+ tabVerif[0]+ " pions bien plac??s et "+ tabVerif[1]+" pions mal plac??s");
    }
    
    
    public boolean Gagnant (Pion [] CombiG, Pion [] CombiJ) {
        
        boolean resultat= false;
        int res=0;
        
        for (int i=0;i<4;i++) {
            if (CombiG[i]==CombiJ[i]) {
                res+=1;
            }
        }
        if (res==4) {
            resultat=true;
        }
        return resultat;
    }
}
