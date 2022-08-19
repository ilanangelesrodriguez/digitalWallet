//SubAlgoritmo para el inicio de sesion
SubAlgoritmo login(id Por Referencia)
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
SubProceso iniciarSesion
	wait
	Escribir "Iniciando Sesion.............."
	wait
FinSubProceso
//Agrego tiempo de espera :v
SubProceso wait
	esperar 2 Segundos
	borrar pantalla
FinSubProceso
//Opciones de la billetera
SubProceso menu
	escribir "   " "1.Enviar" "     " Sin Saltar
	escribir "2.Comprar" "     " Sin Saltar
	escribir "3.Activos" "     " 
	escribir "4.Actividad" "     " Sin Saltar
	escribir "5.Otro" "     " Sin Saltar
	escribir "6.Cerrar Sesion" 
	escribir "Seleccionar:" Sin Saltar
	leer opc
	segun opc hacer
		1: Escribir "Enviar"
		2: Escribir "Comprar"
		3: Escribir "Activos"
		4: Escribir "Actividad"	
		5: outro
		6: cerrarSesion
	FinSegun
FinSubProceso
//Opciones complementarias
SubProceso outro
	escribir "|====== ¿No ves tu token? ======|"
	Escribir "1.Actualizar lista" "   " Sin Saltar
	Escribir "2.Agregar activo"
	leer opc2
	segun opc2 Hacer
		1: wait
		   menu
	   2: escribir "Agregar activo"
		   agregarActivo
	FinSegun
FinSubProceso
SubProceso agregarActivo
	dimension token[3]
	token[0]<-"BTC" //Bitcoin
	token[1]<-"ETH" //Ethereum 
	token[2]<-"SOL" //Solana 
	Para i<-0 hasta 2 con paso 1 Hacer
		x=x+1
		Escribir x "." token[i]
	FinPara
	Para i<-0 hasta 0 con paso 1 Hacer
		Escribir "Selecciona activo:" Sin Saltar
		leer a
	FinPara
	Para i<-0 hasta 0 con paso 1 Hacer
		Escribir "Agregaste el activo:" token[a]
	FinPara
FinSubProceso
//Cerrar :v
SubProceso cerrarSesion
	wait
	Escribir "Cerrando Sesion.............."
	wait
	escribir "Gracias"
FinSubProceso
Algoritmo billeteraDigital
	//Bilitera digital para el token EPISIcoin
	login(id)
	iniciarSesion
	episicoin=0
	ns=episicoin/100
	Escribir "          ID:" id
	Escribir "|========= " episicoin " EPISIcoin =========|"
	Escribir " ------------ S/." ns " -------------"
	menu
FinAlgoritmo
