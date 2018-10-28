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
import acm.objects.HumanUser;
import acm.objects.SimpleStatusUpdate;
import acm.objects.datahandlers.HumanUserPostData;
import org.springframework.dao.EmptyResultDataAccessException;

/**
 * @author Pranil
 * @description Database connection class for Human Users.
 *
 */
@Component
public class HumanUserFactory implements IDatabaseFactory<HumanUser, HumanUserPostData>{

	public static final String GET_ALL_USERS = "select * from users";
	public static final String GET_USER_FROM_ID = "select * from users where userid= ?";
	public static final String GET_USER_FROM_USERNAME = "select * from users where username= ?";
	public static final String GET_USER_FROM_EMAIL = "select * from users where emailaddress= ?";



	private JdbcTemplate jdbcTemplate;

	private SimpleJdbcInsert insertHumanUser;


	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		// Choosing the table name
		this.insertHumanUser = new SimpleJdbcInsert(dataSource).withTableName("users");
	}

	private static class HumanUsersRowMapper implements RowMapper<HumanUser> {

		@Override
		public HumanUser mapRow(ResultSet rs, int rowNum) throws SQLException {


			int id = ((Number) rs.getObject("userid")).intValue();

			String firstName = rs.getString("firstname");
			String lastName = rs.getString("lastname");
			String userName = rs.getString("username");
			String pswd = rs.getString("pswd");
			String cin = rs.getString("cin");
			String phoneNumber = rs.getString("phonenumber");
			String emailAddress = rs.getString("emailaddress");
			Date birthday = rs.getDate("birthday");
			String secretCode = rs.getString("secretcode");


			// To find the exact column names, look at https://github.com/PranilDahal/SocialMediaApp/issues/11
			
			// And then, use all the data that you collect to create a HumanUser object.
			return new HumanUser(id, firstName, lastName, userName, pswd, cin, phoneNumber, emailAddress, birthday, secretCode);

		}

	}


	@Override
	public List<HumanUser> getAllFromDatabase() {
		List<HumanUser> users = this.jdbcTemplate.query(GET_ALL_USERS, new HumanUsersRowMapper());
		return users;
	}


	@Override
	public HumanUser getById(String id) {
		HumanUser user = this.jdbcTemplate.queryForObject(GET_USER_FROM_ID, new Object[] {id}, new HumanUsersRowMapper());
		return user;
	}


	@Override
	public String insertToDatabase(HumanUserPostData postData) {
		Map<String, Object> parameters = new HashMap<String, Object>();

		try {

			parameters.put("firstname", postData.getFirstName());
			parameters.put("lastname", postData.getLastName());
			parameters.put("username", postData.getUserName());
			parameters.put("password", postData.getPassword());
			parameters.put("cin", postData.getCIN());
			parameters.put("phonenumber", postData.getPhoneNumber());
			parameters.put("emailaddress", postData.getEmailAddress());

			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			java.util.Date parsed = format.parse(postData.getBirthDay());
			java.sql.Date sql = new java.sql.Date(parsed.getTime());


			parameters.put("birthday", postData.getBirthDay());
			parameters.put("secretcode", postData.getSecretCode());

			Number newId= insertHumanUser.executeAndReturnKey(parameters);

			return Integer.toString(newId.intValue());
		} catch (ParseException e) {
			System.out.println("ERROR: FAILED TO PARSE STRING TO A SQL DATE TYPE");
			e.printStackTrace();
			return "-1";
		}
	}


	/**
	 * @param username
	 * @return a HumanUser object with the specific username
	 */
	public HumanUser getByUsername(String username) {
		HumanUser user = this.jdbcTemplate.queryForObject(GET_USER_FROM_USERNAME, new Object[] {username}, new HumanUsersRowMapper());
		return user;
	}


	/**
	 * @param username
	 * @return true/false depending on whether there exists a human account with that username
	 */
	public boolean existsByUsername(String username) {
		try{
			HumanUser user = this.jdbcTemplate.queryForObject(GET_USER_FROM_USERNAME, new Object[] {username}, new HumanUsersRowMapper());
			return true;
		}
		catch(EmptyResultDataAccessException e) {
			return false;
		}
	}


	/**
	 * @param email
	 * @return true/false based on whether there exists a human account with that email
	 */
	public boolean existsByEmail(String email) {
		try {
			HumanUser user = this.jdbcTemplate.queryForObject(GET_USER_FROM_EMAIL, new Object[]{email}, new HumanUsersRowMapper());
			return true;
		}
		catch(EmptyResultDataAccessException e) {
			return false;
		}
	}

}
