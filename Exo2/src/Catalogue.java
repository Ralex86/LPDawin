import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Catalogue {
	private enum Season {
		Hiver, Printemps, Ete, Automne
	}

	private int annee;
	private Season saison;
	private HashMap<UUID, Article> articlesMap;

	public Catalogue(int a, String s) {
		annee = a;
		switch (s) {
		case "Hiver":
			saison = Season.Hiver;
			break;
		case "Printemps":
			saison = Season.Printemps;
			break;
		case "Ete":
			saison = Season.Ete;
			break;
		case "Automne":
			saison = Season.Automne;
			break;
		}
		articlesMap = new HashMap<UUID, Article>();
	}

	public void afficher() {
		for (Map.Entry<UUID, Article> entry : articlesMap.entrySet()) {
			entry.getValue().afficher();
		}
	}

	public Article rechercherArticle(UUID ref) {
		return articlesMap.get(ref);
	}

	public void ajouterArticle(Article article) {
		articlesMap.put(article.getReference(), article);
	}

	public boolean supprimerArticle(UUID ref) {
		if (articlesMap.containsKey(ref)) {
			articlesMap.remove(ref);
			return true;
		}
		return false;
	}
}
