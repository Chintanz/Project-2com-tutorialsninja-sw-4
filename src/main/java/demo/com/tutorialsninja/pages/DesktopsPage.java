package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopsPage extends Utility {
    By deskTopsLink = By.linkText("Desktops");
    By desktopsTxt = By.xpath("//h2[contains(text(),'Desktops')]");
    By currencyPound = By.xpath("//span[contains(text(),'Currency')]");
    By poundSterling = By.xpath("//button[contains(text(),'£Pound Sterling')]");
//    By nameAtoZ = By.xpath("//select[@id='input-sort']/option[text()='Name (Z - A)']");
    By productHPLP3065 = By.xpath("//a[contains(text(),'HP LP3065')]");
    By textHPLP3065 = By.xpath("//h1[contains(text(),'HP LP3065')]");
    By deliverDate = By.xpath("//input[@id='input-option225']");
    By addToCart = By.xpath("//button[@id='button-cart']");
    By messageSuccess =By.xpath("//div[text()='Success: You have added ']");
    By shoppingCartDisplay = By.xpath("//a[contains(text(),'shopping cart')]");
    By shoppingCartText = By.xpath("//h1[contains(text(),'Shopping Cart')]");
    By verifyHPLP3065 = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]]");
    By verifyDate = By.xpath("//small[contains(text(),'Delivery Date:2022-11-30')]");
    By verifyModel21 = By.xpath("//td[contains(text(),'Product 21')]");
    By verifyTotal = By.xpath("//td[text()='£74.73']");
        public void selectMenu(String menu) {
        List<WebElement> topMenuList = getListOfElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = getListOfElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        }
    }
    public void clickOnDeskTops(){ mouseHoverToElementAndClick(deskTopsLink); }
    public String getDesktopsVerify(){ return getTextFromElement(desktopsTxt); }
    public void productNameIntArrayList() {
        // Get all the products name and stored into array list
        List<WebElement> products = driver.findElements(By.xpath("//h4/a"));
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        System.out.println(originalProductsName);
        // Sort By Reverse order
        Collections.reverse(originalProductsName);
        System.out.println(originalProductsName);
        //1.3 Select Sort By position "Name: Z to A"
        selectByVisibleTextFromDropDown(By.id("input-sort"), "Name (Z - A)");
        // After filter Z -A Get all the products name and stored into array list
        products = driver.findElements(By.xpath("//h4/a"));
        ArrayList<String> afterSortByZToAProductsName = new ArrayList<>();
        for (WebElement e : products) {
            afterSortByZToAProductsName.add(e.getText());
        }
        System.out.println(afterSortByZToAProductsName);
        //1.4 Verify the Product will arrange in Descending order.
        Assert.assertEquals("Product not sorted into Z to A order",
                originalProductsName, String.valueOf(afterSortByZToAProductsName));
    }
    public void clickOnCurrency(){clickOnElement(currencyPound);}
    public void poundSterling(){mouseHoverToElementAndClick(poundSterling);}
//    public void clickOnNameAtoZ(){selectByVisibleTextFromDropDown(nameAtoZ,"Name (A - Z)");}
    public void clickOnHPLP3065(){clickOnElement(productHPLP3065);}
    public String getVerifyHPLP3065(){return getTextFromElement(textHPLP3065);}
    public void deliveryDate(){String year = "2023";
        String month = "November";
        String date = "30";
        clickOnElement(By.xpath("//div[@class = 'input-group date']//button"));
        while (true) {
            String monthAndYear = driver.findElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']")).getText();
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']"));
            }
        }
        List<WebElement> allDates = driver.findElements(By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']"));
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(date)) {
                e.click();
                break;
            }
        }
       }
       public void clickOnAddToCart(){clickOnElement(addToCart);}
       public String getVerifyMessageSuccess(){return getTextFromElement(messageSuccess);}
       public void clickOnShoppingCart(){clickOnElement(shoppingCartDisplay);}
    public String getVerifyShoppingCart(){return getTextFromElement(shoppingCartText);}
 public String getVerifyProductHPLP(){return getTextFromElement(verifyHPLP3065);}
    public String getVerifyDate(){return getTextFromElement(verifyDate);}
    public String getVerifyModel(){return getTextFromElement(verifyModel21);}
    public String getVerifyTotal(){return getTextFromElement(verifyTotal);}


















}













