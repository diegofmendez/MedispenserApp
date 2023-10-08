
package medispenser;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class medispenser {

    public static void main(String[] args) {
        JFrame window = new JFrame("Ventanaita");
        window.setVisible(true);
        window.setBounds(0,0,700,700);
        window.setDefaultCloseOperation(3);
         
        JPanel panel=new JPanel();
        panel.setBackground(Color.red);
        window.add(panel);
        
        JButton boton = new JButton("Button");
        panel.add(boton);
    }
}
