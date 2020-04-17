package main;

public class Disk {
	private Pixel center;
	private int radius;
	public Disk(Pixel center, int radius) {
		super();
		this.center = center;
		this.radius = radius;
	}
	public Disk(int x, int y, int radius) {
		super();
		
		this.radius = radius;
	}
	
	public Pixel getCenter() {
		return center;
	}
	public void setCenter(Pixel center) {
		this.center = center;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "Disk [center=" + center + ", radius=" + radius + "]";
	}
	
	

}
