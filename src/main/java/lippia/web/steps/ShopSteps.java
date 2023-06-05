package lippia.web.steps;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.services.ShopService;


public class ShopSteps extends PageSteps {
    @And("el usuario hace click en el boton readMore del libro (.*)")
    public void elUsuarioHaceClickEnElBotonReadMore(String readMore) {
        ShopService.clickReadMore(readMore);
    }

    @Then("el usuario no puede comprar el libro por qué está agotado (.*)")
    public void elUsuarioNoPuedeComprarElLibroPorQuéEstáAgotado(String mensaje) {
        ShopService.visualizarAgotado(mensaje);
    }
    @And("el usuario hace click en '(.*)'")
    public void elUsuarioHaceClickEnSortByNewness(String frase) {
        ShopService.selectByNewness(frase);

    }

    @Then("el usuario visualiza los productos de esa categoria")
    public void elUsuarioVisualizaLosProductosDeEsaCategoria() {
        ShopService.visualizarProductosPopulares();
    }


}
