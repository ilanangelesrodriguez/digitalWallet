SubProceso inicioSesion
	Escribir "Introduce tu direccion:" sin saltar 
	leer account
	Escribir "Introduce tu clave:" Sin Saltar
	leer password
FinSubProceso
SubProceso wait
	esperar 2 Segundos
	borrar pantalla
FinSubProceso
SubProceso menu
	escribir "1.Enviar" "   " Sin Saltar
	escribir "2.Recibir" "   " Sin Saltar
	escribir "3.Canjear"
	actividad
	escribir "Seleccionar:" Sin Saltar
	leer opc
	segun opc hacer
		1: Escribir "Enviar"
		2: Escribir "Recibir"
		3: Escribir "Canjear"	
	FinSegun
FinSubProceso
SubProceso actividad
	escribir "No ves tu token" "   " Sin Saltar
	Escribir "Actualizar lista" "   " Sin Saltar
	Escribir "Agregar activo"
FinSubProceso
SubProceso footer
	escribir coin "EPISI"
	Escribir "No tiene transacciones :v"
FinSubProceso
SubProceso cerrarSesion
	escribir "Gracias"
FinSubProceso
Algoritmo billeteraDigital
	//Bilitera digital para el token EPISIcoin
	Escribir "-----------------------------------"
	Escribir "|=== Red principal de Ethereum ===|"
	Escribir "-----------------------------------"
	Escribir "=== Bienvenido a la EPISIwallet ==="
	Escribir "-----------------------------------"
	inicioSesion
	wait
	Escribir "Iniciando Sesion.............."
	wait
	menu
	wait
	cerrarSesion
FinAlgoritmo
