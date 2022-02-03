package co.com.reto.questions;

import co.com.reto.userinterface.Filtrar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Filtrarquestions implements Question {

    @Override
    public Object answeredBy(Actor actor) {

        return Text.of(Filtrar.COMPARARFILTRO).viewedBy(actor).asString();
    }
    public static Filtrarquestions compararfiltro(){
        return new Filtrarquestions();
    }
}
