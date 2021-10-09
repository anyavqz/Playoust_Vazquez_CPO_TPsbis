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
        int [] Tab = new int [6];
        int m;
        for (int i=0; i < 6; i++) {
            Tab[i]=0;
        }
        //System.out.println(Arrays.toString(Tab));
        System.out.println("Veuillez saisir une valeur entière");
        Scanner sc;
        sc = new Scanner(System.in); 
        m=sc.nextInt();
        
        for (int i=0; i <= m; i++) {
            Random generateurAleat = new Random ();
            int Nb1=generateurAleat.nextInt(5);
            Tab[i]=Nb1;
        }
        System.out.println("Le tableau résultat est: ");
        for (int i=0; i < 6; i++) {
            System.out.println(Tab[i]);
        }
    }
    
}
