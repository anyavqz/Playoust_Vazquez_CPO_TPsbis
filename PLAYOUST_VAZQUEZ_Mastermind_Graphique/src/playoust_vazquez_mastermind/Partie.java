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
    Pion [] CombiCourante;
    Random generateurAleat = new Random ();
    
    public void initialiserPartie(){
        Pion [] CombiGagnante = new Pion [4];
        Pion [] CombiCourante = new Pion [4];
        GrilleJeu=new Grille();
        
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
                CombiGagnante[i]=new Pion("Violet");
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
        while (Gagnant()==false || GrilleJeu.etreRemplie()==false) {
            GrilleJeu.afficherGrillesurConsole();
            
            CombiCourante=GrilleJeu.CreerCombi();
            
            GrilleJeu.ajouterCombinaison(CombiCourante);
            
            VerifCombi(CombiGagnante,CombiCourante);
        }
        
        
        
    }
    
    public int [] VerifCombi (Pion [] CombiG, Pion [] CombiJ) {
        int [] tabVerif = new int [2];
        boolean [] tabBool = new boolean [4];
        int OK = 0;
        int notOK =0;
        
        for (int i=0; i<4; i++) {
            tabBool[i]=false;
        }
        
        for (int i=0; i<4; i++) {
            if (CombiG[i].couleur.equals(CombiJ[i].couleur)){
                OK+=1;
                tabBool[i]=true;
            }
        
        }
        tabVerif[0]=OK;
        
        for (int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                if (tabBool[i]==false && tabBool[j]==false) {
                    if (CombiG[i].couleur.equals(CombiJ[j].couleur)) {
                        notOK+=1;
                        tabBool[j]=true;
                    }
                }
            }
        }
        tabVerif[1]=notOK;
        
        return tabVerif;
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
            if (CombiG[i]==CombiJ[i]) {
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
                if (tabBool2[j]==true) {
                    break;
                }
                
                if (CombiJ[i]==CombiG[j]) {
                    tabVerif[1]+=1;
                    tabBool1[i]=true;
                    tabBool2[2]=true;
                }
            }
        }
        
        System.out.print("Vous avez "+ tabVerif[0]+ " jetons bien placés et "+ tabVerif[1]+" jetons mal placés");
    }
    
    
    public boolean Gagnant () {
        int check [] = VerifCombi(CombiGagnante, CombiCourante);
        boolean resultat= false;
        
        if (check[0]==4 && check[1]==0) {
            resultat = true;
        }
        return resultat;
    }
    
}
