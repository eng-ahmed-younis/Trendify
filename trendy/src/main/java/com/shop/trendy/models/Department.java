package com.shop.trendy.models;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Department {

    // 1. Primitive and String properties
    private String departmentName;
    private double budget;

    // 2. Reference to another Bean
    private Manger manager;

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
    }

    public Department(String departmentName, double budget) {
        this.departmentName = departmentName;
        this.budget = budget;
    }

    // Lifecycle methods
    public void init() {
        System.out.println(">> Department Bean Initialized (init-method called)");
    }

    public void destroy() {
        System.out.println(">> Department Bean Destroyed (destroy-method called)");
    }

    // Display all data
    public void displayInfo() {
        System.out.println("==========================================");
        System.out.println("Department Name  : " + departmentName);
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

