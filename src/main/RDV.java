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
public class RDV extends javax.swing.JFrame {

    /**
     * Creates new form Home_Data
     */
    public RDV() {
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
        Entrer = new javax.swing.JToggleButton();
        Client = new javax.swing.JTextField();
        ID = new javax.swing.JTextField();
        Heure = new javax.swing.JTextField();
        Agent = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Date = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Suprimer = new javax.swing.JToggleButton();
        Bien = new javax.swing.JComboBox<>();
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
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/Design_sans_titre_1.png"))); // NOI18N
        jLabel15.setText("RDV");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 46, -1, 76));

        Entrer.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Entrer.setText("Entrer");
        Entrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrerActionPerformed(evt);
            }
        });
        jPanel1.add(Entrer, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 110, 90, -1));

        Client.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientActionPerformed(evt);
            }
        });
        jPanel1.add(Client, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 100, -1));

        ID.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });
        jPanel1.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 100, -1));

        Heure.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Heure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HeureActionPerformed(evt);
            }
        });
        jPanel1.add(Heure, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 40, 100, -1));

        Agent.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Agent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgentActionPerformed(evt);
            }
        });
        jPanel1.add(Agent, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 100, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(214, 184, 132));
        jLabel1.setText("Heure");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(214, 184, 132));
        jLabel3.setText("ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(214, 184, 132));
        jLabel6.setText("Bien");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(214, 184, 132));
        jLabel8.setText("Client");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(214, 184, 132));
        jLabel9.setText("Agent");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, -1));

        Date.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateActionPerformed(evt);
            }
        });
        jPanel1.add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, 100, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(214, 184, 132));
        jLabel2.setText("Date");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, -1, -1));

        Suprimer.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Suprimer.setText("Suprimer");
        Suprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuprimerActionPerformed(evt);
            }
        });
        jPanel1.add(Suprimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 110, -1, -1));

        Bien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "Item 2", "Item 3", "Item 4" }));
        Bien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BienActionPerformed(evt);
            }
        });
        jPanel1.add(Bien, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 100, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 150));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Bien", "Client", "Agent", "Date", "Heure"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1070, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EntrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrerActionPerformed
        DefaultTableModel model = ( DefaultTableModel )jTable1.getModel();
        
        Object Nomclient = Bien.getSelectedItem();
        String IDimmo = ID.getText();
        String ClientRDV = Client.getText();
        String etatImmo = Agent.getText();
        String DateRDV = Date.getText();
        String HeureRDV = Heure.getText();
        
        int selectedRowIndex = jTable1.getSelectedRow();
        model.addRow(new Object[]{ID.getText(), Bien.getSelectedItem(),Client.getText(),Agent.getText(),Date.getText(),Heure.getText()});
        
    }//GEN-LAST:event_EntrerActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int selectedRowIndex = jTable1.getSelectedRow();
        ID.setText(model.getValueAt(selectedRowIndex, 0).toString());
        Bien.setName(model.getValueAt(selectedRowIndex, 1).toString());
        Client.setText(model.getValueAt(selectedRowIndex, 2).toString());
        Agent.setText(model.getValueAt(selectedRowIndex, 3).toString());
        Date.setText(model.getValueAt(selectedRowIndex, 4).toString());
        Heure.setText(model.getValueAt(selectedRowIndex, 5).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void AgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgentActionPerformed

    private void HeureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HeureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HeureActionPerformed

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    private void ClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClientActionPerformed

    private void DateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateActionPerformed

    private void SuprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuprimerActionPerformed
                 DefaultTableModel model = ( DefaultTableModel )jTable1.getModel();
        

        try{
        int SelectedRowIndex = jTable1.getSelectedRow();
        model.removeRow(SelectedRowIndex);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
            
        }
    }//GEN-LAST:event_SuprimerActionPerformed

    private void BienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BienActionPerformed

    }//GEN-LAST:event_BienActionPerformed

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
                new RDV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Agent;
    private javax.swing.JComboBox<String> Bien;
    private javax.swing.JTextField Client;
    private javax.swing.JTextField Date;
    private javax.swing.JToggleButton Entrer;
    private javax.swing.JTextField Heure;
    private javax.swing.JTextField ID;
    private javax.swing.JToggleButton Suprimer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
