import java.util.Scanner;

public class Methods {

	public static void main(String[] args) {

		sayiBulmaca();

	}

	public static void sayiBulmaca() {

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
		String mesaj = "";
		if (varMi) {
			mesaj = ("Sayı mevcuttur: " + aranacak);
		} else {
			System.out.println("Sayı mevcut değildir");
		}
	}
	
	public static void mesajVer(int aranacak) {
		
		System.out.println("Sayı mevcuttur: " + aranacak);
		
	}
}