package main;

public class Base {

	private int p=2;
	int x = 3;
	int y = 5;
	@Override
	public String toString() {
		return "B " +p+"  "+x+"  "+y;
	}
	int sum() {
		return x +y;	
	}
	
}

