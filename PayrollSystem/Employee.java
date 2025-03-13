import java.io.Serializable;
import java.util.Scanner;

public class Employee implements Serializable {
    protected String name;
    protected String id;
    protected double salary;
    public String search;
    int i=0;

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;

    }
    
    
    
    

    public double calculateSalary() {
        return salary;
    }

    public void displayDetails() {
        
        System.out.println("\n|ID: " + id + " | Name: " + name + " | Salary: " + calculateSalary()+"|");
        for(int i=0;i<25;i++){
            System.out.print("--");
        }
    }
    public void SearchedRes(String query){
        
        if (query.equals(id)||query.equals(name)) {

            for(int i=0;i<25;i++){
                System.out.print("--");
            }
            
        
        System.out.println("\n|ID: " + id + " | Name: " + name + " | Salary: " + calculateSalary()+"|");
        for(int i=0;i<25;i++){
            System.out.print("--");
        }
        System.out.println("\n");
        
        
        
        }
        
        
    }
    
}