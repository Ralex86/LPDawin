import java.util.Date;

public class Reservation {
	private int numReservation;
	private Date dateDepart;
	private Date dateRetour;
	private boolean estPaye;
	private Voyage voyage;
	private static int number = 0;
	
	public Reservation(Date depart, Date retour, boolean paye, Voyage v) {
		numReservation = ++number;
		dateDepart = depart;
		dateRetour = retour;
		estPaye = paye;
		voyage = v;
	}
	
	public Date getDateDepart() {
		return dateDepart;
	}
	
	public Date getDateRetour() {
		return dateRetour;
	}
	
	public void afficher() {
		System.out.println();
		System.out.println("Num�ro de r�servation: "+ numReservation);
		System.out.println("Date de d�part: " + dateDepart);
		System.out.println("Date de retour: " + dateRetour);
		System.out.println("Voyage pay�: " + (estPaye ? "Oui" : "Non"));
		voyage.afficher();
	}
}
