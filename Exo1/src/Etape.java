
public class Etape {
	private int numeroEtape;
	private String lieuEtape;
	private int dureeEtape;
	
	private static int number = 0;
	
	public Etape(String lieu, int duree) {
		numeroEtape = ++number;
		lieuEtape = lieu;
		dureeEtape = duree;
	}
	
	public void afficher() {
		System.out.println();
		System.out.println("Numéro de l'étape: " + numeroEtape);
		System.out.println("Lieu de l'étape: " + lieuEtape);
		System.out.println("Durée de l'étape: " + dureeEtape);
	}
}
