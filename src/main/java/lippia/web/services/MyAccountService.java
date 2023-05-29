package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;

import static lippia.web.constants.SuperiorNavigationBarConstants.*;

public class MyAccountService extends ActionManager {
    public static void loginConExito(){
        WebActionManager.isVisible(loginExitoso);
    }
    public static void clickDetallesDeCuenta(){
        WebActionManager.waitClickable(BUTTON_DETALLES_CUENTA).click();
    }
    public static void verificaVisualizacionDetalles(){
        WebActionManager.isVisible(MENSAJE_DETALLES_CUENTA);
    }
    public static void clickCerrarSesion(){
        WebActionManager.waitClickable(logOut).click();
    }
}
