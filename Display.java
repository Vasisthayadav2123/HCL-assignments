import java.util.Scanner;

public class Display {
    static String displayID(String[][] employees) {
        String ids = "";
        for (int i = 0; i < employees.length; i++) {
            ids += employees[i][0];
            if (i != employees.length - 1) {
                ids += ",";
            }
        }
        return ids;
    }

    static String displayName(String[][] employees) {
        String names = "";
        for (int i = 0; i < employees.length; i++) {
            names += employees[i][1];
            if (i != employees.length - 1) {
                names += ",";
            }
        }
        return names;
    }

    static String displaySal(String[][] employees) {
        String salary = "";
        for (int i = 0; i < employees.length; i++) {
            salary += String.format("%.2f", Double.parseDouble(employees[i][2]));
            if (i != employees.length - 1) {
                salary += ",";
            }
        }
        return salary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employee data you want to input: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[][] employees = new String[n][3];
        System.out.println("Enter Employee ID, Name, and Salary (separate by commas): ");
        for (int i = 0; i < n; i++) {
            String employee = sc.nextLine();
            employees[i] = employee.split(",");
        }
        System.out.println("Displaying Employee IDs: ");
        System.out.println(displayID(employees));
        System.out.println("Displaying Employee Names: ");
        System.out.println(displayName(employees));
        System.out.println("Displaying Employee Salaries: ");
        System.out.println(displaySal(employees));
        sc.close();
    }
}
