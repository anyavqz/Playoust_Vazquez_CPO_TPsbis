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
        Joueur J1 = new Joueur("Prosper");
        Joueur J2 = new Joueur("Petasse");
        Partie Partie = new Partie(J1,J2);
        Partie.debuterPartie();
        System.out.println(J2.Couleur);
        
        
        
        
        
           
    }
    
}
