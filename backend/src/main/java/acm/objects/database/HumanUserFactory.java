package acm.objects.database;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Component;
import acm.objects.HumanUser;
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


	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		this.insertHumanUser = new SimpleJdbcInsert(dataSource).withTableName("users");
	}


	@Override
	public List<HumanUser> getAllFromDatabase() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public HumanUser getById(String id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String insertToDatabase(HumanUserPostData postData) {
		// TODO Auto-generated method stub
		return null;
	}


	public HumanUser getByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}


	public boolean existsByUsername(String username) {
		// TODO Auto-generated method stub
		return true;
	}


	public boolean existsByEmail(String email) {
		// TODO Auto-generated method stub
		return true;
	}

}
