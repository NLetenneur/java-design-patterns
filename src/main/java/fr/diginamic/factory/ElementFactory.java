package fr.diginamic.factory;

public class ElementFactory {
public static Element getInstance(ElementType type, String nom, double valeur, Unite unite) {
	Element element= null;
	if (type==null) {
		return null;
	}
	switch (type){
		case Ingrédient: element =new Ingredient(nom, valeur, unite);
		break;
		case Additif: element =new Additif(nom, valeur, unite);
		break;
		case Allergène: element =new Allergene(nom, valeur, unite);
		break;
		default: System.out.println("Ce type d'élément n'existe pas");
	}
	return element;
}
}
