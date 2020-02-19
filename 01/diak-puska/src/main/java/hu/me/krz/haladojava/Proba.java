package hu.me.krz.haladojava;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Proba {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Adja meg, hogy hány példányt kell létrehozni a Diak osztályból!");
		int db = 0;

		try {
			db = sc.nextInt();

		} catch (Exception ex) {
			System.err.println("Hiba: " + ex.getMessage());
			System.exit(-20);
		}

		sc.close();

		Diak[] diakok = new Diak[db];

		for (int i = 0; i < diakok.length; i++) {
			String name = "diák" + (i + 1);
			Random r = new Random();
			int age = r.nextInt(25 - 18 + 1) + 18;
			int puska = r.nextInt(6 - 0) % 6;
			diakok[i] = new Diak(name, age, puska);
		}

		Arrays.sort(diakok);

		for (Diak a : diakok) {
			System.out.println(a);
		}

	}
}
