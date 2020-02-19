package hu.me.krz.haladojava;

import java.util.Random;
import java.util.Scanner;

public class Proba {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Adja meg, hogy hány példányt kell létrehozni!");
		int db = 0;

		try {
			db = sc.nextInt();

		} catch (Exception ex) {
			System.err.println("Hiba: " + ex.getMessage());
			System.exit(-20);
		}
		
		sc.close();

		Diak[] diakok = new Diak[db];
		Tanar[] tanarok = new Tanar[db];

		for (int i = 0; i < diakok.length; i++) {
			String name = "diák" + (i + 1);
			Random r = new Random();
			int age = r.nextInt(80 - 16 + 1) + 16;
			int puska = r.nextInt(6 - 0) % 6;
			diakok[i] = new Diak(name, age, puska);
		}

		for (int i = 0; i < tanarok.length; i++) {
			String name = "tanár" + (i + 1);
			Random r = new Random();
			int age = r.nextInt(80 - 25 + 1) + 25;
			double avg = r.nextDouble() * (5 - 1) + 1;
			tanarok[i] = new Tanar(name, age, avg);
		}

		for (Diak d : diakok) {
			if (d.joAlanyE()) {
				System.out.println(d);
			}
		}

		for (Tanar t : tanarok) {
			if (t.joAlanyE()) {
				System.out.println(t);
			}
		}
	}
}
