package main;

public class ColoredSegment extends Segment {
	private final String color;

	public ColoredSegment(Pixel start, Pixel end, String color) {
		super(start, end);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "ColoredSegment [color=" + color + "]";
	}
	

}
