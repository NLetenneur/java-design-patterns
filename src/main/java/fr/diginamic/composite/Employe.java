package fr.diginamic.composite;

public class Employe implements IElement {
	private String nom;
	private String prenom;
	private double salaire;

	/**
	 * Constructor
	 * 
	 * @param nom
	 * @param prenom
	 * @param salaire
	 */
	public Employe(String nom, String prenom, double salaire) {
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
	}
	/** Calcule le salaire de l'employe
	 * @return salaire
	 */
	public double calculerSalaire() {
		return salaire;
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

	/** Getter pour prenom
	 * @return prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**Setter pour prenom
	 * @param prenom prenom 
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/** Getter pour salaire
	 * @return salaire
	 */
	public double getSalaire() {
		return salaire;
	}

	/**Setter pour salaire
	 * @param salaire salaire 
	 */
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	
	
}
