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
        
    double Celcius=sc.nextDouble();
    System.out.println(CelciusVersKelvin(Celcius));
    System.out.println(CelciusVersFarenheit(Celcius));
    
    double Farenheit=sc.nextDouble();
    System.out.println(FarenheitVersCelcius(Farenheit));
    System.out.println(FarenheitVersKelvin(Farenheit));
    
    double Kelvin=sc.nextDouble();
    System.out.println(KelvinVersCelcius(Kelvin));
    System.out.println(KelvinVersFarenheit(Kelvin));
    

        
    }
    
    public static double CelciusVersKelvin(double Celcius) {
        double Kelvin;
        return Kelvin=Celcius+273.15;
    }
    
    public static double KelvinVersCelcius(double Kelvin) {
        double Celcius;
        return Celcius=Kelvin-273.15;
         
    }
    
    public static double FarenheitVersCelcius(double Farenheit) {
        double Celcius;
        return Celcius=(Farenheit-32)/1.8;
    }
    
    public static double CelciusVersFarenheit(double Celcius) {
        double Farenheit;
        return Farenheit=Celcius*1.8+32;
    }
    
    public static double KelvinVersFarenheit(double Kelvin) {
        double Farenheit;
        double Celcius=KelvinVersCelcius(Kelvin);
        return Farenheit=CelciusVersFarenheit(Celcius);
    }
    
    public static double FarenheitVersKelvin(double Farenheit) {
        double Kelvin;
        double Celcius=FarenheitVersCelcius(Farenheit);
        return Kelvin=CelciusVersKelvin(Celcius);
    }
}
