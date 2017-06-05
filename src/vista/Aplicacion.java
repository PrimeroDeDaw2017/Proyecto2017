/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Desktop;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.*;
import java.io.*;
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
        this.setIconImage(new ImageIcon(getClass().getResource("Ficheros/imagen/logofinal.png")).getImage());
        this.setLocationRelativeTo(null);
        avatars = new ArrayList<>();
        this.llenarMenu();
    }

     public void llenarMenu(){
        avatars.add(new Avatar("Acer", CargaImagen("Ficheros/imagen/Acer.png")));
        avatars.add(new Avatar("Ipad", CargaImagen("Ficheros/imagen/Ipad.png")));
        avatars.add(new Avatar("Acer", CargaImagen("Ficheros/imagen/Acer.png")));
        avatars.add(new Avatar("Ipad", CargaImagen("Ficheros/imagen/Ipad.png")));
        menu.setAvatars(avatars);
    }
     
     public void cargaAutomatica(String nombre, String img){
         String nb = "";
         
         for(int i=0; i<letrasMayusculas.length; i++){
             if(nombre.substring(0,1).equalsIgnoreCase(letrasMayusculas[i])){
                 nb = letrasMayusculas[i];
             }
         }
       avatars.add(new Avatar(nb+nombre.substring(1, nombre.length()), CargaImagen("Ficheros/imagen/"+img+".png")));
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
        jMenu1 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1270, 1014));
        setPreferredSize(new java.awt.Dimension(1270, 1014));

        menu.setPreferredSize(new java.awt.Dimension(1270, 1014));
        menu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                menuKeyPressed(evt);
            }
        });
        menu.setLayout(new javax.swing.BoxLayout(menu, javax.swing.BoxLayout.LINE_AXIS));

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

        jMenu1.setText("Herramientas");

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jMenuItem6.setText("D a t o s   d e   l a  E m p r e s a");
        jMenu1.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jMenuItem7.setText("C a l c  u l a d o r a");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jMenuItem8.setText("B l o c  d e  N o t a s");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuBar1.add(jMenu1);

        jMenu6.setText("Ayuda");

        jMenuItem21.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem21.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jMenuItem21.setText("A c e r c a   d e ...");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem21);

        jMenuItem22.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem22.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jMenuItem22.setText("G u i a   d e  U s u a r i o");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem22);

        jMenuBar1.add(jMenu6);

        jMenu2.setText("Salir");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
        );

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

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        try
        {
            Runtime rt=Runtime.getRuntime();
            Process p =rt.exec("calc");
            p.waitFor();

        }
        catch (IOException ioe )
        {
            ioe.getStackTrace();
        }
        catch (InterruptedException ie )
        {
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // block de notas
        try
        {
            Runtime rt=Runtime.getRuntime();
            Process p =rt.exec("notepad");
            p.waitFor();

        }
        catch (IOException ioe )
        {
            ioe.getStackTrace();
        }
        catch (InterruptedException ie )
        {
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        // ayuda
        try {
            Acerca cli = new Acerca();
            cli.setVisible(true);
        } catch (Exception e) {
        }

    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
        // manual
        // try {
            //  manual cli = new manual();
            // cli.setVisible(true);
            // } catch (Exception e) {
            // }
        //////////////
        try {
            File directorio = new File("temp"); //Creas un nuevo directorio a nivel de tu jar.
            directorio.mkdirs();
            directorio.setWritable(true);
            //copias la direccion
            String archivo = directorio.getCanonicalPath() + File.pathSeparator + "ayuda1.pdf";
            //nuevo archivo en esa direccion
            File temp = new File(archivo);
            InputStream is = this.getClass().getResourceAsStream("/Pdf/MANUAL.pdf");
            FileOutputStream archivoDestino = new FileOutputStream(temp);
            FileWriter fw = new FileWriter(temp);
            byte[] buffer = new byte[512 * 1024];
            //lees el archivo hasta que se acabe...
            int nbLectura;
            while ((nbLectura = is.read(buffer)) != -1) {
                archivoDestino.write(buffer, 0, nbLectura);
            }
            //cierras el archivo,el inputS y el FileW
            fw.close();
            archivoDestino.close();
            is.close();
            //abres el archivo temporal
            Desktop.getDesktop().open(temp);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"error l abrir el rchivo");
        }
    }//GEN-LAST:event_jMenuItem22ActionPerformed

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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private org.edisoncor.gui.panel.PanelAvatarChooser menu;
    private javax.swing.JMenu menuA;
    private javax.swing.JMenu menuE;
    private javax.swing.JMenuItem opcionA1;
    private javax.swing.JMenuItem opcionE1;
    // End of variables declaration//GEN-END:variables
}
