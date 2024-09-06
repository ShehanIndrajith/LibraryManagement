/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFrame;

import com.mysql.cj.protocol.Resultset;
import java.awt.TextField;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author Kavisha Lashani
 */
public class SignUp_Page extends javax.swing.JFrame {

    /**
     * Creates new form SignUp_Page
     */
    public SignUp_Page() {
        initComponents();
        Labe_UserNameError.setVisible(false);
        Label_PasswordError.setVisible(false);
        Label_EmailError.setVisible(false);
        Label_ContactNumbeError.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Panel_SignUp = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Labe_UserName = new javax.swing.JLabel();
        TextField_Password = new javax.swing.JTextField();
        TextField_UserName = new javax.swing.JTextField();
        Label_UIcon = new javax.swing.JLabel();
        Label_Password = new javax.swing.JLabel();
        Label_EIcon = new javax.swing.JLabel();
        Label_PIcon = new javax.swing.JLabel();
        TextField_ContactNumber = new javax.swing.JTextField();
        Label_Email = new javax.swing.JLabel();
        TextField_Email1 = new javax.swing.JTextField();
        Label_ContactNumber = new javax.swing.JLabel();
        Label_CIcon = new javax.swing.JLabel();
        Button_Login = new javax.swing.JButton();
        Button_SignUp1 = new javax.swing.JButton();
        Labe_UserNameError = new javax.swing.JLabel();
        Label_PasswordError = new javax.swing.JLabel();
        Label_EmailError = new javax.swing.JLabel();
        Label_ContactNumbeError = new javax.swing.JLabel();
        Label_HaveAlreadyAccount = new javax.swing.JLabel();
        Label_ContactNumber2 = new javax.swing.JLabel();
        Button_exit = new javax.swing.JButton();
        Label_BImage = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 912, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(28, 244, 127));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 343, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 792, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(4, 246, 107));
        setUndecorated(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 912, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 912, Short.MAX_VALUE)
        );

        Panel_SignUp.setBackground(new java.awt.Color(102, 19, 209));
        Panel_SignUp.setPreferredSize(new java.awt.Dimension(420, 720));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SignUP");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Create New account");

        Labe_UserName.setForeground(new java.awt.Color(255, 255, 255));
        Labe_UserName.setText("Name");

        TextField_Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextField_PasswordKeyPressed(evt);
            }
        });

        TextField_UserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextField_UserNameKeyPressed(evt);
            }
        });

        Label_UIcon.setForeground(new java.awt.Color(255, 255, 255));
        Label_UIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/user (1).png"))); // NOI18N

        Label_Password.setForeground(new java.awt.Color(255, 255, 255));
        Label_Password.setText("Password");

        Label_EIcon.setForeground(new java.awt.Color(255, 255, 255));
        Label_EIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/email.png"))); // NOI18N

        Label_PIcon.setForeground(new java.awt.Color(255, 255, 255));
        Label_PIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/padlock.png"))); // NOI18N

        TextField_ContactNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextField_ContactNumberKeyPressed(evt);
            }
        });

        Label_Email.setForeground(new java.awt.Color(255, 255, 255));
        Label_Email.setText("Email");

        TextField_Email1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextField_Email1KeyPressed(evt);
            }
        });

        Label_ContactNumber.setForeground(new java.awt.Color(255, 255, 255));
        Label_ContactNumber.setText("Contact Number");

        Label_CIcon.setForeground(new java.awt.Color(255, 255, 255));
        Label_CIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add-contact.png"))); // NOI18N

        Button_Login.setBackground(new java.awt.Color(11, 168, 145));
        Button_Login.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Button_Login.setText("Login");
        Button_Login.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 1));
        Button_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_LoginActionPerformed(evt);
            }
        });

        Button_SignUp1.setBackground(new java.awt.Color(11, 168, 145));
        Button_SignUp1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Button_SignUp1.setText("SignUp");
        Button_SignUp1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 1));
        Button_SignUp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_SignUp1ActionPerformed(evt);
            }
        });

        Labe_UserNameError.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        Labe_UserNameError.setForeground(new java.awt.Color(255, 0, 0));

        Label_PasswordError.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        Label_PasswordError.setForeground(new java.awt.Color(255, 0, 0));

        Label_EmailError.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        Label_EmailError.setForeground(new java.awt.Color(255, 51, 51));

        Label_ContactNumbeError.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        Label_ContactNumbeError.setForeground(new java.awt.Color(255, 0, 0));

        Label_HaveAlreadyAccount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Label_HaveAlreadyAccount.setForeground(new java.awt.Color(255, 255, 255));
        Label_HaveAlreadyAccount.setText("Have already Account");

        Label_ContactNumber2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Label_ContactNumber2.setForeground(new java.awt.Color(255, 255, 255));
        Label_ContactNumber2.setText("or");

        Button_exit.setBackground(new java.awt.Color(153, 0, 0));
        Button_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/close (1).png"))); // NOI18N
        Button_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_SignUpLayout = new javax.swing.GroupLayout(Panel_SignUp);
        Panel_SignUp.setLayout(Panel_SignUpLayout);
        Panel_SignUpLayout.setHorizontalGroup(
            Panel_SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_SignUpLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(Panel_SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_SignUpLayout.createSequentialGroup()
                        .addComponent(Label_ContactNumber2)
                        .addGap(190, 190, 190))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_SignUpLayout.createSequentialGroup()
                        .addGroup(Panel_SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_UIcon, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Label_EIcon, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Label_PIcon, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Label_CIcon, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(Panel_SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_ContactNumbeError, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Panel_SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Label_PasswordError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Label_ContactNumber)
                                .addComponent(Label_Email)
                                .addComponent(TextField_Password, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                                .addComponent(Label_Password)
                                .addComponent(Labe_UserName)
                                .addComponent(TextField_ContactNumber)
                                .addComponent(TextField_Email1)
                                .addGroup(Panel_SignUpLayout.createSequentialGroup()
                                    .addGap(64, 64, 64)
                                    .addComponent(Labe_UserNameError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(Label_EmailError, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TextField_UserName, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_SignUpLayout.createSequentialGroup()
                        .addGroup(Panel_SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Button_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_HaveAlreadyAccount)
                            .addComponent(Button_SignUp1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(131, 131, 131))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_SignUpLayout.createSequentialGroup()
                        .addGroup(Panel_SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(151, 151, 151))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_SignUpLayout.createSequentialGroup()
                        .addComponent(Button_exit)
                        .addContainerGap())))
        );
        Panel_SignUpLayout.setVerticalGroup(
            Panel_SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_SignUpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Button_exit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(71, 71, 71)
                .addComponent(Labe_UserName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label_UIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextField_UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(Labe_UserNameError)
                .addGap(18, 18, 18)
                .addComponent(Label_Password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextField_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_PIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Label_PasswordError)
                .addGap(18, 18, 18)
                .addComponent(Label_Email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextField_Email1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_EIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(Label_EmailError)
                .addGroup(Panel_SignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Panel_SignUpLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(Label_CIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_SignUpLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Label_ContactNumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TextField_ContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addComponent(Label_ContactNumbeError)
                .addGap(59, 59, 59)
                .addComponent(Button_SignUp1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_ContactNumber2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Label_HaveAlreadyAccount)
                .addGap(18, 18, 18)
                .addComponent(Button_Login)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        Label_BImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/books-5211309_12801.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(864, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(Label_BImage, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel_SignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel_SignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_BImage))
                .addGap(2183, 2183, 2183)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Button_SignUp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_SignUp1ActionPerformed

        boolean feildEmty = false;
        boolean isExite = false;
        String emailRegex = "^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$";
        String user_name = TextField_UserName.getText();
        String password = TextField_Password.getText();
        String email = TextField_Email1.getText();
        String contact = TextField_ContactNumber.getText();

        if (user_name.equals("")) {
            Labe_UserNameError.setVisible(true);
            Labe_UserNameError.setText("Please Enter The User Name");
            feildEmty = true;
        }
        if (password.equals("")) {
            Label_PasswordError.setVisible(true);
            Label_PasswordError.setText("Please Enter The Password Least minum 8 characters");
            feildEmty = true;
        }
        if (email.equals("") || !email.matches(emailRegex)) {
            Label_EmailError.setVisible(true);
            Label_EmailError.setText("PLease Enter the valid Email");
            feildEmty = true;
        }
        if (contact.equals("")) {
            Label_ContactNumbeError.setVisible(true);
            Label_ContactNumbeError.setText("Please Enter The Contact number");
            feildEmty = true;
        }

        if (!feildEmty) {

            try {
                DBConnector dbc = new DBConnector();

                boolean rs = dbc.CheckDublicate(email);
                if (!rs) {
                    int status = dbc.SignUP(user_name, password, email, contact);
                    if (status > 0) {
                        JOptionPane.showMessageDialog(null, "Account Create Success.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "PLease Check The Details.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    Label_EmailError.setVisible(true);
                    Label_EmailError.setText("This Email Is Already Use");
                }

            } catch (SQLException ex) {
                Logger.getLogger(SignUp_Page.class.getName()).log(Level.SEVERE, null, ex);
            }

        }


    }//GEN-LAST:event_Button_SignUp1ActionPerformed

    private void Button_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_LoginActionPerformed
        Login_Page login_Page = new Login_Page();
        login_Page.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Button_LoginActionPerformed

    private void Button_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_exitActionPerformed
        dispose();
    }//GEN-LAST:event_Button_exitActionPerformed

    private void TextField_UserNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_UserNameKeyPressed
        Labe_UserNameError.setVisible(false);
    }//GEN-LAST:event_TextField_UserNameKeyPressed

    private void TextField_PasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_PasswordKeyPressed
        Label_PasswordError.setVisible(false);
    }//GEN-LAST:event_TextField_PasswordKeyPressed

    private void TextField_Email1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_Email1KeyPressed
        Label_EmailError.setVisible(false);
    }//GEN-LAST:event_TextField_Email1KeyPressed

    private void TextField_ContactNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextField_ContactNumberKeyPressed
        Label_ContactNumbeError.setVisible(false);
    }//GEN-LAST:event_TextField_ContactNumberKeyPressed

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
            java.util.logging.Logger.getLogger(SignUp_Page.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp_Page.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp_Page.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp_Page.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Login;
    private javax.swing.JButton Button_SignUp1;
    private javax.swing.JButton Button_exit;
    private javax.swing.JLabel Labe_UserName;
    private javax.swing.JLabel Labe_UserNameError;
    private javax.swing.JLabel Label_BImage;
    private javax.swing.JLabel Label_CIcon;
    private javax.swing.JLabel Label_ContactNumbeError;
    private javax.swing.JLabel Label_ContactNumber;
    private javax.swing.JLabel Label_ContactNumber2;
    private javax.swing.JLabel Label_EIcon;
    private javax.swing.JLabel Label_Email;
    private javax.swing.JLabel Label_EmailError;
    private javax.swing.JLabel Label_HaveAlreadyAccount;
    private javax.swing.JLabel Label_PIcon;
    private javax.swing.JLabel Label_Password;
    private javax.swing.JLabel Label_PasswordError;
    private javax.swing.JLabel Label_UIcon;
    private javax.swing.JPanel Panel_SignUp;
    private javax.swing.JTextField TextField_ContactNumber;
    private javax.swing.JTextField TextField_Email1;
    private javax.swing.JTextField TextField_Password;
    private javax.swing.JTextField TextField_UserName;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
