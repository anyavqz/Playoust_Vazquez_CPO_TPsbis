/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playoust_vazquez_mastermind;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author anyavazquez
 */
public class VerifGraphique extends JButton {
    Pion PetitPion;
    String Couleur;
    
    ImageIcon img_PPRouge = new javax.swing.ImageIcon(getClass().getResource("/imagesMastermind/PP_R.jpeg"));
    ImageIcon img_PPBlanc = new javax.swing.ImageIcon(getClass().getResource("/imagesMastermind/PP_bl.jpeg"));
    
    
     @Override
    public void paintComponent (Graphics G) {
        super.paintComponent(G);
        if (Couleur=="Rouge") {
            setIcon(img_PPRouge);
        }
        if (Couleur=="Blanc") {
            setIcon(img_PPBlanc);
        }
        
    }
}
