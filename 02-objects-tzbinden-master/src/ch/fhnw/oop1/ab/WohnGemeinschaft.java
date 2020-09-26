package ch.fhnw.oop1.ab;
public class WohnGemeinschaft {
	
	public static void main(String[] args) {
		Apartment smallAp = new Apartment();
		smallAp.address = "Bahnhofstrasse, Windisch";
		smallAp.nOfRooms = 3;
		smallAp.clean = true;
		
		Apartment bigAp = new Apartment();
		bigAp.address = "Bahnhofstrasse";
		bigAp.address = bigAp.address + ", Windisch";
		bigAp.nOfRooms = 4;
		bigAp.clean = true;

		Student a, b, c;
		a = new Student();
		a.name = "Alice";
		a.apartment = bigAp; // Alice zieht in die grosse WG
		printStudent(a);

		b = new Student();
		b.name = "Bob";
		b.apartment = bigAp; // Bob zieht auch in die grosse WG
		printStudent(b);

		c = new Student();
		c.name = "Carol";
		c.apartment = smallAp; // Carol zieht in die kleine WG
		printStudent(c);
		
		compareApartments(a, b, c);

		a.apartment.clean = false; // Alice passiert ein Missgeschick
		System.out.println("Die kleine Wohnung ist sauber: " + smallAp.clean);
		System.out.println("Die grosse Wohnung ist sauber: " + bigAp.clean);
		System.out.println("Alices Wohnung ist sauber: " + a.apartment.clean);
		System.out.println("Bobs Wohnung ist sauber: " + b.apartment.clean);
		System.out.println("Carol Wohnung ist sauber: " + c.apartment.clean);
		System.out.println();

		b.apartment.clean = true; // Bob putzt
		System.out.println("Die kleine Wohnung ist sauber: " + smallAp.clean);
		System.out.println("Die grosse Wohnung ist sauber: " + bigAp.clean);
		System.out.println("Alices Wohnung ist sauber: " + a.apartment.clean);
		System.out.println("Bobs Wohnung ist sauber: " + b.apartment.clean);
		System.out.println("Carol Wohnung ist sauber: " + c.apartment.clean);
		System.out.println();

		b.apartment = smallAp; // Bob zieht in die kleine WG
		b.apartment.clean = false; // Jetzt passiert Bob ein Missgeschick
		System.out.println("Die kleine Wohnung ist sauber: " + smallAp.clean);
		System.out.println("Die grosse Wohnung ist sauber: " + bigAp.clean);
		System.out.println("Alices Wohnung ist sauber: " + a.apartment.clean);
		System.out.println("Bobs Wohnung ist sauber: " + b.apartment.clean);
		System.out.println("Carol Wohnung ist sauber: " + c.apartment.clean);
		System.out.println();

		compareApartments(a, b, c);
	}
	
	static void printStudent(Student s) {
		// TODO print out the name of the student and its address
	}
	
	private static void compareApartments(Student a, Student b, Student c) {
//		System.out.print(a.name + ", " + b.name + " and " + c.name + " wohnen in derselben WG: ");
//		System.out.println(...); // TODO print out whether the students a, b and c live in the same appartment
//
//		System.out.print(a.name + ", " + b.name + " and " + c.name + " wohnen an derselben Adresse: ");
//		System.out.println(...); // TODO and print out whether the students a, b and c live at the same address
	}


}

class Apartment {
	String address;
	int nOfRooms;
	boolean clean;
}

class Student {
	String name;
	Apartment apartment;
}
