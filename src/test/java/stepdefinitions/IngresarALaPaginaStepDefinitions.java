package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.BuscarProducto;
import tasks.IngresarALaPaginaInicial;

import static net.serenitybdd.screenplay.actors.OnStage.*;


public class IngresarALaPaginaStepDefinitions {

	@Before
	public void inicio() {

		setTheStage(new OnlineCast());

	}

	@Dado("^que (.*) abre la pagina Target$")
	public void queCarlosAbreLaPaginaTarget(String actor) {

		theActorCalled(actor).wasAbleTo(IngresarALaPaginaInicial.deTarget());

	}

	@Cuando("^realiza la busqueda del producto$")
	public void realizaLaBusquedaDelProducto() {

		theActorInTheSpotlight().attemptsTo(BuscarProducto.deTarget());

	}

	@Entonces("^se compara el producto$")
	public void seComparaElProducto() {

	}


	/*
	@Dado("^que (.*) abre la pagina del exito$")
	public void queCarolinaAbreElNavegador(String actor) {
		theActorCalled(actor).wasAbleTo(IngresarALaPaginaInicial.delExito());
	}

	@Cuando("^agrega un producto de tecnologia al carrito de compras$")
	public void agregaUnProductoDeTecnologiaAlCarritoDeCompras() {
		theActorInTheSpotlight().attemptsTo(ComprarProducto.delExito());
	}

	@Entonces("^se verifica que el producto se annadio al carrito de compras$")
	public void seVerificaQueElProductoSeAnnadioAlCarritoDeCompras() {		
		theActorInTheSpotlight().should(seeThat(ProductoAnnadido.alCarrito(), equalTo("exito")));
	}

	*/
}
