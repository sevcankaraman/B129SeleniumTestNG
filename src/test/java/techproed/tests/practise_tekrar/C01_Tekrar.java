package techproed.tests.practise_tekrar;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.FacePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class C01_Tekrar {
    @Test
    public void testName() {

        // facebook anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("facebook_url"));

        // kullanıcı email kutusuna rastgele bir isim yazın,
        FacePage facePage=new FacePage();
        facePage.emailkutu.sendKeys("Sevcan");

        // kullanıcı sifre kutusuna rastgele bir password yazın
        facePage.passwordkutu.sendKeys("123456");

        // giris yap butonuna tıklayın
        facePage.girisbutonu.click();


        // girdigin sifre yanlıs yazı elementinin, gorunur oldugunu test edin
        Assert.assertTrue( facePage.yanlisYazisi.isDisplayed());

        // sayfayı kaptın

    }
}