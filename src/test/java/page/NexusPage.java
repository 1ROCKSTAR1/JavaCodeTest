package page;

import base.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class NexusPage extends BasePage {

    public NexusPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@onclick='addToCart(3)']")
    private WebElement addToCartButton;

    @FindBy(xpath = "//a[contains(text(),'Cart')]")
    private WebElement cartButton;

    public NexusPage clickOnAddToCartButton() {
        getWait2().until(ExpectedConditions.visibilityOf(addToCartButton)).click();
        return this;
    }

    public NexusPage handleAlert() {
        Alert alert = getDriver().switchTo().alert();
        alert.accept();
        return this;
    }

    public CartPage clickOnCartButton() {
        getWait2().until(ExpectedConditions.visibilityOf(cartButton)).click();
        return new CartPage(getDriver());
    }
}
