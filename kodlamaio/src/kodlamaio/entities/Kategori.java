package kodlamaio.entities;

public class Kategori {
	private int id;
	private String isim;
	public Kategori(int id, String isim) {
		super();
		this.id = id;
		this.isim = isim;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}

}
