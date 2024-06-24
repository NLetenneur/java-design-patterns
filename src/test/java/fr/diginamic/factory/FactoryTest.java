package fr.diginamic.factory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class FactoryTest {

	@Test
	public void testCreerIngredient() {
		Element element = ElementFactory.getInstance(ElementType.Ingrédient, "Ingrédient", 20.3, Unite.centi_grammes);
		assertEquals(element.getNom(), "Ingrédient");		
		assertEquals(Ingredient.class, element.getClass());
	}
	
	@Test
	public void testCreerAllergene() {
		Element element = ElementFactory.getInstance(ElementType.Allergène, "Allergène", 20.3, Unite.centi_grammes);
		assertEquals(element.getNom(), "Allergène");		
		assertEquals(Allergene.class, element.getClass());

	}
	@Test
	public void testCreerAdditif() {
		Element element = ElementFactory.getInstance(ElementType.Additif, "Additif", 20.3, Unite.centi_grammes);
		assertEquals(element.getNom(), "Additif");
		assertEquals(Additif.class, element.getClass());

	}
	
	@Test
	public void testCreerNull() {
		Element element = ElementFactory.getInstance(null, "nul", 15.02, Unite.centi_grammes);
		assertNull(element);

	}
	
}
