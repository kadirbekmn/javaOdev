package javaOdev;

public class switchDemo {

	public static void main(String[] args) {

		char grade = 'A';

		switch (grade = 'A') {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;

		case 'B':
			System.out.println("Çok güzel : Geçtiniz");
			break;

		case 'C':
			System.out.println("Çok güzel : Geçtiniz");
			break;

		case 'D':
			System.out.println("Çok güzel : Geçtiniz");
			break;

		case 'F':
			System.out.println("Maalesef : Kaldınız");
			break;

		default:
			System.out.println("Geçersiz not girdiniz");
		}

	}

}
