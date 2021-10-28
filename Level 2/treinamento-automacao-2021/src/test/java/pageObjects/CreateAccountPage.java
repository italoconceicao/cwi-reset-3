package pageObjects;

import elementMapper.CreateAccountPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CreateAccountPage extends CreateAccountPageElementMapper {


    public CreateAccountPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void fillFirstName(){
        FirstName.sendKeys("Meu");
    }
    public void fillLastName(){
        LastName.sendKeys("Nome");
    }
    public void fillPassword(){
        FillPassword.sendKeys("123456");
    }
    public void fillDays(){
        Days.sendKeys("10");
    }
    public void fillMonths() {
        Months.sendKeys("January");
    }
    public void fillYears() {
        Years.sendKeys("2000");
    }
    public void fillAddress() { Address.sendKeys("Nome da Rua");}
    public void fillCity() { City.sendKeys("Nome da Cidade");}
    public void fillState() { State.sendKeys("Alabama");}
    public void fillPostalCode() { PostCode.sendKeys("12345");}
    public void fillMobilePhone() { MobilePhone.sendKeys("51999998888");}
    public void clickRegister() {SubmitAccount.click();}



}
