package hu.me.krz.haladojava;

public final class Planet {

	private Point position;
	private double radius;
	private String name;

	public Planet(Point position, double radius, String name) {
		this.position = position;
		this.radius = radius;
		this.name = name;
	}

	public Point getPosition() {
		return position;
	}

	public double getRadius() {
		return radius;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Bolygó: pozíciója " + position + ", sugara " + radius + ", neve " + name;
	}

}
