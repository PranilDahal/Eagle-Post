package acm.objects.database;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Component;

import acm.objects.HumanUser;
import acm.objects.SetupTestObject;
import acm.objects.SimpleStatusUpdate;

@Component
public class HumanUserDatabaseBean {

	public static final String GET_ALL_USERS = "select * from users";

	private JdbcTemplate jdbcTemplate;

	private SimpleJdbcInsert insertHumanUser;


	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		this.insertHumanUser = new SimpleJdbcInsert(dataSource).withTableName("users");
	}


	public List<HumanUser> getAllUsers() {

		List<HumanUser> humans = this.jdbcTemplate.query(GET_ALL_USERS, new UsersMapper());
		return humans;

	}

	private static class UsersMapper implements RowMapper<HumanUser> {

		@Override
		public HumanUser mapRow(ResultSet rs, int rowNum) throws SQLException {

			String firstName = rs.getString("first_name");
			String lastName = rs.getString("last_name");
			String cin = rs.getString("cin");
			String phoneNumber = rs.getString("phone_number");
			String emailAddress = rs.getString("email_address");
			Date birthDay = rs.getDate("birthday");
			String secretCode = rs.getString("secret_code");
			
			return new HumanUser(firstName, lastName, cin, phoneNumber, emailAddress, birthDay, secretCode);

		}

	}

}
