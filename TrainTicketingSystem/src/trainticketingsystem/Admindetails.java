/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainticketingsystem;

import trainticketingsystem.otherjavas.Admindetail;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import trainticketingsystem.otherjavas.operationadmin;


/**
 *
 * @author Mila
 */
public class Admindetails extends javax.swing.JFrame {
    


    /**
     * Creates new form Admindetails
     */
    operationadmin ope = new operationadmin();
    ArrayList <Admindetails> AdmindetailsList=new ArrayList <Admindetails>();//changes done here 
    
    public Admindetails() {
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

        mainJlabel = new javax.swing.JLabel();
        usernamelabel = new javax.swing.JLabel();
        usernametext = new javax.swing.JTextField();
        passwordlabel = new javax.swing.JLabel();
        passwordtext = new javax.swing.JTextField();
        Updatebutton = new javax.swing.JButton();
        textlabel = new javax.swing.JLabel();
        nextbutton = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        viewbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(mainJlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1280, 800));

        usernamelabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        usernamelabel.setText(" Admin Username");
        getContentPane().add(usernamelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 210, 50));

        usernametext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernametextActionPerformed(evt);
            }
        });
        getContentPane().add(usernametext, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 340, 80));

        passwordlabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        passwordlabel.setText("Password");
        getContentPane().add(passwordlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 322, 100, 40));
        getContentPane().add(passwordtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 340, 70));

        Updatebutton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Updatebutton.setText("Update");
        Updatebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(Updatebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 490, 220, 60));

        textlabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        textlabel.setText(" Admin Details");
        getContentPane().add(textlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 300, 60));

        nextbutton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        nextbutton.setText("Next");
        nextbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(nextbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 220, 60));

        Back.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 490, 220, 60));

        viewbutton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        viewbutton.setText("View");
        viewbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(viewbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 610, 220, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
          LogInAdmin ad = new LogInAdmin();
          ad.setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    private void nextbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbuttonActionPerformed
          Traindetails td = new Traindetails();
          td.setVisible(true);
    }//GEN-LAST:event_nextbuttonActionPerformed

    private void UpdatebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatebuttonActionPerformed
        // TODO add your handling code here:update code here;
        
         Admindetail aAdmindetail =new Admindetail(usernametext.getText(),passwordtext.getText());
        try {
            //studentList.add(aStudent);
            //Operation ope;
            ope.saveInvoice(aAdmindetail);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Admindetail.class.getName()).log(Level.SEVERE, null, ex);
        }
      
            
        JOptionPane.showMessageDialog(null, "ok");     
        
        
    }//GEN-LAST:event_UpdatebuttonActionPerformed

    private void viewbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbuttonActionPerformed
        // TODO add your handling code here:
       
          Adminview av = new Adminview();
          av.setVisible(true);
    }//GEN-LAST:event_viewbuttonActionPerformed

    private void usernametextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernametextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernametextActionPerformed

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
            java.util.logging.Logger.getLogger(Admindetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admindetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admindetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admindetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admindetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Updatebutton;
    private javax.swing.JLabel mainJlabel;
    private javax.swing.JButton nextbutton;
    private javax.swing.JLabel passwordlabel;
    private javax.swing.JTextField passwordtext;
    private javax.swing.JLabel textlabel;
    private javax.swing.JLabel usernamelabel;
    private javax.swing.JTextField usernametext;
    private javax.swing.JButton viewbutton;
    // End of variables declaration//GEN-END:variables
}