class Employee {
    String name;
    double salary;

    Employee(String name, double salary) throws Exception {
        if(name.isEmpty()) {
            throw new Exception("Employee name cannot be empty");
        }
        if(salary < 0) {
            throw new Exception("Salary cannot be negative");
        }

        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Manager Class
class Manager extends Employee {

    Manager(String name, double salary) throws Exception {
        super(name, salary);   // calling parent constructor
    }

    void display() {   // method overriding
        super.display();
        System.out.println("Role: Manager");
    }
}

// Developer Class
class Developer extends Employee {

    Developer(String name, double salary) throws Exception {
        super(name, salary);
    }

    void display() {
        super.display();
        System.out.println("Role: Developer");
    }
}

// Main Class
public class EmployeeSystem {

    public static void main(String[] args) {

        try {

            Manager m = new Manager("Rahul", 60000);
            Developer d = new Developer("Anita", 50000);

            System.out.println("Manager Details:");
            m.display();

            System.out.println("\nDeveloper Details:");
            d.display();

        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
