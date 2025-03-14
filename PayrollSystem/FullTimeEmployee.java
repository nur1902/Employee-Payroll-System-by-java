public class FullTimeEmployee extends Employee {
    private double bonus;

    public FullTimeEmployee(String name, String id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;

    
    }

    @Override
    public double calculateSalary() {
        return salary + bonus;
    }
    @Override
    public String EmployeeType(){
        return "Full Time";
    }
    
}
