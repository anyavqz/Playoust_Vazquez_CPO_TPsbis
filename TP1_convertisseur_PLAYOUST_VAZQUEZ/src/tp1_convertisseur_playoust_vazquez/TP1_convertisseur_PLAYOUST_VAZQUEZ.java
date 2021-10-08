/*
Vazquez Anya - Prosper Playoust
TDB-2
27/09/2021
TP0 - exo2
 */
package tp1_convertisseur_playoust_vazquez;

import java.util.Scanner;

/**
 *
 * @author anyavazquez
 */
public class TP1_convertisseur_PLAYOUST_VAZQUEZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double Valeur;
        System.out.println("Veuillez saisir une valeur");
        Scanner sc;
        sc = new Scanner(System.in); 
        Valeur=sc.nextDouble();
        System.out.println(Valeur);
        
        double valeurK=Valeur+273.15;
        System.out.println("La température en kelvin est de "+valeurK);
        
        
        
    }
    
    public static double CelciusVersKelvin(double Celcius) {
        double Kelvin;
        return Kelvin=Celcius+273.15;
    }
    
    Scanner sc;
    double Celcius=sc.nextDouble();
   // System.out.println(CelciusVersKelvin(Celcius));
    
    
    
}
