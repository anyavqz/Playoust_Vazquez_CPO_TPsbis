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
public class CouleurGraphique extends JButton {
    String CouleurGraph;
    
    ImageIcon img_turquoise = new javax.swing.ImageIcon(getClass().getResource("/imagesMastermind/T.jpeg"));
    ImageIcon img_bleue = new javax.swing.ImageIcon(getClass().getResource("/imagesMastermind/B.jpeg"));
    ImageIcon img_grise = new javax.swing.ImageIcon(getClass().getResource("/imagesMastermind/G.jpeg"));
    ImageIcon img_jaune = new javax.swing.ImageIcon(getClass().getResource("/imagesMastermind/J.jpeg"));
    ImageIcon img_marron = new javax.swing.ImageIcon(getClass().getResource("/imagesMastermind/M.jpeg"));
    ImageIcon img_orange = new javax.swing.ImageIcon(getClass().getResource("/imagesMastermind/O.jpeg"));
    ImageIcon img_verte = new javax.swing.ImageIcon(getClass().getResource("/imagesMastermind/V.jpeg"));
    
   //public CouleurGraphique (String color) {
        //CouleurGraph = color;
    //}
    
    @Override
    public void paintComponent (Graphics G) {
        super.paintComponent(G);
        setIcon(img_turquoise);
    }
}
