package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LapTopsAndNoteBooksPage extends Utility {
    By currencyPound = By.xpath("//span[contains(text(),'Currency')]");
    By poundSterling = By.xpath("//button[contains(text(),'£Pound Sterling')]");
    By laptopsAndNotebookLink = By.linkText("Laptops & Notebooks");
    By laptopAndNotebooksTxt = By.xpath("//h2[contains(text(),'Laptops & Notebooks')]");
    By highLow = By.xpath("//select[@id='input-sort']/option[text()='Price (High > Low)']");
    By macBook = By.linkText("MacBook");
    By textMacBook = By.xpath("//h1[contains(text(),'MacBook')]");
    By addToCart = By.xpath("//button[@id='button-cart']");
    By successMessage = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By shoppingCartDisplay = By.xpath("//a[normalize-space()='shopping cart']");
    By textShoppingCart = By.xpath("//h1[contains(text(),'Shopping Cart')]");
    By productMacBook = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");
    By clearQuantity = By.xpath("//input[@value='1']");
    By addQuantity = By.xpath("//input[@value='1']");
    By quantityChange = By.xpath("//tbody/tr[1]/td[4]/div[1]/input[1]");
    By updateTab = By.xpath("//button[contains(@data-original-title, 'Update')]");
    By modifiedMessage = By.xpath("//div[contains(@class,'alert alert-success alert-dismissible')]/i");
    By verifyTotal = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



    public void clickOnCurrency(){clickOnElement(currencyPound);}
    public void poundSterling(){mouseHoverToElementAndClick(poundSterling);}
    public void clickOnLaptopsAndNoteBooks(){mouseHoverToElementAndClick(laptopsAndNotebookLink);}
    public String getVerifyLaptopsAndNoteBooks(){return getTextFromElement(laptopAndNotebooksTxt);}
public void productPriceInArrayList(){
    List<WebElement> products = driver.findElements(By.xpath("//p[@class ='price']"));
    List<Double> originalProductsPrice = new ArrayList<>();
    for (WebElement e : products) {
        System.out.println(e.getText());
        String[] arr = e.getText().split("Ex Tax:");
        originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",","")));
    }
    System.out.println(originalProductsPrice);
    // Sort By Reverse order
    Collections.sort(originalProductsPrice, Collections.reverseOrder());
    System.out.println(originalProductsPrice);
}
public void clickOnHighToLow(){selectByVisibleTextFromDropDown(highLow,"Price (High > Low)");}
public void clickOnMacBook(){clickOnElement(macBook);}
public String getVerifyMacBook(){return getTextFromElement(textMacBook);}
public void clickOnAddToCart(){clickOnElement(addToCart);}
public String getVerifyMessage(){return getTextFromElement(successMessage);}
public void clickOnShoppingCartDisplayMsg(){clickOnElement(shoppingCartDisplay);}
public String getVerifyShoppingCart(){return getTextFromElement(textShoppingCart);}
public String getVerifyProductMacBook(){return getTextFromElement(productMacBook);}
public void changeQuantity(){driver.findElement(clearQuantity).clear();
        sendTextToElement(addQuantity,"2");}
public  void updateTab(){clickOnElement(updateTab);}
public String getVerifySuccessModifiedMessage(){return getTextFromElement(modifiedMessage);}
public String getVerifyTotal(){return getTextFromElement(verifyTotal);}


















}
