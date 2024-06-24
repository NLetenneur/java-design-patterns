package fr.diginamic.builder;

public class Element {
private String nom;
private double valeur;
private Unite unite;

/** Constructor
 * @param nom
 * @param valeur
 * @param unite
 */
public Element(String nom, double valeur, Unite unite) {
	this.nom = nom;
	this.valeur = valeur;
	this.unite = unite;
}

@Override
public String toString() {
	return "Element [nom=" + nom + ", valeur=" + valeur + ", unite=" + unite + "]";
}

/** Getter pour nom
 * @return nom
 */
public String getNom() {
	return nom;
}

/**Setter pour nom
 * @param nom nom 
 */
public void setNom(String nom) {
	this.nom = nom;
}

/** Getter pour valeur
 * @return valeur
 */
public double getValeur() {
	return valeur;
}

/**Setter pour valeur
 * @param valeur valeur 
 */
public void setValeur(double valeur) {
	this.valeur = valeur;
}

/** Getter pour unite
 * @return unite
 */
public Unite getUnite() {
	return unite;
}

/**Setter pour unite
 * @param unite unite 
 */
public void setUnite(Unite unite) {
	this.unite = unite;
}





}
