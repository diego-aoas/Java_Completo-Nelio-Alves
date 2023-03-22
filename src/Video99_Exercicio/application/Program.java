package Video99_Exercicio.application;

import Video99_Exercicio.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.printf("How many employees will be registered? ");
        int nEmpl = sc.nextInt();


        for (int i = 0; i < nEmpl; i++) {

            System.out.println("\nEmployee #" + (i + 1));
            System.out.printf("Id: ");
            Integer id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.println("Id already taken! Try again: ");
                id = sc.nextInt();
            }


            System.out.printf("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.printf("Salary: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);

            list.add(emp);
        }

        System.out.println("\nEnter the employee ID that will have salary increase: ");
        int idSalary = sc.nextInt();

//        Integer pos = position(list, idSalary);

        Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);

//        if (pos == null) {
        if (emp == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.println("Enter the percentage: ");
            double percent = sc.nextDouble();
//            list.get(pos).increaseSalary(percent);
            emp.increaseSalary(percent);
        }

        System.out.println("\nList of employees");
        for (Employee empl : list) {
            System.out.println(empl);
        }


        sc.close();
    }

    public static Integer position(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
