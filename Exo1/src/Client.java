import java.util.ArrayList;
import java.util.Date;

public class Client {
	private int numClient;
	private String nom;
	private String prenom;
	private ArrayList<Reservation> mesReservations;
	private static int number = 0;
	
	public Client(String n, String p) {
		numClient = ++number;
		nom = n;
		prenom = p;
		mesReservations = new ArrayList<Reservation>();
	}
	
	public void afficher() {
		System.out.println();
		System.out.println("Num�ro de client: " + numClient);
		System.out.println("Nom du client: " + nom);
		System.out.println("Pr�nom du client: " + prenom);
		for (Reservation r: mesReservations) {
			r.afficher();
		}
	}
	
	public void afficherListResaPassees() {
		System.out.println();
		System.out.println(" -- Liste des r�servations pass�es -- ");
		Date d = new Date();
		for (Reservation r : mesReservations) {
			if (r.getDateRetour().before(d))
				r.afficher();
		}
	}
	
	public void afficherListResaEnCours() {
		System.out.println();
		System.out.println(" -- Liste des r�servations en cours -- ");
		Date d = new Date();
		for (Reservation r : mesReservations) {
			if (r.getDateDepart().before(d) && r.getDateRetour().after(d))
				r.afficher();
		}
	}
	
	public void afficherListResaAVenir() {
		System.out.println();
		System.out.println(" -- Liste des r�servations � venir -- ");
		Date d = new Date();
		for (Reservation r : mesReservations) {
			if (r.getDateDepart().after(d))
				r.afficher();
		}
	}
	
	public void ajouterReservation(Reservation resa) {
		mesReservations.add(resa);
	}
}
