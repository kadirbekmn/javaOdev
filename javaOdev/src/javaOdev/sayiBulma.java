package javaOdev;

import java.util.Scanner;

public class sayiBulma {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = scan.nextInt();
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (aranacak == sayi) {
				varMi = true;
				break;
			}
		}
		
		if(varMi) {
			System.out.println("Sayı mevcuttur");
		}else {
			System.out.println("Sayı mevcut değildir");
		}
		

	}

}
