package page;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OrderPage extends BasePage {
    public OrderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='name']")
    private WebElement nameField;

    @FindBy(xpath = "//input[@id='country']")
    private WebElement countryField;

    @FindBy(xpath = "//input[@id='city']")
    private WebElement cityField;

    @FindBy(xpath = "//input[@id='card']")
    private WebElement creditCardField;

    @FindBy(xpath = "//input[@id='month']")
    private WebElement monthField;

    @FindBy(xpath = "//input[@id='year']")
    private WebElement yearField;

    @FindBy(xpath = "//button[contains(text(),'Purchase')]")
    private WebElement purchaseButton;

    public OrderPage fillNameField() {
        getWait2().until(ExpectedConditions.visibilityOf(nameField)).sendKeys("Alex");
        return this;
    }

    public OrderPage fillCountryField() {
        getWait2().until(ExpectedConditions.visibilityOf(nameField)).sendKeys("Indonesia");
        return this;
    }

    public OrderPage fillCityField() {
        getWait2().until(ExpectedConditions.visibilityOf(nameField)).sendKeys("Jakarta");
        return this;
    }

    public OrderPage fillCardField() {
        getWait2().until(ExpectedConditions.visibilityOf(nameField)).sendKeys("123456");
        return this;
    }

    public OrderPage fillMonthField() {
        getWait2().until(ExpectedConditions.visibilityOf(nameField)).sendKeys("06");
        return this;
    }

    public OrderPage fillYearField() {
        getWait2().until(ExpectedConditions.visibilityOf(nameField)).sendKeys("2023");
        return this;
    }

    public FinalOrderPage clickOnPurchaseButton() {
        getWait2().until(ExpectedConditions.visibilityOf(nameField)).click();
        return new FinalOrderPage(getDriver());
    }
}
