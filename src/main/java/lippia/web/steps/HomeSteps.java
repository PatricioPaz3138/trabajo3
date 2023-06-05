package lippia.web.steps;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.HomeService;

public class HomeSteps extends PageSteps {

    @Given("el usuario ingresa a la URL")
    public void elUsuarioIngresaALaURL() {
        HomeService.navegarWeb();
    }

    @When("el usuario clickea Shop menu")
    public void elUsuarioHaceClickEnMenu() {
        HomeService.clickMenu();
    }

    @And("el usuario hace click en el botón del menu home")
    public void elUsuarioHaceClickEnElBotónDelMenuHome() {
        HomeService.clickHomeMenu();
    }

    @Then("el usuario verifica que hay solo tres sliders")
    public void elUsuarioVerificaQueHaySoloTresSliders() {
        HomeService.verificaSliders();
    }
    @Then("el usuario verifica que hay tres arrivals presentes")
    public void elUsuarioVerificaQueHayTresArrivalsPresentes() {
        HomeService.verificaArrivals();
    }
    @And("el usuario hace click en cualquier imagen '(.*)' del libro")
    public void elUsuarioHaceClickEnCualquierImagenDelLibro(String imagenNombre) {
        HomeService.clickLibros(imagenNombre);
    }
    @And("el usuario es redirigido a la pagina '(.*)' para agregar el libro a la cesta")
    public void elUsuarioEsRedirigidoALaPaginaParaAgregarElLibroALaCesta(String pagina) {
        HomeService.validarRedireccion(pagina);
    }

    @Then("el usuario visualiza la descripcion '(.*)' del libro")
    public void elUsuarioVisualizaLaDescripcionDelLibro(String descripcion) {
        HomeService.verificarDescripcion(descripcion);

    }

    @And("el usuario hace click en review del libro")
    public void elUsuarioHaceClickEnReviewReviewDelLibro() {
        HomeService.clickReview();
    }

    @Then("el usuario visualiza la review '(.*)' del libro")
    public void elUsuarioVisualizaLaReviewDelLibro(String reviews) {
        HomeService.verificarReview(reviews);
    }
}
