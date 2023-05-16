package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.HomeService;
import lippia.web.services.LoginService;
import lippia.web.services.RegistrationService;

public class RegistrationSteps extends PageSteps {
   
    @Given("el usuario ingresa mail (.*) y contraseña (.*)")
    public void elUsuarioIngresaMailDeRegistro(String mail,String contrasenia) {
        RegistrationService.registro(mail,contrasenia);
    }
    @When("el usuario hace click en el boton register")
    public void elUsuarioHaceClickEnElBotonRegister() {
        RegistrationService.clickRegister();
    }
    @Then("el usuario se registra correctamente")
    public void elUsuarioSeRegistraCorrectamente() {
        RegistrationService.registroExitoso();

    }


}
