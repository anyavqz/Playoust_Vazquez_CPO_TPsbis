/*
Vazquez Anya - Prosper Playoust
TDB-2
27/09/2021
TP1 - Exercie 1: Saisie et manipulation de nombres
 */
package manipnombresint_playoust_vazquez;

import java.util.Scanner;

/**
 *
 * @author anyavazquez
 */
public class ManipNombresInt_PLAYOUST_VAZQUEZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // 1 - SAISIE ET MANIPULATION DE NOMBRES
        int entier1;
        int entier2; // On initialise les deux entiers que l'on va demander à l'utilisateur
        System.out.println("Saisir deux entiers"); // affichage d'un message pour demander à l'utilisateur de saisir les valeurs qu'il souhaite
        Scanner sc = new Scanner(System.in); //Scanner permet à l'utilisateur de saisir des valeurs, et "new" permet qu'elles soient enregistrées
        entier1=sc.nextInt(); // saisie de valeur
        entier2=sc.nextInt();// saisie de valeur
        System.out.println(entier1 + " " +entier2); //affichage des entiers saisis
        System.out.println("La somme de ces deux entiers est " +(entier1+entier2)); // affichage de la somme + message 
        System.out.println("La différence de ces deux entiers est " +(entier1-entier2)); // affichage de la différence + message
        System.out.println("Le produit de ces deux entiers est " +(entier1*entier2)); // affichage du produit + message
        int quotient=entier1/entier2; // déclaration d'une varable quotient (entier) + affectation du quotient des valeurs saisies au préalable
        int reste=entier1%entier2; // déclaration d'une varable reste (entier) + affectation du reste de la division de nombre1 par nombre2
        System.out.println("le quotient du premier entier par le deuxieme vaut "+quotient+"\nle reste vaut "+ reste); //affichage du résultat
        
    }
    
}
