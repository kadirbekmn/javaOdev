package javaOdev;

import java.util.Scanner;

public class miniProjeAsalSayi {

	public static void main(String[] args) {

		System.out.println("Sayı gir lo");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		boolean isPrime = true;
		
		if(number == 1) {
			System.out.println("Sayı asal değildir");
			return;
		}
		
		if(number < 1) {
			System.out.println("Geçersiz sayı");
		}
		
		

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
			isPrime = false;
			}
		}
		
		if(isPrime) {
			System.out.println("Sayı asaldır");
		}else {
			System.out.println("Sayı asal değildir");
		}
		
	}

}
