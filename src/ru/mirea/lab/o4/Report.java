package ru.mirea.lab.o4;

public class Report {
    public static String GenerateReport(Employee[] employees)
    {
        StringBuilder stringBuilder = new StringBuilder();

        for (Employee employee : employees)
        {
            stringBuilder.append(String.format("Работник: %s  Зарплата: %20.3fp\n",employee.GetFullname(), employee.GetSalary()));
        }
        return stringBuilder.toString();
    }
}
