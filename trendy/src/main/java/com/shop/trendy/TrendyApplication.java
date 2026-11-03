package com.shop.trendy;

import com.shop.trendy.models.Branch;
import com.shop.trendy.models.Department;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TrendyApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrendyApplication.class, args);

		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {
			
			// 1. Display Department info (including branchName and branch reference)
			System.out.println("\n========== DEPARTMENT DATA ==========");
			Department department = context.getBean("department", Department.class);
			department.displayInfo();

			// 2. Demonstrate SINGLETON Scope (same instance returned every time)
			System.out.println("\n========== DEMO: SINGLETON SCOPE ==========");
			Branch s1 = context.getBean("singletonBranch", Branch.class);
			Branch s2 = context.getBean("singletonBranch", Branch.class);
			System.out.println("Singleton Instance 1 Hash: " + System.identityHashCode(s1));
			System.out.println("Singleton Instance 2 Hash: " + System.identityHashCode(s2));
			System.out.println("Are both instances identical? " + (s1 == s2) + " (Same object in memory)");

			// 3. Demonstrate PROTOTYPE Scope (new instance returned every time)
			System.out.println("\n========== DEMO: PROTOTYPE SCOPE ==========");
			Branch p1 = context.getBean("prototypeBranch", Branch.class);
			Branch p2 = context.getBean("prototypeBranch", Branch.class);
			System.out.println("Prototype Instance 1 Hash: " + System.identityHashCode(p1));
			System.out.println("Prototype Instance 2 Hash: " + System.identityHashCode(p2));
			System.out.println("Are both instances identical? " + (p1 == p2) + " (Different objects in memory)");
		}
	}

}
