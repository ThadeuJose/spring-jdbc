package com.amigoscode.movie;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import org.springframework.jdbc.core.RowMapper;

public class MovieRowMapper implements RowMapper<Movie> {

    @Override
    public Movie mapRow(ResultSet resultSet, int i) throws SQLException {
        int id = resultSet.getInt("id");
        String name = resultSet.getString("name");
        LocalDate releaseDate = LocalDate.parse(resultSet.getString("release_date"));
        return new Movie(id, name, null, releaseDate);
    }

}
