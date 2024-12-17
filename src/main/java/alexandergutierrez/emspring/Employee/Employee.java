package alexandergutierrez.emspring.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {

    private String name;
    private String email;
    private String address;
    private String jobTitle;
    private String department;
}
