
public class Main {

	public static void main(String[] args) {
		System.out.println(" ---- TEST CATALOGUE ---- ");
		Article a1 = new Article("Bagel", 12, 2);
		Article a2 = new Article("Pomme", 50, 0.52);
		Article a3 = new Article("Fiat Multipla", -59, -3000);
		Catalogue c = new Catalogue(2018, "Automne");
		System.out.println();
		System.out.println("-- Affichage du catalogue vide --");
		c.afficher();
		c.ajouterArticle(a1);
		c.ajouterArticle(a2);
		c.ajouterArticle(a3);
		System.out.println();
		System.out.println("-- Affichage du catalogue rempli --");
		c.afficher();
		System.out.println();
		System.out.println("-- Recherche de l'article Fiat Multipla --");
		c.rechercherArticle(a3.getReference()).afficher();
		System.out.println();
		System.out.println("-- Suppression de l'article Fiat Multipla --");
		c.supprimerArticle(a3.getReference());
		c.afficher();
		
		

	}

}
