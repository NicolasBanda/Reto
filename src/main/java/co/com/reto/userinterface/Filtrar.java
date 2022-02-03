package co.com.reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Filtrar extends PageObject {

    public static final Target FILTRAR = Target.the("filtrar").
            locatedBy("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[4]");

    public static final Target COMPARARFILTRO = Target.the("comparar").
            locatedBy("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div");

}
