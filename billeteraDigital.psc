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
//Agrego tiempo de espera 
SubProceso wait
	esperar 2 Segundos
	borrar pantalla
FinSubProceso
//Opciones de la billetera
SubProceso menu(id Por Referencia, episicoin Por Referencia , monto Por Referencia, ns Por Referencia, compra Por Referencia)
	episicoin=episicoin-monto+compra/100
	ns=episicoin*100
	Escribir "          ID:" id
	Escribir "|========= " episicoin " EPISIcoin =========|"
	Escribir " ----------- S/." ns " -------------"
	escribir "   " "1.Enviar" "     " Sin Saltar
	escribir "2.Comprar" "     " Sin Saltar
	escribir "3.Activos" "     " 
	escribir "4.Actividad" "     " Sin Saltar
	escribir "5.Otro" "     " Sin Saltar
	escribir "6.Cerrar Sesion" 
	escribir "Seleccionar:" Sin Saltar
	leer opc
	segun opc hacer
		1: enviar(id, episicoin, monto)
		2: Escribir "Comprar"
			comprar(id, episicoin, monto, ns)
		3: Escribir "Activos"
			agregarActivo
		   //escribir token[a]
		4: Escribir "Actividad"	
		5: outro(id)
		6: cerrarSesion
	FinSegun
	wait
FinSubProceso
//Opciones complementarias
SubProceso enviar(id Por Referencia, episicoin Por Referencia, monto Por Referencia)
	wait
	escribir "------------- Enviar a ------------"
	escribir "introduce la direccion:" Sin Saltar
	Leer id2
	wait
	Escribir "Buscando...."
	wait
	escribir "Activo:" episicoin " EPSIcoins"
	escribir "Importe:" Sin Saltar
	leer monto 
	escribir monto " EPISIcoins"
	escribir "Confirmar:"
	escribir "1. Si"
	escribir "2. No"
	leer z
	si z=1 Entonces
		Escribir "Envio exitoso"
	SiNo
		enviar(id, episicoin, monto)
	FinSi
	wait
	menu(id, episicoin ,monto, ns, compra)
FinSubProceso
SubProceso comprar(id Por Referencia, episicoin Por Referencia, monto Por Referencia, ns Por Referencia)
	wait
	Escribir "-------- Comprar EPISIcoin --------"
	Escribir "Activo: S/." ns
	Escribir "Importe:" sin saltar
	leer compra
	escribir "S/." compra " == " compra/100 " EPISIcoins"
	escribir " "
	escribir "Confirmar:"
	escribir "1. Si"
	escribir "2. No"
	leer z
	si z=1 Entonces
		Escribir "Compra exitosa"
	SiNo
		enviar(id, episicoin, monto)
	FinSi
	wait
	menu(id, episicoin, monto, ns, compra)
FinSubProceso
SubProceso outro(id Por Referencia)
	wait
	escribir "|====== ¿No ves tu token? ======|"
	Escribir "1.Actualizar lista" "   " Sin Saltar
	Escribir "2.Agregar activo"
	leer opc2
	segun opc2 Hacer
		1: wait
		   //menu
	   2: escribir "Agregar activo"
		   agregarActivo
		   escribir "======= Activo agregado ======="
		   wait
		   //menu
   FinSegun
   menu(id , episicoin , monto , ns , compra)
FinSubProceso
SubProceso agregarActivo
	wait
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
		Escribir "Agregaste el activo:" token[a-1]
	FinPara
	wait
	menu(id, episicoin ,monto, ns, compra)
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
	episicoin=100
	//episicoin=100*ns
	login(id)
	iniciarSesion
	menu(id, episicoin,monto, ns, compra)
FinAlgoritmo
