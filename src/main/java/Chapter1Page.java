import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Chapter1Page extends BasePage{

    @FindBy (id = "divontheleft")
    private WebElement textToBeAsserted;

    @FindBy (xpath = "//a[text() = 'Home Page']")
    private WebElement homePageLink;

    Chapter1Page(WebDriver driver){
        super(driver);
    }

    public String getTextForAssertion(){
        if (textToBeAsserted.isDisplayed())
            return textToBeAsserted.getText();
        return "";
    }

    public void goToHomePage(){
        if (homePageLink.isEnabled())
            homePageLink.click();
    }
}
