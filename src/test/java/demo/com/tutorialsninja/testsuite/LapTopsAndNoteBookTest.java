package demo.com.tutorialsninja.testsuite;

import demo.com.tutorialsninja.pages.HomePage;
import demo.com.tutorialsninja.pages.LapTopsAndNoteBooksPage;
import demo.com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LapTopsAndNoteBookTest extends BaseTest {
    LapTopsAndNoteBooksPage lapTopsAndNoteBooksPage = new LapTopsAndNoteBooksPage();
    HomePage homePage = new HomePage();

    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully(){
      lapTopsAndNoteBooksPage.clickOnCurrency();
      lapTopsAndNoteBooksPage.poundSterling();
      lapTopsAndNoteBooksPage.clickOnLaptopsAndNoteBooks();
//      lapTopsAndNoteBooksPage.productPriceInArrayList();
//        lapTopsAndNoteBooksPage.clickOnHighToLow();
    }
    @Test
    public void verifyThatUserPlaceOrderSuccessfully() throws InterruptedException {
        lapTopsAndNoteBooksPage.clickOnCurrency();
        lapTopsAndNoteBooksPage.poundSterling();
        lapTopsAndNoteBooksPage.clickOnLaptopsAndNoteBooks();
        Thread.sleep(1000);
        lapTopsAndNoteBooksPage.clickOnMacBook();
        String acMacBook ="MacBook";
        String exMacBook = lapTopsAndNoteBooksPage.getVerifyMacBook();
        Assert.assertEquals(acMacBook,exMacBook,"MacBook product not displayed");
        Thread.sleep(1000);
        lapTopsAndNoteBooksPage.clickOnAddToCart();
        lapTopsAndNoteBooksPage.getVerifyMessage();
        String acMessage = "Success: You have added MacBook to your shopping cart";
        String exMessage = lapTopsAndNoteBooksPage.getVerifyMessage();
        String[] exp = exMessage.split("!");
        Assert.assertEquals(exp[0],acMessage,"Success: You have added not displayed");
        Thread.sleep(1000);
       lapTopsAndNoteBooksPage.clickOnShoppingCartDisplayMsg();
       lapTopsAndNoteBooksPage.getVerifyShoppingCart();
//       String acShoppingCart = "Shopping Cart";
//       String exShoppingCart = lapTopsAndNoteBooksPage.getVerifyShoppingCart();
//        String[] exp1 = exShoppingCart.split("0.00kg");
//       Assert.assertEquals(exp1[0],acShoppingCart,"Shopping Cart not displayed");
//        Thread.sleep(1000);
       lapTopsAndNoteBooksPage.getVerifyProductMacBook();
       String acProductMacBook = "MacBook";
       String exProductMacBook = lapTopsAndNoteBooksPage.getVerifyProductMacBook();
       Assert.assertEquals(acProductMacBook,exProductMacBook,"MacBook is not displayed");
        Thread.sleep(1000);
        lapTopsAndNoteBooksPage.changeQuantity();
        lapTopsAndNoteBooksPage.updateTab();
        Thread.sleep(1000);
        lapTopsAndNoteBooksPage.getVerifySuccessModifiedMessage();
//        String acModifiedMsg = "Success: You have modified your shopping cart!";
//        String exModifiedMsg = lapTopsAndNoteBooksPage.getVerifySuccessModifiedMessage();
//        Assert.assertEquals(acModifiedMsg,exModifiedMsg,"Not displayed");
//        Thread.sleep(1000);
          lapTopsAndNoteBooksPage.getVerifyTotal();





    }

































}
