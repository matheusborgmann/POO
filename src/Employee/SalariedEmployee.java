package Employee;

public class SalariedEmployee extends Employee {
    private double weekSalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weekSalary) {
        super(firstName, lastName, socialSecurityNumber);

        if (weekSalary < 0.0)
            throw new IllegalArgumentException("Weekly salary must be positive!");

            this.weekSalary = weekSalary;
    }

    public double getWeekSalary() {
        return weekSalary;
    }

    public void setWeekSalary(double weekSalary) {
        this.weekSalary = weekSalary;
    }
    //calcular rendimentos:
    @Override
    public double earnings(){
        return getWeekSalary();
    }

    @Override
    public String toString() {
        return String.format("Salaried employees: %s%n%s: $%,.2f", super.toString(), "weekly salary", getWeekSalary());
    }
}
