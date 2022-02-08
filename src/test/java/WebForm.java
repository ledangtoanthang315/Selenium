import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebForm extends PageObject{

    private final String EMAIL = "user@aspireapp.com";
    private final String PASSWORD = "@sp1r3app";
    private final String PRODUCT_NAME = "020815p";
    private final String COUNTED_QUANTITY = "11";
    private final String ORDERS_QUANTITY = "1";

    @FindBy(xpath = "//input[@name='login']")
    private WebElement email;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement login_button;

    @FindBy(xpath = "//span[contains(text(),'User')]")
    private WebElement loginSuccess;

    @FindBy(xpath = "//div[contains(text(),'Inventory')]")
    private WebElement inventory_link;

    @FindBy(xpath = "//div[contains(text(),'Manufacturing')]")
    private WebElement manufacturing_link;

    @FindBy(xpath = "//button[@title='Products']")
    private WebElement products_menu;

    @FindBy(xpath = "//a[contains(text(),'Products')]")
    private WebElement products_link;

    @FindBy(xpath = "//a[contains(text(),'Add a line')]")
    private WebElement add_a_line_link;

    @FindBy(xpath = "//button[contains(text(),'Create')]")
    private WebElement create_button;

    @FindBy(xpath = "//button[contains(text(),'Save')]")
    private WebElement save_button;

    @FindBy(xpath = "//span[contains(text(),'Confirm')]")
    private WebElement confirm_button;

    @FindBy(xpath = "//span[contains(text(),'Mark as Done')]")
    private WebElement mark_as_done_button;

    @FindBy(xpath = "//input[@name='name']")
    private WebElement product_name;

    @FindBy(xpath = "//input[@name='inventory_quantity']")
    private WebElement counted_quantity;

    @FindBy(xpath = "//input[@name='qty_producing']")
    private WebElement orders_quantity;

    @FindBy(xpath = "//input[@class='o_input ui-autocomplete-input' and @id='o_field_input_744']")
    private WebElement products_orders;

    @FindBy(xpath = "//input[@class='o_input ui-autocomplete-input']")
    private WebElement products_consumed;

//    @FindBy(xpath = "//button[@name='action_update_quantity_on_hand']")
    @FindBy(xpath = "//span[contains(text(),'Update Quantity')]")
    private WebElement update_quantity_button;

    @FindBy(xpath = "/html/body/header/nav/a[1]")
    private WebElement application_icon;

    public WebForm(WebDriver driver) {
        super(driver);
    }

    public void inputEmail(){
        this.email.sendKeys(EMAIL);
    }

    public void inputPassword(){
        this.password.sendKeys(PASSWORD);
    }

    public void inputProductName(){
        this.product_name.sendKeys(PRODUCT_NAME);
    }

    public void inputCountedQuantity(){
        this.counted_quantity.sendKeys(COUNTED_QUANTITY);
    }

    public void inputOrdersQuantity(){
        this.products_consumed.sendKeys(ORDERS_QUANTITY);
    }

    public void inputProductsOrders(){
        this.products_orders.sendKeys(PRODUCT_NAME);
    }

    public void inputProductsConsumed(){
        this.products_consumed.sendKeys(PRODUCT_NAME);
    }

    public void clickLoginButton(){
        this.login_button.click();
    }

    public void clickInventoryLink(){
        this.inventory_link.click();
    }

    public void clickManufacturingLink(){
        this.manufacturing_link.click();
    }

    public void clickProductsMenu(){
        this.products_menu.click();
    }

    public void clickProductsLink(){
        this.products_link.click();
    }

    public void clickAdALineLink(){
        this.add_a_line_link.click();
    }

    public void clickCreateButton(){
        this.create_button.click();
    }

    public void clickSaveButton(){
        this.save_button.click();
    }

    public void clickConfirmButton(){
        this.confirm_button.click();
    }

    public void clickMarkAsDoneButton(){
        this.mark_as_done_button.click();
    }

    public void clickUpdateQuantity(){
        this.update_quantity_button.click();
    }

    public void clickApplicationIcon(){
        this.application_icon.click();
    }

    public void verifyLoginSuccess(){
        this.loginSuccess.isDisplayed();
    }

}