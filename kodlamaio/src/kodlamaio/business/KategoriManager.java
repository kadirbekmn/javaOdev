package kodlamaio.business;

import kodlamaio.core.logging.Logger;
import kodlamaio.dataAccess.KategoriDao;
import kodlamaio.entities.Kategori;

public class KategoriManager {
	private KategoriDao kategoriDao;
	private Logger[] loggers;
	private Kategori[] kategoriler;

	public KategoriManager(KategoriDao kategoriDao, Logger[] loggers, Kategori[] kategoriler) {
		this.kategoriDao = kategoriDao;
		this.loggers = loggers;
		this.kategoriler = kategoriler;
	}
	
	
	public void add(Kategori kategori) throws Exception {
		
		for(Kategori kategorim : kategoriler) {
			if(kategorim.getIsim().equals(kategori.getIsim())) {
				throw new Exception("Kategori ismi tekrar edemez");
			}
		}
		
		kategoriDao.add(kategori);
		
		for(Logger loglarim : loggers) {
			loglarim.log(kategori.getIsim());
		}
		
		
	}

}
