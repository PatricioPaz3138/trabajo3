package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;

import static lippia.web.constants.SuperiorNavigationBarConstants.*;

public class RegistrationService extends ActionManager {
    public static void registroUsuarioYContraseñaValido(){
        WebActionManager.waitClickable(campoUsuarioRegister).click();
        WebActionManager.setInput(campoUsuarioRegister,"Pepito124@crowdar.com");
        WebActionManager.waitClickable(campoContraseniaRegister).click();
        WebActionManager.setInput(campoContraseniaRegister,"Pepito12345%%");
    }
    public static void clickRegister(){
        WebActionManager.waitClickable(REGISTER_BUTTON).click();
    }
    public static void registroExitoso(){
        WebActionManager.isVisible(loginExitoso);
        WebActionManager.waitClickable(desLog).click();
    }
}
