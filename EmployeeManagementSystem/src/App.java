import java.util.List;

public class App {

    public static void getAllEmployees(List<Employee> employees) {
        employees.stream()
            .map(Employee::getName)
            .forEach((e) -> {
            System.out.println(e);
        });
    }

    public static void getAllDepartmentNames(List<Employee> employees) {
        employees.stream()
            .map(Employee::getDepartment)
            .distinct()
            .forEach((e) -> {
            System.out.println(e);
        });
    }

    public static void main(String[] args) throws Exception {
        List<Employee> employees = List.of(
            new Employee(1, "Alice", "HR", 55000),
            new Employee(2, "Bob", "IT", 70000),
            new Employee(3, "Charlie", "Finance", 65000),
            new Employee(4, "David", "HR", 60000),
            new Employee(5, "Eva", "Marketing", 58000),
            new Employee(6, "Frank", "IT", 72000),
            new Employee(7, "Grace", "Finance", 67000),
            new Employee(8, "Hannah", "HR", 53000),
            new Employee(9, "Ian", "Marketing", 61000),
            new Employee(10, "Jack", "IT", 75000)
        );

        //Get names of all employees
        System.out.println("\n List of all employee names : \n");
        getAllEmployees(employees);

        //Get all department names
        System.out.println("\n List of all department names : \n");
        getAllDepartmentNames(employees);
        
    }
}
