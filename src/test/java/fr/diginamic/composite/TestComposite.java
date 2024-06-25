/**
 * 
 */
package fr.diginamic.composite;


import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * 
 */
public class TestComposite {

	@Test
	public void test() {
		Employe empl1 = new Employe("Ranmey", "JB", 7500.00);
		Employe empl2 = new Employe("Doe", "Jane", 3500.00);
		List<IElement> emplBD =new ArrayList<IElement>();
		emplBD.add(empl1);
		emplBD.add(empl2);
		Service bD = new Service("Big Data", emplBD);
		Employe empl3 = new Employe("Guineau", "Kevin", 7500.00);
		Employe empl4 = new Employe("Martin", "Paul", 3500.00);
		List<IElement> emplJD =new ArrayList<IElement>();
		emplJD.add(empl3);
		emplJD.add(empl4);
		Service jD = new Service("Java Dev", emplJD);
		Employe empl5 = new Employe("Raspey", "Cécile", 10000.00);
		Employe empl6 = new Employe("Bechkar", "Bilel", 8000.00);
		List<IElement> subDSIN =new ArrayList<IElement>();
		subDSIN.add(bD);
		subDSIN.add(jD);
		subDSIN.add(empl5);
		subDSIN.add(empl6);
		Service dSIN = new Service("DSIN", subDSIN);
		assertEquals(dSIN.calculerSalaire(), 40000.00,0.00);
	}

}
