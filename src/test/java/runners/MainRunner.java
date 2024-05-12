package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = {"classpath:features"}, glue = {"stepsDefinitions"},
        monochrome = true, dryRun = false, //dryRun é apenas pra rodar a stack e ver quais steps não foram implementados
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
        tags = "@pan")

public class MainRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}

//documentação: https://cucumber.io/docs/guides/parallel-execution/?lang=java#testng

