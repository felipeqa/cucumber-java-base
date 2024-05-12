package stepsDefinitions;

import PageObjects.Home.HomePageObject;
import PageObjects.bankHome.BankHome;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.testng.Assert;

public class HomePanSteps {

    private HomePageObject homePageObject;
    private BankHome bankHome;

    public HomePanSteps(HomePageObject homePageObject, BankHome bankHome) {
        this.homePageObject = homePageObject;
        this.bankHome = bankHome;
    }

    @Dado("que eu esteja na home do pan")
    public void que_eu_esteja_na_home_do_pan() {
        homePageObject.getDriver().get("https://www.bancopan.com.br/");
    }
    @Quando("eu acessar atendimento e serviços online")
    public void eu_acessar_atendimento_e_serviços_online() throws InterruptedException {
        homePageObject.atendimento.click();
        homePageObject.waitForWebElementAndClick(homePageObject.servicosOnline);
        homePageObject.waitForWebElementAndClick(homePageObject.boleto);
    }
    @Então("devo visualizar a Home Pan")
    public void devo_visualizar_a_home_pan() {
        bankHome.waitForWebElementAndClick(bankHome.campoCpf);
        String title = bankHome.getDriver().getTitle();
        System.out.println(title);
        Assert.assertEquals("Entrar em Área do Cliente",title);
    }
}
