/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Two;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author menelaos
 */
public class TwoButtons {
    JFrame frame;
    JLabel label;
    int i = 1;
    
    public static void main (String[] args) {
        TwoButtons gui = new TwoButtons();        
        gui.go();
    }
    
    public void go () {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton labelButton = new JButton("Change Label");
        labelButton.addActionListener(new LabelListener());
        
        JButton colorButton = new JButton("Change Circle");
        colorButton.addActionListener(new ColorListener());
        
        MyDrawPanel drawPanel = new MyDrawPanel();
        
        label = new JLabel("I'm a label");
        
        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label);

        frame.setSize(3000, 300);
        frame.setVisible(true);
    }
    
    class LabelListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent event) {
            System.out.println("LabelListener called");
            label.setText("label and i = " + i);
            i++;
        }
    }
    
    class ColorListener implements ActionListener {
                
        @Override
        public void actionPerformed(ActionEvent event) {
            System.out.println("ColorListener called");
            frame.repaint();
        }
    } 
    
    class MyDrawPanel extends JPanel {
        
    @Override
        public void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;

            System.out.println("MyDrawPanel called");

            int red = (int) (Math.random() * 256);
            int green = (int) (Math.random() * 256);
            int blue = (int) (Math.random() * 256);
            Color startColor = new Color(red, green, blue);

            red = (int) (Math.random() * 256);
            green = (int) (Math.random() * 256);
            blue = (int) (Math.random() * 256);
            Color endColor = new Color(red, green, blue);

            GradientPaint gradient = new GradientPaint(70,70,startColor,150,150,endColor);
            g2d.setPaint(gradient);
            g2d.fillOval(70,70,100,100);
        }
    }
}
