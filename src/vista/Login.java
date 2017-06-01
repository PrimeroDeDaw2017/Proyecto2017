
package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;
import org.jvnet.substance.SubstanceLookAndFeel;



public class Login extends javax.swing.JFrame {


   private Timer tiempo;
 
    int contador;
    
     private SplashGUI splash;

    public final static int Two_Second=10;
    
    public Login() {     
        initComponents();
     ///   this.setTitle("AUTHENTIC-MOVIL");
        // this.setResizable(false);
       // this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/logofinal.png")).getImage());
       // this.setLocationRelativeTo(null);
       // this.setLocationRelativeTo(null); 
    }
     public Login(SplashGUI splashGUI) {
        this.splash = splashGUI;
        setProgressB(0, "cargando componentes...");
         JFrame.setDefaultLookAndFeelDecorated(true);
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.MagmaSkin");
//        setUndecorated(true);
        initComponents();
          this.setTitle("AUTHENTIC-MOVIL");
        // this.setResizable(false);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/logofinal.png")).getImage());
        this.setLocationRelativeTo(null);
        this.setLocationRelativeTo(null); 
        setResizable(false);
        setProgressB(5, "iniciando software...");
        setProgressB(10, "conectando a la base de datos...");
        setProgressB(15, "conectando a la base de datos...");
        setProgressB(20, "cargando interfacez de usuario...");
        setProgressB(30, "cargando reportes...");
        setProgressB(40, "compilando ...");
        setProgressB(50, "verificando al administrador...");
        setProgressB(55, "verificando usuarios...");
        setProgressB(57, "verificando usuarios...");
        setProgressB(61, "verificando usuarios...");
        setProgressB(70, "cargando listas...");
        setProgressB(90, "espere unos segundos...");
    
        setProgressB(96, "programa desarrollado por Humberto , Yessica");
      

        setProgressB(100, "Bienvenidos a nuestro sistema");
    }
     
     private void setProgressB(int login, String mens) {
        splash.getLabel().setText(mens);
        splash.getProgressBar().setValue(login);
        try {
            Thread.sleep(350);

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
    class TimerListener implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent ae) {
           
            contador++;
            barrita.setValue(contador);
            
            if(contador==100){
                
                tiempo.stop();
                esconder();
                
             //   NuevoEmpleado nu=new NuevoEmpleado();
            
            //    nu.setVisible(true);
                
                setVisible(false);
            }
                    
        }
  
    } 
 
    public void esconder(){
            
        this.setVisible(false);
     }
    public void activar(){
        
        tiempo.start();
    }

    public void inicioSesion(){
        
        String usuario=txtusuario.getText();
        String contraseña=String.valueOf(txtcontraseña.getPassword());
        
        if(usuario.equalsIgnoreCase("Moha") && contraseña.compareTo("12345")==0){
            
            contador=-1;
            
            barrita.setValue(0);
            barrita.setStringPainted(true);
            
            tiempo =new Timer(Two_Second ,new TimerListener());
            
            activar();
    
        }else{
            
            JOptionPane.showMessageDialog(null, "Error al ingresar, usuario o contraseña");
        }
    }
    
    
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelNice2 = new org.edisoncor.gui.panel.PanelNice();
        barrita = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        btnEntrar = new org.edisoncor.gui.button.ButtonAction();
        btnCancelar = new org.edisoncor.gui.button.ButtonAction();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtcontraseña = new javax.swing.JPasswordField();
        txtusuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelNice2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelNice2.add(barrita, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 340, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(25, 118, 210));
        jLabel4.setText("Iniciar Sesion");
        panelNice2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 120, 40));

        btnEntrar.setBackground(new java.awt.Color(236, 240, 241));
        btnEntrar.setForeground(new java.awt.Color(25, 118, 210));
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        panelNice2.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(236, 240, 241));
        btnCancelar.setForeground(new java.awt.Color(25, 118, 210));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panelNice2.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(25, 118, 210));
        jLabel5.setText("Usuario :");
        panelNice2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesForm/usuarioA.png"))); // NOI18N
        panelNice2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesForm/password.png"))); // NOI18N
        panelNice2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        txtcontraseña.setBackground(new java.awt.Color(36, 33, 33));
        txtcontraseña.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtcontraseña.setForeground(new java.awt.Color(207, 207, 207));
        txtcontraseña.setMinimumSize(new java.awt.Dimension(2, 17));
        txtcontraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontraseñaActionPerformed(evt);
            }
        });
        panelNice2.add(txtcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 210, 20));

        txtusuario.setBackground(new java.awt.Color(36, 33, 33));
        txtusuario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtusuario.setForeground(new java.awt.Color(207, 207, 207));
        panelNice2.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 210, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(25, 118, 210));
        jLabel8.setText("Contraseña :");
        panelNice2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        getContentPane().add(panelNice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        
       this.inicioSesion();
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtcontraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontraseñaActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barrita;
    private org.edisoncor.gui.button.ButtonAction btnCancelar;
    private org.edisoncor.gui.button.ButtonAction btnEntrar;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private org.edisoncor.gui.panel.PanelNice panelNice2;
    private javax.swing.JPasswordField txtcontraseña;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
