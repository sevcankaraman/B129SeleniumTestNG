package techproed.tests.day01_practise;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.FacebookPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class C04_PageClassKullanimi {

    // facebook anasayfaya gidin
    // kullanıcı email kutusuna rastgele bir isim yazın
    // kullanıcı sifre kutusuna rastgele bir password yazın
    // giris yap butonuna tıklayın
    // girdigin sifre yanlıs yazı elementinin, gorunur oldugunu test edin
    // sayfayı kaptın


    @Test
    public void test01() {


        // facebook anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("facebook_url"));


        // kullanıcı email kutusuna rastgele bir isim yazın

        FacebookPage facebookPage = new FacebookPage();
        facebookPage.emailKutusu.sendKeys("Ahmet");



        // kullanıcı sifre kutusuna rastgele bir password yazın
        facebookPage.sifreKutusu.sendKeys("123456");




        // giris yap butonuna tıklayın
        facebookPage.girisYapButonu.click();



        // girdigin sifre yanlıs yazı elementinin, gorunur oldugunu test edin
        Assert.assertTrue(facebookPage.girdiginSifreYanlisYaziElementi.isDisplayed());


        // sayfayı kaptın
        Driver.closeDriver();



    }
}