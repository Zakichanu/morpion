import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class morpion1 {

  public static JFrame morpion = new JFrame("Morpion");
  public static JButton a1 = new JButton();
  public static JButton a2 = new JButton();
  public static JButton a3 = new JButton();
  public static JButton b1 = new JButton();
  public static JButton b2 = new JButton();
  public static JButton b3 = new JButton();
  public static JButton c1 = new JButton();
  public static JButton c2 = new JButton();
  public static JButton c3 = new JButton();
  public static int nbclick;

  public morpion1(int w, int h) {
    nbclick = 1;
    morpion.setBounds(400, 400, w, h);
    initialise();
    morpion.setVisible(true);
  }

  public static void initialise() {

    java.awt.Font taille = new java.awt.Font("Arial", 45, 50);
    a1.setFont(taille);
    a2.setFont(taille);
    a3.setFont(taille);
    b1.setFont(taille);
    b2.setFont(taille);
    b3.setFont(taille);
    c1.setFont(taille);
    c2.setFont(taille);
    c3.setFont(taille);

    morpion.setLayout(new GridLayout(3, 3));
    morpion.setPreferredSize(new Dimension(400, 400));
    morpion.setResizable(false);
    morpion.setLocationRelativeTo(null);

    morpion.add(a1);
    morpion.add(b1);
    morpion.add(c1);
    morpion.add(a2);
    morpion.add(b2);
    morpion.add(c2);
    morpion.add(a3);
    morpion.add(b3);
    morpion.add(c3);

    // Ajout des évènements pour les 9 boutons//
    a1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (a2.getText() == "" || a3.getText() == "" || b3.getText() == "" || b2.getText() == "" || b1.getText() == ""
            || c1.getText() == "" || c2.getText() == "" || c3.getText() == "" || a1.getText() == "") {
          if (nbclick % 2 == 0) {
            a1.setText("O");
            a1.setBackground(new Color(18, 82, 235));
            if (a1.getText() == a2.getText() && a2.getText() == a3.getText() && a1.getText() != "") {
              Dialog gagnant = new Dialog("Le joueur 2 a gagne !! ");
            } else if (a1.getText() == b2.getText() && b2.getText() == c3.getText() && a1.getText() != "") {
              Dialog gagnant = new Dialog("Le joueur 2 a gagne !! ");
            } else if (a1.getText() == b1.getText() && b1.getText() == c1.getText() && a1.getText() != "") {
              Dialog gagnant = new Dialog("Le joueur 2 a gagne !!");
            }
          } else {
            a1.setText("X");
            a1.setBackground(new Color(232, 12, 21));
            if (a1.getText() == a2.getText() && a2.getText() == a3.getText() && a1.getText() != "") {
              Dialog gagnant = new Dialog("Le joueur 1 a gagne !! ");
            } else if (a1.getText() == b2.getText() && b2.getText() == c3.getText() && a1.getText() != "") {
              Dialog gagnant = new Dialog("Le joueur 1 a gagne !! ");
            } else if (a1.getText() == b1.getText() && b1.getText() == c1.getText() && a1.getText() != "") {
              Dialog gagnant = new Dialog("Le joueur 1 a gagne !!");
            }

          }
        } else {
          if (nbclick % 2 == 0) {
            a1.setText("O");
            a1.setBackground(new Color(18, 82, 235));
          } else {
            a1.setText("X");
            a1.setBackground(new Color(232, 12, 21));
          }
          Dialog nul = new Dialog("MATCH NUL !!");
        }

        nbclick++;
        a1.setEnabled(false);
      }
    });

    a2.addActionListener(new ActionListener() {

      public void actionPerformed(ActionEvent e) {
        if (a1.getText() == "" || a3.getText() == "" || b3.getText() == "" || b2.getText() == "" || b1.getText() == ""
            || c1.getText() == "" || c2.getText() == "" || c3.getText() == "" || a2.getText() == "") {
          if ((float) nbclick / 2 == (int) nbclick / 2) {
            a2.setText("O");
            a2.setBackground(new Color(18, 82, 235));
            if (a1.getText() == a2.getText() && a2.getText() == a3.getText() && a1.getText() != "") {
              Dialog gagnant = new Dialog("Le joueur 2 a gagne !! ");
            } else if (a2.getText() == b2.getText() && b2.getText() == c2.getText() && a2.getText() != "") {
              Dialog gagnant = new Dialog("Le joueur 2 a gagne !!");
            }
          } else {
            a2.setText("X");
            a2.setBackground(new Color(232, 12, 21));
            if (a1.getText() == a2.getText() && a2.getText() == a3.getText() && a1.getText() != "") {
              Dialog gagnant = new Dialog("Le joueur 1 a gagne !! ");
            } else if (a2.getText() == b2.getText() && b2.getText() == c2.getText() && a2.getText() != "") {
              Dialog gagnant = new Dialog("Le joueur 1 a gagne !!");
            }
          }
        } else {
          if (nbclick % 2 == 0) {
            a2.setText("O");
            a2.setBackground(new Color(18, 82, 235));
          } else {
            a2.setText("X");
            a2.setBackground(new Color(232, 12, 21));
          }
          Dialog nul = new Dialog("MATCH NUL !!");
        }
        nbclick++;
        a2.setEnabled(false);
      }
    });

    a3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (a1.getText() == "" || a2.getText() == "" || b3.getText() == "" || b2.getText() == "" || b1.getText() == ""
            || c1.getText() == "" || c2.getText() == "" || c3.getText() == "" || a3.getText() == "") {
          if ((float) nbclick / 2 == (int) nbclick / 2) {
            a3.setText("O");
            a3.setBackground(new Color(18, 82, 235));
            if (a1.getText() == a2.getText() && a2.getText() == a3.getText() && a1.getText() != "") {
              Dialog gagnant = new Dialog("Le joueur 2 a gagne !! ");
            } else if (a3.getText() == b2.getText() && b2.getText() == c1.getText() && a3.getText() != "") {
              Dialog gagnant = new Dialog("Le joueur 2 a gagne !! ");
            } else if (a3.getText() == b3.getText() && b3.getText() == c3.getText() && a3.getText() != "") {
              Dialog gagnant = new Dialog("Le joueur 2 a gagne !!");
            }
          } else {
            a3.setText("X");
            a3.setBackground(new Color(232, 12, 21));
            if (a1.getText() == a2.getText() && a2.getText() == a3.getText() && a1.getText() != "") {
              Dialog gagnant = new Dialog("Le joueur 1 a gagne !! ");
            } else if (a3.getText() == b2.getText() && b2.getText() == c1.getText() && a3.getText() != "") {
              Dialog gagnant = new Dialog("Le joueur 1 a gagne !! ");
            } else if (a3.getText() == b3.getText() && b3.getText() == c3.getText() && a3.getText() != "") {
              Dialog gagnant = new Dialog("Le joueur 1 a gagne !!");
            }
          }
        } else {
          if (nbclick % 2 == 0) {
            a3.setText("O");
            a3.setBackground(new Color(18, 82, 235));
          } else {
            a3.setText("X");
            a3.setBackground(new Color(232, 12, 21));
          }
          Dialog nul = new Dialog("MATCH NUL !!");
        }
        nbclick++;
        a3.setEnabled(false);
      }
    });

    b1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (a1.getText() == "" || a2.getText() == "" || a3.getText() == "" || b3.getText() == "" || b2.getText() == ""
            || c1.getText() == "" || c2.getText() == "" || c3.getText() == "" || b1.getText() == "") {
          if ((float) nbclick / 2 == (int) nbclick / 2) {
            b1.setText("O");
            b1.setBackground(new Color(18, 82, 235));
            if (b1.getText() == b2.getText() && b2.getText() == b3.getText() && b1.getText() != "") {
              Dialog gagnant = new Dialog("Le joueur 2 a gagne !! ");
            } else if (b1.getText() == a1.getText() && a1.getText() == c1.getText() && b1.getText() != "") {
              Dialog gagnant = new Dialog("Le joueur 2 a gagne !!");
            }
          } else {
            b1.setText("X");
            b1.setBackground(new Color(232, 12, 21));
            if (b1.getText() == b2.getText() && b2.getText() == b3.getText() && b1.getText() != "") {
              Dialog gagnant = new Dialog("Le joueur 1 a gagne !! ");
            } else if (b1.getText() == a1.getText() && a1.getText() == c1.getText() && b1.getText() != "") {
              Dialog gagnant = new Dialog("Le joueur 1 a gagne !!");
            }
          }
        } else {
          if (nbclick % 2 == 0) {
            b1.setText("O");
            b1.setBackground(new Color(18, 82, 235));
          } else {
            b1.setText("X");
            b1.setBackground(new Color(232, 12, 21));
          }
          Dialog nul = new Dialog("MATCH NUL !!");
        }
        nbclick++;
        b1.setEnabled(false);
      }
    });

    b2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (a1.getText() == "" || a2.getText() == "" || a3.getText() == "" || b3.getText() == "" || b1.getText() == ""
            || c1.getText() == "" || c2.getText() == "" || c3.getText() == "" || b2.getText() == "") {
          if ((float) nbclick / 2 == (int) nbclick / 2) {
            b2.setText("O");
            b2.setBackground(new Color(18, 82, 235));
            if (b2.getText() == b1.getText() && b1.getText() == b3.getText() && b2.getText() != "") {
              Dialog gagnant = new Dialog("Le joueur 2 a gagne !! ");
            } else if (a1.getText() == b2.getText() && b2.getText() == c3.getText() && b2.getText() != "") {
              Dialog gagnant = new Dialog("Le joueur 2 a gagne !! ");
            } else if (a3.getText() == b2.getText() && b2.getText() == c1.getText() && b2.getText() != "") {
              Dialog gagnant0 = new Dialog("Le joueur 2 a gagne !! ");
            } else if (a2.getText() == b2.getText() && b2.getText() == c2.getText() && b2.getText() != "") {
              Dialog gagnant = new Dialog("Le joueur 2 a gagne !!");
            }
          } else {
            b2.setText("X");
            b2.setBackground(new Color(232, 12, 21));
            if (b2.getText() == b1.getText() && b1.getText() == b3.getText() && b2.getText() != "") {
              Dialog gagnant2 = new Dialog("Le joueur 1 a gagne !! ");
            } else if (a1.getText() == b2.getText() && b2.getText() == c3.getText() && b2.getText() != "") {
              Dialog gagnant = new Dialog("Le joueur 1 a gagne !! ");
            } else if (a3.getText() == b2.getText() && b2.getText() == c1.getText() && b2.getText() != "") {
              Dialog gagnant = new Dialog("Le joueur 1 a gagne !! ");
            } else if (a2.getText() == b2.getText() && b2.getText() == c2.getText() && b2.getText() != "") {
              Dialog gagnant = new Dialog("Le joueur 1 a gagne !!");
            }
          }
        } else {
          if (nbclick % 2 == 0) {
            b2.setText("O");
            b2.setBackground(new Color(18, 82, 235));
          } else {
            b2.setText("X");
            b2.setBackground(new Color(232, 12, 21));
          }
          Dialog nul = new Dialog("MATCH NUL !!");
        }
        nbclick++;
        b2.setEnabled(false);
      }
    });

    b3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (a1.getText() != "" || a2.getText() != "" || a3.getText() == "" || b2.getText() == "" || b1.getText() == ""
            || c1.getText() == "" || c2.getText() == "" || c3.getText() == "" || b3.getText() == "") {
          if ((float) nbclick / 2 == (int) nbclick / 2) {
            b3.setText("O");
            b3.setBackground(new Color(18, 82, 235));
            if (b3.getText() == b2.getText() && b2.getText() == b1.getText() && b3.getText() != "") {
              Dialog gagnant = new Dialog("Le joueur 2 a gagne !! ");
            } else if (b3.getText() == a3.getText() && a3.getText() == c3.getText() && b3.getText() != "") {
              Dialog gagnant = new Dialog("Le joueur 2 a gagne !!");
            }
          } else {
            b3.setText("X");
            b3.setBackground(new Color(232, 12, 21));
            if (b3.getText() == b2.getText() && b2.getText() == b1.getText() && b3.getText() != "") {
              Dialog gagnant = new Dialog("Le joueur 1 a gagne !! ");
            } else if (b3.getText() == a3.getText() && a3.getText() == c3.getText() && b3.getText() != "") {
              Dialog gagnant = new Dialog("Le joueur 1 a gagne !!");
            }
          }
        } else {
          if (nbclick % 2 == 0) {
            b3.setText("O");
            b3.setBackground(new Color(18, 82, 235));
          } else {
            b3.setText("X");
            b3.setBackground(new Color(232, 12, 21));
          }
          Dialog nul = new Dialog("MATCH NUL !!");
        }
        nbclick++;
        b3.setEnabled(false);
      }
    });

    c1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (a1.getText() == "" || a2.getText() == "" || a3.getText() == "" || b3.getText() == "" || b2.getText() == ""
            || b1.getText() == "" || c2.getText() == "" || c3.getText() == "" || c1.getText() == "") {
          if ((float) nbclick / 2 == (int) nbclick / 2) {
            c1.setText("O");
            c1.setBackground(new Color(18, 82, 235));
            if (c1.getText() == c2.getText() && c2.getText() == c3.getText() && c1.getText() != "") {
              Dialog gagnant = new Dialog("Le joueur 2 a gagne !! ");
            } else if (c1.getText() == b2.getText() && b2.getText() == a3.getText() && c1.getText() != "") {
              Dialog gagnant = new Dialog("Le joueur 2 a gagne !! ");
            } else if (c1.getText() == b1.getText() && b1.getText() == a1.getText() && c1.getText() != "") {
              Dialog gagnant0 = new Dialog("Le joueur 2 a gagne !!");
            }
          } else {
            c1.setText("X");
            c1.setBackground(new Color(232, 12, 21));
            if (c1.getText() == c2.getText() && c2.getText() == c3.getText() && c1.getText() != "") {
              Dialog gagnant = new Dialog("Le joueur 1 a gagne !! ");
            } else if (c1.getText() == b2.getText() && b2.getText() == a3.getText() && c1.getText() != "") {
              Dialog gagnant2 = new Dialog("Le joueur 1 a gagne !! ");
            } else if (c1.getText() == b1.getText() && b1.getText() == a1.getText() && c1.getText() != "") {
              Dialog gagnant3 = new Dialog("Le joueur 1 a gagne !!");
            }
          }

        } else {
          if (nbclick % 2 == 0) {
            c1.setText("O");
            c1.setBackground(new Color(18, 82, 235));
          } else {
            c1.setText("X");
            c1.setBackground(new Color(232, 12, 21));
          }
          Dialog nul = new Dialog("MATCH NUL !!");
        }
        nbclick++;
        c1.setEnabled(false);
      }
    });

    c2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (a1.getText() == "" || a2.getText() == "" || a3.getText() == "" || b3.getText() == "" || b2.getText() == ""
            || b1.getText() == "" || c1.getText() == "" || c3.getText() == "" || c2.getText() == "") {
          if ((float) nbclick / 2 == (int) nbclick / 2) {
            c2.setText("O");
            c2.setBackground(new Color(18, 82, 235));
            if (c2.getText() == c1.getText() && c1.getText() == c3.getText() && c2.getText() != "") {
              Dialog gagnant = new Dialog("Le joueur 2 a gagne !! ");
            } else if (c2.getText() == b2.getText() && b2.getText() == a2.getText() && c2.getText() != "") {
              Dialog gagnant = new Dialog("Le joueur 2 a gagne !!");
            }
          } else {
            c2.setText("X");
            c2.setBackground(new Color(232, 12, 21));
            if (c2.getText() == c1.getText() && c1.getText() == c3.getText() && c2.getText() != "") {
              Dialog gagnant = new Dialog("Le joueur 1 a gagne !! ");
            } else if (c2.getText() == b2.getText() && b2.getText() == a2.getText() && c2.getText() != "") {
              Dialog gagnant = new Dialog("Le joueur 1 a gagne !!");
            }
          }

        } else {
          if (nbclick % 2 == 0) {
            c2.setText("O");
            c2.setBackground(new Color(18, 82, 235));
          } else {
            c2.setText("X");
            c2.setBackground(new Color(232, 12, 21));
          }
          Dialog nul = new Dialog("MATCH NUL !!");
        }
        nbclick++;
        c2.setEnabled(false);
      }
    });

    c3.addActionListener(new ActionListener() {

      public void actionPerformed(ActionEvent e) {
        if (a1.getText() == "" || a2.getText() == "" || a3.getText() == "" || b3.getText() == "" || b2.getText() == ""
            || b1.getText() == "" || c1.getText() == "" || c2.getText() == "" || c3.getText() == "") {

          if ((float) nbclick / 2 == (int) nbclick / 2) {
            c3.setText("O");
            c3.setBackground(new Color(18, 82, 235));
            if (c3.getText() == c2.getText() && c2.getText() == c1.getText() && c3.getText() != "") {
              Dialog gagnant = new Dialog("Le joueur 2 a gagne !! ");
            } else if (c3.getText() == b2.getText() && b2.getText() == a1.getText() && c3.getText() != "") {
              Dialog gagnant = new Dialog("Le joueur 2 a gagne !! ");
            } else if (c3.getText() == b3.getText() && b3.getText() == a3.getText() && c3.getText() != "") {
              Dialog gagnant0 = new Dialog("Le joueur 2 a gagne !!");
            }
          } else {
            c3.setText("X");
            c3.setBackground(new Color(232, 12, 21));
            if (c3.getText() == c2.getText() && c2.getText() == c1.getText() && c3.getText() != "") {
              Dialog gagnant = new Dialog("Le joueur 1 a gagne !! ");
            } else if (c3.getText() == b2.getText() && b2.getText() == a1.getText() && c3.getText() != "") {
              Dialog gagnant = new Dialog("Le joueur 1 a gagne !! ");
            } else if (c3.getText() == b3.getText() && b3.getText() == a3.getText() && c3.getText() != "") {
              Dialog gagnant = new Dialog("Le joueur 1 a gagne !!");
            }
          }

        } else {
          if (nbclick % 2 == 0) {
            c3.setText("O");
            c3.setBackground(new Color(18, 82, 235));
          } else {
            c3.setText("X");
            c3.setBackground(new Color(232, 12, 21));
          }
          Dialog nul = new Dialog("MATCH NUL !!");
        }
        nbclick++;
        c3.setEnabled(false);
      }
    });

    // Code de la JMenuBar//
    JMenuBar outils = new JMenuBar();
    morpion.setJMenuBar(outils);
    JMenu fichier = new JMenu("Fichier");
    outils.add(fichier);
    JMenuItem nvlpartie = new JMenuItem("Nouvelle Partie");
    JMenuItem quitter = new JMenuItem("Quitter");
    fichier.add(nvlpartie);
    fichier.addSeparator();
    fichier.add(quitter);

    nouvellepartie nv = new nouvellepartie();

    nvlpartie.addActionListener(nv);

    quitter.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent f) {
        System.exit(0);
      }
    });
  }

  public static void main(String[] args) {
    new morpion1(500, 500);
  }
}