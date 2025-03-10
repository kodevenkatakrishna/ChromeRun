package RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"Features/ChromeLaunch.feature"},
glue = {"StepsDefination"},
plugin = {"pretty",
		"json:target/cucumber.json",
		"html:target/cucumber-report.html"},monochrome=true)
public class RunnerClassTest {

}
