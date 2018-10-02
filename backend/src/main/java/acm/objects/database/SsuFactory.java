package acm.objects.database;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Component;

import acm.objects.SimpleStatusUpdate;
import acm.objects.datahandlers.SsuPostData;

/**
 * @author Pranil
 * @description Database connection class for SSU.
 *
 */
@Component
public class SsuFactory implements IDatabaseFactory<SimpleStatusUpdate, SsuPostData>{

	public static final String GET_ALL_SSU = "select * from ssu";

	public static final String GET_SSU_FROM_ID = "select * from ssu where ssuId= ?";

	private JdbcTemplate jdbcTemplate;

	private SimpleJdbcInsert insertSsu;


	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		this.insertSsu = new SimpleJdbcInsert(dataSource).withTableName("ssu").usingGeneratedKeyColumns("ssuId");
	}

	private static class SsuValuesMapper implements RowMapper<SimpleStatusUpdate> {

		@Override
		public SimpleStatusUpdate mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Issue #30 - Update this mapper class to include the userid column
			// TODO Issue #29 - Update this mapper class to include the likes column
			String id = rs.getString("ssuid");
			String title = rs.getString("title");
			String desc = rs.getString("description");
			Date postDate = rs.getDate("dateposted");

			return new SimpleStatusUpdate(id, title,desc,postDate);

		}

	}

	@Override
	public List<SimpleStatusUpdate> getAllFromDatabase() {
		List<SimpleStatusUpdate> ssu = this.jdbcTemplate.query(GET_ALL_SSU, new SsuValuesMapper());
		return ssu;
	}


	@Override
	public SimpleStatusUpdate getById(String ssuId) {
		SimpleStatusUpdate ssu = this.jdbcTemplate.queryForObject(GET_SSU_FROM_ID, new Object[] {ssuId}, new SsuValuesMapper());
		return ssu;
	}


	@Override
	public String insertToDatabase(SsuPostData dataToAdd) {
		Map<String, Object> parameters = new HashMap<String, Object>();

		try {
			// TODO Issue #30 - Include userid in the insert statement
			// TODO Issue #29 - When someone posts a new SSU, it must be inserted into the database with 0 Likes.
			parameters.put("title", dataToAdd.getTitle());
			parameters.put("description", dataToAdd.getDescription());
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			java.util.Date parsed = format.parse(dataToAdd.getDatePosted());
			java.sql.Date sql = new java.sql.Date(parsed.getTime());
			parameters.put("dateposted", sql);

			Number newId= insertSsu.executeAndReturnKey(parameters);

			return Integer.toString(newId.intValue());
		} catch (ParseException e) {
			System.out.println("ERROR: FAILED TO PARSE STRING TO A SQL DATE TYPE");
			e.printStackTrace();
			return "-1";
		}
	}


	/**
	 * @param ssuList
	 * @description Sorts a given list of SSUs based on datePosted
	 */
	private void sortByDate(ArrayList<SimpleStatusUpdate> ssuList){
		// TODO Issue #32






	}


	/**
	 * @param userid
	 * @return List of SSU posted by a specific user based on ID
	 */
	public List<SimpleStatusUpdate> getAllByUserId(String userid) {
		// TODO Issue #31

		// Step 1: Create a SQL statement at the top of this class
		
		// Step 2: Execute the SQL statement using the jdbcTemplate object 
		// (look at the methods inside SsuFactory.java to see how it works)
		
		//Step 3: Then, return the list


		return null;
	}


	/**
	 * @param ssuId - if of the SSU to delete
	 * @return ssuid of the SSU that got deleted OR -1 if unsuccesful
	 */
	public int deleteById(String ssuId) {

		// TODO Issue #16
		
		// Step 1: Create a SQL statement at the top of this class
		
		// Step 2: Execute the SQL statement using the jdbcTemplate object 
		// (look at the methods inside SsuFactory.java to see how it works)
		
		//Step 3: Surround your code in try-catch block. If the execution goes wrong (an exception is thrown), return -1
		// If SQL statement executes properly, return the ssuId
		
		return -1;
	}
	
	/**
	 * @param ssuId - id of the SSU to edit | dataToUpdate - new SsuPostData
	 * @return Updated SSU
	 */
	public SimpleStatusUpdate updateById(String ssuId, SsuPostData dataToUpdate) {

		// TODO Issue #17
		
		// Step 1: Create a SQL statement at the top of this class to update SSU
		// UPDATE ssu SET column1=blah, column2=blah .... where ssuid=blah | Google UPDATE Sql statements to see how it works
		// *** Only update the Title and Description fields ***
		
		// Step 2: Execute the SQL statement using the jdbcTemplate object 
		// (look at the methods inside SsuFactory.java to see how it works)
		// you might wanna use this.jdbcTemplate.update(...) method.
		
		//Step 3: Surround your code in try-catch block. 
		//If the execution goes wrong (an exception is thrown), return a SSU object with ssuid set as -1
		
		// Test if this works. Call the API by using Postman app.
		
		return null;
	}

}
