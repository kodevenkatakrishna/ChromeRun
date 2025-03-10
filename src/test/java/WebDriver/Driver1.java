package WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver1 {
    public static WebDriver driver;
    public static Properties Prop;
    public static FileInputStream PropFIle;

    public static Properties FileReader() throws IOException {
        PropFIle = new FileInputStream("TestData.properties");
        Prop = new Properties();
        Prop.load(PropFIle);
        return Prop;
    }
    public static WebDriver Browser(String URL) throws IOException {
        FileReader();
        if(Prop.getProperty("Browser").equals("Chrome")){
            driver = new ChromeDriver();
            driver.get(URL);
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            driver.manage().window().maximize();
        } else if (Prop.getProperty("Browser").equals("Edge")) {
            driver = new EdgeDriver();
            driver.get(URL);
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            driver.manage().window().maximize();
        } else {
            System.out.println("No Drivers Found");
        }
        return driver;
    }

    public static void Time(By E) {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(E));
    }


}
