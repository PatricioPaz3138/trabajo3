package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static lippia.web.constants.ShopConstants.*;

public class ShopService extends ActionManager {
    public static void selectByNewness(String frase) {
        WebActionManager.waitClickable(BUTTON_DEFAULT_SORTING).click();
        List<WebElement> listaOpciones = WebActionManager.getElements(LISTA_DESPLEGABLE);
        for (int i = 0; i < listaOpciones.size(); i++) {
            if (listaOpciones.get(i).getText().equals(frase)) {
                listaOpciones.get(i).click();
                break;
            }
        }
    }

    public static void visualizarProductosPopulares() {
        Assert.assertTrue(WebActionManager.isVisible(WEBAPP));
        Assert.assertTrue(WebActionManager.isVisible(FORMS));
        Assert.assertTrue(WebActionManager.isVisible(DATASTRUCTURE));
        Assert.assertTrue(WebActionManager.isVisible(FUNCTION));
    }

    public static void clickReadMore(String libro) {
        Map<String, String> libros = new HashMap<>();
        libros.put("Android Quick Start Guide", READMORE_ANDROID);
        libros.put("Functional Programming in JS", READMORE_FUNCTIONAL);
        WebActionManager.waitClickable(libros.get(libro)).click();
    }

    public static void visualizarAgotado(String mensaje) {
        String mensajeAgotado = WebActionManager.getText(MENSAJE_AGOTADO);
        Assert.assertTrue(WebActionManager.isVisible(MENSAJE_AGOTADO));
        Assert.assertTrue(mensajeAgotado.contains(mensaje));
    }
}
