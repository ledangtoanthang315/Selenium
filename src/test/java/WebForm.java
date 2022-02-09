import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Objects;

public class WebForm extends PageObject{

    private final String EMAIL = "user@aspireapp.com";
    private final String PASSWORD = "@sp1r3app";
    private final String PRODUCT_NAME = "020909p";
    private final String COUNTED_QUANTITY = "11";
    private final String ORDERS_QUANTITY = "1";

    @FindBy(xpath = "//input[@name='login']")
    private WebElement email;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement login_button;

    @FindBy(xpath = "//span[contains(text(),'User')]")
    private WebElement login_Success;

    @FindBy(xpath = "//div[contains(text(),'Inventory')]")
    private WebElement inventory_link;

    @FindBy(xpath = "//div[contains(text(),'Manufacturing')]")
    private WebElement manufacturing_link;

    @FindBy(xpath = "//button[@title='Products']")
    private WebElement products_menu;

    @FindBy(xpath = "//a[contains(text(),'Products')]")
    private WebElement products_link;

    @FindBy(xpath = "//div[@class='tab-content']/div[1]//*[text()='Add a line']")
    private WebElement add_a_line_link;

    @FindBy(xpath = "//span[contains(text(),'Update Quantity')]")
    private WebElement update_quantity_button;

    @FindBy(xpath = "//button[contains(text(),'Create')]")
    private WebElement create_button;

    @FindBy(xpath = "//button[contains(text(),'Save')]")
    private WebElement save_button;

    @FindBy(xpath = "//span[contains(text(),'Confirm')]")
    private WebElement confirm_button;

    @FindBy(xpath = "//span[contains(text(),'Mark as Done')]")
    private WebElement mark_as_done_button;

    @FindBy(xpath = "//input[@name='name']")
    private WebElement product_name_txt;

    @FindBy(xpath = "//input[@name='inventory_quantity']")
    private WebElement counted_quantity_txt;

    @FindBy(xpath = "//input[@name='qty_producing']")
    private WebElement orders_quantity_txt;

    @FindBy(xpath = "//div[@name='product_id']//descendant-or-self::div/input")
    private WebElement products_orders_txt;

    @FindBy(xpath = "//div[@class='tab-content']/div[1]//*[@name='product_id']")
    private WebElement products_orders_done;

    @FindBy(xpath = "//div[@class='tab-content']//div[@name='product_id']//descendant-or-self::div/input")
    private WebElement products_consumed_txt;

    @FindBy(xpath = "/html/body/header/nav/a[1]")
    private WebElement application_icon;

    @FindBy(xpath = "//div[@name='state']//descendant-or-self::button[@title='Current state' and contains(text(),'Done')]")
    private WebElement status_done;

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
        this.product_name_txt.sendKeys(PRODUCT_NAME);
    }

    public void inputCountedQuantity(){
        this.counted_quantity_txt.sendKeys(COUNTED_QUANTITY);
    }

    public void inputOrdersQuantity(){
        this.products_consumed_txt.sendKeys(ORDERS_QUANTITY);
    }

    public void inputProductsOrders(){
        this.products_orders_txt.sendKeys(PRODUCT_NAME);
    }

    public void inputProductsConsumed(){
        this.products_consumed_txt.sendKeys(PRODUCT_NAME);
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

    public void clickUpdateQuantity() {this.update_quantity_button.click(); }

    public void clickApplicationIcon(){
        this.application_icon.click();
    }

    public void verifyLoginSuccess(){
        this.login_Success.isDisplayed();
    }

    public void verifyStatusDone(){
        this.status_done.isDisplayed();
    }

    public void verifyOrdersDone(){
        if(Objects.equals(this.products_orders_done.getText(),PRODUCT_NAME)) {
            System.out.println("The new Manufacturing Order is created with corrected information!");
        } else System.out.println("The new Manufacturing Order is NOT created with corrected information!!!!!!");
    }

}