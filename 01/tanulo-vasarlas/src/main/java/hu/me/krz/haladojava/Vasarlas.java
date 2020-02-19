package hu.me.krz.haladojava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Vasarlas {
	public static void main(String[] args) {
		List<Tanulo> tanuloList = new ArrayList<>(Arrays.asList(
				new Tanulo("Kati"),
				new Tanulo("Pista"),
				new Tanulo("Peti"),
				new Tanulo("Gréta"),
				new Tanulo("Lilla")));
		
		int random;			
		for (int i=0; (i<6 && tanuloList.size()!=0); i++) {
			System.out.println((i+1)+" vásárlási kör:\n");
			for (int j=0; j<tanuloList.size();j++) {
				random = (int)(Math.random() * 3000 + 1500);
				if (tanuloList.get(j).fogyasztas(random)==true) {
					System.out.println(tanuloList.get(j).getNev()+"-nak/nek elfogyott a pénze");
					tanuloList.remove(j);
				}
			}
			atlag(tanuloList);
			System.out.println("Pozitivban lévő tanulók: "+tanuloList.size());
			for (Tanulo tanulo: tanuloList) {
			    System.out.println(tanulo.toString());
			}
			System.out.println();
		}
		
	}
	public static void atlag (List<Tanulo> tanuloList) {
		int sum=0;
		int i;
		for (i=0; i<tanuloList.size();i++) {
			sum += tanuloList.get(i).getPenz();
		}
		if (i>0) {
			System.out.println("Átlag: "+(sum/i));
		} else {
			System.out.println("Vásárlás vége.");
			System.exit(0);;
		}
		
	}
}
