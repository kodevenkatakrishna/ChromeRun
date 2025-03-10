package StepsDefination;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

import WebDriver.Driver1;

import java.io.IOException;

public class StepsFile extends Driver1{
    

    @Given("Open Chrome")
    public void open_chrome() throws IOException {
        driver = Driver1.Browser("https://www.google.com/");
    }


}
