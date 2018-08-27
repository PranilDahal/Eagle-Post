package acm.objects.database;

import java.util.List;

/**
 * @author Pranil
 *
 * @param <T> The actual object
 * @param <S> Post data object
 */
public interface IDatabaseBean<T, S> {
	
	/**
	 * @return List<T> of all the T objects in database
	 */
	List<T> getAllFromDatabase();
	
	/**
	 * @param id
	 * @return one T object with unique id
	 */
	T getById(String id);
	
	/**
	 * @param postData
	 * @return id of the new object created.
	 */
	String insertToDatabase(S postData);

}
