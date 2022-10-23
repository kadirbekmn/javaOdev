package kodlamaio.business;

import java.util.List;

import kodlamaio.core.logging.Logger;
import kodlamaio.dataAccess.EgitmenDao;
import kodlamaio.dataAccess.HibernateEgitmenDao;
import kodlamaio.dataAccess.JdbcEgitmenDao;
import kodlamaio.entities.Egitmen;

public class EgitmenManager {
	private EgitmenDao egitmenDao;
	private Logger[] loggers;
	

	public EgitmenManager(EgitmenDao egitmenDao, Logger[] loggers) {
		this.egitmenDao = egitmenDao;
		this.loggers = loggers;
	}


	public void add(Egitmen egitmen) throws Exception {

		
		// EgitmenDao egitmenDao = new HibernateEgitmenDao();
		egitmenDao.add(egitmen);
		
		for(Logger logger : loggers) {
			logger.log(egitmen.getIsim());
		}

	}

}
