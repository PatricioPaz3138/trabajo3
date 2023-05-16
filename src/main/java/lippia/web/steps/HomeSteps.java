package lippia.web.steps;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.HomeService;
import lippia.web.services.SuperiorBarNavigationBarService;
public class HomeSteps extends PageSteps {
    //Sliders
    @Given("el usuario ingresa a la URL")
    public void elUsuarioIngresaALaURL() {
        SuperiorBarNavigationBarService.navegarWeb();
    }

    @When("el usuario hace click en {string} menu")
    public void elUsuarioHaceClickEnMenu(String arg0) {
        SuperiorBarNavigationBarService.clickMenu();
    }

    @And("el usuario hace click en el botón del menu home")
    public void elUsuarioHaceClickEnElBotónDelMenuHome() {
        SuperiorBarNavigationBarService.clickHomeMenu();
    }

    @Then("el usuario verifica que hay solo tres sliders")
    public void elUsuarioVerificaQueHaySoloTresSliders() {
        HomeService.clickSliders();
    }
    //Arrivals
    @Then("el usuario verifica que hay tres arrivals presentes")
    public void elUsuarioVerificaQueHayTresArrivalsPresentes() {
        HomeService.verificaArrivals();
    }
    //DescriptionArrivals
    @And("el usuario hace click en cualquier imagen '(.*)' del libro")
    public void elUsuarioHaceClickEnCualquierImagenDelLibro(String imagenNombre) {
        SuperiorBarNavigationBarService.clickLibros(imagenNombre);
    }
    @And("el usuario es redirigido a la pagina '(.*)' para agregar el libro a la cesta")
    public void elUsuarioEsRedirigidoALaPaginaParaAgregarElLibroALaCesta(String pagina) {
        SuperiorBarNavigationBarService.validarRedireccion(pagina);
    }

    @Then("el usuario visualiza la descripcion '(.*)' del libro")
    public void elUsuarioVisualizaLaDescripcionDelLibro(String descripcion) {
        SuperiorBarNavigationBarService.verificarDescripcion(descripcion);
    }
}
