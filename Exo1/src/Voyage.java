import java.util.ArrayList;
import java.util.UUID;

public class Voyage {
	private UUID referenceVoyage;
	private String libelleVoyage;
	private ArrayList<Reservation> reservations;
	
	public Voyage(String libelle) {
		referenceVoyage = UUID.randomUUID();
		libelleVoyage = libelle;
		reservations = new ArrayList<Reservation>();
	}
	
	public UUID getReference() {
		return referenceVoyage;
	}
	
	public String getLibelle() {
		return libelleVoyage;
	}
	
	public void afficher() {
		System.out.println();
		System.out.println("R�f�rence du voyage:" + referenceVoyage);
		System.out.println("Libell� du voyage: " + libelleVoyage);
	}
}
