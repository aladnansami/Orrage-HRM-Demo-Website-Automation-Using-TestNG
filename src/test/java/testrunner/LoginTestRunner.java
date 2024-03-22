import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import setup.Setup;

public class LoginTestRunner extends Setup {

    @Test
    public void doLogin(){
        LoginPage loginpage = new LoginPage(driver);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        loginpage.doLogin("Admin","admin123");


        WebElement headerText = driver.findElement(By.tagName("h6"));
        String header_actual = headerText.getText();
        String header_expected =  "Dashboard";
        Assert.assertEquals(header_actual,header_expected);
        WebElement profileImageElement = driver.findElement(By.className("oxd-userdropdown-img"));
        Assert.assertTrue(profileImageElement.isDisplayed());
    }

    @Test
    public void searchEmplyInformation() throws InterruptedException {
        DashboardPage dashboard = new DashboardPage(driver);
        Thread.sleep(3000);
        dashboard.menus.get(1).click();
        Thread.sleep(3000);
      String isUserFound = driver.findElements(By.className("oxd-text--span")).get(11).getText();
      Assert.assertTrue(isUserFound.contains("Records Found"));

    }
}
