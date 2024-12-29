package page;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AfterAutorizePage extends BasePage {
    public AfterAutorizePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"tbodyid\"]/div[3]/div/a/img")
    private WebElement nexusTitle;

    public NexusPage clickOnNexus() {
        getWait2().until(ExpectedConditions.visibilityOf(nexusTitle)).click();
        return new NexusPage(getDriver());
    }
}
