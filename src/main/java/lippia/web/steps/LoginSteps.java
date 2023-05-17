package lippia.web.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.HomeService;
import lippia.web.services.LoginService;
import lippia.web.services.SuperiorBarNavigationBarService;
import org.apache.commons.logging.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static lippia.web.constants.SuperiorNavigationBarConstants.*;

public class LoginSteps extends PageSteps {

    @And("el usuario hace click en el boton My Account")
    public void elUsuarioHaceClickEnElBotonMyAccount() {
        LoginService.clickMyAccount();

    }

    @When("el usuario hace click en el boton login")
    public void elUsuarioHaceClickEnElBotonLogin() {
        LoginService.clickLogin();
        
    }

    @Then("el usuario inicia sesion correctamente")
    public void elUsuarioIniciaSesionCorrectamente() {
        LoginService.loginExitoso();
        WebActionManager.waitClickable(logOut).click();
    }
    //Outline
    @When("el usuario ingresa usuario (.*) y contraseña (.*)")
    public void elUsuarioIngresaUsuarioUsuarioYContraseñaContraseniaInvalidos
    (String usuario,String contrasenia) {
        LoginService.login(usuario,contrasenia);

    }
    @Then("el usuario visualiza un mensaje (.*) de error")
    public void elUsuarioVisualizaUnMensajeMensajeDeError(String mensaje) {
        LoginService.visualizaMensaje(mensaje);

    }



}
