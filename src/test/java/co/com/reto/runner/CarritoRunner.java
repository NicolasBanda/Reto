package co.com.reto.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/carrito.feature",
        snippets = SnippetType.CAMELCASE,
        glue = "co.com.reto.stepdefinitions"
)

public class CarritoRunner {
}
