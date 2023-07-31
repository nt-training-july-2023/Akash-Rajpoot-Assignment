package Map;

import java.util.*;

public class EmployeeMapExample {
    private Map<Integer, String> employeeMap;

    public EmployeeMapExample() {
        employeeMap = new HashMap<>();
    }

    // Method to add elements to the map
    public void addEmployee(int employeeId, String employeeName) {
        employeeMap.put(employeeId, employeeName);
    }

    public void printEmployeeIdsByName(String searchName) {
        boolean found = false;
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            int employeeId = entry.getKey();
            String employeeName = entry.getValue();

            if (employeeName.contains(searchName)) {
                System.out.println("Employee ID: " + employeeId + ", Employee Name: " + employeeName);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No employees found with the name containing: " + searchName);
        }
    }

    public static void main(String[] args) {
        EmployeeMapExample empMapExample = new EmployeeMapExample();

        // Adding elements to the map
        empMapExample.addEmployee(101, "John Doe");
        empMapExample.addEmployee(102, "Alice Smith");
        empMapExample.addEmployee(103, "Bob Johnson");
        empMapExample.addEmployee(104, "Eva Anderson");

        // Search and print employee IDs by name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name to search for: ");
        String searchName = scanner.nextLine();
        empMapExample.printEmployeeIdsByName(searchName);
    }
}
