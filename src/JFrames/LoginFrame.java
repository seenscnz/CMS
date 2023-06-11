package JFrames;

import javax.swing.JOptionPane;

/**
 *
 * @author sumiya
 */
public class LoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrame
     */
    public LoginFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_main = new javax.swing.JPanel();
        loginboxpanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_submit = new javax.swing.JButton();
        text_pass = new javax.swing.JPasswordField();
        label_password = new javax.swing.JLabel();
        text_username = new javax.swing.JTextField();
        label_username = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_main.setBackground(new java.awt.Color(255, 255, 255));
        panel_main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginboxpanel.setBackground(new java.awt.Color(204, 153, 0));
        loginboxpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("login");
        loginboxpanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        btn_submit.setText("submit");
        btn_submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_submitMouseClicked(evt);
            }
        });
        loginboxpanel.add(btn_submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, -1));
        loginboxpanel.add(text_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 150, -1));

        label_password.setText("password:");
        loginboxpanel.add(label_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));
        loginboxpanel.add(text_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 150, -1));

        label_username.setText("username:");
        loginboxpanel.add(label_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        panel_main.add(loginboxpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 380, 490));

        getContentPane().add(panel_main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_submitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_submitMouseClicked

        String username = text_username.getText(); 
        String password = new String(text_pass.getPassword()); 

        if (validateLogin(username, password)) {
            JOptionPane.showMessageDialog(this, "Login successful!");
            openHomePage();
        } else {
             JOptionPane.showMessageDialog(this, "Invalid username or password", "Login Failed", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_submitMouseClicked
    private boolean validateLogin(String username, String password) {
    return username.equals("admin") && password.equals("password");
}
    private void openHomePage() {
    HomePage homePage = new HomePage();
    homePage.setVisible(true);
    this.dispose(); // Close the login frame
}

    
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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_submit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel label_password;
    private javax.swing.JLabel label_username;
    private javax.swing.JPanel loginboxpanel;
    private javax.swing.JPanel panel_main;
    private javax.swing.JPasswordField text_pass;
    private javax.swing.JTextField text_username;
    // End of variables declaration//GEN-END:variables
}

