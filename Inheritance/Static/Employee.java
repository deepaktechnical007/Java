package Static;

public class Employee {

    int empId;
    String name;
    static String company = "smart programing";

    Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    void display() {
        System.out.println(empId + " " + name + " " + company);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Deepak");
        e1.display();
        Employee e2 = new Employee(102, "Babu");
        e2.display();
    }
}
