package javaOdev;

public class HesapMakinesiSiniflar {

	public static void main(String[] args) {
		
		HesapMakinesi m1 = new HesapMakinesi(10, 5, "siyah");
		System.out.println(m1.toplama());
		m1.sayi1 = 20;
		System.out.println(m1.cikarma());
		
		HesapMakinesi m2 = new HesapMakinesi(20, 30, "mavi");
		System.out.println(m2.toplama());

		
	}
}
