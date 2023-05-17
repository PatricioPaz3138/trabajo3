package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import org.testng.Assert;

import static lippia.web.constants.SuperiorNavigationBarConstants.*;

public class LoginService extends ActionManager {
    public static void clickMyAccount(){
        WebActionManager.click(MY_ACCOUNT_BUTTON);
    }

    public static void clickLogin(){
        WebActionManager.waitClickable(LOGIN_BUTTON).click();
    }
    public static void loginExitoso(){
        WebActionManager.isVisible(loginExitoso);
    }
    public static void login(String usuario ,String contrasenia){

        WebActionManager.waitClickable(campoUsuario).click();
        WebActionManager.setInput(campoUsuario,usuario);
        WebActionManager.waitClickable(campoContrasenia).click();
        WebActionManager.setInput(campoContrasenia,contrasenia);




    }
    public static void visualizaMensaje(String mensaje){
        String mensajeDeError = WebActionManager.getText(mensajeError);
        Assert.assertTrue(WebActionManager.isVisible(mensajeError));
        Assert.assertTrue(mensajeDeError.contains(mensaje));
    }

}
