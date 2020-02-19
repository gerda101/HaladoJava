package hu.me.krz.haladojava;

public class Diak extends Szemely implements Comparable<Diak> {
	private int db;

	public Diak(String name, int age, int db) {
		super(name, age);
		this.db = db;
	}

	@Override
	public String toString() {
		return "Diák: név " + getName() + ", életkor " + getAge() + ", puskák száma " + db;
	}

	@Override
	public int compareTo(Diak o) {

		if (this.db == o.db)
			return 0;
		else if (this.db > o.db)
			return 1;
		else
			return -1;

	}

}
