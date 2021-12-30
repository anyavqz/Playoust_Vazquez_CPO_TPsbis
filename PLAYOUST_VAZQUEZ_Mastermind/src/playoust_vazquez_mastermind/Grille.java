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
        System.out.println("Veuillez choisir une couleur : \nR : Rose \nJ : Jaune \nV : Vert \nB : Bleu\nO : Orange\nG : Gris\nM : Marron\nT : Turquoise");
        
        int ch=sc.next().charAt(0);
        while (ch!='R' && ch!='J'&& ch!='M' && ch!='V' && ch!='T' && ch!='B' && ch!='G' && ch!='O') {
            System.out.println("Saisie incorrecte, veuillez rééssayer");
            System.out.println("Veuillez choisir une couleur : \nR : Rose \nJ : Jaune \nV : Vert \nB : Bleu\nO : Orange\nG : Gris\nM : Marron\nT : Turquoise");
            ch=sc.next().charAt(0);
        }
        
        Pion PionJ= new Pion(null);
        
        switch (ch){
         case 'R' :
             PionJ= new Pion("Rose");
             break;
         case 'J' : 
             PionJ =new Pion("Jaune");
             break;
         case 'V' :
             PionJ =new Pion("Vert");
             break;
         case 'B' : 
             PionJ =new Pion("Bleu");
             break;
         case 'O' :
             PionJ =new Pion("Orange");
             break;
         case 'G' : 
             PionJ =new Pion("Gris");
             break;
         case 'M' :
             PionJ =new Pion("Marron");
             break;
         case 'T' : 
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
        if (PionJeu[11][0].lireCouleur()!="") {
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
                    System.out.print("V ");
                }
                if (PionJeu[i][j].lireCouleur().equals("Gris")) {
                    System.out.print("G ");
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



    
