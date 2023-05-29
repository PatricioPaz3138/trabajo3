package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
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
        WebActionManager.waitClickable(logOut).click();
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
    public static void cierreDeSesion(){
        WebActionManager.waitClickable(signOut).click();
    }
    public static void volverAtras(){
        WebDriver driver = DriverManager.getDriverInstance();
        // Crear una instancia de Actions
        Actions actions = new Actions(driver);
    // Pulsar la tecla de retroceso
        actions.sendKeys(Keys.BACK_SPACE).perform();
    }
    public static void verificacionCierreDeSesion(){
        WebActionManager.waitVisibility(CIERRE_DE_SESION);
        Assert.assertTrue(WebActionManager.isPresent(CIERRE_DE_SESION));
    }

}
