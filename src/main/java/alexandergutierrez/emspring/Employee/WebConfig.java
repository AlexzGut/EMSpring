package alexandergutierrez.emspring.Employee;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.HiddenHttpMethodFilter;

@Configuration
public class WebConfig {

    // HiddenHttpMethodFilter allows simulation of HTTP methods
    // like PUT and DELETE using a hidden input field in an HTML form
    @Bean
    public HiddenHttpMethodFilter hiddenHttpMethodFilter() {
        return new HiddenHttpMethodFilter();
    }
}
