import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.awt.event.ActionEvent;

public class nouvellepartie implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        morpion1.a1.setText("");
        morpion1.a1.setBackground(UIManager.getColor("Button.background"));
        morpion1.a1.setEnabled(true);

        morpion1.a2.setText("");
        morpion1.a2.setBackground(UIManager.getColor("Button.background"));
        morpion1.a2.setEnabled(true);

        morpion1.a3.setText("");
        morpion1.a3.setBackground(UIManager.getColor("Button.background"));
        morpion1.a3.setEnabled(true);

        morpion1.b1.setText("");
        morpion1.b1.setBackground(UIManager.getColor("Button.background"));
        morpion1.b1.setEnabled(true);

        morpion1.b2.setText("");
        morpion1.b2.setBackground(UIManager.getColor("Button.background"));
        morpion1.b2.setEnabled(true);

        morpion1.b3.setText("");
        morpion1.b3.setBackground(UIManager.getColor("Button.background"));
        morpion1.b3.setEnabled(true);

        morpion1.c1.setText("");
        morpion1.c1.setBackground(UIManager.getColor("Button.background"));
        morpion1.c1.setEnabled(true);

        morpion1.c2.setText("");
        morpion1.c2.setBackground(UIManager.getColor("Button.background"));
        morpion1.c2.setEnabled(true);

        morpion1.c3.setText("");
        morpion1.c3.setBackground(UIManager.getColor("Button.background"));
        morpion1.c3.setEnabled(true);

        morpion1.nbclick = 1;
    }
}