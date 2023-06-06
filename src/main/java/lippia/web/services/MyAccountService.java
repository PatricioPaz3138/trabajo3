package lippia.web.services;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import org.testng.Assert;
import static lippia.web.constants.LoginConstants.loginExitoso;
import static lippia.web.constants.MyAccountConstants.*;
public class MyAccountService extends ActionManager {
    public static void loginConExito(){
        WebActionManager.isVisible(loginExitoso);
    }
    public static void clickDetallesDeCuenta(){
        WebActionManager.waitClickable(BUTTON_DETALLES_CUENTA).click();
    }
    public static void verificaVisualizacionDetalles(){
        Assert.assertTrue(WebActionManager.isVisible(MENSAJE_DETALLES_CUENTA));
    }
    public static void clickCerrarSesion(){
        WebActionManager.waitClickable(logOut).click();
    }
}
