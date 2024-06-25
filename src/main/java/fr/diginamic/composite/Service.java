package fr.diginamic.composite;

import java.util.ArrayList;
import java.util.List;

public class Service implements IElement{
	private String nom;
	private List<IElement> elements = new ArrayList<>();


	
	/** Constructor
	 * @param nom
	 * @param elements
	 */
	public Service(String nom, List<IElement> elements) {
		super();
		this.nom = nom;
		this.elements = elements;
	}


	/** Calcule le salaire d'un employe du service ou d'un de ses sous-service
	 * @return salaire
	 */
	public double calculerSalaire() {
		double totalSalaires =0;
		for (IElement item : this.elements) {
			totalSalaires+=item.calculerSalaire();
		}
		return totalSalaires;
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



	/** Getter pour elements
	 * @return elements
	 */
	public List<IElement> getElements() {
		return elements;
	}



	/**Setter pour elements
	 * @param elements elements 
	 */
	public void setElements(List<IElement> elements) {
		this.elements = elements;
	}

}
