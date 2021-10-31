/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author petitweb
 */
public class Convertisseur {
    int nbConversions=0;
    
    public double CelciusVersKelvin(double Celcius) { // On créé notre démarche. Elle prend en entrée une valeur en Celcius et retourne sa pendante en Kelvin
        double Kelvin;
        return Kelvin=Celcius+273.15;
    }
    
    public double KelvinVersCelcius(double Kelvin) { // Meme principe
        double Celcius;
        return Celcius=Kelvin-273.15;
         
    }
    
    public double FarenheitVersCelcius(double Farenheit) {
        double Celcius;
        return Celcius=(Farenheit-32)/1.8;
    }
    
    public double CelciusVersFarenheit(double Celcius) {
        double Farenheit;
        return Farenheit=Celcius*1.8+32;
    }
    
    public double KelvinVersFarenheit(double Kelvin) { // Pour cette demarche, on décide de faire appel à une autre démarche deja créée
        double Farenheit;
        double Celcius=KelvinVersCelcius(Kelvin);
        return Farenheit=CelciusVersFarenheit(Celcius);
    }
    
    public double FarenheitVersKelvin(double Farenheit) { // Meme chose
        double Kelvin;
        double Celcius=FarenheitVersCelcius(Farenheit);
        return Kelvin=CelciusVersKelvin(Celcius);
    }
    @Override
    public String toString () {
    return "nb de conversions"+ nbConversions;
    }
}
