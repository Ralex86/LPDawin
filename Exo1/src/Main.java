import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		System.out.println("---------TESTS DE TRAVELWORLD ----------");
		System.out.println("Date du jour: " + (new Date()));
		Voyage v1 = new Voyage("Premier voyage");
		Voyage v2 = new Voyage ("Deuxi�me voyage");
		//v.afficher();
		
		Sejour s1 = new Sejour("Premier sejour", "Dublin");
		Sejour s2 = new Sejour("Deuxi�me sejour", "Coutances");
		//s.afficher();
		
		Circuit c1 = new Circuit("Premier circuit", true);
		c1.ajouterEtape(new Etape("Barcelone", 1));
		c1.ajouterEtape(new Etape("Melbourne", 3));
		c1.ajouterEtape(new Etape("Eindhoven", 1));
		c1.ajouterEtape(new Etape("Rio de Janeiro", -5));
		Circuit c2 = new Circuit("Deuxi�me circuit", true);
		c2.ajouterEtape(new Etape("Bordeaux", 2));
		c2.ajouterEtape(new Etape("Mumbai", 1));
		c2.ajouterEtape(new Etape("Tokyo", -12));
		//c.afficher();
		
		Client cl = new Client("", "Tibo");
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		try {
			cl.ajouterReservation(new Reservation(dateFormat.parse("15/11/2018"), dateFormat.parse("12/05/2019"), true, c1));
			cl.ajouterReservation(new Reservation(dateFormat.parse("30/09/2018"), dateFormat.parse("18/10/2018"), true, v2));
			cl.ajouterReservation(new Reservation(dateFormat.parse("05/02/2018"), dateFormat.parse("19/09/2018"), true, s1));
			cl.ajouterReservation(new Reservation(dateFormat.parse("15/01/2018"), dateFormat.parse("12/12/2018"), true, c2));
			cl.ajouterReservation(new Reservation(dateFormat.parse("22/06/2019"), dateFormat.parse("12/07/2019"), true, v1));
			cl.ajouterReservation(new Reservation(dateFormat.parse("15/01/2017"), dateFormat.parse("12/03/2017"), true, s2));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		cl.afficher();
		cl.afficherListResaAVenir();
		cl.afficherListResaEnCours();
		cl.afficherListResaPassees();
	}

}
