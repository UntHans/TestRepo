import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {

    @Test
    public void startWebDriver(){

        WebDriver driver = new FirefoxDriver();

        driver.navigate().to("http://yumi/MasterMaths.Website.QA/");
        Assert.assertTrue("Title should start with Master Maths - Log in",
                            driver.getTitle().startsWith("Master Maths - Log in"));

        driver.close();
        driver.quit();

}



        }

