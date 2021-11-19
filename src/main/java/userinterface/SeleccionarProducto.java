package userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SeleccionarProducto extends PageObject {
	
	public static final Target CATEGORIAS = Target.the("Menu - Categorías")
			.located(By.xpath("//*[contains (@href, '#categoriesMenu')]//span[contains(text(),'Categories')]"));//*[contains(text(), 'Tecnología') and contains(@href,'/tecnologia')]
	
	public static final Target OPCION_MEN = Target.the("Selecciona opción Men")
			.located(By.xpath("//ul[contains(@class, 'NavigationList-sc-1ltyzy8-0 ywAYv')]//div[contains(text(), 'Men')]"));
	
	public static final Target TXT_BUSCAR = Target.the("Buscador")
			.located(By.xpath("//input[contains(@id, 'search')]"));
	
	public static final Target BTN_BUSCAR = Target.the("Btn - Botón Buscar")
			.located(By.xpath("//button[contains(@class, 'SearchInputButton-sc-1opoijs-0 eOzuAz')]"));
	
	public static final Target CHB_SISTEMA_OPERATIVO = Target.the("CheckBox - Sistema operativo")
			.located(By.xpath("//input[contains(@id,'Mac%20OS') and contains(@name,'Mac OS')]"));
		
	public static final Target PRODUCTO = Target.the("Opci�n selecci�n de producto")
			.located(By.xpath("//*[contains(@href,'/macbook-12-intel-core-m3-450758/p') and contains(@class,'no-underline')]"));
	
	public static final Target LBL_RESULTADO_PRODUCTO = Target.the("Label - Resultado de producto seleccionado")
			.located(By.xpath("//h1[contains(@id,'product-name')]"));
	
	public static final Target ANNADIR_AL_CARRITO = Target.the("Opci�n a�adir al carrito de compras")
			.located(By.xpath("(//div[contains(@class,'flex items') and contains(text(),'Agregar')])[1]"));
	
	public static final Target MENSAJE_AGREGADO = Target.the("Mensaje de producto a�adido al carrito de compras")
			.located(By.xpath("//div[contains(@class,'pr5 mw6-ns lh-copy')]"));
	
	public static final Target LBL_X = Target.the("Label - X")
			.located(By.xpath("//p[text()='2018 Éxito ® NIT 890900608-9. Todos los derechos reservados.']"));
	
	public static final Target INICIO = Target.the("Inicio")
			.located(By.xpath("//*[contains(text(),'Inicio')]"));
	
	public static final Target HEADER = Target.the("Header")
			.located(By.xpath("//div [contains(@id,'header') and contains(@class,'exito')]"));
	 
	public static final Target IR_AL_CARRITO = Target.the("Ir al carrito")
			.located(By.xpath("//div[@class='exito-header-2-x-minicartButtonMobile exito-header-2-x-minicartButton']"));
	
	public static final Target VALOR_TOTAL = Target.the("Valor total de compra")
			.located(By.xpath("(//td[contains(@class,'monetary') and contains(@data-bind,'totalLabel')])[1]"));
	
	public static final Target LBL_PRODUCTO = Target.the("Label - Producto")
			.located(By.xpath("//*[contains(@class,'product') and contains(text(),'Producto')]"));
	
	public static final Target LBL_TOTAL = Target.the("Label - Total")
			.located(By.xpath("(//*[contains(@class,'info') and contains(text(),'Total')])[1]"));
	
	public static final Target LBL_EXITO = Target.the("Label - Éxito")
			.located(By.xpath("//span[contains(text(),'exito')]"));
	
}
