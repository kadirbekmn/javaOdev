package javaOdev;

import java.util.Scanner;

public class sesliHarfler {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner (System.in);
		char harf = scan.next().charAt(0);

		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın sesli harf");
			break;
		default:
			System.out.println("İnce sesli harf");

		}

	}

}
