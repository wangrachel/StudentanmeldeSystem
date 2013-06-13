/**
 * 
 */
package spring.webapp.loginsystem.persistence.dao;

import java.util.List;

import spring.webapp.loginsystem.entity.Datei;

/**
 * @author Songhua Cui
 * 
 * 
 */
public interface DateiDao {
	/**
	 * @param kursId
	 * @return 
	 */
	List<Datei> getDateienByKursId(String kursId);

	/**
	 * @param dateiId
	 * @return 
	 */
	Datei getDateiByDateiId(long dateiId);

	/**
	 * 
	 * @param dateiId
	 */
	void deleteDateiByDateiId(long dateiId);

	/**
	 * @param datei
	 * @param kursId
	 */
	void saveDatei(Datei datei, String kursId);
}
