package steps.google;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google extends ScenarioSteps {
    @Managed(driver = "Chrome")
    WebDriver webDriver;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("{string} Go to url {string}")
    public void go_to_url(String actor, String url) {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.get(url);
//        OnStage.theActorCalled(actor).whoCan(BrowseTheWeb.with(webDriver))
//                .attemptsTo(Open.url(url)
//        );
        webDriver.close();
    }
}
