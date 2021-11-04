
public class Interface{
    private FenetreCreation f1;
    private FenetreJeu f2;
    private Personnage perso;
    Interface(String i,Personnage p)
    {
        perso =p;
    }
    void initFenetreCreation()
    {
        f1=new FenetreCreation();
    }
    void initFenetreJeu()
    {
        f2=new FenetreJeu(perso);
    }
    String getNomCreation()
    {
        return f1.getNom();
    }
    Personnage getPersonnageCreation()
    {
        return f1.getPersonnage();
    }
    boolean getActiveCreation()
    {
        return f1.getActive();
    }
    boolean getActiveJeu()
    {
        return f2.getActive();
    }

}

