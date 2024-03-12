import org.testng.annotations.Test;

public class LoginTestRunner extends Setup{

    @Test
    public void doLogin(){
        Loginpage loginpage = new Loginpage(driver);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        loginpage.doLogin("Admin","admin123");
    }
}
