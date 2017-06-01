/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.*;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import org.edisoncor.gui.util.Avatar;
import java.util.ArrayList;
import javax.swing.*;
import org.jvnet.substance.SubstanceLookAndFeel;


public class Aplicacion extends javax.swing.JFrame {
 
    private ArrayList<Avatar> avatars;
    private static Aplicacion ap;
    private final String [] letrasMayusculas = {"A","B","C","D","E","F","G","H","L","M","N","S","Z"};
    
    public Aplicacion() {
        initComponents();
        
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setTitle("AUTHENTIC-MOVIL");
     // this.setResizable(false);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagen/logofinal.png")).getImage());
        this.setLocationRelativeTo(null);
        avatars = new ArrayList<>();
        this.llenarMenu();
    }

     public void llenarMenu(){
        avatars.add(new Avatar("Acer", CargaImagen("/imagen/Acer.png")));
        avatars.add(new Avatar("Ipad", CargaImagen("/imagen/Ipad.png")));
        avatars.add(new Avatar("Acer", CargaImagen("/imagen/Acer.png")));
        avatars.add(new Avatar("Ipad", CargaImagen("/imagen/Ipad.png")));
        menu.setAvatars(avatars);
    }
     
     public void cargaAutomatica(String nombre, String img){
         String nb = "";
         
         for(int i=0; i<letrasMayusculas.length; i++){
             if(nombre.substring(0,1).equalsIgnoreCase(letrasMayusculas[i])){
                 nb = letrasMayusculas[i];
             }
         }
       avatars.add(new Avatar(nb+nombre.substring(1, nombre.length()), CargaImagen("/imagen/"+img+".png")));
       menu.setAvatars(avatars);
     }
     
      public static Image CargaImagen(String fileName){
        try {
            return ImageIO.read(Aplicacion.class.getResource(fileName));
        }
        catch (Exception e) {
            return null;
        }
    }
      
      public void llamarMenu(){
        if(menu.getSelectedtitulo().equals("Menu1")){
            new Bienvenido().setVisible(true);
        }
        if(menu.getSelectedtitulo().equals("Salir")){
            System.exit(0);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        menu = new org.edisoncor.gui.panel.PanelAvatarChooser();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuA = new javax.swing.JMenu();
        opcionA1 = new javax.swing.JMenuItem();
        menuE = new javax.swing.JMenu();
        opcionE1 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1270, 1014));
        setPreferredSize(new java.awt.Dimension(1270, 1014));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setPreferredSize(new java.awt.Dimension(1270, 1014));
        menu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                menuKeyPressed(evt);
            }
        });
        menu.setLayout(new javax.swing.BoxLayout(menu, javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 49, 634, 434));

        jMenuBar1.setBackground(new java.awt.Color(51, 255, 255));
        jMenuBar1.setToolTipText("");

        menuA.setBackground(new java.awt.Color(255, 0, 51));
        menuA.setText("Administrador");

        opcionA1.setText("Log in");
        opcionA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionA1ActionPerformed(evt);
            }
        });
        menuA.add(opcionA1);

        jMenuBar1.add(menuA);

        menuE.setBackground(new java.awt.Color(255, 255, 0));
        menuE.setText("Empleado");

        opcionE1.setText("Log in");
        opcionE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionE1ActionPerformed(evt);
            }
        });
        menuE.add(opcionE1);

        jMenuBar1.add(menuE);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_menuKeyPressed


    if(menu.getSelectedtitulo().equalsIgnoreCase("Acer")){
            new Bienvenido().setVisible(true);
        }
        if(menu.getSelectedtitulo().equals("Ipad")){
            System.exit(0);
        }
    }//GEN-LAST:event_menuKeyPressed

    private void opcionA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionA1ActionPerformed
      
        SplashGUI in=new SplashGUI();
        in.setVisible(true);
    }//GEN-LAST:event_opcionA1ActionPerformed

    private void opcionE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionE1ActionPerformed
        

    }//GEN-LAST:event_opcionE1ActionPerformed

    public static void setAplicacion (Aplicacion a){
         ap = a;
    }
    
    public static Aplicacion getAplicacion (){
        return ap;
    } 
    
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
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplicacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private org.edisoncor.gui.panel.PanelAvatarChooser menu;
    private javax.swing.JMenu menuA;
    private javax.swing.JMenu menuE;
    private javax.swing.JMenuItem opcionA1;
    private javax.swing.JMenuItem opcionE1;
    // End of variables declaration//GEN-END:variables
}
