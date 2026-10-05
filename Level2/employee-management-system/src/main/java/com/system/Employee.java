package com.system;

public class Employee {

    public String name;
    public String surname;
    public String id;
    public String delegation;
    public double salary; 

    public Employee(String name, String surname, String id, String delegation, double salary) {
		this.name = name;
		this.surname = surname;
		this.id = id;
		this.delegation = delegation;
		this.salary = salary;
	}

	public Employee(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDelegation() {
        return delegation;
    }

    public void setDelegation(String delegation) {
        this.delegation = delegation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
