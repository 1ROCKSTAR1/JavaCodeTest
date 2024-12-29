package page;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FinalOrderPage extends BasePage {
    public FinalOrderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/div[10]/p/text()[2]")
    private WebElement amountField;

    public String getActualFinalPrice() {
        return getWait2().until(ExpectedConditions.visibilityOf(amountField)).getText();

    }
}
