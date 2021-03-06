/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package playoust_vazquez_mastermind;

import java.awt.Color;
import java.util.Random;


/**
 *
 * @author anyavazquez
 */
public class FenetreDeJeu extends javax.swing.JFrame {
    
    
    Joueur player;
    Grille GrilleJeu;
    
    Pion [] CombiGagnante = new Pion [4]; // Combinaison aléatoire de pions.
    PionsGraphique [] CombiCourante = new PionsGraphique [4]; // Combinaison de pions saisie par l'utilisateur à chaque tour.
    
    PionsGraphique [][] PionCourant = new PionsGraphique[12][4]; // Grille de PionsGraphique
    VerifGraphique [][] PetitPions  = new VerifGraphique [12][4]; // Grille de VerifGraphique
    
    int CompteurLigne=0; // Permet d'avoir un suivi sur l'avancement de la partie. Garde en mémoire le numéro de la ligne où il faut jouer
    int CompteurCombi=-1; // Permet de placer les pions du joueur au fur et à mesure dans CombiCourante
    
    Random generateurAleat = new Random ();
    
    /**
     * Creates new form FenetreDeJeu : Initialise la fenêtre de jeu : ajout des cases pour petits pions et grille de jeu et coloration des boutons pour
     * le choix des couleurs de combinaison.
     */
    public FenetreDeJeu() {
        GrilleJeu = new Grille();
        player = new Joueur("");
        initComponents();
        panneau_choix_pions.setVisible(false);
        panneau_text.setVisible(false);
        
        
        for (int i=0; i<12; i++) {
            for (int j=0; j<4; j++) {
                PionsGraphique PionGraph = new PionsGraphique(GrilleJeu.PionJeu[i][j]);
                PionCourant[i][j]=PionGraph;
                panneau_pions_joueur.add(PionCourant[i][j]);
            }
        }
        
        for (int i=0; i<12; i++) {
            for (int j=0; j<4; j++) {
                VerifGraphique PetitPion = new VerifGraphique();
                PetitPions [i][j] = PetitPion;
                panneau_verif_pions.add(PetitPions[i][j]);
            }
        }
        
        
        Color Bleu = new Color(51,153,255);
        btn_B.setBackground(Bleu);
        Color Turquoise = new Color(0,206,209);
        btn_T.setBackground(Turquoise);
        Color Rose = new Color(219,112,147);
        btn_R.setBackground(Rose);
        Color Gris = new Color(128,128,128);
        btn_G.setBackground(Gris);
        Color Marron = new Color(102,51,0);
        btn_M.setBackground(Marron);
        btn_J.setBackground(Color.YELLOW);
        Color Vert = new Color(160,220,48);
        btn_V.setBackground(Vert);
        Color Orange = new Color(255,153,0);
        btn_O.setBackground(Orange);
        
        
    }
    
    /**
     * Permet d'ajouter les pions de couleurs selectionnés par l'utilisateur dans la grille
     * @param couleur : couleur selectionnée dans le tableau de 8 couleurs disponibles
     * @return
     */
    public PionsGraphique AjouterPion(String couleur) {
        for (int i=0;i<12;i++) {
            for (int j=0;j<4;j++) {
                if (PionCourant[i][j].couleur=="") {
                    PionCourant[i][j].couleur=couleur;
                    panneau_pions_joueur.repaint();
                    CombiCourante[CompteurCombi]=PionCourant[i][j];
                    return PionCourant[i][j];
                }
                
            }
        }
        
        return null;
    }
    
