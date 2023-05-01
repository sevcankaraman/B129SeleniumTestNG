package techproed.tests.tasks;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;


public class Task01 {
    /*
    https://www.bluerentalcars.com/ sitesine gidiniz
    Kullanımda olmayan Kullanıcı adı ve şifre ile giriş yapmaya çalışınız

    Description:
    Kullanimda olmayan kullanıcı adi ve şifre ile giriş yapılamamalı

    Acceptance Criteria:
    Kullanici, dogru email ve yanlis sifre girildiginde, hata mesajini almalı

    Hata Mesaji:
    Bad credentials

    Test Data:
    Customer email: jack@gmail.com
    Customer password: fakepass
     */

    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("blueRentACarUrl"));
        BlueRentalPage blueRentalPage = new BlueRentalPage();
        blueRentalPage.login.click();
        blueRentalPage.email.sendKeys(ConfigReader.getProperty("email"), Keys.TAB,ConfigReader.getProperty("fakepass"),Keys.ENTER);
        ReusableMethods.bekle(2);
        String actualMessage = blueRentalPage.hataMesaji.getText();
        ReusableMethods.bekle(2);
        String expectedMessage = ConfigReader.getProperty("hataMesaji");
        ReusableMethods.bekle(2);

        Assert.assertEquals(expectedMessage, actualMessage);
        Driver.closeDriver();


    }
}