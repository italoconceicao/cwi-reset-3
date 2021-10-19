package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import pageObjects.CreateAccountPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.SearchPage;
import utils.Browser;
import utils.Utils;
import java.util.Random;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SetupTest extends BaseTests{

    @Test
    public void testOpeningBrowserAndLoadingPage(){
        // TESTE DE LOAD DA PÁGINA

        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()));
        System.out.println("Abrimos o navegador e carregamos a Url!");
    }

    @Test
    public void testLogin() {
        // TESTE DE LOGIN

        //Iniciar Páginas
        HomePage home = new HomePage();
        LoginPage login = new LoginPage();

        home.clickBtnLogin();
        System.out.println("Clicou em Sign in.☑");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().concat("index.php?controller=authentication&back=my-account")));
        login.fillEmail();
        System.out.println("Preencheu o campo de usuário. ☑");
        login.fillPasswd();
        login.clickBtnSubmitLogin();
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().concat("index.php?controller=my-account")));
        System.out.println("Validou a url da minha conta. ☑");
        assertTrue(Browser.getCurrentDriver().findElement(By.className("page-heading")).getText().contains("MY ACCOUNT"));
        System.out.println("Validou minha conta no body. ☑");

    }
    @Test
    public void testSearch(){
        // TESTE DE PESQUISA

        String quest = "YELLOW";

        //Iniciar a página
        HomePage home = new HomePage();
        SearchPage search = new SearchPage();
        //Pesquisar (função do HomePage)
        home.doSearch(quest);

        //Validar
        assertTrue(search.isSearchPage());
        assertEquals(search.getTextLighter().replace("\"", ""),quest);
        assertEquals(search.getTextHeading_counter(),"3 results have been found."); //Funcionará enquanto não forem adiocionados ou retirados produtos com a tag em questão

        Browser.getCurrentDriver().findElement(By.linkText("Printed Summer Dress")).click();
        System.out.println("Escolheu a peça. ☑");
        Browser.getCurrentDriver().findElement(By.id("add_to_cart")).click();
        System.out.println("Adicionou ao carrinho. ☑");

    }

    @Test
    public void testCreateAccount(){

        // TESTE DE CRIAÇÃO DE CONTA

        Random random = new Random();
        String email = "MeuNome" + random.nextInt() + "@gmail.com";

        //Iniciar as páginas
        HomePage home = new HomePage();
        LoginPage login = new LoginPage();
        CreateAccountPage createAccount = new CreateAccountPage();
        //Direcionar para a página de criação de conta
        home.clickBtnLogin();
        System.out.println("Clicou em Sign in. ☑");
        login.fillEmailCreate(email);
        System.out.println("Preencheu o campo de email. ☑");
        login.clickBtnCreateAnAccount();
        System.out.println("Clicou em Create An Account. ☑");

        //Criação de conta
        createAccount.fillFirstName();
        System.out.println("Preencheu o campo de Primeiro Nome. ☑");
        createAccount.fillLastName();
        System.out.println("Preencheu o campo de Primeiro Nome. ☑");
        createAccount.fillPassword();
        System.out.println("Preencheu o campo de Senha. ☑");
        createAccount.fillDays();
        System.out.println("Preencheu o campo de Dia do Nascimento. ☑");
        createAccount.fillMonths();
        System.out.println("Preencheu o campo de Mês do Nascimento. ☑");
        createAccount.fillYears();
        System.out.println("Preencheu o campo de Ano do Nascimento. ☑");
        createAccount.fillAddress();
        System.out.println("Preencheu o campo de Endereço. ☑");
        createAccount.fillCity();
        System.out.println("Preencheu o campo de Cidade. ☑");
        createAccount.fillState();
        System.out.println("Preencheu o campo de Estado. ☑");
        createAccount.fillPostalCode();
        System.out.println("Preencheu o campo de ZipCode. ☑");
        createAccount.fillMobilePhone();
        System.out.println("Preencheu o campo de Telefone. ☑");
        createAccount.clickRegister();
        System.out.println("Clicou no botão 'Register'. ☑");
        Assert.assertTrue(Browser.getCurrentDriver().findElement(By.className("page-heading")).getText().contains("MY ACCOUNT"));
        System.out.println("Checou se redirecionou para a página My Account. ☑");

    }

    @Test
    public void testBuy(){
        // TESTE DE COMPRA

        testLogin();
        testSearch();
        Browser.getCurrentDriver().findElement(By.linkText("Proceed to checkout")).click();
        Browser.getCurrentDriver().findElement(By.linkText("Proceed to checkout")).click();
        System.out.println("Confirmou os produtos da compra. ☑");
        Browser.getCurrentDriver().findElement(By.name("processAddress")).click();
        System.out.println("Confirmou endereço. ☑");
        Browser.getCurrentDriver().findElement(By.id("cgv")).click();
        Browser.getCurrentDriver().findElement(By.name("processCarrier")).click();
        System.out.println("Confirmou frete. ☑");
        Browser.getCurrentDriver().findElement(By.className("bankwire")).click();
        System.out.println("Escolheu método de pagamento. ☑");
        Browser.getCurrentDriver().findElement(By.xpath("//*[@class='button btn btn-default button-medium']")).click();
        System.out.println("Confirmou método de pagamento. ☑");
        Assert.assertTrue(Browser.getCurrentDriver().findElement(By.className("page-heading")).getText().contains("ORDER CONFIRMATION"));
        System.out.println("Compra Finalizada. ☑");

    }

}
