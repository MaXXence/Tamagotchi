import java.util.Date;
import java.util.ArrayList;

public class Personnage {
	private String nom;
	private Date dateNaissance;
	private int pieceActuelle;
	private double[] caracteristiques={80,80,80,80,80,80};
	protected ArrayList<String> nomCaracteristiques;
	private String type;

	
	public Personnage(String n)
	{
		nom=n;
		dateNaissance=new Date();
		pieceActuelle=0;
	}
	
	public String getNom()
	{
		return nom;
	}
	public Date getDateNaissance()
	{
		return dateNaissance;
	}
	public int getPiece()
	{
		return pieceActuelle;
	}
	public void setPiece(int p)
	{
		pieceActuelle=p;
	}
	public ArrayList<String> getNomCaracteristiques()
    {
        return nomCaracteristiques;
    }
	public void setCaracteristique(int n, double v)
	{
		caracteristiques[n]=v;
	}
	public double getCaracteristique(int n)
	{
		return caracteristiques[n];
	}
}
