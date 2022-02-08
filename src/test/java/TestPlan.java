import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class TestPlan {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        // ChromeDriver location set up in Utils class
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test
    public static void Challenge(){

        // 1. Login page
        driver.manage().window().maximize();
        driver.get(Utils.BASE_URL);
        WebForm webForm = new WebForm(driver);
        webForm.inputEmail();
        webForm.inputPassword();
        webForm.clickLoginButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webForm.verifyLoginSuccess();

        // 2. Navigate to Inventory
        webForm.clickInventoryLink();

        // 3. Create new product
        webForm.clickProductsMenu();
        webForm.clickProductsLink();
        webForm.clickCreateButton();
        webForm.inputProductName();
        webForm.clickSaveButton();

        // 4. Update the quantity of new product
        webForm.clickUpdateQuantity();
        webForm.inputCountedQuantity();
        webForm.clickCreateButton();
        webForm.inputCountedQuantity();
        webForm.clickSaveButton();

        // 5. Click on Application icon
        webForm.clickApplicationIcon();

        // 6. Create a new Manufacturing Order item for the created Product
        webForm.clickManufacturingLink();
        webForm.clickCreateButton();
        webForm.inputProductsOrders();
        webForm.clickAdALineLink();
        webForm.inputProductsConsumed();
        webForm.clickConfirmButton();

        // 7. Update the status of new Orders to "Done" successfully
        webForm.inputOrdersQuantity();
        webForm.clickMarkAsDoneButton();
        webForm.clickSaveButton();
        webForm.verifyStatusDone();

        // 8. Validate the new Manufacturing Order
        webForm.verifyOrdersDone();

    }

    @AfterSuite
    public static void cleanUp(){
//        driver.manage().deleteAllCookies();
//        driver.close();
    }
}