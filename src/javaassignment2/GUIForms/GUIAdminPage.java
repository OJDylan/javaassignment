package javaassignment2.GUIForms;

import javaassignment2.Agent;
import javaassignment2.Appointment;

public class GUIAdminPage extends javax.swing.JFrame {
    public GUIAdminPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreateReport = new javax.swing.JButton();
        btnViewAppointments = new javax.swing.JButton();
        btnViewU = new javax.swing.JButton();
        menubarAdmin = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuitemEdit = new javax.swing.JMenuItem();
        menuitemLogout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin");
        setResizable(false);

        btnCreateReport.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCreateReport.setText("Create Appointment Report");
        btnCreateReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateReportActionPerformed(evt);
            }
        });

        btnViewAppointments.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnViewAppointments.setText("View Appointments");
        btnViewAppointments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAppointmentsActionPerformed(evt);
            }
        });

        btnViewU.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnViewU.setText("View Users");
        btnViewU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewUActionPerformed(evt);
            }
        });

        jMenu1.setText("System");

        menuitemEdit.setText("Edit Property");
        menuitemEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemEditActionPerformed(evt);
            }
        });
        jMenu1.add(menuitemEdit);

        menuitemLogout.setText("Logout");
        menuitemLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitemLogoutActionPerformed(evt);
            }
        });
        jMenu1.add(menuitemLogout);

        menubarAdmin.add(jMenu1);

        setJMenuBar(menubarAdmin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCreateReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewAppointments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(btnCreateReport)
                .addGap(18, 18, 18)
                .addComponent(btnViewAppointments)
                .addGap(18, 18, 18)
                .addComponent(btnViewU)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuitemEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemEditActionPerformed
        // TODO add your handling code here:
        dispose();
        Agent a = new Agent();
        a.editProperty();
    }//GEN-LAST:event_menuitemEditActionPerformed

    private void btnCreateReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateReportActionPerformed
        // TODO add your handling code here:
        Agent a = new Agent();
        a.createReport();
    }//GEN-LAST:event_btnCreateReportActionPerformed

    private void menuitemLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitemLogoutActionPerformed
        // TODO add your handling code here:
        dispose();
        GUILogIn l = new GUILogIn();
        l.run();
    }//GEN-LAST:event_menuitemLogoutActionPerformed

    private void btnViewAppointmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAppointmentsActionPerformed
        // TODO add your handling code here:
        Appointment a = new Appointment();
        a.viewAppointments();
    }//GEN-LAST:event_btnViewAppointmentsActionPerformed

    private void btnViewUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewUActionPerformed
        // TODO add your handling code here:
        Agent a = new Agent();
        a.viewUser();
    }//GEN-LAST:event_btnViewUActionPerformed

    public static void run() {
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
            java.util.logging.Logger.getLogger(GUIAdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIAdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIAdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIAdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIAdminPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateReport;
    private javax.swing.JButton btnViewAppointments;
    private javax.swing.JButton btnViewU;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar menubarAdmin;
    private javax.swing.JMenuItem menuitemEdit;
    private javax.swing.JMenuItem menuitemLogout;
    // End of variables declaration//GEN-END:variables

}
