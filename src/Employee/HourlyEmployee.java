package Employee;

public class HourlyEmployee extends Employee{

       private double wage;
       private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double salary, double hours) {
        super(firstName, lastName, socialSecurityNumber);

        if (wage < 0.0 )// validando a renumeração e horas
            throw new IllegalArgumentException("Wage must be positive!");

        this.wage = wage;

        if (hours < 0.0)
            throw new IllegalArgumentException("Hourly must be positive!");

        this.hours = hours;
    }
    //retorna renumeracao
    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if(wage < 0.0)//valida renumeracao
            throw new IllegalArgumentException("Wage must be positive!");

        this.wage = wage;
    }

    public void setHours(double hours) {
        if(hours < 0.0)//valida horas trabalhadas
            throw new IllegalArgumentException("Hourly wage must be positive!");

        this.hours = hours;
    }
    //retorna horas trabalhadas
    public double getHours() {
        return hours;
    }

    @Override
    public double earnings(){
        return getHours();
    }
}
