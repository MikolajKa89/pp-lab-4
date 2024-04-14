public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[7];
        employees[0] = new Manager("Tom Henks", 50000);
        employees[1] = new Worker("", 60000);
        employees[2] = new Employee("Leonardo DiCaprio", 70000);
        employees[3] = new Employee("Robert Downey Jr.", 55000);
        employees[4] = new Worker("Brad Pitt", 65000);
        employees[5] = new Manager("John Doe", 60000);
        employees[6] = new Worker("Jane Smith", 55000);

        // Ustawienie nowej wartości salary dla wszystkich pracowników
        for (Employee employee : employees) {
            double newSalary = employee.getSalary() + 500;
            employee.setSalary(newSalary);
        }

        // Ustawienie nowych wartości dla Managerów
        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                Manager manager = (Manager) employee;
                manager.setNumberOfSubordinates(7500);
                manager.setSalary(7500);
            }
        }

        // Wyświetlenie zaktualizowanych informacji o pracownikach
        System.out.println("Zaktualizowane informacje o pracownikach:");
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
}
