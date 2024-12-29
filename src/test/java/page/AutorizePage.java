package page;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AutorizePage extends BasePage {
    public AutorizePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='loginusername']")
    private WebElement userNameField;

    @FindBy(xpath = "//input[@id='loginpassword']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@onclick='logIn()']")
    private WebElement logInButton;

    public AutorizePage fillNameField() {
        getWait2().until(ExpectedConditions.visibilityOf(userNameField)).sendKeys("1Alex1");
        return this;
    }

    public AutorizePage fillPassField() {
        getWait2().until(ExpectedConditions.visibilityOf(passwordField)).sendKeys("p@ssw0rd1");
        return this;
    }

    public AfterAutorizePage clickOnLoginButton() {
        getWait2().until(ExpectedConditions.visibilityOf(logInButton)).click();
        return new AfterAutorizePage(getDriver());
    }
}
