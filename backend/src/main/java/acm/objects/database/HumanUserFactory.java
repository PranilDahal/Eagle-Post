package acm.objects.database;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Component;
import acm.objects.HumanUser;
import acm.objects.SimpleStatusUpdate;
import acm.objects.datahandlers.HumanUserPostData;

/**
 * @author Pranil
 * @description Database connection class for Human Users.
 *
 */
@Component
public class HumanUserFactory implements IDatabaseFactory<HumanUser, HumanUserPostData>{

	public static final String GET_ALL_USERS = "select * from users";

	private JdbcTemplate jdbcTemplate;

	private SimpleJdbcInsert insertHumanUser;

	//TODO Issue #18 and #15
	// Fill the methods that are empty in the class
	// You will also need to fill the RowMapper class

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		// Choosing the table name
		this.insertHumanUser = new SimpleJdbcInsert(dataSource).withTableName("users");
	}

	private static class HumanUsersRowMapper implements RowMapper<HumanUser> {

		@Override
		public HumanUser mapRow(ResultSet rs, int rowNum) throws SQLException {

			// TODO Issue #18 and #15 - The purpose of this class is to create a HumanUser object based on each SQL row
			// Look at the SsuFactory's RowMapper class for example

			String id = rs.getString("put the column name for the user id");
			String firstName = rs.getString("put the column name for the first name of users");

			// and so on ... 

			//	return new HumanUser(blah, blah, blah ...)
			return null;

		}

	}

	// TODO Issue #18 and #15 - 
	// ***** For all the methods below, you will need to create SQL statements.*****
	
	// Look at the top of SsuFactory.java for example.
	@Override
	public List<HumanUser> getAllFromDatabase() {
		// TODO Issue #18 and #15 - Returns ALL the users from database
		return null;
	}


	@Override
	public HumanUser getById(String id) {
		// TODO Issue #18 and #15 - Returns user based on id
		return null;
	}


	@Override
	public String insertToDatabase(HumanUserPostData postData) {
		// TODO Issue #18 and #15 - Inserts a new user into the database
		return null;
	}


	/**
	 * @param username
	 * @return a HumanUser object with the specific username
	 */
	public HumanUser getByUsername(String username) {
		// TODO Issue #18 and #15 - Returns a humanUser with specific username
		return null;
	}


	/**
	 * @param username
	 * @return true/false depending on whether there exists a human account with that username
	 */
	public boolean existsByUsername(String username) {
		// TODO Issue #18 and #15 - returns true/false depending on whether there exists a human account with that username
		return true;
	}


	/**
	 * @param email
	 * @return true/false based on whether there exists a human account with that email
	 */
	public boolean existsByEmail(String email) {
		// TODO Issue #18 and #15 - Returns true/false based on whether there exists a human account with that email
		return true;
	}

}
