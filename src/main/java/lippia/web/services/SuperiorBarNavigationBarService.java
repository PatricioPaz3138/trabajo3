package lippia.web.services;
import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.SuperiorNavigationBarConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static com.crowdar.core.actions.ActionManager.click;
import static com.crowdar.core.actions.ActionManager.isEnabled;
import static com.crowdar.core.actions.WebActionManager.navigateTo;
import static lippia.web.constants.SuperiorNavigationBarConstants.*;


public class SuperiorBarNavigationBarService  {
    public static void navegarWeb() {
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }
    public static void clickMenu() {

        WebActionManager.click(SHOP_MENU_BUTTON);
    }
    public static void clickHomeMenu() {
        WebActionManager.waitClickable(HOME_BUTTON).click();
        }
    public static void clickLibros(String imagenNombre){
        WebActionManager.waitVisibility(nombreImagen.replace("%s", imagenNombre));
        WebActionManager.waitClickable(nombreImagen.replace("%s", imagenNombre)).click();


    }
    public static void validarRedireccion(String pagina){

        String tituloVisual = WebActionManager.getText(tituloLibro);
        Assert.assertEquals(tituloVisual,pagina);
    }
    public static void verificarDescripcion(String descripcion){
        String descripcionMostrada = WebActionManager.getText(descripcionLibro);
        Assert.assertTrue(WebActionManager.isVisible(descripcionLibro));
        Assert.assertTrue(descripcionMostrada.contains(descripcion));

    }
    }











