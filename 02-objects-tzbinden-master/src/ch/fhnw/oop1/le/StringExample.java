package ch.fhnw.oop1.le;

import java.util.Scanner;

public class StringExample {

    public static void main(String[] args) {
        System.out.println("oop1 🥳");

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        System.out.println("Read: " + word);

        if(word == "oop1") {
            System.out.println("==");
        } else {
            System.out.println("!=");
        }

        if(word.equals("oop1")) {
            System.out.println("equals");
        } else {
            System.out.println("!equals");
        }

        scanner.close();
    }
}