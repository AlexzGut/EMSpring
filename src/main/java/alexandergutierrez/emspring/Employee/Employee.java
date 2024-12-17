package alexandergutierrez.emspring.Employee;

import lombok.Data;

@Data
public class Employee {

    private static int id_gen = 0;
    private int id;
    private String name;
    private String email;
    private String address;
    private String jobTitle;
    private String department;

    public Employee(String name, String email, String address, String jobTitle, String department) {
        this.id = ++id_gen;
        this.name = name;
        this.email = email;
        this.address = address;
        this.jobTitle = jobTitle;
        this.department = department;
    }
}
