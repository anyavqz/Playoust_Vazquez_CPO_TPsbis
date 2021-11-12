/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_playoust_vazquez;

import java.util.Scanner;

/**
 *
 * @author anyavazquez
 */
public class TP2_convertisseurObjet_PLAYOUST_VAZQUEZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc;
    
    Convertisseur Temperature =new Convertisseur();
    sc = new Scanner(System.in); 
    System.out.print("Bonjour veuillez saisir une valeur");
    double Temperature=sc.nextDouble();
    double Temperaturebis; // On créé une variable bis pour ne pas supprimer la premiere
    System.out.println("Saisissez la conversion que vous souhaitez effectuer\n1) De Celcius vers Kelvin \n 2) De Kelvin vers Celcius\3)De Celcius vers Farenheit\n4) De Farenheit vers Kelvin\n5) De Farenheit vers Celcius\n6) De Kelvin vers Farenheit");
    int Choix=sc.nextInt();
    if (Choix==1) {
        Temperaturebis=Convertisseur.CelciusVersKelvin(Temperature);
        System.out.println(Temperature+" degré Celcius est égal à "+Temperaturebis+" degrés Kelvin");
    }
    if (Choix==2) {
        Temperaturebis=Convertisseur.classKelvinVersCelcius(Temperature);
        System.out.println(Temperature+" degré Celcius est égal à "+Temperaturebis+" degrés Kelvin");
    }
    if (Choix==3) {
        Temperaturebis=Convertisseur.class(CelciusVersFarenheit(Temperature));
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
    
}
