package acm.objects.database;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Component;

import acm.objects.SetupTestObject;


@Component
public class SetupDatabaseBean {

	public static final String LIST_TEST = "select * from testSetup";

	public static final String ADD_TEST = "insert into testSetup (first_name, last_name, cin) values (?, ?, ?)";

	private JdbcTemplate jdbcTemplate;

	private SimpleJdbcInsert insertTestValue;


	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		this.insertTestValue = new SimpleJdbcInsert(dataSource).withTableName("testsetup");
	}


	public List<SetupTestObject> getTestValues() {
		
		List<SetupTestObject> employees = this.jdbcTemplate.query(LIST_TEST, new TestValuesMapper());
		return employees;
		
	}

	public int insertTestValues(SetupTestObject value) {

		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("first_name", value.getFirst_name());
		parameters.put("last_name", value.getLast_name());
		parameters.put("cin", value.getCin());

		Number newId = insertTestValue.executeAndReturnKey(parameters);
		return newId.intValue();
	}
	
	public void runCommand(String command){
		
		this.jdbcTemplate.execute(command);

	}


	private static final class TestValuesMapper implements RowMapper<SetupTestObject> {

		@Override
		public SetupTestObject mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			String firstName = rs.getString("first_name");
			String lastName = rs.getString("last_name");
			Integer cin = rs.getInt("cin");
			return new SetupTestObject(firstName, lastName, cin);
			
		}

	}

}