package demo.com.tutorialsninja.testsuite;

import demo.com.tutorialsninja.pages.DesktopsPage;
import demo.com.tutorialsninja.pages.HomePage;
import demo.com.tutorialsninja.pages.LapTopsAndNoteBooksPage;
import demo.com.tutorialsninja.pages.MyAccountsPage;
import demo.com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
    HomePage homePage = new HomePage();
    DesktopsPage desktopsPage = new DesktopsPage();
    LapTopsAndNoteBooksPage lapTopsAndNoteBooksPage = new LapTopsAndNoteBooksPage();
    MyAccountsPage myAccountsPage =new MyAccountsPage();


    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() throws InterruptedException {
        homePage.clickOnDeskTops();
        homePage.selectMenu("Show AllDesktops");
        Thread.sleep(1000);
        desktopsPage.getDesktopsVerify();
        String acDesktops = "Desktops";
        String exDesktops = desktopsPage.getDesktopsVerify();
        Assert.assertEquals(acDesktops, exDesktops, "Desktops is not displayed");
    }
    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() throws InterruptedException {
        lapTopsAndNoteBooksPage.clickOnLaptopsAndNoteBooks();
        homePage.selectMenu("Show AllLaptops & Notebooks");
        Thread.sleep(1000);
        lapTopsAndNoteBooksPage.getVerifyLaptopsAndNoteBooks();
        String acLaptopsNotebooks = "Laptops & Notebooks";
        String exLaptopsNotebooks = lapTopsAndNoteBooksPage.getVerifyLaptopsAndNoteBooks();
        Assert.assertEquals(acLaptopsNotebooks, exLaptopsNotebooks, "Laptops & Notebooks not displayed");
    }
    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully(){
      homePage.clickOnComponents();
      homePage.selectMenu("Components");
      homePage.getVerifyComponentsTxt();
      String acComponents = "Components";
      String exComponents = homePage.getVerifyComponentsTxt();
      Assert.assertEquals(acComponents,exComponents,"Components are not displayed");
    }

}
