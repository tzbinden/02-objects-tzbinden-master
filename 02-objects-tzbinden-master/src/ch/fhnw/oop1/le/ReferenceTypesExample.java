package ch.fhnw.oop1.le;

public class ReferenceTypesExample {

	public static void main(String[] args) {
		Date d1 = new Date();
		d1.day = 21;
		d1.month = 9;
		d1.year = 2030;
		
		System.out.println(d1.day + ". " + d1.month + ". " + d1.year);
		
		resetDay(d1);
		
		System.out.println(d1.day + ". " + d1.month + ". " + d1.year);
	}
	
	static void resetDay(Date date) {
		date.day = 1;
	}
}

class Date {
	int day;
	int month;
	int year;
}