package com.shop.trendy;

import com.shop.trendy.models.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TrendyApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrendyApplication.class, args);

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Employee employee = context.getBean("employee", Employee.class);
		employee.showMangrData();
	}

}
