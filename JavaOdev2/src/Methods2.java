
public class Methods2 {

	public static void main(String[] args) {

		String mesaj = "Bugün hava çok güzel";
		System.out.println(mesaj.substring(0, 2));
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		
		int toplamMesaj = toplam(5,7);
		System.out.println(toplamMesaj);
		
		int toplam = topla2(2,3,5,6,7,8);
		System.out.println(toplam);
		

	}

	public static void ekle() {

	}

	public static void sil() {

	}

	public static void guncelle() {

	}

	public static int toplam(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public static String sehirVer() {
		return "İstanbul";
	}
	
	public static int topla2(int... sayilar) {
		int toplam = 0;
		for(int sayi : sayilar) {
			toplam += sayi;
		}
		return toplam;	
	}
	
	
	

}
