package fr.diginamic.builder;

import java.util.List;

public class ProduitBuilder {
	private Produit produit;

	/** Constructor
	 * @param produit
	 */
	public ProduitBuilder() {
		this.produit = null;
	}
	public  ProduitBuilder appendsNom(String nom) {
		this.produit.setNom(nom);
		return this;
	}
	public  ProduitBuilder appendsGrade(String grade) {
		this.produit.setNom(grade);
		return this;
	}
	public  ProduitBuilder appendsIngredient(Ingredient ingredient) {
		List<Ingredient> ingredients = this.produit.getIngredients();
		ingredients.add(ingredient);
		this.produit.setIngredients(ingredients);
		return this;
	}
	public  ProduitBuilder appendsAllergene(Allergene allergene) {
		List<Allergene> allergenes = this.produit.getAllergenes();
		allergenes.add(allergene);
		this.produit.setAllergenes(allergenes);
		return this;
	}

}
