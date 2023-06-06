package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LoginService;





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

    @And("el usuario hace click en cerrar sesion")
    public void elUsuarioHaceClickEnCerrarSesion() {
        LoginService.cierreDeSesion();
    }

    @And("el usuario vuelve atras en la pagina")
    public void elUsuarioVuelveAtrasEnLaPagina() {
        LoginService.volverAtras();
    }

    @Then("el usuario no debe estar logeado")
    public void elUsuarioNoDebeEstarLogeado() {
        LoginService.verificacionCierreDeSesion();
    }
}
