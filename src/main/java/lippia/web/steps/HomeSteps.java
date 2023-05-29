package lippia.web.steps;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.HomeService;
import lippia.web.services.SuperiorBarNavigationBarService;
public class HomeSteps extends PageSteps {

    @Given("el usuario ingresa a la URL")
    public void elUsuarioIngresaALaURL() {
        SuperiorBarNavigationBarService.navegarWeb();
    }

    @When("el usuario clickea Shop menu")
    public void elUsuarioHaceClickEnMenu() {
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
    @Then("el usuario verifica que hay tres arrivals presentes")
    public void elUsuarioVerificaQueHayTresArrivalsPresentes() {
        HomeService.verificaArrivals();
    }
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

    @And("el usuario hace click en review del libro")
    public void elUsuarioHaceClickEnReviewReviewDelLibro() {
        SuperiorBarNavigationBarService.clickReview();
    }

    @Then("el usuario visualiza la review '(.*)' del libro")
    public void elUsuarioVisualizaLaReviewDelLibro(String reviews) {
        SuperiorBarNavigationBarService.verificarReview(reviews);
    }
}
