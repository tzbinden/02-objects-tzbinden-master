package ch.fhnw.oop1.le;

public class Assignments { 
	public static void main(String[] args) {
		Point p1 = new Point();
		Point p2 = new Point();
		Rational r1 = new Rational();
		Rational r2 = new Rational();
		
		p1 = p2;	  // ok
		r1 = r2;	  // ok
		// p1 = r1;	  // not allowed; types are different
		// sp1 = (Point)r1;  // cast not possible
		p1.x = r1.numer; // ok
		p1.y = r2.denom; // ok

	}
}

class Point {
	int x, y;
}

class Rational {
	int numer, denom;
}
