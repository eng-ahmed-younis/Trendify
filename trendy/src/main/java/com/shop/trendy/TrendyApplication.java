package com.shop.trendy;

import com.shop.trendy.models.Department;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TrendyApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrendyApplication.class, args);

		// Initialize Spring context using try-with-resources (auto-closes and triggers destroy-method)
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {
			// Fetch the department bean that demonstrates all Spring XML cases
			Department department = context.getBean("department", Department.class);
			department.displayInfo();

			// Fetch the HR department bean (constructor-arg index/type and null property)
			Department hrDepartment = context.getBean("hrDepartment", Department.class);
			hrDepartment.displayInfo();
		}
	}

}
