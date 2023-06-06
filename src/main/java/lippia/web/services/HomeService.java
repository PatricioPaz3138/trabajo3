package lippia.web.services;
import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import org.testng.Assert;
import static com.crowdar.core.actions.WebActionManager.navigateTo;
import static lippia.web.constants.HomeConstants.*;
public class HomeService extends ActionManager {
    public static void navegarWeb() {
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }
    public static void clickMenu() {
        WebActionManager.click(SHOP_MENU_BUTTON);
    }
    public static void clickHomeMenu() {
        WebActionManager.waitClickable(HOME_BUTTON).click();
    }
    public static void verificaSliders() {

        Assert.assertEquals((WebActionManager.getElements(SLIDERS_IMG)).size()
                , 3, "El Array no tiene 3 imágenes");
    }
    public static void verificaArrivals() {
        Assert.assertTrue(WebActionManager.isVisible(RUBY_IMG));
        Assert.assertTrue(WebActionManager.isVisible(HTML_IMG));
        Assert.assertTrue(WebActionManager.isVisible(JAVA_SCRIPT_IMG));
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
        Assert.assertTrue(WebActionManager.waitVisibility(descripcionLibro).isDisplayed());
        Assert.assertTrue(descripcionMostrada.contains(descripcion));
    }
    public static void clickReview(){
        WebActionManager.waitClickable(reviewLibro_click).click();
    }
    public static void verificarReview(String reviews){
        String reviewMostrada = WebActionManager.getText(textReviewLibro);
        Assert.assertTrue(WebActionManager.waitVisibility(textReviewLibro).isDisplayed());
        Assert.assertTrue(reviewMostrada.contains(reviews));
    }
}

