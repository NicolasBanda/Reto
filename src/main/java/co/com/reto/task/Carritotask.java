package co.com.reto.task;

import co.com.reto.userinterface.Carrito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Carritotask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Carrito.ADDTOCARD),
                Click.on(Carrito.ADDTOCARD2),
                Click.on(Carrito.CARRITO)



        );
    }
    public static Carritotask informacion(){return instrumented(Carritotask.class);}
}
