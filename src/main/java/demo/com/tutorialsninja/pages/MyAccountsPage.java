package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class MyAccountsPage extends Utility {

By myAccountLink = By.xpath("//span[contains(text(),'My Account')]");
By register = By.linkText("Register");
By registerAccount = By.xpath("//h1[text()='Register Account']");
By loginLink = By.linkText("Login");
By returningCustomerTxt = By.xpath("//h2[text()='Returning Customer']");
By firstName = By.xpath("//input[@id='input-firstname']");
By lastName = By.xpath("//input[@id='input-lastname']");
By eEmail = By.xpath("//input[@id='input-email']");
By telephone = By.xpath("//input[@id='input-telephone']");
By password = By.xpath("//input[@id='input-password']");
By confirm = By.xpath("//input[@id='input-confirm']");
By agreeTerms = By.xpath("//label[normalize-space()='Yes']");
By continueBtn = By.xpath("//input[@value='Continue']");
By createdAccount = By.xpath("//h1[text()='Your Account Has Been Created!']");
By continueLink = By.xpath("//a[contains(text(),'Continue')]");
By myAccount = By.xpath("//span[contains(text(),'My Account')]");
By mail = By.xpath("//input[@id='input-email']");
By passWord = By.xpath("//input[@id='input-password']");
By loGinBtn = By.xpath("//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]");
By accountLogoutTxt = By.xpath("//h1[contains(text(),'Account Logout')]");










    public void selectMyAccountOptions(String option)
    {
        String anyOption = option.toLowerCase();
        String expression = "//a[text()='" + anyOption + "']";
        driver.findElement(By.xpath(expression)).click();
    }
    public void clickOnMyAccount(){clickOnElement(myAccountLink);}
    public void clickOnRegister(){mouseHoverToElementAndClick(register);}
    public String getVerifyRegisterAccountxt(){return getTextFromElement(registerAccount);}
    public void clickOnLoginLink(){mouseHoverToElementAndClick(loginLink);}
public String getVerifyReturningCustomer(){return getTextFromElement(returningCustomerTxt);}
public void sendTxtToFirstName(){sendTextToElement(firstName,"Api");}
public void sendTxtLastName(){sendTextToElement(lastName,"Ruby");}
public void sendTxtToEmail(){sendTextToElement(eEmail,"abc@gmail.com");}
public void sendTxtToTelephone(){sendTextToElement(telephone,"01234567891");}
public void sendTxtToPassword(){sendTextToElement(password,"xyx123");}
public void sendTxtToconfirm(){sendTextToElement(confirm,"xyz123");}
public void clickOnAgreeTerms(){clickOnElement(agreeTerms);}
public void clickOnContinueBtn(){clickOnElement(continueBtn);}
public String getVerifyAccountCreate(){return getTextFromElement(registerAccount);}
public void clickOnContinueLink(){clickOnElement(continueLink);}
public void clickOnMyAccountLink(){clickOnElement(myAccount);}
public void sendmailtxt(){sendTextToElement(mail,"abc@gmail.com");}
    public void sendPassword(){sendTextToElement(passWord,"chintz1111");};
public void clickOnLoginBtn(){clickOnElement(loGinBtn);}
public String getVerifyLogoutTxt(){return getTextFromElement(accountLogoutTxt);}






}
