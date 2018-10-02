
public class Sejour extends Voyage {
	private String lieuSejour;
	
	public Sejour(Voyage v, String lieu) {
		super(v.getLibelle());
		lieuSejour = lieu;
	}
	
	public Sejour(String libelle, String lieu) {
		super(libelle);
		lieuSejour = lieu;
	}
	
	public void afficher() {
		super.afficher();
		System.out.println("Lieu du séjour: " + lieuSejour);
	}
}