    /**
     * Permet de vérifier les combinaisons entrées par le joueur/ attribue les couleurs aux petits pions en fonction
     * @param CombiG : combinaison gagnante
     * @param CombiJ : combinaison entrée par le joueur
     */
    public void VerifComb(Pion[] CombiG, PionsGraphique[] CombiJ) {

        if (CompteurCombi == 3) {
            if (PionCourant[11][0].couleur == "") {
                CompteurCombi = -1;
                int[] tabVerif = new int[2];
                tabVerif[0] = 0;
                tabVerif[1] = 0;

                boolean[] tabBool1 = new boolean[4];
                boolean[] tabBool2 = new boolean[4];
                for (int i = 0; i < 4; i++) {
                    tabBool1[i] = false;
                    tabBool2[i] = false;
                }

                for (int i = 0; i < 4; i++) {
                    if (CombiG[i].lireCouleur() == CombiJ[i].couleur) {
                        tabVerif[0] += 1;
                        tabBool1[i] = true;
                        tabBool2[i] = true;
                    }
                }

                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        if (CombiJ[i].couleur == CombiG[j].lireCouleur() && tabBool2[j] != true && tabBool1[i] != true) {
                            tabVerif[1] += 1;
                            tabBool1[i] = true;
                            tabBool2[j] = true;
                            break;
                        }
                    }
                }
                for (int i = 0; i < tabVerif[0]; i++) {
                    PetitPions[CompteurLigne][i].Couleur = "Blanc";
                }
                for (int i = tabVerif[0]; i < tabVerif[0] + tabVerif[1]; i++) {
                    PetitPions[CompteurLigne][i].Couleur = "Rouge";
                }
                CompteurLigne += 1;
                if (tabVerif[0] == 4) {
                    textemessage.setText("Bravo " + player.Nom + " ! Vous avez gagné. Le capitaine est fier de vous !");
                    //System.out.print("Bravo " + player.Nom + " ! Vous avez gagné.");
                    btn_T.setEnabled(false);
                    btn_B.setEnabled(false);
                    btn_G.setEnabled(false);
                    btn_M.setEnabled(false);
                    btn_R.setEnabled(false);
                    btn_J.setEnabled(false);
                    btn_V.setEnabled(false);
                    btn_O.setEnabled(false);
                }
            } else {
                textemessage.setText("Mince! Vous n'avez pas réussi à déchiffrer le code du Capitaine BarbeRousse... ");
                btn_T.setEnabled(false);
                btn_B.setEnabled(false);
                btn_G.setEnabled(false);
                btn_M.setEnabled(false);
                btn_R.setEnabled(false);
                btn_J.setEnabled(false);
                btn_V.setEnabled(false);
                btn_O.setEnabled(false);
            }
            
        }
        panneau_verif_pions.repaint();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panneau_pions_joueur = new javax.swing.JPanel();
        panneau_verif_pions = new javax.swing.JPanel();
        panneau_infos_joueur = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_start = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nom_joueur = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panneau_choix_pions = new javax.swing.JPanel();
        btn_T = new javax.swing.JButton();
        btn_V = new javax.swing.JButton();
        btn_G = new javax.swing.JButton();
        btn_J = new javax.swing.JButton();
        btn_M = new javax.swing.JButton();
        btn_O = new javax.swing.JButton();
        btn_B = new javax.swing.JButton();
        btn_R = new javax.swing.JButton();
        panneau_text = new javax.swing.JPanel();
        message = new javax.swing.JScrollPane();
        textemessage = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panneau_pions_joueur.setBackground(new java.awt.Color(255, 255, 255));
        panneau_pions_joueur.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panneau_pions_joueur.setLayout(new java.awt.GridLayout(12, 4));
        getContentPane().add(panneau_pions_joueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 256, 768));

        panneau_verif_pions.setBackground(new java.awt.Color(255, 255, 255));
        panneau_verif_pions.setLayout(new java.awt.GridLayout(12, 4));
        getContentPane().add(panneau_verif_pions, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 128, 768));

        panneau_infos_joueur.setBackground(new java.awt.Color(0, 204, 204));
        panneau_infos_joueur.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Bienvenue dans le Mastermind !");
        panneau_infos_joueur.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        btn_start.setText("J'accepte la mission !");
        btn_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_startActionPerformed(evt);
            }
        });
        panneau_infos_joueur.add(btn_start, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setText("Nom du soldat : ");
        panneau_infos_joueur.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        nom_joueur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_joueurActionPerformed(evt);
            }
        });
        panneau_infos_joueur.add(nom_joueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 160, -1));
        panneau_infos_joueur.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 360, -1));

        jLabel4.setText("Le capitaine Barbe-Rousse vous envoie un message, tentez de le déchiffrer !");
        panneau_infos_joueur.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 480, 50));
        panneau_infos_joueur.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 360, -1));

        getContentPane().add(panneau_infos_joueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 500, 220));

        panneau_choix_pions.setBackground(new java.awt.Color(255, 255, 255));
        panneau_choix_pions.setLayout(new java.awt.GridLayout(4, 2));

        btn_T.setText("Turquoise");
        btn_T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TActionPerformed(evt);
            }
        });
        panneau_choix_pions.add(btn_T);

        btn_V.setText("Vert");
        btn_V.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VActionPerformed(evt);
            }
        });
        panneau_choix_pions.add(btn_V);

        btn_G.setText("Gris");
        btn_G.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GActionPerformed(evt);
            }
        });
        panneau_choix_pions.add(btn_G);

        btn_J.setText("Jaune");
        btn_J.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_JActionPerformed(evt);
            }
        });
        panneau_choix_pions.add(btn_J);

        btn_M.setText("Marron");
        btn_M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MActionPerformed(evt);
            }
        });
        panneau_choix_pions.add(btn_M);

        btn_O.setText("Orange");
        btn_O.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OActionPerformed(evt);
            }
        });
        panneau_choix_pions.add(btn_O);

        btn_B.setText("Bleu");
        btn_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BActionPerformed(evt);
            }
        });
        panneau_choix_pions.add(btn_B);

        btn_R.setText("Rose");
        btn_R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RActionPerformed(evt);
            }
        });
        panneau_choix_pions.add(btn_R);

        getContentPane().add(panneau_choix_pions, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 500, 310));

        panneau_text.setBackground(new java.awt.Color(0, 204, 204));
        panneau_text.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textemessage.setColumns(20);
        textemessage.setRows(5);
        message.setViewportView(textemessage);

        panneau_text.add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 480, 170));

        getContentPane().add(panneau_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 590, 500, 190));

        setBounds(0, 0, 1095, 832);
    }// </editor-fold>//GEN-END:initComponents

    private void nom_joueurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_joueurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_joueurActionPerformed

    private void btn_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_startActionPerformed
        panneau_choix_pions.setVisible(true);
        panneau_text.setVisible(true);
        initialiserPartie();
        textemessage.setText("Bon Courage ! Vous avez 12 coups pour remporter ce défi !");
        btn_start.setEnabled(false);
    }//GEN-LAST:event_btn_startActionPerformed

    private void btn_TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TActionPerformed
        // TODO add your handling code here:
        
        CompteurCombi+=1;
        AjouterPion("Turquoise");
        VerifComb(CombiGagnante,CombiCourante);
    }//GEN-LAST:event_btn_TActionPerformed

    private void btn_JActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_JActionPerformed
        // TODO add your handling code here:
        CompteurCombi+=1;
        AjouterPion("Jaune");
        VerifComb(CombiGagnante,CombiCourante);
    }//GEN-LAST:event_btn_JActionPerformed

    private void btn_VActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VActionPerformed
        // TODO add your handling code here:
        CompteurCombi+=1;
        AjouterPion("Vert");
        VerifComb(CombiGagnante,CombiCourante);
    }//GEN-LAST:event_btn_VActionPerformed

    private void btn_GActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GActionPerformed
        // TODO add your handling code here:
        CompteurCombi+=1;
        AjouterPion("Gris");
        VerifComb(CombiGagnante,CombiCourante);
    }//GEN-LAST:event_btn_GActionPerformed

    private void btn_MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MActionPerformed
        // TODO add your handling code here:
        CompteurCombi+=1;
        AjouterPion("Marron");
        VerifComb(CombiGagnante,CombiCourante);
    }//GEN-LAST:event_btn_MActionPerformed

    private void btn_OActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OActionPerformed
        // TODO add your handling code here:
        CompteurCombi+=1;
        AjouterPion("Orange");
        VerifComb(CombiGagnante,CombiCourante);
        
    }//GEN-LAST:event_btn_OActionPerformed

    private void btn_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BActionPerformed
        // TODO add your handling code here:
        CompteurCombi+=1;
        AjouterPion("Bleu");
        VerifComb(CombiGagnante,CombiCourante);
    }//GEN-LAST:event_btn_BActionPerformed

    private void btn_RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RActionPerformed
        // TODO add your handling code here:
        CompteurCombi+=1;
        AjouterPion("Rose");
        VerifComb(CombiGagnante,CombiCourante);
    }//GEN-LAST:event_btn_RActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FenetreDeJeu().setVisible(true);
            }
        });
    }
    
    /**
     * Création de la combinaison gagnante aléaroirement pour initialiser la partie et création de la grille de jeu
     */
    public void initialiserPartie(){
        GrilleJeu=new Grille();
        
        String nomJoueur = nom_joueur.getText(); // Permet de récupérer le nom du joueur
        player.Nom=nomJoueur;  // attribution de nomJoueur à l'attribut player de la classe
        
        for (int i=0; i<4; i++) {
            int choixCouleur = generateurAleat.nextInt(7);
            if (choixCouleur==0) {
                CombiGagnante[i]=new Pion("Rose");
            }
            if (choixCouleur==1) {
                CombiGagnante[i]=new Pion("Jaune");
            }
            if (choixCouleur==2) {
                CombiGagnante[i]=new Pion("Vert");
            }
            if (choixCouleur==3) {
                CombiGagnante[i]=new Pion("Bleu");
            }
            if (choixCouleur==4) {
                CombiGagnante[i]=new Pion("Orange");
            }
            if (choixCouleur==5) {
                CombiGagnante[i]=new Pion("Gris");
            }
            if (choixCouleur==6) {
                CombiGagnante[i]=new Pion("Marron");
            }
            if (choixCouleur==7) {
                CombiGagnante[i]=new Pion("Turquoise");
            }
            System.out.println(CombiGagnante[i].couleur); //affichage de la combinaison gagnante sur la console pour les tests
        }
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_B;
    private javax.swing.JButton btn_G;
    private javax.swing.JButton btn_J;
    private javax.swing.JButton btn_M;
    private javax.swing.JButton btn_O;
    private javax.swing.JButton btn_R;
    private javax.swing.JButton btn_T;
    private javax.swing.JButton btn_V;
    private javax.swing.JButton btn_start;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JScrollPane message;
    private javax.swing.JTextField nom_joueur;
    private javax.swing.JPanel panneau_choix_pions;
    private javax.swing.JPanel panneau_infos_joueur;
    private javax.swing.JPanel panneau_pions_joueur;
    private javax.swing.JPanel panneau_text;
    private javax.swing.JPanel panneau_verif_pions;
    private javax.swing.JTextArea textemessage;
    // End of variables declaration//GEN-END:variables

}