/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ttuhsc.speechperception.gui;

import com.ttuhsc.speechperception.utility.ReadExcel;
import com.ttuhsc.speechperception.vo.UserData;
import java.awt.Color;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author Lab
 */
public class ClientInfo extends javax.swing.JFrame {

    /**
     * Creates new form ClientInfo
     */
    
    
    public ClientInfo() {
        initComponents();
        //jList1Model = new DefaultListModel();
        //jList1.setModel(jList1Model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
private DefaultListModel jList1Model;
    JList userList;
    private String sessionNum;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jList1Model = new DefaultListModel();
        jList1.setModel(jList1Model);
        jList1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        getRegisteredUsers();
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 130, 300, 300));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Add User");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 490, 110, 50));

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Remove");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 490, 120, 50));

        jButton3.setBackground(new java.awt.Color(0, 153, 153));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("Start");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 620, 190, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Select or Add User Information");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 480, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1930, 1030));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
       GetUser gc = new GetUser(this, rootPaneCheckingEnabled);
       gc.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jButton1ActionPerformed

    void savedataInList(UserData user){
    
        jList1Model.addElement(user.getName());
    
    }
    
    void getRegisteredUsers(){
        ReadExcel read = new ReadExcel();
        List<UserData> ud = read.readUserData();
        if(!ud.isEmpty()){
        for(UserData user : ud){
        
        jList1Model.addElement(user.getName());
    
        }  
    }
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        if(!jList1.isSelectionEmpty()){
        SessionNumber sn = new SessionNumber(this, rootPaneCheckingEnabled);
        sn.setVisible(true);
        UserData ud = fetchUser(sessionNum);
        
        CategoriesFrame cf = new CategoriesFrame(ud);
        cf.setExtendedState(JFrame.MAXIMIZED_BOTH);
        cf.setVisible(true);
        
        Instructions ins= new Instructions();
        ins.setExtendedState(JFrame.MAXIMIZED_BOTH);
        ins.setVisible(rootPaneCheckingEnabled);
        
        
        dispose();
        }else{
           
            JOptionPane.showMessageDialog(rootPane, "You need to select a user first to continue","",JOptionPane.ERROR_MESSAGE);
        
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    public UserData fetchUser(String sessionNumer){
    
    UserData ud = new UserData();
    ud.setName(jList1.getSelectedValue());
    ud.setSessionNumber(Integer.parseInt(sessionNumer));
    
    return ud;
    }
    
    public void  saveSessionNumber(String sessionNumber){
    
        sessionNum = sessionNumber;
    
    }
            
            
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        ReadExcel rd = new ReadExcel();
        int selectedIndex = jList1.getSelectedIndex();
        if(selectedIndex != -1){
        rd.deleteUser(selectedIndex);
        jList1Model.remove(selectedIndex);
    }//GEN-LAST:event_jButton2ActionPerformed
    }
    
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ClientInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ClientInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ClientInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ClientInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ClientInfo().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
