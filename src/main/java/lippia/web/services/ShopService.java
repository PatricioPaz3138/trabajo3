package lippia.web.services;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.List;

import static lippia.web.constants.SuperiorNavigationBarConstants.*;
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
        WebActionManager.isVisible(WEBAPP);
        WebActionManager.isVisible(FORMS);
        WebActionManager.isVisible(DATASTRUCTURE);
        WebActionManager.isVisible(FUNCTION);
    }
    public static void clickReadMore(String libro) {
        switch (libro) {
            case "Android Quick Start Guide":
                WebActionManager.waitClickable(READMORE_ANDROID).click();
                break;
            case "Functional Programming in JS":
                WebActionManager.waitClickable(READMORE_FUNCTIONAL).click();
                break;
        }
    }
    public static void visualizarAgotado(String mensaje) {
        String mensajeAgotado = WebActionManager.getText(MENSAJE_AGOTADO);
        Assert.assertTrue(WebActionManager.isVisible(MENSAJE_AGOTADO));
        Assert.assertTrue(mensajeAgotado.contains(mensaje));
    }
}
