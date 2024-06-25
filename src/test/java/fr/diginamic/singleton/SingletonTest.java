package fr.diginamic.singleton;

import static org.junit.Assert.*;

import org.junit.Test;

public class SingletonTest {

	@Test
	public void testGetValue() {
		assertEquals(Singleton.getInstance().getValue("db.url"), "jdbc:mysql://localhost:3306/mabase");
		assertEquals(Singleton.getInstance().getValue("db.user"), "root");
		assertEquals(Singleton.getInstance().getValue("db.password"), "1234");
	}

}
