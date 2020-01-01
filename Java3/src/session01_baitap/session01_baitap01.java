/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session01_baitap;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author TAI
 */
public class session01_baitap01 extends JFrame {

    JPanel myJPanel;
    JLabel lblUser;
    JLabel lblPassword;
    JLabel lblStatusUserName;
    JLabel lblStatusPassword;
    JLabel lblStatusLogin;
    JTextField txtUser;
    JPasswordField txtPassword;
    JButton btnLogin;
    JButton btnExit;

    void create_JFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Login");
        setSize(330, 170);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    void create_JPanel() {
        myJPanel = new JPanel();
    }

    void addJPanel() {
        add(this.myJPanel);
    }

    void create_JLabelUser() {
        lblUser = new JLabel("User name: ");
    }

    void addJLabelUser() {
        myJPanel.add(lblUser);
    }

    void create_JTextFieldUser() {
        txtUser = new JTextField(20);
    }

    void addJTextFieldUser() {
        myJPanel.add(txtUser);
    }

    void create_JButtonLogin() {
        btnLogin = new JButton("Login");
        btnLogin.setPreferredSize(new Dimension(70, 20));
    }

    void addJButtonLogin() {
        myJPanel.add(btnLogin);
    }

    void create_JLabelPassword() {
        lblPassword = new JLabel("Password:  ");
    }

    void addJLabelPassword() {
        myJPanel.add(lblPassword);
    }

    void create_JTextFieldPassword() {
        txtPassword = new JPasswordField(20);
    }

    void addJTextFieldPassword() {
        myJPanel.add(txtPassword);
    }

    void create_JButtonExit() {
        btnExit = new JButton("Exit");
        btnExit.setPreferredSize(new Dimension(70, 20));
    }

    void addJButtonExit() {
        myJPanel.add(btnExit);
    }

    void create_JLabelStatusUserName() {
        lblStatusUserName = new JLabel("Status textbox user name: ");
        lblStatusUserName.setPreferredSize(new Dimension(300, 20));
    }

    void addJLabelStatusUserName() {
        myJPanel.add(lblStatusUserName);
    }

    void create_JLabelStatusPassword() {
        lblStatusPassword = new JLabel("Status textbox password: ");
        lblStatusPassword.setPreferredSize(new Dimension(300, 20));
    }

    void addJLabelStatusPassword() {
        myJPanel.add(lblStatusPassword);
    }

    void create_JLabelStatusLogin() {
        lblStatusLogin = new JLabel("Status login: ");
        lblStatusLogin.setPreferredSize(new Dimension(300, 20));
    }

    void addJLabelStatusLogin() {
        myJPanel.add(lblStatusLogin);
    }

    void display_JFrame() {
        setVisible(true);
    }

    void add_Focus_JTextFieldUser() {
        txtUser.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent fe) {
                lblStatusUserName.setText("Status textbox user name: got focus");
            }

            @Override
            public void focusLost(FocusEvent fe) {
                lblStatusUserName.setText("Status textbox user name: lost focus");
            }
        });
    }

    void add_Focus_JTextFieldPassword() {
        txtPassword.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent fe) {
                lblStatusPassword.setText("Status textbox password: got focus");
            }

            @Override
            public void focusLost(FocusEvent fe) {
                lblStatusPassword.setText("Status textbox password: lost focus");
            }
        });
    }

    void add_event_for_JButtonLogin() {
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (txtUser.getText().equalsIgnoreCase("")) {
                    lblStatusLogin.setText("Status login: User name empty");
                    txtUser.requestFocus();
                }
                if (txtPassword.getText().equalsIgnoreCase("")) {
                    lblStatusLogin.setText("Status login: Password empty");
                    txtPassword.requestFocus();
                }
                if ((txtUser.getText().equalsIgnoreCase("")) && (txtPassword.getText().equalsIgnoreCase(""))) {
                    lblStatusLogin.setText("Status login: User name and password empty");
                    txtUser.requestFocus();
                }
                if (!(txtUser.getText().equalsIgnoreCase("")) && !(txtPassword.getText().equalsIgnoreCase(""))) {
                    lblStatusLogin.setText("Status login: login successful");
                }
            }
        });
    }

    void add_event_for_JButtonExit() {
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException {
        session01_baitap01 myForm = new session01_baitap01();
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (IllegalAccessException ex) {
            Logger.getLogger(session01_baitap01.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(session01_baitap01.class.getName()).log(Level.SEVERE, null, ex);
        }

        myForm.create_JFrame();
        myForm.create_JPanel();
        myForm.addJPanel();
        myForm.create_JLabelUser();
        myForm.addJLabelUser();
        myForm.create_JTextFieldUser();
        myForm.addJTextFieldUser();
        myForm.create_JButtonLogin();
        myForm.addJButtonLogin();
        myForm.create_JLabelPassword();
        myForm.addJLabelPassword();
        myForm.create_JTextFieldPassword();
        myForm.addJTextFieldPassword();
        myForm.create_JButtonExit();
        myForm.addJButtonExit();
        myForm.create_JLabelStatusUserName();
        myForm.addJLabelStatusUserName();
        myForm.create_JLabelStatusPassword();
        myForm.addJLabelStatusPassword();
        myForm.create_JLabelStatusLogin();
        myForm.addJLabelStatusLogin();
        myForm.display_JFrame();
        myForm.add_Focus_JTextFieldUser();
        myForm.add_Focus_JTextFieldPassword();
        myForm.add_event_for_JButtonLogin();
        myForm.add_event_for_JButtonExit();
    }
}
