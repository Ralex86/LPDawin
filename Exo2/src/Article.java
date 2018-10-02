import java.util.UUID;

public class Article {
	private UUID reference;
	private String designation;
	private int qteStock;
	private double prix;
	
	public Article(String d, int q, double p) {
		reference = UUID.randomUUID();
		designation = d;
		qteStock = q;
		prix = p;
	}
	
	public boolean retirer(int q) {
		if (qteStock - q > 0) {
			qteStock -= q;
			return true;
		}
		return false;
	}
	
	public void ajouter(int q) {
		qteStock += q;
	}
	
	public void modifierPrix(double p) {
		prix = p;
	}
	
	public void afficher() {
		System.out.println();
		System.out.println("R�f�rence de l'article: " + reference);
		System.out.println("D�signation de l'article: " + designation);
		System.out.println("Quantit� en stock: " + qteStock);
		System.out.println("Prix � l'unit�: " + prix);
	}
}
