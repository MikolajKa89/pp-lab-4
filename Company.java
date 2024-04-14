public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Manager("Tom Henks", 50000);
        employees[1] = new Worker("", 60000);
        employees[2] = new Employee("Leonardo DiCaprio", 70000);
        employees[3] = new Employee("Robert Downey Jr.", 55000);
        employees[4] = new Worker("Brad Pitt", 65000);

        // Zliczanie pracowników nie będących managerami
        int nonManagerCount = 0;
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                nonManagerCount++;
            }
        }

        // Ustawienie zliczonej wartości jako numberOfSubordinates dla pracownika o indeksie 0
        ((Manager) employees[0]).setNumberOfSubordinates(nonManagerCount);

        // Ustawienie salary pracownika o indeksie 0 na 75000
        employees[0].setSalary(75000);

        // Wyświetlenie zmodyfikowanych danych dla pracownika o indeksie 0
        System.out.println("Dane dla pracownika o indeksie 0:");
        System.out.println(employees[0]);

        // Wyświetlenie danych dla pozostałych pracowników
        System.out.println("\nDane dla pozostałych pracowników:");
        for (int i = 1; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
}
