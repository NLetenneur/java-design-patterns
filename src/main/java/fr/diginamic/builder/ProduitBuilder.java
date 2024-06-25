package fr.diginamic.builder;

import java.util.ArrayList;
import java.util.List;

public class ProduitBuilder {
	private Produit produit;

	/**
	 * Constructor
	 * 
	 * @param produit
	 */
	public ProduitBuilder() {
		this.produit = new Produit(null, null, null, null, null, null, null);
	}

	public ProduitBuilder appendsNom(String nom) {
		this.produit.setNom(nom);
		return this;
	}

	public ProduitBuilder appendsGrade(String grade) {
		this.produit.setGrade(grade);
		return this;
	}

	public ProduitBuilder appendsIngredient(Ingredient ingredient) {
		List<Ingredient> ingredients = new ArrayList<>();
		if (this.produit.getIngredients() != null) {
			ingredients = this.produit.getIngredients();
		}
		ingredients.add(ingredient);
		this.produit.setIngredients(ingredients);
		return this;
	}

	public ProduitBuilder appendsAllergene(Allergene allergene) {
		List<Allergene> allergenes = new ArrayList<>();
		if (this.produit.getAllergenes() != null) {
			allergenes = this.produit.getAllergenes();
		}
		allergenes.add(allergene);
		this.produit.setAllergenes(allergenes);
		return this;
	}

	public ProduitBuilder appendsAdditif(Additif additif) {
		List<Additif> additifs = new ArrayList<>();
		if (this.produit.getAdditifs() != null) {
			additifs = this.produit.getAdditifs();
		}
		additifs.add(additif);
		this.produit.setAdditifs(additifs);
		return this;
	}

	public ProduitBuilder appendsCategorie(Categorie categorie) {
		this.produit.setCategorie(categorie);
		return this;
	}

	public ProduitBuilder appendsMarque(Marque marque) {
		this.produit.setMarque(marque);
		return this;
	}

	public Produit build() {
		return new Produit(this.produit.getNom(), this.produit.getGrade(), this.produit.getIngredients(),
				this.produit.getAdditifs(), this.produit.getAllergenes(), this.produit.getCategorie(),
				this.produit.getMarque());
	}

}
