package sp4_console_playoust._vazquez;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anyavazquez
 */
public class Grille {
    Cellule CellulesJeu [][];
    
    public Grille() {
        CellulesJeu= new Cellule [6][7];
        for (int i=0; i < 6; i++) {
            for (int j=0; j<7; j++) {
                CellulesJeu[i][j]=new Cellule();
            }
        }
    }
    
    public boolean ajouterJetonDansColonne(Jeton J, int Colonne) {
        for (int i=5; i>=0; i--) {
            if (CellulesJeu[i][Colonne].affecterJeton(J) == false) {
                CellulesJeu[i][Colonne].jetonCourant=J;
                return true;
            }
        }
        return false;
    }
    
    public boolean etreRemplie() {
        boolean EtatGrille = true;
        for (int i=0; i<7; i++) {
            if (CellulesJeu[0][i].jetonCourant==null) {
                EtatGrille = false;
                return EtatGrille;
            }
        }
        return EtatGrille;
        
            
    }
    
    public void viderGrille() {
        for (int i=0; i<6; i++) {
            for (int j = 0; i<7; i++) {
                CellulesJeu[i][j].jetonCourant=null;
            }
        }
    }
    
    public void afficherGrilleSurConsole() {//ajouter les trous noirs pour versions suivantes
        for (int i=0; i<6; i++) {
            for (int j=0; j<7; j++) {
                if (CellulesJeu[i][j].jetonCourant!=null) {
                    CellulesJeu[i][j].jetonCourant.lireCouleur();
                    if ("Rouge".equals(CellulesJeu[i][j].jetonCourant.Couleur)) {
                        System.out.print("R");
                    } else {
                        System.out.print("J");
                    }
                } else {
                    System.out.print("/");
                }
            } System.out.println("");
        }
        
    }
    
    public boolean celluleOccupee(int L, int C) {
        if (CellulesJeu[L][C].jetonCourant!=null) {
            return true;
        }
        return false;
    }
    
    public String lireCouleurDuJeton(int L, int C) {
        String couleurCourante = CellulesJeu[L][C].jetonCourant.Couleur;
        return couleurCourante;
    }
    
    public boolean etreGagnantePourJoueur(Joueur Player) {
        String Color = Player.Couleur;
        for (int i = 0; i< 6; i++) {
            for (int j = 0; j<4; j++) {
                if (CellulesJeu[i][j].lireCouleurDuJeton() == Color && CellulesJeu[i][j+1].lireCouleurDuJeton() == Color && CellulesJeu[i][j+2].lireCouleurDuJeton() == Color && CellulesJeu[i][j+3].lireCouleurDuJeton() == Color) {
                    return true;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0 ; j < 7; j++) {
                if (CellulesJeu[i][j].lireCouleurDuJeton() == Color && CellulesJeu[i+1][j].lireCouleurDuJeton() == Color && CellulesJeu[i+2][j].lireCouleurDuJeton() == Color && CellulesJeu[i+3][j].lireCouleurDuJeton() == Color) {
                    return true;
                }
            }
        }
        for (int i=0; i<3; i++) {
            for (int j=0; j<4; j++) {
                if (CellulesJeu[i][j].lireCouleurDuJeton() == Color && CellulesJeu[i+1][j+1].lireCouleurDuJeton() == Color && CellulesJeu[i+2][j+2].lireCouleurDuJeton() == Color && CellulesJeu[i+3][j+3].lireCouleurDuJeton() == Color) {
                    return true;
                }
            }
        }
        for (int i=5; i>2; i--) {
            for (int j=0; j<4; j++) {
                if (CellulesJeu[i][j].lireCouleurDuJeton() == Color && CellulesJeu[i-1][j+1].lireCouleurDuJeton() == Color && CellulesJeu[i-2][j+2].lireCouleurDuJeton() == Color && CellulesJeu[i-3][j+3].lireCouleurDuJeton() == Color) {
                    return true;
                }
            }
        }
        return false;
        
    }
    
}
