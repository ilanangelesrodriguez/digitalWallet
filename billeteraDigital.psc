//SubAlgoritmo para el inicio de sesion
SubAlgoritmo iniciarSesion(id Por Referencia)
	Escribir "-----------------------------------"
	Escribir "|=== Red principal de Ethereum ===|"
	Escribir "-----------------------------------"
	Escribir "=== Bienvenido a la EPISIwallet ==="
	Escribir "-----------------------------------"
	Escribir "Introduce tu direccion:" sin saltar 
	leer id
	Escribir "Introduce tu clave:" Sin Saltar
	leer password
FinSubAlgoritmo
//
SubProceso wait
	esperar 2 Segundos
	borrar pantalla
FinSubProceso
SubProceso menu
	escribir "1.Enviar" "   " Sin Saltar
	escribir "2.Canjear" "   " Sin Saltar
	escribir "3.Otro"
	escribir "Seleccionar:" Sin Saltar
	leer opc
	segun opc hacer
		1: Escribir "Enviar"
		2: Escribir "Recibir"
		3: actividad	
	FinSegun
FinSubProceso
SubProceso actividad
	escribir "|====== ¿No ves tu token? ======|"
	Escribir "Actualizar lista" "   " Sin Saltar
	Escribir "Agregar activo"
FinSubProceso
SubProceso cerrarSesion
	escribir "Gracias"
FinSubProceso
Algoritmo billeteraDigital
	//Bilitera digital para el token EPISIcoin
	iniciarSesion(id)
	wait
	Escribir "Iniciando Sesion.............."
	wait
	Escribir "           ID:" id
	Escribir "|========= " episicoin " EPISIcoin =========|"
	Escribir "------------ " ns " -------------"
	menu
	wait
	cerrarSesion
FinAlgoritmo
