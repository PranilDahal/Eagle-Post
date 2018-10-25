package acm.objects.database;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
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
	
	public static final String DELETE_WITH_ID = "delete from ssu where ssuid= ?";

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
	 * @author Andy Echeverria
	 * @param ssuId
	 * @return 1 if deletion is successful else return -1 if unsuccessful
	 */
	public int deleteById(String ssuId) {
		
		try {
			this.jdbcTemplate.update(DELETE_WITH_ID, ssuId);
			return 1;
		}
		catch (RuntimeException e){
			System.out.println("ERROR: FAILED TO EXECUTE SQL STATEMENT");
			e.printStackTrace();
			return -1;
		}
	}


}
