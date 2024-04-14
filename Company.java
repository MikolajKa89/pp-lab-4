public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Manager("Tom Henks", 50000);
        employees[1] = new Worker("", 60000);
        employees[2] = new Employee("Leonardo DiCaprio", 70000);
        employees[3] = new Worker("Robert Downey Jr.", 55000);
        employees[4] = new Worker("Brad Pitt", 65000);

        // Dodawanie pracowników specyficznych dla zadania
        employees[0].setNumberOfSubordinates(0); // Menedżer - brak podwładnych

        // Zamiana pracowników o indeksach 1 i 4 na instancje klasy Worker
        employees[1] = new Worker("Tom Henks", 60000);
        employees[4] = new Worker("Brad Pitt", 65000);

        // Wyświetlenie danych dla wszystkich pracowników
        System.out.println("Dane dla wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
