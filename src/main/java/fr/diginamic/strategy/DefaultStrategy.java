package fr.diginamic.strategy;

public class DefaultStrategy implements Strategy {

	@Override
	public void trier(int[] tab) {
		for (int i = 0; i < tab.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < tab.length; j++) {
				if (tab[j] < tab[index]) {
					index = j;// searching for lowest index
				}
			}
			int smallerNumber = tab[index];
			tab[index] = tab[i];
			tab[i] = smallerNumber;
		}
	}
}
