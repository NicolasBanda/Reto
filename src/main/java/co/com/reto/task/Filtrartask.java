package co.com.reto.task;

import co.com.reto.userinterface.Filtrar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Filtrartask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Filtrar.FILTRAR)


        );
    }
    public static Filtrartask informacion(){return instrumented(Filtrartask.class);

    }
}
