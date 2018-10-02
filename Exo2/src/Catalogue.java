
public class Catalogue {
	private int annee;
	private String saison;
	private ArrayList<Article> articles;
	
	public Catalogue(int a, String s) {
		annee = a;
		saison = s;
		articles = new ArrayList<Article>();
	}
}
