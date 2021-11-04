import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

import java.util.ArrayList;

public class Personnage {
	private String nom;
	private LocalDate dateNaissance;
	private int pieceActuelle;
	private double[] caracteristiques={5,25,50,70,90};
	protected ArrayList<String> nomCaracteristiques;
	private String etatPhysique;
	private String etatMoral;
	private String type;

	
	public Personnage(String n)
	{
		nom=n;
		dateNaissance=LocalDate.now();
		pieceActuelle=1;
		etatPhysique="En forme";
		etatMoral="Heureux";
	}
	
	public String getNom()
	{
		return nom;
	}
	public LocalDate getDateNaissance()
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
	public ArrayList<Integer> getAge()
	{
		LocalDate d=LocalDate.now();
		ArrayList<Integer> ageList = new ArrayList<Integer>();
		Period age = Period.between(dateNaissance, d);
		ageList.add(age.getYears());
		ageList.add(age.getMonths());
		ageList.add(age.getDays());

		return ageList;
	}
	public String getEtatPhys()
	{
		return etatPhysique;
	}
	public String getEtatMoral()
	{
		return etatMoral;
	}
}
