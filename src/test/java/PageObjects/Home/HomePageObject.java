package PageObjects.Home;

import PageObjects.PageObjectBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObject extends PageObjectBase {

    public HomePageObject() {
        super();
    }


    //filtrando por texto
    @FindBy(xpath = "//h2[contains(text(),'Atendimento')][@data-js='category']")
    public WebElement atendimento;

    @FindBy(xpath ="//h4[contains(text(),'Serviços online')][@data-js='topico']")
    public WebElement servicosOnline;

    @FindBy(css ="a[href='https://online.bancopan.com.br/']")
    public WebElement boleto;
}
