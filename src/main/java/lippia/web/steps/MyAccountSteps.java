package lippia.web.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LoginService;
import lippia.web.services.MyAccountService;

import static lippia.web.constants.SuperiorNavigationBarConstants.signOut;

public class MyAccountSteps extends PageSteps {
    @And("el usuario ha iniciado sesion correctamente")
    public void elUsuarioHaIniciadoSesionCorrectamenteMyAccountFeature() {
        MyAccountService.loginConExito();
    }
    @When("el usuario hace click en detalles de la cuenta")
    public void elUsuarioHaceClickEnDetallesDeLaCuenta() {
        MyAccountService.clickDetallesDeCuenta();
    }

    @Then("el usuario visualiza los detalles de su cuenta")
    public void elUsuarioVisualizaLosDetallesDeSuCuenta() {
        MyAccountService.verificaVisualizacionDetalles();
    }


    @When("el usuario clickea en cerrar sesion")
    public void elUsuarioClickeaEnCerrarSesion() {
        MyAccountService.clickCerrarSesion();
    }
}
