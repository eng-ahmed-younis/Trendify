package com.shop.trendy.models;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Department implements InitializingBean, DisposableBean {

    // 1. Primitive and String properties
    private String departmentName;
    private String branchName;
    private double budget;

    // 2. Reference to another Bean
    private Manger manager;
    private Branch branch;

    // 3. List of simple values
    private List<String> tasks;

    // 4. List of Bean references
    private List<Employee> employees;

    // 5. Set of unique values
    private Set<String> locations;

    // 6. Map of key-value pairs
    private Map<String, String> contactDetails;

    // 7. Properties
    private Properties configSettings;

    // Constructors
    public Department() {
        System.out.println("1. [Constructor] Department instance created");
    }

    public Department(String departmentName, double budget) {
        this.departmentName = departmentName;
        this.budget = budget;
        System.out.println("1. [Constructor] Department instance created with args");
    }

    // ==========================================
    // Spring Bean Lifecycle Callbacks
    // ==========================================

    // A. InitializingBean interface callback
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("3. [InitializingBean] Department: afterPropertiesSet() called");
    }

    // B. Custom XML init-method callback
    public void customInit() {
        System.out.println("4. [custom init-method] Department: customInit() called");
    }

    // C. DisposableBean interface callback
    @Override
    public void destroy() throws Exception {
        System.out.println("5. [DisposableBean] Department: destroy() called");
    }

    // D. Custom XML destroy-method callback
    public void customDestroy() {
        System.out.println("6. [custom destroy-method] Department: customDestroy() called");
    }

    // Display all data
    public void displayInfo() {
        System.out.println("==========================================");
        System.out.println("Department Name  : " + departmentName);
        System.out.println("Branch Name      : " + branchName);
        if (branch != null) {
            System.out.println("Branch Object    : " + branch);
        }
        System.out.println("Budget           : $" + budget);
        if (manager != null) {
            System.out.println("Manager          : " + manager.getName() + " (Age: " + manager.getAge() + ")");
        }
        System.out.println("Tasks List       : " + tasks);
        System.out.println("Locations Set    : " + locations);
        System.out.println("Contact Map      : " + contactDetails);
        System.out.println("Config Properties: " + configSettings);
        if (employees != null) {
            System.out.println("Employees Count  : " + employees.size());
            for (Employee emp : employees) {
                System.out.print("  -> ");
                emp.showMangrData();
            }
        }
        System.out.println("==========================================");
    }

    // Getters and Setters
    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public Manger getManager() {
        return manager;
    }

    public void setManager(Manger manager) {
        this.manager = manager;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public void setTasks(List<String> tasks) {
        this.tasks = tasks;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Set<String> getLocations() {
        return locations;
    }

    public void setLocations(Set<String> locations) {
        this.locations = locations;
    }

    public Map<String, String> getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(Map<String, String> contactDetails) {
        this.contactDetails = contactDetails;
    }

    public Properties getConfigSettings() {
        return configSettings;
    }

    public void setConfigSettings(Properties configSettings) {
        this.configSettings = configSettings;
    }
}
