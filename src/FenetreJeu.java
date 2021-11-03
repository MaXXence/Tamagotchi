import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

public class FenetreJeu extends JFrame{
    boolean active;
    JPanel panneau1;
    JPanel panneau2;
    JPanel panneau3;
    JPanel panneau4;
    ImageIcon imagePerso;

    FenetreJeu(Personnage perso)
    {
        this.setTitle("Tamagotchi");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panneau1 = new JPanel();
        panneau1.setBounds(0,0,300,400);
        panneau1.setBackground(Color.red);
        panneau2 = new JPanel();
        panneau2.setBounds(300,0,500,400);
        panneau2.setBackground(Color.blue);
        panneau2.setLayout(null);
        panneau3 = new JPanel();
        panneau3.setBounds(0,400,300,400);
        panneau3.setBackground(Color.green);
        panneau3.setLayout(null);
        panneau4 = new JPanel();
        panneau4.setBounds(300,400,500,400);
        panneau4.setBackground(Color.black);
        panneau4.setLayout(null);

        selectImage(perso);
        panneau1.add(new JLabel(imagePerso));
        
        this.add(panneau1);
        this.add(panneau2);
        this.add(panneau3);
        this.add(panneau4);

        this.setSize(800,838);//300+38 taille de la barre de titre = 38px
        this.setLayout(null);
        this.setVisible(true);
    }
    void selectImage(Personnage perso)
    {
        if(perso instanceof Chien)
        {
            imagePerso=new ImageIcon("img/chien.png");
        }
    }


    void fermerFenetre()
    {
        this.dispose();
    }
    boolean getActive()
    {
        return active;
    }
}
