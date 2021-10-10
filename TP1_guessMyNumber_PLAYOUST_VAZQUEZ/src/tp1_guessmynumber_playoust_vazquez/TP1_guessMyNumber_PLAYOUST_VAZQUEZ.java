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
        Random generateurAleat = new Random ();
        int Nb1=generateurAleat.nextInt(100); // Genere un nb aleatoire entre 0 et 100
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
        int NbAl=generateurAleat.nextInt(100);
        int NbUt=-1;
        int compteur=0;
        if (Diff==2) {
            while (NbUt!=NbAl) {
                System.out.println("Veuillez saisir un nombre");
                NbUt=sc.nextInt();
                compteur+=1;
                if (NbUt>NbAl) {
                    System.out.println("Trop grand");
                }
                if (NbUt<NbAl) {
                System.out.println("Trop petit");
            }
     
            }System.out.println("Gagné");
             System.out.println("Vous avez fait "+compteur+" tentatives");
        }
        if (Diff==1) {
            NbAl=generateurAleat.nextInt(75);
            while (NbUt!=NbAl) {
                System.out.println("Veuillez saisir un nombre");
                NbUt=sc.nextInt();
                compteur+=1;
                if(NbUt>NbAl+25) {
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
            while (compteur<=10) {
                System.out.println("Veuillez saisir un nombre");
                NbUt=sc.nextInt();
                compteur+=1;
                if (NbUt==NbAl) {
                    System.out.println("Gagné");
                    break;
                }
                
                if (NbUt>NbAl) {
                    System.out.println("Trop grand");
                }
                
                if(NbUt<NbAl) {
                    System.out.println("Trop petit");
                }
                if (compteur==10) {
                    System.out.println("Perdu");
                    break;
                }
                
            }  
            
        }
    
}
}
