import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.WebDriverFactory;

public class TestNG_Selenium {
    WebDriver driver;
    @BeforeMethod


    public void setup(){

        driver= WebDriverFactory.getDriver("chrome");

        /*

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


         */

    }

    @AfterMethod

    public void tearDown(){
       WebDriver driver = new ChromeDriver();
        driver.quit();

    }

    @Test
    public void googleTitle(){


        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");



        String expectedTitle="Google";
        String actualTitle=driver.getTitle();

        //if it is fail it will show this message if it is passed it will not show this message
        Assert.assertEquals(actualTitle,expectedTitle,"Google title is not matching");




    }
}
