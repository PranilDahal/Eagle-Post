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

import acm.objects.SimpleStatusUpdate;

@Component
public class SsuDatabaseBean {

	public static final String GET_ALL_SSU = "select * from ssu";

	private JdbcTemplate jdbcTemplate;

	private SimpleJdbcInsert insertSSU;


	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		this.insertSSU = new SimpleJdbcInsert(dataSource).withTableName("ssu");
	}


	public List<SimpleStatusUpdate> getAllSSUs() {

		List<SimpleStatusUpdate> ssu = this.jdbcTemplate.query(GET_ALL_SSU, new SsuValuesMapper());
		return ssu;

	}

	private static class SsuValuesMapper implements RowMapper<SimpleStatusUpdate> {

		@Override
		public SimpleStatusUpdate mapRow(ResultSet rs, int rowNum) throws SQLException {

			String title = rs.getString("title");
			String desc = rs.getString("description");
			Date postDate = rs.getDate("date_posted");
			
			return new SimpleStatusUpdate(title,desc,postDate);

		}

	}
}
