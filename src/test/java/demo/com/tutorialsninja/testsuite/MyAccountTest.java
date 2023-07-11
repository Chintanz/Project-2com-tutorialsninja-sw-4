package demo.com.tutorialsninja.testsuite;

import demo.com.tutorialsninja.pages.HomePage;
import demo.com.tutorialsninja.pages.MyAccountsPage;
import demo.com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAccountTest extends BaseTest {
    HomePage homePage = new HomePage();
    MyAccountsPage myAccountsPage =new MyAccountsPage();

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() throws InterruptedException {
myAccountsPage.clickOnMyAccount();
myAccountsPage.clickOnRegister();
myAccountsPage.getVerifyRegisterAccountxt();
Thread.sleep(1000);
String acRegisterAccount = "Register Account";
String exRegisterAccount = myAccountsPage.getVerifyRegisterAccountxt();
Assert.assertEquals(acRegisterAccount,exRegisterAccount,"Register Account");
Thread.sleep(1000);
 }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() throws InterruptedException {
        myAccountsPage.clickOnMyAccount();
        myAccountsPage.clickOnLoginLink();
        myAccountsPage.getVerifyReturningCustomer();
        Thread.sleep(1000);
        String acReturning = "Returning Customer";
        String exReturning = myAccountsPage.getVerifyReturningCustomer();
        Assert.assertEquals(acReturning,exReturning,"Returning Customer");
        Thread.sleep(1000);
    }
    @Test
    public void verifyThatUserRegisterAccountSuccessfully() throws InterruptedException {
        myAccountsPage.clickOnMyAccount();
        myAccountsPage.clickOnRegister();
        myAccountsPage.sendTxtToFirstName();
        Thread.sleep(1000);
        myAccountsPage.sendTxtLastName();
        myAccountsPage.sendTxtToEmail();
        myAccountsPage.sendTxtToTelephone();
        Thread.sleep(1000);
        myAccountsPage.sendTxtToPassword();
        myAccountsPage.sendTxtToconfirm();
       myAccountsPage.clickOnAgreeTerms();
        Thread.sleep(1000);
       myAccountsPage.clickOnContinueBtn();
myAccountsPage.getVerifyAccountCreate();
        String acAccountCreate = "Your Account Has Been Created";
        String exAccountCreate = myAccountsPage.getVerifyAccountCreate();
        Assert.assertEquals(acAccountCreate,exAccountCreate,"Your Account Has Been Created");
        Thread.sleep(1000);
        myAccountsPage.clickOnContinueLink();
        myAccountsPage.clickOnMyAccountLink();
       myAccountsPage.selectMyAccountOptions("Logout");
  }
    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully(){
        myAccountsPage.clickOnMyAccount();
        myAccountsPage.clickOnLoginLink();
        myAccountsPage.sendmailtxt();
        myAccountsPage.sendPassword();
        myAccountsPage.clickOnLoginBtn();
        myAccountsPage.selectMyAccountOptions("Logout");
        myAccountsPage.getVerifyLogoutTxt();
        String acLogout = "Account Logout";
        String exLogout = myAccountsPage.getVerifyLogoutTxt();
        Assert.assertEquals(acLogout,exLogout);



    }
























}
