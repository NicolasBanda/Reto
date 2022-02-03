package co.com.reto.task;

import co.com.reto.models.Loginmodels;
import co.com.reto.userinterface.Login;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Logintask implements Task {

    Loginmodels loginmodels;

    public Logintask(Loginmodels loginmodels){this.loginmodels = loginmodels;}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(loginmodels.getUsername()).into(Login.USERNAME),
                Enter.theValue(loginmodels.getPassword()).into(Login.PASSWORD),
                Click.on(Login.LOGIN)

        );

    }
    public static Logintask Informacion (Loginmodels loginmodels){
        return  instrumented(Logintask.class, loginmodels);
    }
}
