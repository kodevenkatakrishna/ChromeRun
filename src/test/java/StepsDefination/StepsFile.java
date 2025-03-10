package StepsDefination;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class StepsFile {
    WebDriver driver;

    @Given("Open Chrome")
    public void open_chrome() throws IOException {
        driver.get("https://www.google.com/");
    }


}
