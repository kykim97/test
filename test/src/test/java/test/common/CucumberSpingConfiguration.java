package test.common;


import test.TestApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { TestApplication.class })
public class CucumberSpingConfiguration {
    
}
