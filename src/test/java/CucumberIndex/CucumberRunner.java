package CucumberIndex;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\Features"},
		glue = {"Steps_definitations"},
		publish = true, monochrome = true, dryRun = false, 
		 plugin = {"pretty","timeline:target/cucumber-parallel-report",
			        "testng:target/testng-cucumber-reports/testngReport.xml",
			                "json:target/cucumberReport.json","junit:target/cucumber-reports/Cucumber.xml"
			        }
		
		)

public class CucumberRunner extends AbstractTestNGCucumberTests {

}
