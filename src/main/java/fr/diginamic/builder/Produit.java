package fr.diginamic.builder;

import java.util.List;

public class Produit {
private String nom;
private String grade;
private List<Ingredient> ingredients;
private List<Additif> additifs;
private List<Allergene> allergenes;
private Categorie categorie;
private Marque marque;
/** Constructor
 * @param nom
 * @param grade
 * @param ingredients
 * @param additifs
 * @param allergenes
 * @param categorie
 * @param marque
 */
Produit(String nom, String grade, List<Ingredient> ingredients, List<Additif> additifs,
		List<Allergene> allergenes, Categorie categorie, Marque marque) {
	super();
	this.nom = nom;
	this.grade = grade;
	this.ingredients = ingredients;
	this.additifs = additifs;
	this.allergenes = allergenes;
	this.categorie = categorie;
	this.marque = marque;
}

@Override
public String toString() {
	return "Produit [nom=" + nom + ", grade=" + grade + ", ingredients=" + ingredients + ", additifs=" + additifs
			+ ", allergenes=" + allergenes + ", categorie=" + categorie + ", marque=" + marque + "]";
}
/** Getter pour nom
 * @return nom
 */
public String getNom() {
	return nom;
}
/** Getter pour grade
 * @return grade
 */
public String getGrade() {
	return grade;
}
/** Getter pour ingredients
 * @return ingredients
 */
public List<Ingredient> getIngredients() {
	return ingredients;
}
/** Getter pour additifs
 * @return additifs
 */
public List<Additif> getAdditifs() {
	return additifs;
}
/** Getter pour allergenes
 * @return allergenes
 */
public List<Allergene> getAllergenes() {
	return allergenes;
}
/** Getter pour categorie
 * @return categorie
 */
public Categorie getCategorie() {
	return categorie;
}
/** Getter pour marque
 * @return marque
 */
public Marque getMarque() {
	return marque;
}
/**Setter pour nom
 * @param nom nom 
 */
void setNom(String nom) {
	this.nom = nom;
}
/**Setter pour grade
 * @param grade grade 
 */
void setGrade(String grade) {
	this.grade = grade;
}
/**Setter pour ingredients
 * @param ingredients ingredients 
 */
void setIngredients(List<Ingredient> ingredients) {
	this.ingredients = ingredients;
}
/**Setter pour additifs
 * @param additifs additifs 
 */
void setAdditifs(List<Additif> additifs) {
	this.additifs = additifs;
}
/**Setter pour allergenes
 * @param allergenes allergenes 
 */
void setAllergenes(List<Allergene> allergenes) {
	this.allergenes = allergenes;
}
/**Setter pour categorie
 * @param categorie categorie 
 */
void setCategorie(Categorie categorie) {
	this.categorie = categorie;
}
/**Setter pour marque
 * @param marque marque 
 */
void setMarque(Marque marque) {
	this.marque = marque;
}




}
