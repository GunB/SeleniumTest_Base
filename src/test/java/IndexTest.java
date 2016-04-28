
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IndexTest {

    @Test
    public void main() {
        // declaration and instantiation of objects/variables
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "http://localhost:8383/Secure/index.html";
        String expectedTitle = "Welcome: Mercury ToursA";
        String actualTitle = "";

        // launch Firefox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page witht the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }

        Assert.assertTrue(actualTitle.contentEquals(expectedTitle));

        //close Firefox
        driver.close();

        // exit the program explicitly
        driver.quit();
    }

    @Test
    public void hello() {
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "http://localhost:8383/Secure/index.html";
        // launch Firefox and direct it to the Base URL
        driver.get(baseUrl);
        
        WebElement acceptAnswerLink = driver.findElement(By.id("hlogo"));
        acceptAnswerLink.click();
        driver.quit();
    }//*/
}
