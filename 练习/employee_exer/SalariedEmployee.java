package day15.exer2;

public class SalariedEmployee extends Employee {
    private double monthlySalary;

    public SalariedEmployee(String name, int number, MyDate birthday, double monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double earnings() {
        return this.monthlySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +super.toString();
    }
}
