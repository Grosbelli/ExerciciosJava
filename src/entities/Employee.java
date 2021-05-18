package entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary (double percentage){
        double newSalary = grossSalary + (grossSalary * (percentage/100)) - tax;
        System.out.printf("Updated data: %s, $ %.2f%n", name, newSalary);
    }

    public String toString() {
        return "Employee: " +
                name +
                ", $ " +
                String.format("%.2f%n", netSalary());
    }
}
