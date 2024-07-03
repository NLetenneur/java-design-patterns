package fr.diginamic.strategy;

public class BubbleStrategy implements Strategy {

	@Override
	public void trier(int[] tab) {
		int n = tab.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (tab[j] > tab[j + 1]) {
					int temp = tab[j];
					tab[j] = tab[j + 1];
					tab[j + 1] = temp;
				}
			}

		}
	}
}
