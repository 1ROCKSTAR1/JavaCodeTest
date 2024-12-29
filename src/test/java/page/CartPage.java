package page;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"tbodyid\"]/tr/td[3]")
    private WebElement priceTitle;

    @FindBy(xpath = "//*[@id=\"tbodyid\"]/tr/td[3]")
    private WebElement placeOrderButton;

    public CartPage checkoutTitleCheck() {
        getWait2().until(ExpectedConditions.visibilityOf(priceTitle)).getText();
        Assert.assertEquals(priceTitle,"$650");
        return this;
    }

    public OrderPage clickOnPlaceOrderButton() {
        getWait2().until(ExpectedConditions.visibilityOf(placeOrderButton)).click();
        return new OrderPage(getDriver());
    }
}
