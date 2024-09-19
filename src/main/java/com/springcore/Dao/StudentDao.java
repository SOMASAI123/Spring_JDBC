package com.springcore.Dao;

import java.util.List;

import com.springcore.entities.Hey;

public interface StudentDao {
	
	public int insert(Hey hey);
	
	public int update(Hey hey);
	
	public int delete(Hey hey);
	
	public Hey getdetails(int id);
	
	public List<Hey> getalldetails();

}
