package Video099_Exercicio.entities;

public class Employee {
    private Integer id;
    private String name;
    private Double salary;

    public Employee() {
    }

    public Employee(int id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double percentage) {
        salary += salary * percentage / 100;
    }


    @Override
    public String toString() {
        return id + ", " + name + ", " + String.format("%.2f", salary);
    }
}
