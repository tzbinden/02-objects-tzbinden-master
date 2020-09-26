package ch.fhnw.oop1.ub.network;

public class Network {
	
	public static void main(String[] args) {
		Person a = new Person();
		a.name = "Alice";
		a.knows = new Person[2]; 	// alice has two friends
		
		Person b = new Person();
		b.name = "Bob";
		b.knows = new Person[2]; 	// bob has two friends
		
		Person c = new Person();
		c.name = "Carol";
		c.knows = a.knows; 			// carol has the same friends as alice!

		Person d = new Person();
		d.name = "Daniel";
		d.knows = new Person[3]; 	// daniel has three friends
		
		a.knows[0] = b;
		a.knows[1] = d;
		b.knows[0] = c;
		b.knows[1] = d;
		d.knows[0] = c;
		d.knows[1] = d;
		d.knows[2] = a;
		
		printTrace(a, 0);
		printTrace(a, 1);
		
		System.out.println("path(a)");
		path(a);
		System.out.println("path(b)");
		path(b);
		System.out.println("path(c)");
		path(c);
	}
	
	static void printTrace(Person p, int index) {
		for(int i = 0; i < 4; i++) {
			System.out.println(p.name);
			p = p.knows[index];
		}
		System.out.println();
	}
	
	static void path(Person p) {
		Person x = p.knows[0].knows[0];
		Person y = p.knows[1].knows[0];
		System.out.println(x.name);
		System.out.println(y.name);
		System.out.println(x == y);
		System.out.println();
	}

}
