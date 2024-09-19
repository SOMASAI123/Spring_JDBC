package com.springcore.springjdbc1;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import com.springcore.entities.Hey;
import com.springcore.Dao.StudentDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context=new AnnotationConfigApplicationContext(Javaconfig.class);
        
      StudentDao studentDao= (StudentDao)context.getBean("studentDao",StudentDao.class);
    Hey hey=new Hey();
     hey.setId(141);
     hey.setName("kumar");
     hey.setCity("wgl");
    int result=studentDao.insert(hey);
    System.out.println(result); 
      
//      Hey hey=studentDao.getdetails(12);
//      System.out.println(hey);
//        
      
//      List<Hey>hey=studentDao.getalldetails();
//      for(Hey h:hey)
//      {
//    	  System.out.println(hey);
//      }
//        
    }
}
