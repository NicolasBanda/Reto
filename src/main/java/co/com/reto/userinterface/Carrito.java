package co.com.reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Carrito extends PageObject {

    public static final Target ADDTOCARD = Target.the("seleccionar").
            located(By.id("add-to-cart-sauce-labs-backpack"));

    public static final Target CARRITO = Target.the("carrito").
            locatedBy("//*[@id=\"shopping_cart_container\"]/a");

    public static final Target ADDTOCARD2 = Target.the("seleccionar2").
            located(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));

    public static final Target DESCRIPCION = Target.the("descripcion").
            locatedBy("//*[@id=\"cart_contents_container\"]/div/div[1]/div[2]");

}
