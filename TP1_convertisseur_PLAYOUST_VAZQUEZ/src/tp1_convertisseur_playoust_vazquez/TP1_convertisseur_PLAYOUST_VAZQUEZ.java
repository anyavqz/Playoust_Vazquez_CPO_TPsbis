/*
Vazquez Anya - Prosper Playoust
TDB-2
27/09/2021
TP1 - exo2
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
        
        double valeurK=Valeur+273.15; //On convertit notre valeur en Celcius en Kelvin
        System.out.println("La température en kelvin est de "+valeurK);
        
    double Celcius=sc.nextDouble(); //On teste la conversion des Celcius vers les autres mesures
    System.out.println(CelciusVersKelvin(Celcius));
    System.out.println(CelciusVersFarenheit(Celcius));
    
    double Farenheit=sc.nextDouble();//On teste la conversion des Farenheit vers les autres mesures
    System.out.println(FarenheitVersCelcius(Farenheit));
    System.out.println(FarenheitVersKelvin(Farenheit));
    
    double Kelvin=sc.nextDouble();//On teste la conversion des Kelvin vers les autres mesures
    System.out.println(KelvinVersCelcius(Kelvin));
    System.out.println(KelvinVersFarenheit(Kelvin));
    

    System.out.print("Bonjour veuillez saisir une valeur");
    double Temperature=sc.nextDouble();
    double Temperaturebis; // On créé une variable bis pour ne pas supprimer la premiere
    System.out.println("Saisissez la conversion que vous souhaitez effectuer\n1) De Celcius vers Kelvin \n 2) De Kelvin vers Celcius\3)De Celcius vers Farenheit\n4) De Farenheit vers Kelvin\n5) De Farenheit vers Celcius\n6) De Kelvin vers Farenheit");
    int Choix=sc.nextInt();
    if (Choix==1) {
        Temperaturebis=CelciusVersKelvin(Temperature);
        System.out.println(Temperature+" degré Celcius est égal à "+Temperaturebis+" degrés Kelvin");
    }
    if (Choix==2) {
        Temperaturebis=KelvinVersCelcius(Temperature);
        System.out.println(Temperature+" degré Celcius est égal à "+Temperaturebis+" degrés Kelvin");
    }
    if (Choix==3) {
        Temperaturebis=CelciusVersFarenheit(Temperature);
        System.out.println(Temperature+" degré Celcius est égal à "+Temperaturebis+" degrés Kelvin");
    }
    if (Choix==4) {
        Temperaturebis=FarenheitVersKelvin(Temperature);
        System.out.println(Temperature+" degré Celcius est égal à "+Temperaturebis+" degrés Kelvin");
    }
    if (Choix==5) {
        Temperaturebis=FarenheitVersCelcius(Temperature);
        System.out.println(Temperature+" degré Celcius est égal à "+Temperaturebis+" degrés Kelvin");
    }
    if (Choix==6) {
        Temperaturebis=KelvinVersFarenheit(Temperature);
        System.out.println(Temperature+" degré Celcius est égal à "+Temperaturebis+" degrés Kelvin");
    }
    }
    
    public static double CelciusVersKelvin(double Celcius) { // On créé notre démarche. Elle prend en entrée une valeur en Celcius et retourne sa pendante en Kelvin
        double Kelvin;
        return Kelvin=Celcius+273.15;
    }
    
    public static double KelvinVersCelcius(double Kelvin) { // Meme principe
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
    
    public static double KelvinVersFarenheit(double Kelvin) { // Pour cette demarche, on décide de faire appel à une autre démarche deja créée
        double Farenheit;
        double Celcius=KelvinVersCelcius(Kelvin);
        return Farenheit=CelciusVersFarenheit(Celcius);
    }
    
    public static double FarenheitVersKelvin(double Farenheit) { // Meme chose
        double Kelvin;
        double Celcius=FarenheitVersCelcius(Farenheit);
        return Kelvin=CelciusVersKelvin(Celcius);
    }
}
