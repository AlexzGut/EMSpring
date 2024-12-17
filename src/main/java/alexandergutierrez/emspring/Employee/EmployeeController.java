package alexandergutierrez.emspring.Employee;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
@Slf4j
@RequestMapping("/employees")
public class EmployeeController {

    @ModelAttribute("employees")
    public List<Employee> getEmployees() {
        return Arrays.asList(
                new Employee("John Doe", "john.doe@example.com", "123 Main St, Toronto", "Software Developer", "IT"),
                new Employee("Jane Smith", "jane.smith@example.com", "456 Queen St, Vancouver", "HR Manager", "Human Resources"),
                new Employee("Robert Brown", "robert.brown@example.com", "789 King St, Montreal", "Project Manager", "Operations"),
                new Employee("Emily Davis", "emily.davis@example.com", "101 Prince St, Calgary", "QA Analyst", "Quality Assurance"),
                new Employee("Michael Johnson", "michael.johnson@example.com", "555 York St, Ottawa", "DevOps Engineer", "IT")
        );
    }

    @GetMapping
    public String employeeList(Model model) {
        return "employee-list";
    }

    @GetMapping("{id}/details")
    public String employeeDetail(@PathVariable int id, Model model) {
        model.addAttribute("employeeId", id);
        return "employee-detail";
    }

    @DeleteMapping("{id}/delete")
    public String employeeDelete(@PathVariable int id, Model model) {
        model.addAttribute("employeeId", id);
        return "redirect:/employees";
    }
}
