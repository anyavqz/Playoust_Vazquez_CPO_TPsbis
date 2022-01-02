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
public class PionsGraphique extends JButton{
    Pion PionAssocie;
    
    ImageIcon img_turquoise = new javax.swing.ImageIcon(getClass().getResource("/imagesMastermind/T.jpeg"));
    ImageIcon img_bleue = new javax.swing.ImageIcon(getClass().getResource("/imagesMastermind/B.jpeg"));
    ImageIcon img_grise = new javax.swing.ImageIcon(getClass().getResource("/imagesMastermind/G.jpeg"));
    ImageIcon img_jaune = new javax.swing.ImageIcon(getClass().getResource("/imagesMastermind/J.jpeg"));
    ImageIcon img_marron = new javax.swing.ImageIcon(getClass().getResource("/imagesMastermind/M.jpeg"));
    ImageIcon img_orange = new javax.swing.ImageIcon(getClass().getResource("/imagesMastermind/O.jpeg"));
    ImageIcon img_verte = new javax.swing.ImageIcon(getClass().getResource("/imagesMastermind/V.jpeg"));
    ImageIcon img_rose = new javax.swing.ImageIcon(getClass().getResource("/imagesMastermind/R.jpeg"));
    
    public PionsGraphique (Pion unPion) {
        PionAssocie = unPion;
    }
    
    @Override
    public void paintComponent (Graphics G) {
        super.paintComponent(G);
        if (PionAssocie.lireCouleur()=="Turquoise") {
            setIcon(img_turquoise);
        }
        if (PionAssocie.lireCouleur()=="Orange") {
            setIcon(img_orange);
        }
        if (PionAssocie.lireCouleur()=="Gris") {
            setIcon(img_grise);
        }
        if (PionAssocie.lireCouleur()=="Jaune") {
            setIcon(img_jaune);
        }
        if (PionAssocie.lireCouleur()=="Marron") {
            setIcon(img_marron);
        }
        if (PionAssocie.lireCouleur()=="Vert") {
            setIcon(img_verte);
        }
        if (PionAssocie.lireCouleur()=="Rose") {
            setIcon(img_rose);
        }
        if (PionAssocie.lireCouleur()=="Bleu") {
            setIcon(img_bleue);
        }
    }
}
