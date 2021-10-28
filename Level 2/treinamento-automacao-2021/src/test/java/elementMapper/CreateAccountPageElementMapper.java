package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPageElementMapper {

    @FindBy(id = "customer_firstname")
    public WebElement FirstName;

    @FindBy(id = "customer_lastname")
    public WebElement LastName;

    @FindBy(id = "passwd")
    public WebElement FillPassword;

    @FindBy(id = "days")
    public WebElement Days;

    @FindBy(id = "months")
    public WebElement Months;

    @FindBy(id = "years")
    public WebElement Years;

    @FindBy(id = "address1")
    public WebElement Address;

    @FindBy(id = "city")
    public WebElement City;

    @FindBy(id = "id_state")
    public WebElement State;

    @FindBy(id = "postcode")
    public WebElement PostCode;

    @FindBy(id = "phone_mobile")
    public WebElement MobilePhone;

    @FindBy(id = "submitAccount")
    public WebElement SubmitAccount;


}
