package demo.com.tutorialsninja.testsuite;

import demo.com.tutorialsninja.pages.DesktopsPage;
import demo.com.tutorialsninja.pages.HomePage;
import demo.com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DesktopsTest extends BaseTest {
    DesktopsPage desktopsPage = new DesktopsPage();
    HomePage homePage = new HomePage();

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        homePage.clickOnDeskTops();
        homePage.selectMenu("Show AllDesktops");
        desktopsPage.productNameIntArrayList();
    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
      desktopsPage.clickOnCurrency();
      desktopsPage.poundSterling();
      homePage.clickOnDeskTops();
      Thread.sleep(1000);
      homePage.selectMenu("Show AllDesktops");
//      desktopsPage.clickOnNameAtoZ();
      desktopsPage.clickOnHPLP3065();
      Thread.sleep(1000);
      String acHPLP3065 = "HP LP3065";
      String exHPLP3065 = desktopsPage.getVerifyHPLP3065();
      Assert.assertEquals(acHPLP3065,exHPLP3065,"HPLP3065 is not displayed");
        Thread.sleep(1000);
        desktopsPage.deliveryDate();
        desktopsPage.clickOnAddToCart();
        desktopsPage.getVerifyMessageSuccess();
        String acSuccessMessage = "Success: You have added HP LP3065 to your shopping cart";
        String exSuccessMessage = desktopsPage.getVerifyMessageSuccess();
        String[] exp = exSuccessMessage.split("!");
        Assert.assertEquals(acSuccessMessage,exp[0],"Success: You have added HP LP3065 to your shopping cart not displayed");
        Thread.sleep(1000);
        desktopsPage.clickOnShoppingCart();
//        desktopsPage.getVerifyShoppingCart();
//      String actMessage = "Shopping Cart";
//      String expMessage = desktopsPage.getVerifyShoppingCart();
//      String[] exp1 = expMessage.split("(1.00kg)");
//      Assert.assertEquals("Error Message is not Displayed", exp[0], actMessage);
//        Thread.sleep(1000);
        desktopsPage.getVerifyProductHPLP();
        String exHPLP = "HP LP3065";
        String acHPLP = desktopsPage.getVerifyHPLP3065();
        Assert.assertEquals(acHPLP,exHPLP,"No error message displayed");

        Thread.sleep(1000);
        desktopsPage.getVerifyDate();
        String exDate = "2022-11-30";
        String acDate = desktopsPage.getVerifyDate();
        Assert.assertEquals(acDate,exDate,"No error message displayed");

        Thread.sleep(1000);
        desktopsPage.getVerifyModel();
        String exModel = "Product21";
        String acModel = desktopsPage.getVerifyModel();
        Assert.assertEquals(acModel,exModel,"No error message displayed");

        Thread.sleep(1000);
        desktopsPage.getVerifyTotal();
        String exTotal = "£74.73";
        String acTotal = desktopsPage.getVerifyTotal();
        Assert.assertEquals(acTotal,exTotal,"No error message displayed");
    }

}
