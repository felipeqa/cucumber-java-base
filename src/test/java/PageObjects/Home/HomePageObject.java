package PageObjects.Home;

import PageObjects.PageObjectBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObject extends PageObjectBase {

    public HomePageObject() {
        super();
    }


    //filtrando por texto
    @FindBy(xpath = "//h2[contains(text(),'Atendimento')]")
    public WebElement atendimento;
}
