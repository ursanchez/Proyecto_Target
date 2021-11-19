package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterface.SeleccionarProducto.BTN_BUSCAR;
import static userinterface.SeleccionarProducto.TXT_BUSCAR;


public class BuscarProducto implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		 actor.attemptsTo(

		 		/*
				 WaitUntil.the(CATEGORIAS, isVisible()).forNoMoreThan(2).seconds(),
				 Click.on(CATEGORIAS),
				 WaitUntil.the(OPCION_MEN, isVisible()).forNoMoreThan(2).seconds(),
				 Click.on(OPCION_MEN),
				*/
				 WaitUntil.the(TXT_BUSCAR, isVisible()).forNoMoreThan(2).seconds(),
				 Enter.theValue("Hola").into(TXT_BUSCAR),
				 WaitUntil.the(BTN_BUSCAR, isVisible()).forNoMoreThan(2).seconds(),
				 Click.on(BTN_BUSCAR)


				/*
				 WaitUntil.the(MENU_TECNOLOGIA, isVisible()).forNoMoreThan(10).seconds(),
				 Click.on(MENU_TECNOLOGIA),
				 WaitUntil.the(COMPUTADORES, isVisible()).forNoMoreThan(30).seconds(),
				 Scroll.to(COMPUTADORES),
				 Click.on(COMPUTADORES),
				 WaitUntil.the(PORTATILES, isVisible()).forNoMoreThan(30).seconds(),
				 Click.on(PORTATILES),
				 WaitUntil.the(LBL_FILTRO_SISTEMA_OPERATIVO, isVisible()).forNoMoreThan(30).seconds(),
				 Scroll.to(LBL_FILTRO_SISTEMA_OPERATIVO),
				 Click.on(CHB_SISTEMA_OPERATIVO),
				 WaitUntil.the(PRODUCTO, isVisible()).forNoMoreThan(30).seconds(),
				 Click.on(PRODUCTO),
				 WaitUntil.the(LBL_RESULTADO_PRODUCTO, isVisible()).forNoMoreThan(30).seconds(),
				 Scroll.to(LBL_RESULTADO_PRODUCTO),
				 Click.on(ANNADIR_AL_CARRITO),
				 WaitUntil.the(MENSAJE_AGREGADO, isVisible()).forNoMoreThan(30).seconds(),
				 Scroll.to(INICIO),
				 MoveMouse.to(IR_AL_CARRITO),
				 WaitUntil.the(IR_AL_CARRITO, isVisible()).forNoMoreThan(30).seconds(),
				 Click.on(IR_AL_CARRITO)
					*/
				 );		 
		// System.out.println(Text.of(LBL_EXITO).viewedBy(actor).asString());
	}
	
	public static BuscarProducto deTarget() {

		return instrumented(BuscarProducto.class);

	}

}
