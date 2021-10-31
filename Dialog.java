import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Dialog extends JDialog {
    public Dialog(String text) {
        setTitle("VICTOIRE !");
        setResizable(false);
        setPreferredSize(new Dimension(400, 100));
        setLocationRelativeTo(null);

        JLabel victoire = new JLabel(text);

        JButton nvlpartie = new JButton("Nouvelle Partie");
        JButton quitter = new JButton("Quitter le jeu");
        JButton fermerdialog = new JButton("Fermer");

        JPanel organisation = new JPanel();
        JPanel boutons = new JPanel();

        boutons.setLayout(new FlowLayout());
        boutons.add(nvlpartie);
        boutons.add(quitter);
        boutons.add(fermerdialog);
        boutons.setVisible(true);

        organisation.setLayout(new BorderLayout());
        organisation.add(victoire, BorderLayout.NORTH);
        organisation.add(boutons, BorderLayout.SOUTH);
        organisation.setVisible(true);

        nouvellepartie nv = new nouvellepartie();
        nvlpartie.addActionListener(nv);
        nvlpartie.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        fermerdialog.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        quitter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        add(organisation);
        pack();
        setVisible(true);

    }
}