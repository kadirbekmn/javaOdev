package kodlamaio.entities;

public class Egitmen {
	
	private int id;
	private String isim;
	private String dersAdi;
	private int yas;
	public Egitmen() {
	}
	public Egitmen(int id, String isim, String dersAdi, int yas) {
		this.id = id;
		this.isim = isim;
		this.dersAdi = dersAdi;
		this.yas = yas;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getDersAdi() {
		return dersAdi;
	}
	public void setDersAdi(String dersAdi) {
		this.dersAdi = dersAdi;
	}

}
