import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    private String homePageUrl = "http://book.theautomatedtester.co.uk/";

    @FindBy (xpath = "//a[@href='/chapter1']")
    private WebElement chapter1Link;

    HomePage(WebDriver driver){
        super(driver);
    }

    public void goToHomePage(){
        driver.get(homePageUrl);
    }

    public void goToChapter1(){
        if (chapter1Link.isEnabled())
            chapter1Link.click();
    }

}
