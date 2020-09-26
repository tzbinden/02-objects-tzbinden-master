package ch.fhnw.oop1.le;

public class PrimitiveTypesExample {

	public static void main(String[] args) {
		int day = 21;
		int month = 9;
		int year = 2030;
		
		System.out.println(day + ". " + month + ". " + year);
		
		resetDay(day, month, year);
		
		System.out.println(day + ". " + month + ". " + year);
	}
	
	static void resetDay(int day, int month, int year) {
		day = 1; // No visible effect!
	}
}

