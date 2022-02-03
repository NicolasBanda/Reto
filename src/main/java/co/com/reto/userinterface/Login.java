package co.com.reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login extends PageObject {

    public static final Target USERNAME = Target.the("usuario").
            located(By.id("user-name"));
    public static final Target PASSWORD = Target.the("contraseña").
            located(By.id("password"));
    public static final Target LOGIN = Target.the("login").
            located(By.id("login-button"));


}
