import java.io.*;
import java.util.*;

class PayrollSystem {
    private List<Employee> employees = new ArrayList<>();
    private static final String FILE_NAME = "payroll_data.ser";
    Scanner scanner=new Scanner(System.in);

    public void addEmployee(Employee emp) {
        employees.add(emp);
        saveData();
    }
    public void SearchAmployee(String query){
        
        
        
        System.out.println("\nSearched Employee Details:");
        for(Employee emp : employees){
            emp.SearchedRes(query);

        }
    

    }

    public void displayPayroll() {
        
        System.out.println("\nEmployee Payroll Details:");
        for(int i=0;i<25;i++){
            System.out.print("--");
        }
        for (Employee emp : employees) {
            
            emp.displayDetails();
        }
    }

    public void saveData() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(employees);
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    public void loadData() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            employees = (List<Employee>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No previous data found. Starting fresh.");
        }
    }
}