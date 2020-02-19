package hu.me.krz.haladojava;

import java.util.List;
import java.util.Random;
import hu.me.krz.haladojava.Point;

public class Astronomer {
	private List<Planet> discoveredPlanets;
	private String name;

	public Astronomer(String name) {
		// super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public List<Planet> getDiscoveredPlanets() {
		return discoveredPlanets;
	}

	public void observeTheSky() {

		Random r = new Random();

		for (int i = 0; i < 10; i++) {
			double radius = r.nextDouble() * 100;
			String name = getName() + " " + (i + 1);
			Point p = new Point(0, 0, 0);
			Point t = new Point(((i + 1) * 10), 0, 0);
			p.translate(t);

			Planet[] bolygok = new Planet[10];
			bolygok[i] = new Planet(p, radius, name);

			System.out.println(bolygok[i]);

		}
	}

	@Override
	public String toString() {
		return "Astronomer [discoveredPlanets=" + discoveredPlanets + ", name=" + name + "]";
	}

}
