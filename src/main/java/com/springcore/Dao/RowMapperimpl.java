package com.springcore.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springcore.entities.Hey;

public class RowMapperimpl implements RowMapper<Hey> {

	@Override
	public Hey mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Hey hey=new Hey();
		hey.setId(rs.getInt(1));
		hey.setName(rs.getString(2));
		hey.setCity(rs.getString(3));
		return hey;
	}

}
