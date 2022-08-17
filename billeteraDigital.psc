SubProceso inicioSesion
	Escribir "Introduce tu direccion:" Sin Saltar
	leer account
	Escribir "Introduce tu clave:" Sin Saltar
	leer password
FinSubProceso
SubProceso menu
	escribir "Enviar" "  " Sin Saltar
	escribir "Recibir" "  " Sin Saltar
	escribir "Canjear"
FinSubProceso
SubProceso actividad
	escribir "No ves tu token"
	Escribir "Actualizar lista"
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
	Escribir "Bienvenido a la EPISIwallet"
	inicioSesion
	esperar 3 Segundos
	borrar pantalla
	Escribir "iniciando sesion"
	esperar 2 Segundos
	Borrar Pantalla
	Escribir "EPISIwallet"
	Escribir "Account"
	Escribir account
	Escribir coin Sin Saltar
	Escribir "EPISIcoin"
	menu
	Escribir "|" "  Activos  " "|" "  Actividad  " "|"
	actividad
	esperar 2 Segundos
	Borrar Pantalla
	cerrarSesion
	
FinAlgoritmo
