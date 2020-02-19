package hu.me.krz.haladojava;

public class Diak extends Szemely implements Valogato<Diak> {

	private int db;

	public Diak(String name, int age, int db) {
		super(name, age);
		this.db = db;

	}

	public boolean joAlanyE() {
		if (this.db == 0) {
			return true;
		} else
			return false;
	}

	@Override
	public String toString() {
		return "Diák: név " + getName() + ", életkor " + getAge() + ", puskák száma " + db;

	}

}
