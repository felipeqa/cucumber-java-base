package stepsDefinitions;

import PageObjects.Home.HomePageObject;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class HomePanSteps {

    private HomePageObject homePageObject;

    public HomePanSteps(HomePageObject homePageObject) {
        this.homePageObject = homePageObject;
    }

    @Dado("que eu esteja na home do pan")
    public void que_eu_esteja_na_home_do_pan() {
        homePageObject.getDriver().get("https://www.bancopan.com.br/");
    }
    @Quando("eu acessar atendimento e serviços online")
    public void eu_acessar_atendimento_e_serviços_online() {

    }
    @Então("devo visualizar a Home Pan")
    public void devo_visualizar_a_home_pan() {

    }
}
