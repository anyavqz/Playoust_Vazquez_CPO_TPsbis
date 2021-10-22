/*
Vazquez Anya - Prosper Playoust
TDB-2
27/09/2021
TP1 - exo4
 */
package tp1_stats_playoust_vazquez;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author anyavazquez
 */
public class TP1_stats_PLAYOUST_VAZQUEZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] Tab = new int [6]; //on déclare un tableau "Tab" de 6 cases qui contiendront des nombres entiers
        int m; //déclaration de la variable m qui va être choisie par l'utilisateur
        for (int i=0; i < 6; i++) { // ici, on créé une boucle for pour initialiser chaque case du tableau à 0
            Tab[i]=0;
        }
        //System.out.println(Arrays.toString(Tab)); nous vérifions ici que la boucle for ci-dessus fonctionnait bien
        System.out.println("Veuillez saisir une valeur entière");// affichage d'un message à l'utilisateur 
        Scanner sc;
        sc = new Scanner(System.in); // Scanner permet à l'utilisateur de saisir des valeurs, et "new" permet qu'elles soient enregistrées
        m=sc.nextInt(); // saisie de la valeur entière
        
        for (int i=0; i <= m; i++) { //création de la boucle for pour i compris entre 0 et m
            Random generateurAleat = new Random ();//générateur de nombre
            int Nb1=generateurAleat.nextInt(5); //déclaration de la variable Nb1 et attribution d'une valeur aléatoire entre 0 et 5
            Tab[Nb1]+=1;// on incrémente la case d'indice correspondante
        }
        System.out.println("Le tableau résultat est: ");
        for (int i=0; i < 6; i++) {
            System.out.println(Tab[i]); // affichage du tableau résultat à l'aide d'une boucle for
        }
    }
    
}
