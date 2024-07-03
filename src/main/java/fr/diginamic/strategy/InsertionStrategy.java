package fr.diginamic.strategy;

public class InsertionStrategy implements Strategy {

	@Override
	public void trier(int[] tab) {
		for (int k = 1; k < tab.length - 1; k++) {
			int temp = tab[k];
			int j = k - 1;
			while (j >= 0 && temp <= tab[j]) {
				tab[j + 1] = tab[j];
				j = j - 1;
			}
			tab[j + 1] = temp;
		}

	}

}
