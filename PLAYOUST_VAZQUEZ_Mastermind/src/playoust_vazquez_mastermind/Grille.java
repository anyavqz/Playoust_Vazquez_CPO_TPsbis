/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playoust_vazquez_mastermind;

/**
 *
 * @author petitweb
 */
public class Grille {

    Pion PionJeu[][];

    public Grille() {
        PionJeu = new Pion[12][4];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 4; j++) {
                PionJeu[i][j] = new Pion(null);
            }
        }
    }
    
    public String lireCouleur(int l,int c) {
        return PionJeu[l][c].lireCouleur();
    }
    
    public boolean etreGagnant(Joueur J) {
        
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
                else {
                    System.out.print("/ ");
                }
            }    
        
        
    }
}
}


    
