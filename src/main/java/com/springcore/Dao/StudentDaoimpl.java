package com.springcore.Dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springcore.entities.Hey;

public class StudentDaoimpl implements StudentDao{
    
	private JdbcTemplate jdbcTemplate;
	
	public int insert(Hey hey)
	{
		String query="insert into Hey values(?,?,?)";
		
		this.jdbcTemplate.update(query,hey.getId(),hey.getName(),hey.getCity());
		 return 0;
	}
	
	public int update(Hey hey) {
		String query="update Hey set city= ? where id=?";
		this.jdbcTemplate.update(query,hey.getCity(),hey.getId());
		return 0;
	}
	
	
	public int delete(Hey hey) {
	
		String query="delete from Hey where id=?";
		
		this.jdbcTemplate.update(query,hey.getId());
		return 0;
	}
	
	public Hey getdetails(int id) {
	    
		String query="select *from Hey where id=?";
		
		RowMapper<Hey> rowMapper=new RowMapperimpl();
		Hey hey=this.jdbcTemplate.queryForObject(query,rowMapper,id);
		
		return hey;
	}
	
	public List<Hey> getalldetails() {
		// TODO Auto-generated method stub
		
		String query1="select *from Hey";
	List<Hey>hey=	this.jdbcTemplate.query(query1,new RowMapperimpl());
		
		return hey;
	}
	
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	


	
	
	
}
