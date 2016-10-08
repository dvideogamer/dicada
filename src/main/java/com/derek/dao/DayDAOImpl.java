package com.derek.dao;

import com.derek.model.Day;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class DayDAOImpl implements DayDAO {

    @Autowired
    NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public void save(Day p) {
//        jdbcTemplate.execute()
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Day> list() {
        return jdbcTemplate.query("SELECT * FROM days", new DayMapper());
    }

    private static final class DayMapper implements RowMapper<Day> {

        public Day mapRow(ResultSet rs, int rowNum) throws SQLException {
            Day day = new Day(rs.getLong("day_id"), rs.getString("name"));
            return day;
        }
    }
}