package com.java.corespring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class AppJdbcMain {

	public static void main(String[] args) {
		//spring jdbc template
		ApplicationContext context=new ClassPathXmlApplicationContext("com/java/corespring/jdbc/config.xml");
		JdbcTemplate temp= context.getBean("jdbcTemplate",JdbcTemplate.class);
	//insert query
		String qr="insert into student(id,name,city,phone)values(?,?,?,?)";
		//fire query
		int result=temp.update(qr,456,"Uttam" ,"kanpur","9887766565");
	  System.out.println("Number of record inserted:"+result);
	}

}
