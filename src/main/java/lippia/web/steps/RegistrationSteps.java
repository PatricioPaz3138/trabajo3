package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.services.LoginService;
import lippia.web.services.RegistrationService;

public class RegistrationSteps extends PageSteps {
   
    @And("el usuario ingresa mail y contraseña de registro")
    public void elUsuarioIngresaMailDeRegistro() {
        RegistrationService.registroUsuarioYContraseñaValido();
    }
    @And("el usuario hace click en el boton register")
    public void elUsuarioHaceClickEnElBotonRegister() {
        RegistrationService.clickRegister();
    }
    @Then("el usuario se registra correctamente")
    public void elUsuarioSeRegistraCorrectamente() {
        RegistrationService.registroExitoso();
    }


}
