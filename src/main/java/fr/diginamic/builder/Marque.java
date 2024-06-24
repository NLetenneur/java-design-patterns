package fr.diginamic.builder;

public class Marque {
private String nom;

/** Constructor
 * @param nom
 */
public Marque(String nom) {
	super();
	this.nom = nom;
}

@Override
public String toString() {
	return "Marque [nom=" + nom + "]";
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


}
