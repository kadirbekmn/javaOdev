package kodlamaio.business;

import kodlamaio.core.logging.Logger;
import kodlamaio.dataAccess.KursDao;
import kodlamaio.entities.Kurs;

public class KursManager {
	private Logger[] loggers;
	private KursDao kursDao;
	
	private Kurs[] kurslar;
	
	public KursManager(Logger[] loggers, KursDao kursDao, Kurs[] kurslar) {
		super();
		this.loggers = loggers;
		this.kursDao = kursDao;
		this.kurslar = kurslar;
	}

	public void add(Kurs kurs) throws Exception {

		for(Kurs kursum : kurslar) {
			if(kursum.getKursİsim().equals(kurs.getKursİsim())) {
				throw new Exception("Kurs isimi tekrar edemez");
			}
		}
		if(kurs.getKursFiyat() < 0){
			throw new Exception("Kurs fiyatı 0'dan küçük olamaz");
		}
		
		kursDao.add(kurs);
		
		for(Logger logum : loggers) {
			logum.log(kurs.getKursİsim());
		}
		
	}

	
	
}
