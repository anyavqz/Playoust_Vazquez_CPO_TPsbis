/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_convertisseurobjet_playoust_vazquez;
/**
 *
 * @author petitweb
 */
public class Convertisseur {
    int nbConversions;
    
    public Convertisseur() {
        nbConversions=0;
    }
    
    public float CelciusVersKelvin(float Celcius) { // On créé notre démarche. Elle prend en entrée une valeur en Celcius et retourne sa pendante en Kelvin
        float Kelvin;
        nbConversions+=1;
        return Kelvin=Celcius+273.15f; // On ajoute un f derrière le nombre pour le forcer à être en float
    }

    public float KelvinVersCelcius(float Kelvin) { // Meme principe
        float Celcius;
        nbConversions+=1;
        return Celcius=Kelvin-273.15f;
         
    }
    
    public float FarenheitVersCelcius(float Farenheit) {
        float Celcius;
        nbConversions+=1;
        return Celcius=(Farenheit-32)/1.8f;
    }
    
    public float CelciusVersFarenheit(float Celcius) {
        float Farenheit;
        nbConversions+=1;
        return Farenheit=Celcius*1.8f+32f;
    }
    
    public float KelvinVersFarenheit(float Kelvin) { // Pour cette demarche, on décide de faire appel à une autre démarche deja créée
        float Farenheit;
        float Celcius=KelvinVersCelcius(Kelvin);
        nbConversions-=1; // On retire 1 car on utilise deux méthodes.
        return Farenheit=CelciusVersFarenheit(Celcius);
    }
    
    public float FarenheitVersKelvin(float Farenheit) { // Meme chose
        float Kelvin;
        float Celcius=FarenheitVersCelcius(Farenheit);
        nbConversions-=1;
        return Kelvin=CelciusVersKelvin(Celcius);
    }
    @Override
    public String toString () {
    return "nb de conversions "+ nbConversions;
    }
}
