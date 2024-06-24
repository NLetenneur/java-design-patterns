package fr.diginamic.factory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FactoryTest {

	@Test
	public void testCreerIngredient() {
		Element element = ElementFactory.getInstance(ElementType.Ingrédient, "Ingrédient", 20.3, Unite.centi_grammes);
		assertEquals(element.getNom(), "Ingrédient");
	}
	
	@Test
	public void testCreerAllergene() {
		Element element = ElementFactory.getInstance(ElementType.Allergène, "Allergène", 20.3, Unite.centi_grammes);
		assertEquals(element.getNom(), "Allergène");
	}
	@Test
	public void testCreerAdditif() {
		Element element = ElementFactory.getInstance(ElementType.Additif, "Additif", 20.3, Unite.centi_grammes);
		assertEquals(element.getNom(), "Additif");
	}
	
}
