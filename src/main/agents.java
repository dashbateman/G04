/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author proxc
 */
public class agents extends javax.swing.JFrame {

    /**
     * Creates new form Home_Data
     */
    public agents() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        Nom = new javax.swing.JTextField();
        Entrer = new javax.swing.JToggleButton();
        Prenom = new javax.swing.JTextField();
        ID = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Suprimer = new javax.swing.JToggleButton();
        Gerer = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(5, 57, 44));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(214, 184, 132));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/Design_sans_titre_3.png"))); // NOI18N
        jLabel15.setText("Agent");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 46, -1, 76));

        Nom.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomActionPerformed(evt);
            }
        });
        jPanel1.add(Nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 100, -1));

        Entrer.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Entrer.setText("Entrer");
        Entrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrerActionPerformed(evt);
            }
        });
        jPanel1.add(Entrer, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 100, 90, -1));

        Prenom.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Prenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrenomActionPerformed(evt);
            }
        });
        jPanel1.add(Prenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 100, -1));

        ID.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });
        jPanel1.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 100, -1));

        Email.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        jPanel1.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 100, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(214, 184, 132));
        jLabel1.setText("Bien a gerer");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(214, 184, 132));
        jLabel3.setText("ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(214, 184, 132));
        jLabel6.setText("Nom");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, -1, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(214, 184, 132));
        jLabel8.setText("Prenom");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, -1, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(214, 184, 132));
        jLabel9.setText("Email");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 30, -1, -1));

        Suprimer.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Suprimer.setText("Suprimer");
        Suprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuprimerActionPerformed(evt);
            }
        });
        jPanel1.add(Suprimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 100, -1, -1));

        Gerer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04" }));
        jPanel1.add(Gerer, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, 120, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 150));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nom", "Prenom", "Email", "Preference"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1070, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EntrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrerActionPerformed
        DefaultTableModel model = ( DefaultTableModel )jTable1.getModel();
        
        String Nomclient = Nom.getText();
        String IDimmo = ID.getText();
        String Prenomclient = Prenom.getText();
        String etatImmo = Email.getText();
        Object prixImmo = Gerer.getSelectedItem();
        int selectedRowIndex = jTable1.getSelectedRow();
        model.addRow(new Object[]{ID.getText(), Nom.getText(),Prenom.getText(),Email.getText(),Gerer.getSelectedItem()});
        
    }//GEN-LAST:event_EntrerActionPerformed

    private void NomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int selectedRowIndex = jTable1.getSelectedRow();
        ID.setText(model.getValueAt(selectedRowIndex, 0).toString());
        Nom.setText(model.getValueAt(selectedRowIndex, 1).toString());
        Prenom.setText(model.getValueAt(selectedRowIndex, 2).toString());
        Email.setText(model.getValueAt(selectedRowIndex, 3).toString());
        Gerer.setName(model.getValueAt(selectedRowIndex, 4).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    private void PrenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrenomActionPerformed

    private void SuprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuprimerActionPerformed
                         DefaultTableModel model = ( DefaultTableModel )jTable1.getModel();
        

        try{
        int SelectedRowIndex = jTable1.getSelectedRow();
        model.removeRow(SelectedRowIndex);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
            
        }
    }//GEN-LAST:event_SuprimerActionPerformed

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
            java.util.logging.Logger.getLogger(Home_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new agents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Email;
    private javax.swing.JToggleButton Entrer;
    public javax.swing.JComboBox<String> Gerer;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField Nom;
    private javax.swing.JTextField Prenom;
    private javax.swing.JToggleButton Suprimer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}