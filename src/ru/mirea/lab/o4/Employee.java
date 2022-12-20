package ru.mirea.lab.o4;

public class Employee {
    private String fullname = "no name";
    private float salary = 0;

    Employee(String name, int salaryAmount)
    {
        fullname = name;
        salary = salaryAmount;
    }

    public float GetSalary() {
        return salary;
    }

    public String GetFullname() {
        return fullname;
    }
}
