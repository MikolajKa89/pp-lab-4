class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Tom Henks", 50000);
        employees[1] = new Employee("", 60000);
        employees[2] = new Employee("Leonardo DiCaprio", 70000);
        employees[3] = new Employee("Robert Downey Jr.", 55000);
        employees[4] = new Employee("CBrad Pitt", 65000);

        // Wyświetlenie danych dla pracownika o indeksie równym 3
        System.out.println("Dane dla pracownika o indeksie 3:");
        System.out.println(employees[3]);

        // Modyfikacja salary dla pracownika o indeksie równym 3
        employees[3].setSalary(60000);

        // Wyświetlenie danych dla wszystkich pracowników
        System.out.println("\nDane dla wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}