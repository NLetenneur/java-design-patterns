package fr.diginamic.singleton;

import java.io.File;
import java.util.ResourceBundle;

public class Singleton {
	private File fichier;

	private Singleton() {
		fichier = new File("/java-design-patterns/src/main/resources/configuration.properties");
	}

	/** Holder */
	private static class SingletonHolder {
		/** Instance unique non préinitialisée */
		private final static Singleton instance = new Singleton();
	}

	public static Singleton getInstance() {
		return SingletonHolder.instance;
	}

	public String getValue(String key) {
		ResourceBundle configuration = ResourceBundle.getBundle("configuration");
		String value = configuration.getString(key);
		return value;
	}
}
