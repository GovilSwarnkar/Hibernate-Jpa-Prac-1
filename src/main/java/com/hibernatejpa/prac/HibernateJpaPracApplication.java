package com.hibernatejpa.prac;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.hibernatejpa.prac.bean.Person;
import com.hibernatejpa.prac.dao.PersonJdbcDao;
import com.hibernatejpa.prac.dao.PersonJpaDao;

@SpringBootApplication
public class HibernateJpaPracApplication implements CommandLineRunner { //when applcation startup then CommandLineRunner run methd will execute

	private static final Logger log = LoggerFactory.getLogger(HibernateJpaPracApplication.class);

	/*
	 * @Autowired PersonJdbcDao dao;
	 */
	
	@Autowired
	PersonJpaDao dao;
	
	public static void main(String[] args) {
		SpringApplication.run(HibernateJpaPracApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//spring jdbc
		
		/*
		 * log.info("All person -> {}", dao.findAll());
		 * 
		 * log.info("one person -> {}", dao.findById(10001));
		 * 
		 * log.info("delete person -> {}", dao.deleteById(10001));
		 * 
		 * log.info("insert person -> {}", dao.insertPerson(new Person(10004, "Hanu",
		 * "Mumbai", new Date())));
		 * 
		 * log.info("update person -> {}", dao.updatePerson(new Person(10002, "Krishna",
		 * "Deharadun", new Date())));
		 * 
		 * log.info("All person using custom row mapper -> {}",
		 * dao.findAllCustomRowMapper());
		 */
		
		//jpa with entity manager
		
		log.info("find by id person -> {}", dao.findById(10001));
		
		log.info("update one person -> {}", dao.update(new Person(10002, "Krishna","Deharadun", new Date())));
		
		log.info("insert one person -> {}", dao.insert(new Person(10004, "Hanu","Mumbai", new Date())));
		 
		log.info("delete person -> ");
		dao.deleteById(10002);
		
		log.info("find all person -> {}", dao.findAll());
	}
}
