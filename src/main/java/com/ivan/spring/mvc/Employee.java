package com.ivan.spring.mvc;

import com.ivan.spring.mvc.validation.CheckMail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2, message = "name must be min 2 symbols")
    private String name;
//    @NotNull(message = "surname is required field")
//    @NotEmpty(message = "surname is required field")
    @NotBlank(message = "surname is required field")
    private String surName;
    @Min(value = 500, message = "must be greater than 499")
    @Max(value =  1000, message = "must be less than 1001")
    private int salary;

    private String department;

    private Map<String,String> departments;

    private String carBrend;

    private Map<String,String> carBrends;

    private String [] languages;

    private Map<String,String> langList;

    @Pattern(regexp = "\\d{3}\\d{2}\\d{2}", message = "please use Pattern xxx-xx-xx")
    private String phoneNumber;
    @CheckMail(value = "abc.com",message = "must be ends abc.com")
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Map<String, String> getLangList() {
        return langList;
    }

    public void setLangList(Map<String, String> langList) {
        this.langList = langList;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }



    public Map<String, String> getCarBrends() {
        return carBrends;
    }

    public void setCarBrends(Map<String, String> carBrends) {
        this.carBrends = carBrends;
    }

    public String getCarBrend() {
        return carBrend;
    }

    public void setCarBrend(String carBrend) {
        this.carBrend = carBrend;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }


    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "Information Technology");
        departments.put("Sales", "Sales");
        departments.put("HR", "Human resources");

        carBrends = new HashMap<>();

        carBrends.put("Mecedec-Benz","MB");
        carBrends.put("Audi","Audi");
        carBrends.put("BMW","BMW");

        langList = new HashMap<>();
        langList.put("EN","English");
        langList.put("RU","Russian");
        langList.put("Fr","French");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
