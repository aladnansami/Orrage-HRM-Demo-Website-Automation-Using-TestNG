import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.PublicKey;

public class Loginpage {
    @FindBy (name = "username")
    WebElement txtUsername;

    @FindBy (name = "password")
    WebElement txtPassword ;

    @FindBy (css = "[type=submit]")
    WebElement btnSubmit;
    public Loginpage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void doLogin (String username, String password)
    {
        txtUsername.sendKeys("username");
        txtPassword.sendKeys("password");
        btnSubmit.click();
    }
}
