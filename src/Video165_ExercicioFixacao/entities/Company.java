package Video165_ExercicioFixacao.entities;

public class Company extends TaxPayer {
    private int numberOfEmployees;

    public Company() {
        super();
    }

    public Company(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        if (numberOfEmployees <= 10) {
            return getAnualIncome() * 1.16;
        } else {
            return getAnualIncome() * 1.14;
        }
    }
}
