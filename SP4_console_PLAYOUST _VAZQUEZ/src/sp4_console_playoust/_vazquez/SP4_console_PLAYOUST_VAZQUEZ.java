/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sp4_console_playoust._vazquez;

/**
 *
 * @author anyavazquez
 */
public class SP4_console_PLAYOUST_VAZQUEZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Jeton j =new Jeton("Rouge");
        Jeton j2 = new Jeton ("Jaune");
        Grille G = new Grille();
        G.ajouterJetonDansColonne(j, 5);
        G.ajouterJetonDansColonne(j2, 1);
        G.afficherGrilleSurConsole();
           
    }
    
}
