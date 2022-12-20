package ru.mirea.lab.o4;

public class Main {
    private static Employee[] employees;

    public static void main(String[] args)
    {

        employees = new Employee[]
                {
                        new Employee("Данила", 500),
                        new Employee("Гоша", 3200),
                        new Employee("Артём", 800),
                        new Employee("Андрей", 3954),
                        new Employee("Гена", 20000)
                };

        System.out.println(Report.GenerateReport(employees));
    }
}
