/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.JOptionPane;

/**
 *
 * @author vyank
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        InsertStudent = new javax.swing.JButton();
        updateStudentMarks = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        addResult = new javax.swing.JButton();
        listStudent = new javax.swing.JButton();
        listStudentResult = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\vyank\\Downloads\\marvin-meyer-SYTO3xs06fU-unsplash.jpg")); // NOI18N
        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 450));
        setMinimumSize(new java.awt.Dimension(700, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InsertStudent.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        InsertStudent.setText("Insert Student");
        InsertStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertStudentActionPerformed(evt);
            }
        });
        getContentPane().add(InsertStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 310, 40));

        updateStudentMarks.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        updateStudentMarks.setText("Update Student Marks");
        updateStudentMarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStudentMarksActionPerformed(evt);
            }
        });
        getContentPane().add(updateStudentMarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 310, 37));

        logout.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 210, 37));

        addResult.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        addResult.setText("Add Result");
        addResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addResultActionPerformed(evt);
            }
        });
        getContentPane().add(addResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 310, 37));

        listStudent.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        listStudent.setText("List Student");
        listStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listStudentActionPerformed(evt);
            }
        });
        getContentPane().add(listStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 310, 37));

        listStudentResult.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        listStudentResult.setText("List Student Result");
        listStudentResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listStudentResultActionPerformed(evt);
            }
        });
        getContentPane().add(listStudentResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 310, 37));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\vyank\\Downloads\\mini admin.png")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InsertStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertStudentActionPerformed
               
               insertStudent frame = new insertStudent();
               frame.setVisible(true);
               frame.setLocationRelativeTo(null);  
    }//GEN-LAST:event_InsertStudentActionPerformed

    private void addResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addResultActionPerformed
        // TODO add your handling code here:
       
               AddResult frame = new AddResult();
               frame.setVisible(true);
               frame.setLocationRelativeTo(null); 
    }//GEN-LAST:event_addResultActionPerformed

    private void listStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listStudentActionPerformed
        // TODO add your handling code here:
       
               ListStudent frame = new ListStudent();
               frame.setVisible(true);
               frame.setLocationRelativeTo(null); 
    }//GEN-LAST:event_listStudentActionPerformed

    private void listStudentResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listStudentResultActionPerformed
        // TODO add your handling code here:
          
               ListResult frame = new ListResult();
               frame.setVisible(true);
               frame.setLocationRelativeTo(null); 
    }//GEN-LAST:event_listStudentResultActionPerformed

    private void updateStudentMarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStudentMarksActionPerformed
        // TODO add your handling code here:
         
               UpdateResult frame = new UpdateResult();
               frame.setVisible(true);
               frame.setLocationRelativeTo(null);
    }//GEN-LAST:event_updateStudentMarksActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        int flag = JOptionPane.showConfirmDialog(null, "Are you sure you want to quit this page ...", "Submit", JOptionPane.YES_NO_OPTION);
        if(flag == 0){
              setVisible(false);
              Home frame = new Home();
               frame.setVisible(true);
               frame.setLocationRelativeTo(null); 
        }
    }//GEN-LAST:event_logoutActionPerformed
 
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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InsertStudent;
    private javax.swing.JButton addResult;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton listStudent;
    private javax.swing.JButton listStudentResult;
    private javax.swing.JButton logout;
    private javax.swing.JButton updateStudentMarks;
    // End of variables declaration//GEN-END:variables
}
