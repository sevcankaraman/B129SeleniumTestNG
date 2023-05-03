package techproed.utilities;

import org.testng.annotations.DataProvider;

public class DataProviderUtils {

    @DataProvider
    public Object[][] sehirVerileri() {
        return new Object[][]{{"Ankara", "IçAnadolu", "06"},
                {"Izmir", "Ege", "35"},
                {"DiyarBakır", "Doğu", "21"}};
    }

    @DataProvider
    public Object[][] kullanicilar() {
        return new Object[][]{{"Erol", "654654654"},
                {"Nuri", "321354654"},
                {"Gül", "654321654"},
                {"Sefa", "32165849658"}};
    }

    @DataProvider
    public Object[][] blueRental() {
        ExcelUtils excelUtils = new ExcelUtils("src/test/java/resources/mysmoketestdata.xlsx", "customer_info");
        return excelUtils.getDataArray();
    }

    @DataProvider()
    public Object[][] customerData() {
        String path = "src/test/java/resources/mysmoketestdata.xlsx";
        String sheetName = "customer_info";

        //ExcelUtils objesi oluşturarak  getDataArray() methodu ile iki boyutlu String Array'i DataProvider olarak return yapıyorum.
        ExcelUtils excelUtils = new ExcelUtils(path, sheetName);
        return excelUtils.getDataArrayWithoutFirstRow();
    }

}