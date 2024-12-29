package test;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.MainPage;

public class Tests extends BaseTest {

    @Test
    public void buyThePhone() {

        String getFinalOrderPrice = new MainPage(getDriver())
                .clickOnLoginButton()
                .fillNameField()
                .fillPassField()
                .clickOnLoginButton()
                .clickOnNexus()
                .clickOnAddToCartButton()
                .handleAlert()
                .clickOnCartButton()
                .checkoutTitleCheck()
                .clickOnPlaceOrderButton()
                .fillNameField()
                .fillCountryField()
                .fillCityField()
                .fillCardField()
                .fillMonthField()
                .fillYearField()
                .clickOnPurchaseButton()
                .getActualFinalPrice();

        Assert.assertEquals(getFinalOrderPrice,"Amount: 650 USD");
    }
}
