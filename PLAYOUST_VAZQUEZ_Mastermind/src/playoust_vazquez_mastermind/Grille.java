/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playoust_vazquez_mastermind;
import java.util.Scanner;

/**
 *
 * @author petitweb
 */
public class Grille {

    Pion PionJeu[][];
    Scanner sc = new Scanner(System.in);

    public Grille() {
        PionJeu = new Pion[12][4];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 4; j++) {
                PionJeu[i][j] = new Pion("");
            }
        }
    }
    
    public String lireCouleur(int l,int c) {
        return PionJeu[l][c].lireCouleur();
    }
    
    public Pion AjouterPion() {
        System.out.println("Veuillez choisir une couleur : \n1 : Rose \n2 : Jaune \n3 : Vert \n4 : Bleu\n5 : Orange\n6 : Violet\n7 : Marron\n8 : Turquoise");
        int ch=sc.nextInt();
        Pion PionJ= new Pion(null);
        switch (ch){
         case 1 :
             PionJ= new Pion("Rose");
             break;
         case 2 : 
             PionJ =new Pion("Jaune");
             break;
         case 3 :
             PionJ =new Pion("Vert");
             break;
         case 4 : 
             PionJ =new Pion("Bleu");
             break;
         case 5 :
             PionJ =new Pion("Orange");
             break;
         case 6 : 
             PionJ =new Pion("Violet");
             break;
         case 7 :
             PionJ =new Pion("Marron");
             break;
         case 8 : 
             PionJ =new Pion("Turquoise");
             break;
        }
        return PionJ;
    }
    
    public Pion[] CreerCombi() {
        Pion[] Combi=new Pion[4];
        
        System.out.println("Veuillez saisir votre combinaison");
        Combi[0]=AjouterPion();
        Combi[1]=AjouterPion();
        Combi[2]=AjouterPion();
        Combi[3]=AjouterPion();
        return Combi;
    }
    
    public void ajouterCombinaison(Pion[] Combi) {
        int i=0;
        int j=0;
        while ( PionJeu[i][j].lireCouleur()!="") {
            i+=1;
        }
        for (j=0;j<4;j++) {
            PionJeu[i][j]=Combi[j];
        }
    
    }
    
    public boolean etreRemplie() {
        boolean etat=false;
        if (PionJeu[12][0]!=null) {
            etat=true;
        }
        return etat;
    }
    
    public void afficherGrillesurConsole() {
         
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 4; j++) {   
                if (PionJeu[i][j].lireCouleur().equals("Rose")) {
                    System.out.print("R ");
                }
                if (PionJeu[i][j].lireCouleur().equals("Jaune")) {
                    System.out.print("J ");
                }
                if (PionJeu[i][j].lireCouleur().equals("Vert")) {
                    System.out.print("Ve ");
                }
                if (PionJeu[i][j].lireCouleur().equals("Violet")) {
                    System.out.print("Vi ");
                }
                if (PionJeu[i][j].lireCouleur().equals("Orange")) {
                    System.out.print("O ");
                }
                if (PionJeu[i][j].lireCouleur().equals("Marron")) {
                    System.out.print("M ");
                }
                if (PionJeu[i][j].lireCouleur().equals("Turquoise")) {
                    System.out.print("T ");
                }
                if (PionJeu[i][j].lireCouleur().equals("Bleu")) {
                    System.out.print("B ");
                }
                if (PionJeu[i][j].lireCouleur().equals("")) {
                    System.out.print("/ ");
                }
                
            }
            System.out.println("");
        
        
    }
}
}



    
