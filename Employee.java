public class Employee {
    String name;
    int id;
    double salary;
    String address;
    int number;

    public Employee(String name, int id, double salary, String address,int number) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.address = address;
        this.number=number;
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address); 
        System.out.println("Number: " + number); 
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("XYZ", 101, 50000.0, "123 Main St",22525);
        emp1.displayInfo();
    }
}
