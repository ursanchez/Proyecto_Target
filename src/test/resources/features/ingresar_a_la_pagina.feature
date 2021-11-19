#language: es
#Author: cajaram@bancolombia.com.co

Característica: Ingresar a la pagina deseada
  Yo como usuario quiero abrir el navegador para buscar un producto

Antecedentes: Ingresar a la pagina target
  Dado que Juan abre la pagina Target
 

  Escenario:
 		Cuando realiza la busqueda del producto
 		Entonces se compara el producto