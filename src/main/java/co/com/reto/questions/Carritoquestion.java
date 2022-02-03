package co.com.reto.questions;

import co.com.reto.userinterface.Carrito;
import co.com.reto.userinterface.Filtrar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Carritoquestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(Carrito.DESCRIPCION).viewedBy(actor).asString();
    }

    public static Carritoquestion descripcioncarrito() {
        return new Carritoquestion();
    }
}