package Video165_ExercicioFixacao.entities;

public class Individual extends TaxPayer {
    private Double healthExpenditures;

    public Individual() {
    }

    public Individual(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        if (getAnualIncome() <= 20000.00) {
            if (healthExpenditures > 0) {
                return (getAnualIncome() * 0.15) - (healthExpenditures * 0.5);
            }
            return getAnualIncome() * 0.15;

        } else {
            if (healthExpenditures > 0) {
                return (getAnualIncome() * 0.25) - (healthExpenditures * 0.5);
            }
            return getAnualIncome() * 0.25;
        }
    }
}
