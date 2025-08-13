
package YalActivity1;

import java.util.Scanner;


public class YalACT4 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter employee name: ");
        String employeeName = sc.nextLine();
        
        System.out.print("Enter hourly rate: ");
        double hourlyRate = sc.nextDouble();
        
        System.out.print("Enter total hours worked this week: ");
        Double hoursWorked = sc.nextDouble();
        
        
        double grossWage = hourlyRate * hoursWorked;
        double ssscontribution = grossWage * 0.10;
        double netWage = grossWage - ssscontribution;
        
        System.out.println("\nOutput: ");
        System.out.println("Wage Summary");
        System.out.println("Employee: " + employeeName);
        System.out.printf("Hourly Rate: ₱%.2f%n", hourlyRate);
        System.out.printf("Hours Worked: %.0f%n", hoursWorked);
        System.out.printf("Gross Weekly Wage: ₱%.2f%n", grossWage);
        System.out.printf("SSS Contribution (10%%): ₱%.2f%n", ssscontribution);
        System.out.printf("Net Weekly Wage: ₱%.2f%n", netWage);
        
    }
    
}
