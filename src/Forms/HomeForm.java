package Forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeForm extends javax.swing.JFrame {
    private String username;

    public HomeForm(String username) {
        this.username = username;  
        initComponents(); 
        initCustomComponents();  
    }

    private void onLogout() {
        JOptionPane.showMessageDialog(this, "You have been logged out.");
        dispose();  
        new LoginForm().setVisible(true);  
    }


    private void initCustomComponents() {
        welcomelbl = new JLabel("Hello, " + username + "! Welcome to your dashboard.", JLabel.CENTER);
        welcomelbl.setFont(new java.awt.Font("SansSerif", java.awt.Font.BOLD, 16));  
        welcomelbl.setForeground(new java.awt.Color(0, 102, 204)); 
        this.add(welcomelbl, java.awt.BorderLayout.CENTER); 

        logoutbtn = new JButton("Logout");
        logoutbtn.setFont(new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 14));  
        logoutbtn.setBackground(new java.awt.Color(255, 69, 0));
        logoutbtn.setForeground(java.awt.Color.WHITE);  
        this.add(logoutbtn, java.awt.BorderLayout.SOUTH); 

        logoutbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onLogout();  
            }
        });

        setVisible(true);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomelbl = new javax.swing.JLabel();
        logoutbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        logoutbtn.setText("Logout");
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(welcomelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(188, Short.MAX_VALUE)
                .addComponent(logoutbtn)
                .addGap(140, 140, 140))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(welcomelbl)
                .addGap(46, 46, 46)
                .addComponent(logoutbtn)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
        // TODO add your handling code here:
        onLogout(); 
    }//GEN-LAST:event_logoutbtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeForm("TestUser").setVisible(true);  // Testing with a dummy username
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton logoutbtn;
    private javax.swing.JLabel welcomelbl;
    // End of variables declaration//GEN-END:variables
}
