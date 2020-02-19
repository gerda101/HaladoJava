package hu.me.krz.haladojava;

public class Tanulo {
	private String nev;
	private int penz;
	
	private int tanulok;
	/*Tanulo[] tanuloArr = new Tanulo[2];
	for (int i=0; i<tanuloArr.length; i++) {
		if (tanuloArr[i]=0) {
			
		}
	}*/
	
	public Tanulo(String nev, int penz) {
		super();
		this.nev = nev;
		this.penz = penz;
	}

	public String getNev() {
		return nev;
	}

	public int getPenz() {
		return penz;
	}

	public int getTanulo() {
		return tanulok;
	}

}
