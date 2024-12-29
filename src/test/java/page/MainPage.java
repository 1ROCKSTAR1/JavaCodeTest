package page;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage {
    
    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@id='login2']")
    private WebElement logInButton;

    public AutorizePage clickOnLoginButton() {
        getWait2().until(ExpectedConditions.visibilityOf(logInButton)).click();
        return new AutorizePage(getDriver());
    }
}
