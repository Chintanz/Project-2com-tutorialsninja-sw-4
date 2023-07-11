package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {

    By deskTopsLink = By.linkText("Desktops");
    By desktopsTxt = By.xpath("//h2[contains(text(),'Desktops')]");
    By laptopsAndNotebookLink = By.linkText("Laptops & Notebooks");
    By laptopAndNotebooksTxt = By.xpath("//h2[contains(text(),'Laptops & Notebooks')]");
    By components = By.linkText("Components");
    By componentsTxt = By.xpath("//h2[contains(text(),'Components')]");






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

    public void clickOnDeskTops(){mouseHoverToElementAndClick(deskTopsLink);}
    public String getDesktopsVerify(){return getTextFromElement(desktopsTxt);}
    public void clickOnLaptopsAndNoteBooks(){mouseHoverToElementAndClick(laptopsAndNotebookLink);}
    public String getVerifyLaptopsAndNoteBooks(){return getTextFromElement(laptopAndNotebooksTxt);}
    public void clickOnComponents(){mouseHoverToElementAndClick(components);}
    public String getVerifyComponentsTxt(){return getTextFromElement(componentsTxt);}





}




























