package employees;

public class Worker extends Employee {
    public String position;

    public Worker(String fullName, double salary) {
        super(fullName, salary);
        this.position = "";
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String newPosition) {
        this.position = newPosition;
    }

    @Override
    public String toString() {
        return "Worker: " + getFullName() + ", Salary: " + getSalary() + ", Position: " + position;
    }
}
