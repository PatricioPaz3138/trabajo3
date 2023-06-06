package lippia.web.services;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import org.testng.Assert;
import static lippia.web.constants.RegistrationConstants.*;
public class RegistrationService extends ActionManager {
    public static void clickRegister(){
        WebActionManager.waitClickable(REGISTER_BUTTON).click();
    }
    public static void registroExitoso(){
        Assert.assertTrue(WebActionManager.isVisible(registroExitoso));
    }
    public static void registro(String mail,String contrasenia){
        WebActionManager.waitClickable(campoUsuarioRegister).click();
        WebActionManager.setInput(campoUsuarioRegister,mail);
        WebActionManager.waitClickable(campoContraseniaRegister).click();
        WebActionManager.setInput(campoContraseniaRegister,contrasenia);
    }
}
