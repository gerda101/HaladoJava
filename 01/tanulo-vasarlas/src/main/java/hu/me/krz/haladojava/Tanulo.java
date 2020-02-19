package hu.me.krz.haladojava;

public class Tanulo {
	private String nev;
	private int penz;	
	private int tanulok=0;
	
	public Tanulo(String nev, int penz) {
		this.nev = nev;
		this.penz = penz;
		tanulok++;
	}
	
	public Tanulo(String nev) {
		this(nev, 10000);
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		tanulok--;
	}

	public int getPenz() {
		return penz;
	}
	
	public String getNev() {
		return nev;
	}

	public int getOsszesTanulo() {
		return tanulok;
	}

	@Override
	public String toString() {
		return "Tanulo: "+ nev +" "+ penz +" Ft";
	}
	
	public boolean fogyasztas(int fogy) {
		this.penz=this.getPenz()-fogy;
		if (penz>0) {
			return false;
		} else return true;
	}
}
