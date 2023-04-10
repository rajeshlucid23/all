package com.example.connectpostgress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class ConnectpostgressApplication implements CommandLineRunner {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(ConnectpostgressApplication.class, args);
	}

	@Override
	/*public void run(String... args) throws Exception {
		String sql = "insert into I_attr_condition_rule ("
				+ "attr_def_id,conditionmatch,conditiontype) values ('10','60','30')";
		int rows = jdbcTemplate.update(sql);
	if(rows >0) {
		System.out.println(sql);
	
	}
	}*/
		
		public void run(String... args) throws Exception {
		String sql = "insert into ram ("
				+ "name,emailid,age) values ('rajesh','rajesh@gmail.com','25')";
		int rows = jdbcTemplate.update(sql);
	if(rows >0) {
		System.out.println(sql);
		}
		
	}
	

}
