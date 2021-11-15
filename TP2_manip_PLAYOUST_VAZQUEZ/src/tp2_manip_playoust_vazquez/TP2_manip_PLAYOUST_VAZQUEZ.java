/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_playoust_vazquez;

/**
 *
 * @author anyavazquez
 */
public class TP2_manip_PLAYOUST_VAZQUEZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2 ;
        
        System.out.println(assiette3.nbCalories); // On affiche le nombre de calories de l'assiette 3. 
        //On a bien 3 tartiflettes qui ont été créées.
        
        System.out.println("nb de calories de Assiette 2 : " +assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " +assiette3.nbCalories) ;
        
        assiette2.nbCalories+=100;
        
        System.out.println("nb de calories de Assiette 2 : " +assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " +assiette3.nbCalories) ;
        
        // assiette 2 et 3 référencent donc à la même tartiflette.
        
        Tartiflette assiettebis = assiette2;
        assiette2=assiette1;
        assiette1=assiettebis;
        
        System.out.println("nb de calories de Assiette 1 : " +assiette1.nbCalories) ;
        System.out.println("nb de calories de Assiette 2 : " +assiette2.nbCalories) ; // On a bien échangé les tartiflettes référencées par les assiettes 1 et 2
        
        //Moussaka assiette666 = assiette1 ; On ne peut pas mettre en relation deux objets de types différents.
        //Moussaka assiette667 = new Tartiflette() ; Impossible
        //Non ce n'est pas possible.
        
        Moussaka TabMoussaka [] = new Moussaka[10];
        for (int i=0; i<10;i++) {
            TabMoussaka[i]= new Moussaka(0);
            System.out.println(TabMoussaka[i].nbCalories);
        }
        
        
    }
    
}
