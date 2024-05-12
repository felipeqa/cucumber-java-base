package PageObjects.bankHome;

import PageObjects.PageObjectBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BankHome extends PageObjectBase {
    public BankHome() {
        super();
    }

    @FindBy(id = "doc")
    public WebElement campoCpf;
}
