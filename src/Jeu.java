import java.util.ArrayList;
public class Jeu {
	private ArrayList<Piece> pieces;
	private Personnage perso;
	private Interface Iface;
	Jeu()
	{
		perso = new Chien("Pipou");
		pieces=new ArrayList<Piece>();
		initPieces();
		Interface Iface=new Interface("jeu", perso, pieces);
		Iface.initFenetreJeu();
		//initPerso();
	}
	
	
	public void initPieces()
	{
		pieces.add(new Piece("salon"));
		pieces.add(new Piece("cuisine"));
		pieces.add(new Piece("chambre"));
		pieces.add(new Piece("salle de bain"));
		pieces.add(new Piece("toilettes"));
		pieces.add(new Piece("jardin"));

		//salon
		pieces.get(0).addPieceAdja(pieces.get(1));
		pieces.get(0).addPieceAdja(pieces.get(2));
		pieces.get(0).addPieceAdja(pieces.get(4));
		pieces.get(0).addPieceAdja(pieces.get(5));

		//cuisine
		pieces.get(1).addPieceAdja(pieces.get(0));


		//chambre
		pieces.get(2).addPieceAdja(pieces.get(0));
		pieces.get(2).addPieceAdja(pieces.get(3));


		//salle de bain
		pieces.get(3).addPieceAdja(pieces.get(2));

		//toilettes
		pieces.get(4).addPieceAdja(pieces.get(0));

		//jardin
		pieces.get(5).addPieceAdja(pieces.get(0));
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
