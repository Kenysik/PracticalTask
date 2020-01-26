import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstTest {

    private WebDriver driver;

    @BeforeClass
    public  void init(){
        ChromeOptions options = new ChromeOptions();
        options.setCapability("start-maximized", "true");
        driver = new ChromeDriver(options);
    }

    @AfterClass
    public void shutDown(){
        driver.quit();
    }

    @Test
    public void mainTest(){
        HomePage homePage = new HomePage(driver);
        homePage.goToHomePage();
        homePage.goToChapter1();

        Chapter1Page chapter1Page = new Chapter1Page(driver);
        Assert.assertEquals(chapter1Page.getTextForAssertion(), "Assert that this text is on the page", "The text isn't correct");

        chapter1Page.goToHomePage();
        Assert.assertEquals(homePage.getCurrentUrl(), "http://book.theautomatedtester.co.uk/", "Home page was't opened");
    }
}
