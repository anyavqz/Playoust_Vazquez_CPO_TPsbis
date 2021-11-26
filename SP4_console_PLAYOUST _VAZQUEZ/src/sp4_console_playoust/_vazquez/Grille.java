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
    
    /**
     * Constructeur de la classe grille.
     */
    public Grille() {
        CellulesJeu= new Cellule [6][7];
        for (int i=0; i < 6; i++) {
            for (int j=0; j<7; j++) {
                CellulesJeu[i][j]=new Cellule();
            }
        }
    }
    
    /**
     * Permet d'ajouter un jeton dans une colonne de la grille.
     * @param J : le jeton à ajouter
     * @param Colonne : la colonne où est ajoutée le jeton
     * @return true ou false si l'ajout s'est bien passé
     */
    public boolean ajouterJetonDansColonne(Jeton J, int Colonne) {
        for (int i=5; i>=0; i--) {
            if (CellulesJeu[i][Colonne].affecterJeton(J)==true){
                return true;
            }
        }
        return false;
    }
    
    /**
     * Permet de vérifier si une colonne est remplie
     * @param col : le numéro de la colonne à vérifier 
     * @return true ou false si la colonne est remplie ou non
     */
    public boolean colonneRemplie(int col) {
        boolean remplie=true;
        for (int i=0; i<6; i++) {
            if (CellulesJeu[i][col].jetonCourant==null) {
                remplie=false;
            } 
        }
        return remplie;
    }
    
    /**
     * Permet de vérifier si la grille est remplie ou non.
     * @return true ou false si la grille est remplie ou non
     */
    public boolean etreRemplie () {
        boolean EtatGrille = true;
        int i=0;
        while (EtatGrille==true) {
            EtatGrille=colonneRemplie(i);
            i+=1;
            if (i==7) {
                return EtatGrille;
            }
        }
        return EtatGrille;
    }
    
    /**
     * Permet de vider la grille. Réinitialise toute la grille
     */
    public void viderGrille() {
        for (int i=0; i<6; i++) {
            for (int j = 0; i<7; i++) {
                CellulesJeu[i][j].jetonCourant=null;
            }
        }
    }
    
    /**
     * Permet d'afficher la grille dans la console
     */
    public void afficherGrilleSurConsole() {
        for (int i=0; i<6; i++) {
            for (int j=0; j<7; j++) {
                if (CellulesJeu[i][j].presenceTrouNoir()==true) {
                    System.out.print("N ");
                } else if (CellulesJeu[i][j].presenceDesintegrateur()==true) {
                    System.out.print("D ");
                } else if (CellulesJeu[i][j].jetonCourant!=null) {
                    CellulesJeu[i][j].jetonCourant.lireCouleur();
                    if ("Rouge".equals(CellulesJeu[i][j].jetonCourant.Couleur)) {
                        System.out.print("R ");
                    } 
                    if ("Jaune".equals(CellulesJeu[i][j].jetonCourant.Couleur)) {
                        System.out.print("J ");
                    }
                } else {
                        System.out.print("/ ");
                }
            } System.out.println("");
        }
    }
        
    /**
     * Permet de savoir si la cellule est occupée par un jeton ou non
     * @param L : la ligne de la cellule 
     * @param C : la colonne de la cellule
     * @return true ou false si la cellule est occupée ou non
     */
    public boolean celluleOccupee(int L, int C) {
        if (CellulesJeu[L][C].jetonCourant!=null) {
            return true;
        }
        return false;
    }
    
    /**
     * Permet de lire la couleur du jeton dans la celllule
     * @param L : la ligne de la cellule
     * @param C : la colonne de la cellule
     * @return la couleur du jeton
     */
    public String lireCouleurDuJeton(int L, int C) {
        String couleurCourante = CellulesJeu[L][C].jetonCourant.Couleur;
        return couleurCourante;
    }
    
    /**
     * Permet de vérifier si la partie est gagnée par un joueur
     * @param Player : joueur testé pour savoir si il a gagné
     * @return true ou false si le joueur a gagné ou non
     */
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
    
    /**
     * Permet de tasser une colonne 
     * @param col : colonne à tasser
     */
    public void tasserGrille(int col) {
        for (int i=5; i>0; i--) {
            if (celluleOccupee(i , col)==false) {
                CellulesJeu[i][col].jetonCourant=CellulesJeu[i-1][col].jetonCourant;
                CellulesJeu[i-1][col].jetonCourant=null;
            }
        }  
    }
    
    /**
     * Permet de tasser toute la grille
     */
    public void tasserGrille() {
        for (int i=0; i<7; i++) {
            tasserGrille(i);
        }
    }
    
    /**
     * Permet de placer un trou noir
     * @param L : ligne de la cellule 
     * @param C : colonne de la cellule 
     * @return  true ou false si le trou noir a bien été placé
     */
    public boolean placerTrouNoir(int L, int C) {
        return CellulesJeu[L][C].placerTrouNoir()==true;
    }
    
    /**
     * Permet de placer un désintégrateur
     * @param L : ligne de la cellule
     * @param C : colonne de la cellule
     * @return true ou false si le désintégrateur a bien été placé
     */
    public boolean placerDesintegrateur(int L, int C) {
        return CellulesJeu[L][C].placerDesintegrateur()==true;
    }
    
    /**
     * Permet de supprimer un jeton
     * @param L : ligne de la cellule
     * @param C : colonne de la cellule
     * @return true ou false si le jeton a bien été supprimé
     */
    public boolean supprimerJeton(int L, int C) {
        if (CellulesJeu[L][C].jetonCourant!=null) {
            CellulesJeu[L][C].supprimerJeton();
            return true;
        }
        return false;
    }
    
    /**
     * Permet de récuperer un jeton
     * @param L : ligne de la cellule
     * @param C : colonne de la cellule
     * @return référence du jeton récuperé
     */
    public Jeton recupererJeton(int L, int C) {
        Jeton refJeton = CellulesJeu[L][C].recupererJeton();
        supprimerJeton(L,C);
        return refJeton;
    }
    
}
