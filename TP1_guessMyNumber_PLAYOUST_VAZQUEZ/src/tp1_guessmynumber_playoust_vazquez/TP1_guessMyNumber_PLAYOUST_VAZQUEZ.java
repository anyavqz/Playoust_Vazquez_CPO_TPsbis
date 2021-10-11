/*
Vazquez Anya - Prosper Playoust
TDB-2
27/09/2021
TP1 - exo2
 */
package tp1_guessmynumber_playoust_vazquez;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author anyavazquez
 */
public class TP1_guessMyNumber_PLAYOUST_VAZQUEZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat = new Random (); //Creation du generateur de nombre aleatoire
        int Nb1=generateurAleat.nextInt(100); // Creation d'un nombre aleatoire entre 0 et 100
        int Nb2=generateurAleat.nextInt(100);
        int Nb3=generateurAleat.nextInt(100);
        int Nb4=generateurAleat.nextInt(100);
        int Nb5=generateurAleat.nextInt(100);
        System.out.println(Nb1);
        System.out.println(Nb2);
        System.out.println(Nb3);
        System.out.println(Nb4);
        System.out.println(Nb5);
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel niveau de difficulté vous voulez ?\n1)Facile\n2)Normal\n3)Difficile");
        int Diff=sc.nextInt(); 
        int NbAl=generateurAleat.nextInt(100); //On genere un nombre aleatoire entre 0 et 100 qui devra etre devine par l'utilisateur
        int NbUt=-1; // On initialise la variable qui va prendre le nombre saisi par l'utilisateur
        int compteur=0;// On initialise le compteur
        if (Diff==2) { 
            while (NbUt!=NbAl) {
                System.out.println("Veuillez saisir un nombre");
                NbUt=sc.nextInt(); // Tant que le nomnbre n'est pas deviné, on demande un autre nombre à l'utilisteur.
                compteur+=1; // Le compteur augmente a chaque essai
                if (NbUt>NbAl) { 
                    System.out.println("Trop grand"); // On donne un indice
                }
                if (NbUt<NbAl) {
                System.out.println("Trop petit");
            }
     
            }System.out.println("Gagné"); // Si on sort de la boucle, ca veut dire que c'est gagné
             System.out.println("Vous avez fait "+compteur+" tentatives");
        }
        if (Diff==1) { 
            NbAl=generateurAleat.nextInt(75); // On diminue l'intervalle du nombre aleatoire pour que ce soit plus simple
            while (NbUt!=NbAl) {
                System.out.println("Veuillez saisir un nombre");
                NbUt=sc.nextInt();
                compteur+=1;
                if(NbUt>NbAl+25) { // Si l'écart est plus grand que 25, on donne un meilleur indice.
                    System.out.println("Vraiment trop grand");
                }
                if (NbUt>NbAl && NbUt<NbAl+25) {
                    System.out.println("Trop grand");
                }
                if(NbUt<NbAl-25) {
                    System.out.println("Vraiment trop petit");    
                }
                if(NbUt<NbAl && NbUt>NbAl-25) {
                    System.out.println("Trop petit");
                }
            } 
            System.out.println("Gagné");
        }    
        if (Diff==3) {
            NbAl=generateurAleat.nextInt(150);
            while (NbUt!=NbAl) {
                System.out.println("Veuillez saisir un nombre");
                NbUt=sc.nextInt();
                compteur+=1;
                
                if (NbUt>NbAl) {
                    System.out.println("Trop grand");
                }
                
                if(NbUt<NbAl) {
                    System.out.println("Trop petit");
                }
                if (compteur==10) {
                    break;
                }
                System.out.println("Gagné");
            }
            
        }
    
}// Modifier 3
}
