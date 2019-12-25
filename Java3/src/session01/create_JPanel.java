/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session01;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author TAI
 */
public class create_JPanel extends JFrame implements ActionListener {

    private int numlabel = 0; // number JLabel in panel
    JPanel panel1, panel2;

    public create_JPanel() {
        createJFrame();
    }

    // create JFrame
    private void createJFrame() {
        setTitle("Create JPanel");
        setLayout(new GridLayout(2, 1, 5, 5));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        createContent();

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void createContent() {
        // create panel1 with layout default is FlowLayout
        panel1 = new JPanel();
        // add a label into panel1
        addJLabel(panel1);

        // create panel2 with GridLayout
        panel2 = new JPanel(new GridLayout(1, 2, 5, 5));
        panel2.add(createJButton("Add a JLabel"));
        panel2.add(createJButton("Remove all JLabel"));

        // add panel1 and panel2 into JFrame
        add(panel1);
        add(panel2);
    }

    // add JLabel to panel and repaint
    private void addJLabel(JPanel panel) {
        panel.add(new JLabel("JLabel" + (++numlabel)));
        panel.validate();
        panel.repaint();
    }

    // remove all JLabel and repaint JPanel
    private void removeAllJLabel(JPanel panel) {
        panel.removeAll();
        panel.validate();
        panel.repaint();
        numlabel = 0;
    }

    // create a JButton
    private JButton createJButton(String buttonName) {
        JButton btn = new JButton(buttonName);
        btn.addActionListener(this);
        return btn;
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        String command = evt.getActionCommand();
        if (command == "Add a JLabel") {
            addJLabel(panel1);
            System.out.println("add" + panel1.getComponentCount());
        }
        if (command == "Remove all JLabel") {
            removeAllJLabel(panel1);
        }
    }

    public static void main(String[] args) {
        create_JPanel myJPanel = new create_JPanel();
    }
}
