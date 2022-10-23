package kodlamaio.entities;

public class Kurs {
	
	private int id;
	private String kursİsim;
	private int kursFiyat;
	public Kurs(int id, String kursİsim, int kursFiyat) {
		super();
		this.id = id;
		this.kursİsim = kursİsim;
		this.kursFiyat = kursFiyat;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getKursİsim() {
		return kursİsim;
	}
	public void setKursİsim(String kursİsim) {
		this.kursİsim = kursİsim;
	}
	public int getKursFiyat() {
		return kursFiyat;
	}
	public void setKursFiyat(int kursFiyat) {
		this.kursFiyat = kursFiyat;
	}

	
	
//kurs isimleri ing çevir
}
