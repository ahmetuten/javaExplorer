import java.util.ArrayList;

public class Department {

    ArrayList<Employee> Employees = new ArrayList<Employee>();

    public void addEmployee(Employee employee) {
        if(Employees.size() <=10){
            Employees.add(employee);
            System.out.println("Employee added.");
        }else {
            System.out.println("Employee limit exceeded.");
        }
    }

    public void printEmployees() {
        for (Employee item: Employees){
            if(item != null){
                System.out.println(item);
            }
        }
    }

    public int numberOfEmployees() {
        return Employees.size();
    }

    public Employee identifyEmployeeByID(int id) {
        for (Employee item: Employees) {
            if (item != null && item.getId() == id) {
                System.out.println(item);
            return item;
            }
        }
        return null;
    }

    public double totalSalary() {
        double sum = 0;
        for (Employee item: Employees){
            sum+= item.getSalary();
        }
        return sum;
    }

    public double averageSalary() {
        return totalSalary() / Employees.size();
    }

    @Override
    public String toString() {
        String name = "Education Department";
        return "Department : " + name + '\'';
    }
}
