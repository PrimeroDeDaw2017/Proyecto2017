package vista;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.WindowConstants;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

/**
 *
 * @author HUMBERTO
 */
public class SplashGUI extends javax.swing.JFrame {

    private SplashGUI splashGUI = this;
     ImageIcon imagen = new ImageIcon();
    public SplashGUI() {
//         setUndecorated(true);
        new underSplash().transparencia(this);
        initComponents();
        setLocationRelativeTo(this);  
        starThread();
        mustarCarga();
        pack();
        progLogin.setVisible(true);
        
    }

    private void starThread() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                LogInA gui = new LogInA(splashGUI);
                gui.setVisible(true);
                gui.setLocationRelativeTo(null);
                dispose();
            }
        });
        thread.start();
    }
    
public class underSplash {
    public void transparencia(JFrame frme){
        frme.setUndecorated(true);
        com.sun.awt.AWTUtilities.setWindowOpaque(frme, false);
    }
    
}

public JProgressBar getProgressBar(){
    return progLogin;
}
public JLabel getLabel(){
    return lblLogin;
}
private void mustarCarga() {
    progreso().setBackground(new Color(153, 255, 0));
    
        progreso().setForeground(new Color(0, 0, 0));
        progreso().setStringPainted(true);
    }

    public javax.swing.JProgressBar progreso() {
        return progLogin;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progLogin = new javax.swing.JProgressBar();
        lblLogin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        progLogin.setBackground(new java.awt.Color(255, 255, 204));
        progLogin.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        progLogin.setAutoscrolls(true);
        progLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        progLogin.setOpaque(true);
        progLogin.setStringPainted(true);
        getContentPane().add(progLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 610, 20));

        lblLogin.setFont(new java.awt.Font("Ebrima", 0, 16)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblLogin.setText("cargando...");
        getContentPane().add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 300, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/splash.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(SplashGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SplashGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JProgressBar progLogin;
    // End of variables declaration//GEN-END:variables
}
