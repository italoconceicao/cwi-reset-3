package pageObjects;

import elementMapper.LoginPageElementMapper;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class LoginPage extends LoginPageElementMapper {

    //Fluxo de Login
    public LoginPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void fillEmail(){
        email.sendKeys("meuemail@meudominio.com");
    }
    public void fillPasswd(){
        passwd.sendKeys("asd123");
    }

    public void clickBtnSubmitLogin(){
        SubmitLogin.click();
    }


    //Fluxo de Criação de conta
    public void fillEmailCreate(String email) {
        emailCreate.sendKeys((CharSequence) email);
    }
    public void clickBtnCreateAnAccount() {
        CreateAccount.click();
    }


}
