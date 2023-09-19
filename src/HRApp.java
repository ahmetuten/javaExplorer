public class HRApp {
    public static void main(String[] args) {
        System.out.println("HRApp started.");

        Department dep = new Department();

        dep.toString();

        Employee emp1 = new Employee(1, "Ahmet", 2600.54);
        Employee emp2 = new Employee(2, "Muhsin", 2300.40);
        Employee emp3 = new Employee(3, "Kerem", 1359.13);
        Employee emp4 = new Employee(4, "Joe", 986.21);
        Employee emp5 = new Employee(5, "Mama", 8602.12);

        dep.addEmployee(emp1);
        dep.addEmployee(emp2);
        dep.addEmployee(emp3);
        dep.addEmployee(emp4);
        dep.addEmployee(emp5);

        Employee empFound = dep.identifyEmployeeByID(3);

        for (Employee item: dep.Employees) {
            System.out.println("item.toString() = " + item.toString());
        }

        System.out.println("Total salary of department: " + dep.totalSalary());
        System.out.println("Average salary of department: " + dep.averageSalary());

    }
}