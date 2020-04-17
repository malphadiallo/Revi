package main;

public class TestBase {

	public static void main(String[] args) {
		Base b = new Base(); 
		Der d = new Der(); 
		System.out.println(b);
		System.out.println(b.sum()); 
		System.out.println(d); 
		System.out.println(d.sum());


	}

}
