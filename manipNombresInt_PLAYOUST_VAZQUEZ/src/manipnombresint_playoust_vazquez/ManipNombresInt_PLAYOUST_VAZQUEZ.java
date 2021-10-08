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
        int entier2;
        System.out.println("Saisir deux entiers"); //Salut
        Scanner sc = new Scanner(System.in);
        entier1=sc.nextInt();
        entier2=sc.nextInt();
        System.out.println(entier1 + " " +entier2);
        System.out.println("La somme de ces deux entiers est " +(entier1+entier2));
        System.out.println("La différence de ces deux entiers est " +(entier1-entier2));
        System.out.println("Le produit de ces deux entiers est " +(entier1*entier2));
        
        
        int quotient=entier1/entier2;
        int reste=entier1%entier2;
        System.out.println("le quotient du premier entier par le deuxieme vaut "+quotient+"\nle reste vaut "+ reste);
        
    }
    
}
