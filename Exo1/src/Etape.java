
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
		System.out.println("Num�ro de l'�tape: " + numeroEtape);
		System.out.println("Lieu de l'�tape: " + lieuEtape);
		System.out.println("Dur�e de l'�tape: " + dureeEtape);
	}
}
