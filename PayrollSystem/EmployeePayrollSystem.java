import java.util.*;

public class EmployeePayrollSystem {
    public static void main(String[] args) {
        System.out.println("\n   Welcome to Payroll system");
        Scanner scanner = new Scanner(System.in);
        PayrollSystem payroll = new PayrollSystem();
        payroll.loadData();

        while (true) {
            for(int i=0;i<15;i++){
                System.out.print("--");
            }
            System.out.println("\n| 1. Add Full-Time Employee  |");
            System.out.println("| 2. Add Part-Time Employee  |");
            System.out.println("| 3. Display Payroll         |");
            System.out.println("| 4. Search Employee         |");
            System.out.println("| 5. Exit                    |");
            for(int i=0;i<15;i++){
                System.out.print("--");
            }
            System.out.print("\nChoose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter ID: ");
                String id = scanner.nextLine();
                System.out.print("Enter Salary: ");
                double salary = scanner.nextDouble();
                System.out.print("Enter Bonus: ");
                double bonus = scanner.nextDouble();
                payroll.addEmployee(new FullTimeEmployee(name, id, salary, bonus));
                System.out.println();
            } else if (choice == 2) {
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter ID: ");
                String id = scanner.nextLine();
                System.out.print("Enter Hours Worked: ");
                int hoursWorked = scanner.nextInt();
                System.out.print("Enter Hourly Rate: ");
                double hourlyRate = scanner.nextDouble();
                payroll.addEmployee(new PartTimeEmployee(name, id, hoursWorked, hourlyRate));
                System.out.println();
            } else if (choice == 3) {
                payroll.displayPayroll();
                System.out.println();
            } else if (choice == 5) {
                System.out.println("Exited Successfully!");
                break;
            }
            else if(choice==4){
                System.out.print("Enter Employee ID or Name: ");
                String query=scanner.nextLine();

                
                payroll.SearchAmployee(query);
            } 
            else {
                System.out.println("Invalid option. Try again.");
            }
        }
        scanner.close();
    }
}