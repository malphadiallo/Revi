package main;

public class Segment {
	private Pixel start;
	private Pixel end;
	public Segment(Pixel start, Pixel end) {
		super();
		this.start = start;
		this.end = end;
	}
	@Override
	public String toString() {
		return "Segment [start=" + start + ", end=" + end + "]";
	}
	

}
