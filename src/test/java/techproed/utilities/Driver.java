package techproed.utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;
    public class Driver {

        /*
Driver class'indaki temel mantik extends yontemiyle degil yani TestBase class'ina extent etmek yerine
Driver class'indan static methodlar kullanarak driver olustururuz.Sttic oldugu icin class ismi ile
her yerden methoda ulasabilecegiz.
 */
        static WebDriver driver;
        public static WebDriver getDriver(){

            /*
                Driver'ı her çağırdığında yeni bir pencere açılmasının önüne geçmek için
            if bloğu içinde Eğer driver'a değer atanmamışsa değer ata, Eğer değer atanmışsa
            driver'ı aynı sayfada return et.Bunun için sadece yapmamız gereken if (driver==null) kullanmak
             */
            if (driver==null){
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            }
            return driver;
        }
        public static void closeDriver(){
            driver.close();
        }


    }
