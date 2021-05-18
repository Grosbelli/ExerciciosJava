package entities;

public class Employee2 {
    private Integer id;
    private String name;
    private Double salary;


    public Employee2(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double increaseSalary(double percentage){
        return salary += salary * (percentage/100);
    }

    public String toString(){
        return id +
                ", " +
                name +
                ", " +
                String.format("%.2f", salary);
    }
}
