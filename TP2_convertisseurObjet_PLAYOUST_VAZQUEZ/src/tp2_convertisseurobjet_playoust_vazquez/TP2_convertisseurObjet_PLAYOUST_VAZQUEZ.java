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
    Convertisseur temperature = new Convertisseur ();
    Scanner sc;
    sc = new Scanner(System.in); 
    System.out.print("Bonjour veuillez saisir une valeur");
    float valeur=sc.nextFloat();
    float valeurbis; // On créé une variable bis pour ne pas supprimer la premiere
    
    System.out.println("Saisissez la conversion que vous souhaitez effectuer\n1) De Celcius vers Kelvin \n2) De Kelvin vers Celcius\n3)De Celcius vers Farenheit\n4) De Farenheit vers Kelvin\n5) De Farenheit vers Celcius\n6) De Kelvin vers Farenheit");
    int Choix=sc.nextInt();
    
    if (Choix==1) {
        valeurbis=temperature.CelciusVersKelvin(valeur);
        System.out.println(valeur+" degré Celcius est égal à "+valeurbis+" degrés Kelvin");
    }
    if (Choix==2) {
        valeurbis=temperature.KelvinVersCelcius(valeur);
        System.out.println(valeur+" degré Celcius est égal à "+valeurbis+" degrés Kelvin");
    }
    if (Choix==3) {
        valeurbis=temperature.CelciusVersFarenheit(valeur);
        System.out.println(valeur+" degré Celcius est égal à "+valeurbis+" degrés Kelvin");
    }
    if (Choix==4) {
        valeurbis=temperature.FarenheitVersKelvin(valeur);
        System.out.println(valeur+" degré Celcius est égal à "+valeurbis+" degrés Kelvin");
    }
    if (Choix==5) {
        valeurbis=temperature.FarenheitVersCelcius(valeur);
        System.out.println(valeur+" degré Celcius est égal à "+valeurbis+" degrés Kelvin");
    }
    if (Choix==6) {
        valeurbis=temperature.KelvinVersFarenheit(valeur);
        System.out.println(valeur+" degré Celcius est égal à "+valeurbis+" degrés Kelvin");
    }
    System.out.println(temperature);
    }
    
}
