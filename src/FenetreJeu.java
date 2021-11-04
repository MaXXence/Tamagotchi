import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

public class FenetreJeu extends JFrame{
    int largeur;
    int hauteur;
    boolean active;
    JPanel panneau1;
    JPanel panneau2;
    JPanel panneau3;
    JPanel panneau4;
    JPanel barre1;
    JPanel barre2;
    JPanel barre3;
    JPanel barre4;
    JPanel barre5;
    JLabel titreBarre1;
    JLabel titreBarre2;
    JLabel titreBarre3;
    JLabel titreBarre4;
    JLabel titreBarre5;

    ImageIcon imagePerso;
    

    FenetreJeu(Personnage perso)
    {
        largeur=800;
        hauteur=600;
        this.setTitle("Tamagotchi");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panneau1 = new JPanel();
        panneau1.setBounds(0,0,largeur*5/8,hauteur*1/2);
        panneau1.setBackground(Color.red);
        panneau2 = new JPanel();
        panneau2.setBounds(largeur*5/8,0,largeur*3/8,hauteur*1/2);
        panneau2.setBackground(Color.blue);
        panneau2.setLayout(null);
        panneau3 = new JPanel();
        panneau3.setBounds(0,hauteur*1/2,largeur*5/8,hauteur*1/2);
        panneau3.setBackground(Color.green);
        panneau3.setLayout(null);
        panneau4 = new JPanel();
        panneau4.setBounds(largeur*5/8,hauteur*1/2,largeur*3/8,hauteur*1/2);
        panneau4.setBackground(Color.black);
        panneau4.setLayout(null);

        selectImage(perso);
        panneau1.add(new JLabel(imagePerso));

        creationBarres(perso);

        this.add(panneau1);
        this.add(panneau2);
        this.add(panneau3);
        this.add(panneau4);

        this.setSize(largeur,hauteur+38);//300+38 taille de la barre de titre = 38px
        this.setLayout(null);
        this.setVisible(true);
    }
    void selectImage(Personnage perso)
    {
        if(perso instanceof Chien)
        {
            imagePerso=new ImageIcon("img/chien.gif");
        }
    }

    void creationBarres(Personnage perso)
    {
        int l=largeur*5/8;
        int h=hauteur*1/2;
        barre1 = new JPanel();
        barre1.setBounds((int)(l*0.3), (int)(h*0.05), (int)(l*0.6), (int)(h*0.1));
        barre1.setBackground(Color.red);
        panneau3.add(barre1);

        barre1 = new JPanel();
        barre1.setBounds((int)(l*0.3), (int)(h*0.25), (int)(l*0.6), (int)(h*0.1));
        barre1.setBackground(Color.red);
        panneau3.add(barre1);

        barre1 = new JPanel();
        barre1.setBounds((int)(l*0.3), (int)(h*0.45), (int)(l*0.6), (int)(h*0.1));
        barre1.setBackground(Color.red);
        panneau3.add(barre1);

        barre1 = new JPanel();
        barre1.setBounds((int)(l*0.3), (int)(h*0.65), (int)(l*0.6), (int)(h*0.1));
        barre1.setBackground(Color.red);
        panneau3.add(barre1);

        barre1 = new JPanel();
        barre1.setBounds((int)(l*0.3), (int)(h*0.85), (int)(l*0.6), (int)(h*0.1));
        barre1.setBackground(Color.red);
        panneau3.add(barre1);

        titreBarre1= new JLabel(perso.getNomCaracteristiques().get(0));
        titreBarre1.setBounds((int)(l*0.1), (int)(h*0.05), (int)(l*0.2), (int)(h*0.1));
        panneau3.add(titreBarre1);

        titreBarre2= new JLabel(perso.getNomCaracteristiques().get(1));
        titreBarre2.setBounds((int)(l*0.1), (int)(h*0.25), (int)(l*0.2), (int)(h*0.1));
        panneau3.add(titreBarre2);

        titreBarre3= new JLabel(perso.getNomCaracteristiques().get(2));
        titreBarre3.setBounds((int)(l*0.1), (int)(h*0.45), (int)(l*0.2), (int)(h*0.1));
        panneau3.add(titreBarre3);

        titreBarre4= new JLabel(perso.getNomCaracteristiques().get(3));
        titreBarre4.setBounds((int)(l*0.1), (int)(h*0.65), (int)(l*0.2), (int)(h*0.1));
        panneau3.add(titreBarre4);

        titreBarre5= new JLabel(perso.getNomCaracteristiques().get(4));
        titreBarre5.setBounds((int)(l*0.1), (int)(h*0.85), (int)(l*0.2), (int)(h*0.1));
        panneau3.add(titreBarre5);


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
