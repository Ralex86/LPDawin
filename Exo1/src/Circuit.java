import java.util.ArrayList;

public class Circuit extends Voyage {
	private boolean enAutonomie;
	private ArrayList<Etape> etapes;
	
	public Circuit(Voyage v, boolean autonomie) {
		super(v.getLibelle());
		enAutonomie = autonomie;
		etapes = new ArrayList<Etape>();
	}
	
	public Circuit(String libelle, boolean autonomie) {
		super(libelle);
		enAutonomie = autonomie;
		etapes = new ArrayList<Etape>();
	}
	
	public void afficher() {
		super.afficher();
		System.out.println("Circuit en autonomie: " + (enAutonomie ? "Oui" : "Non"));
		System.out.println();
		System.out.println(" -- Liste des �tapes -- ");
		for (Etape e : etapes)
			e.afficher();
	}
	
	public void ajouterEtape(Etape etape) {
		etapes.add(etape);
	}
}
