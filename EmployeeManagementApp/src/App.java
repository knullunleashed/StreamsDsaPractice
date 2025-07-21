import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import Model.Employee;

public class App {

    /*
     * 
     * find the youngest employee in each department 
     * whose skills include both "Java" and "SQL"
     * 
     */

    public static boolean hasBothJavaAndSql(List<String>skills){
        Set<String>normalized = skills.stream()
            .map(s -> s.trim().toLowerCase())
            .collect(Collectors.toSet());
        
        return normalized.contains("java") && normalized.contains("sql");
    }

    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee("Amit Sharma", 26, "Engineering", List.of("Java", "SQL", "Spring")),
            new Employee("Neha Verma", 32, "Engineering", List.of("Java", "Python", "AWS")),
            new Employee("Rohan Gupta", 24, "Engineering", List.of("SQL", "Java", "Docker")),
            new Employee("Sara Khan", 29, "HR", List.of("Communication", "Recruitment", "SQL")),
            new Employee("Ishaan Mehta", 35, "HR", List.of("SQL", "Java", "Excel")),
            new Employee("Priya Desai", 23, "HR", List.of("Java ", " SQL")),
            new Employee("Rahul Nair", 27, "Finance", List.of("Excel", "SQL", "Java")),
            new Employee("Sneha Iyer", 30, "Finance", List.of("SQL", "Power BI")),
            new Employee("Dev Patel", 28, "Finance", List.of("Java", "SQL", "Python")),
            new Employee("Aarav Joshi", 22, "Engineering", List.of("java", "sql"))
        );

        System.out.println();

        Map<String,Optional<Employee>> youngestPerDept = employees.stream()
                .filter(e -> hasBothJavaAndSql(e.skills()))
                .collect(Collectors.groupingBy(Employee::department, Collectors.minBy(Comparator.comparingInt(Employee::age))));

        youngestPerDept.forEach((dept, empOpt) -> {
            System.out.println(dept + " -> " + empOpt.map(Employee::name).orElse(null));
        });
    }
}
