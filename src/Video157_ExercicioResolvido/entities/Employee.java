package Video157_ExercicioResolvido.entities;

public class Employee {

    private String name;
    private Integer hours;
    private Double valuePerHour;


    public Employee() {
    }


    public Employee(String name, Integer hours, Double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getHours() {
        return hours;
    }

    public Employee setHours(Integer hours) {
        this.hours = hours;
        return this;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public Employee setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
        return this;
    }

    public double payment() {
        return hours * valuePerHour;
    }

}

