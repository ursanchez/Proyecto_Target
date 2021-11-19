package questions;

import static userinterface.SeleccionarProducto.LBL_EXITO;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ProductoAnnadido implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(LBL_EXITO).viewedBy(actor).asString();
	}

	public static ProductoAnnadido alCarrito() {
		return new ProductoAnnadido();
	}
	
}
