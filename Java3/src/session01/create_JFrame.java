/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session01;

import javax.swing.JFrame;

/**
 *
 * @author TAI
 */
public class create_JFrame extends JFrame {

    public create_JFrame() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Create JFrame ");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        create_JFrame createJFrame = new create_JFrame();
    }
}
