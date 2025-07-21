package Model;

import java.util.List;

public record Employee(String name, int age, String department, List<String>skills) {}
