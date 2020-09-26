package ch.fhnw.oop1.le;

public class Strings {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		String hello = s1;
		s1 = s1 + " " + s2;

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(hello);

		String s3 = "Hello World";
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
	}

}
