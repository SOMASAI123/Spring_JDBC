package com.springcore.springjdbc1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.AbstractDataSource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springcore.Dao.StudentDao;
import com.springcore.Dao.StudentDaoimpl;

@Configuration
public class Javaconfig {
   
	@Bean("ds")
	public AbstractDataSource getdatasource()
	{
	     DriverManagerDataSource ds=new DriverManagerDataSource();
	     ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
	     ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
	     ds.setUsername("root");
	     ds.setPassword("SAISRAVAN@1234");
	     return ds;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate()
	{
		  JdbcTemplate jdbcTemplate=new JdbcTemplate();
		  
		  jdbcTemplate.setDataSource(getdatasource());
		  return jdbcTemplate;
	}
	@Bean("studentDao")
	public StudentDao getstudentDao()
	{
		StudentDaoimpl studentDao=new StudentDaoimpl();
		studentDao.setJdbcTemplate(getTemplate());
		return studentDao;
	}
}
