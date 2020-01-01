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
public class create_JLabel extends JFrame{
    
    private void create_JFrame(String title){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(title);
        setSize(500, 300);
        
    }
    private void display_JFrame(){
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public create_JLabel(){
        
    }
}
