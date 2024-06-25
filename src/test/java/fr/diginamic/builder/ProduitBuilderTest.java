package fr.diginamic.builder;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ProduitBuilderTest {

	@Test
	public void testProduitBuilder() {
		ProduitBuilder builder = new ProduitBuilder();
		Additif add1 = new Additif("test", 50.5, Unite.centi_grammes);
		Additif add2 = new Additif("test2", 50.5, Unite.centi_grammes);
		List<Additif> listAdd= new ArrayList<>();
		listAdd.add(add1);
		listAdd.add(add2);
		builder =builder.appendsNom("Produit test").appendsGrade("B").appendsAdditif(add1).appendsAdditif(add2);
		Produit produit = builder.build();		
		assertNotNull(produit);
		assertEquals(produit.getNom(),"Produit test");
		assertEquals(produit.getGrade(),"B");
		assertEquals(produit.getAdditifs(), listAdd);
	}

	

}
