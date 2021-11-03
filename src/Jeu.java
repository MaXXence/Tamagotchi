import java.util.ArrayList;
public class Jeu {
	private ArrayList<Piece> pieces;
	private Personnage perso;
	private Interface Iface;
	Jeu()
	{
		perso = new Chien("pipou");
		Interface Iface=new Interface("jeu", perso);
		Iface.initFenetreJeu();
		/*pieces=new ArrayList<Piece>();
		initPieces();
		initPerso();*/
	}
	
	
	public void initPieces()
	{
		pieces.add(new Piece("salon"));
		pieces.add(new Piece("chambre"));
		pieces.add(new Piece("jardin"));
		pieces.add(new Piece("toilettes"));
		pieces.get(0).addPieceAdja(pieces.get(1));
		pieces.get(0).addPieceAdja(pieces.get(2));
		pieces.get(0).addPieceAdja(pieces.get(3));
		pieces.get(1).addPieceAdja(pieces.get(0));
		pieces.get(2).addPieceAdja(pieces.get(0));
		pieces.get(3).addPieceAdja(pieces.get(0));
	}
	public void initPerso()
	{
		Iface.initFenetreCreation();
		while(Iface.getActiveCreation())
		{	try
			{
				Thread.sleep(20);
			}
			catch(InterruptedException ex)
			{
				Thread.currentThread().interrupt();
			}
		}
		perso = Iface.getPersonnageCreation();
		System.out.println(perso.getNom());
	}
	public void changerPiece(Personnage perso, Piece p)
	{
		if(perso.getPiece()!=p.getId())
		{
			for(int i=0;i<p.getNbPieces();i++)
			{
				if(perso.getPiece()==p.getPieceAdja().get(i).getId())
				{
					perso.setPiece(p.getId());
					break;
				}
			}
		}
	}
	public void simulation()
	{
	}
}
