package application;

import entities.Employee2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Listas {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee2> list = new ArrayList<>();
        Employee2 emp;

        System.out.print("How many employees will be registered ? ");
        int qntEmployees = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i<qntEmployees; i++){
            System.out.println("\nEmployee: #" + (i+1));
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            while (hasId(list, id) == true) {
                System.out.println("This Id already taken! Try again: ");
                id = sc.nextInt();
            }
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            sc.nextLine();

            emp = new Employee2(id, name, salary);
            list.add(emp);

        }

        System.out.print("\nEnter the employee id that will have salary increase: ");
        int idEmployeeIncreaseSalary = sc.nextInt();
        sc.nextLine();

        emp = list.stream().filter(x -> x.getId() == idEmployeeIncreaseSalary).findFirst().orElse(null);

        // Integer pos = position(list, idEmployeeIncreaseSalary);
        if(emp == null) {
            System.out.println("The id does not exist");
        } else {
            System.out.print("Enter the percentage: ");
            double percentageIncreaseSalary = sc.nextDouble();
            sc.nextLine();
            emp.increaseSalary(percentageIncreaseSalary);
        }

        System.out.println();
        for (Object e : list) {
            System.out.println(e);
        }


        sc.close();

    }

    public static Integer position(List<Employee2> list, int id){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Employee2> list, int id) {
        Employee2 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
