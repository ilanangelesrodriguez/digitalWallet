/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "BILLETERADIGITAL.java."

// Hay dos errores que se pueden generar al exportar un algoritmo con subprocesos desde PSeint a Java:
// 1) En java no se puede elegir entre pasaje por copia o por referencia. Técnicamente solo existe el
// pasaje por copia, pero los identificadores de objetos representan en realidad referencias a los
// objetos. Entonces, el pasaje para tipos nativos actúa como si fuera por copia, mientras que el
// pasaje para objetos (como por ejemplo String) actúa como si fuera por referencia. Esto puede llevar
// a que el algoritmo exportado no se comporte de la misma forma que el algoritmo original, en cuyo
// caso deberán modificarse algunos métodos (subprocesos exportados) para corregir el problema.
// 2) Las funciones que hacen lectura por teclado deben lazar una excepción. Si una función A es
// invocada por otra B, B también debe manejar (lanzar en este caso) las execpciones que lance A.
// Esto no se cumple en el código generado automáticamante: las funciones que realizan lecturas
// directamente incluyen el código que indica que pueden generar dicha excepción, pero las que
// lo hacen indirectamente (invocando a otras que sí lo hacen), puede que no, y deberán ser
// corregidas manualmente.

import java.io.*;

public class billeteradigital {
	BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));

	// SubAlgoritmo para el inicio de sesion
	public static void login(String id) throws IOException {
		String password;
		System.out.println("-----------------------------------");
		System.out.println("|=== Red principal de Ethereum ===|");
		System.out.println("-----------------------------------");
		System.out.println("=== Bienvenido a la EPISIwallet ===");
		System.out.println("-----------------------------------");
		System.out.print("Introduce tu direccion:");
		id = bufEntrada.readLine();
		System.out.print("Introduce tu clave:");
		password = bufEntrada.readLine();
	}

	public static void iniciarsesion() {
		WAIT();
		System.out.println("Iniciando Sesion..............");
		WAIT();
	}

	// Agrego tiempo de espera 
	public static void wait() throws InterruptedException {
		Thread.sleep(2*1000);
		System.out.println(""); // no hay forma directa de borrar la consola en Java
	}

	// Opciones de la billetera
	public static void menu(String id, double episicoin, double monto, double ns, double compra) throws IOException {
		int opc;
		episicoin = episicoin-monto+compra/100;
		ns = episicoin*100;
		System.out.println("          ID:"+id);
		System.out.println("|========= "+episicoin+" EPISIcoin =========|");
		System.out.println(" ----------- S/."+ns+" -------------");
		System.out.print("   "+"1.Enviar"+"     ");
		System.out.print("2.Comprar"+"     ");
		System.out.println("3.Activos"+"     ");
		System.out.print("4.Actividad"+"     ");
		System.out.print("5.Otro"+"     ");
		System.out.println("6.Cerrar Sesion");
		System.out.print("Seleccionar:");
		opc = Integer.parseInt(bufEntrada.readLine());
		switch (opc) {
		case 1:
			enviar(id,episicoin,monto);
			break;
		case 2:
			System.out.println("Comprar");
			comprar(id,episicoin,monto,ns);
			break;
		case 3:
			System.out.println("Activos");
			AGREGARACTIVO();
			// escribir token[a]
			break;
		case 4:
			System.out.println("Actividad");
			break;
		case 5:
			outro(id);
			break;
		case 6:
			CERRARSESION();
			break;
		}
		WAIT();
	}

	// Opciones complementarias
	public static void enviar(SIN_TIPO id, String episicoin, String monto) throws IOException {
		String id2;
		double z;
		WAIT();
		System.out.println("------------- Enviar a ------------");
		System.out.print("introduce la direccion:");
		id2 = bufEntrada.readLine();
		WAIT();
		System.out.println("Buscando....");
		WAIT();
		System.out.println("Activo:"+episicoin+" EPSIcoins");
		System.out.print("Importe:");
		monto = bufEntrada.readLine();
		System.out.println(monto+" EPISIcoins");
		System.out.println("Confirmar:");
		System.out.println("1. Si");
		System.out.println("2. No");
		z = bufEntrada.readLine();
		if (z==1) {
			System.out.println("Envio exitoso");
		} else {
			enviar(id,episicoin,monto);
		}
		WAIT();
		menu(id,episicoin,monto,ns,compra);
	}

	public static void comprar(SIN_TIPO id, SIN_TIPO episicoin, SIN_TIPO monto, String ns) throws IOException {
		double compra;
		double z;
		WAIT();
		System.out.println("-------- Comprar EPISIcoin --------");
		System.out.println("Activo: S/."+ns);
		System.out.print("Importe:");
		compra = bufEntrada.readLine();
		System.out.println("S/."+compra+" == "+compra/100+" EPISIcoins");
		System.out.println(" ");
		System.out.println("Confirmar:");
		System.out.println("1. Si");
		System.out.println("2. No");
		z = bufEntrada.readLine();
		if (z==1) {
			System.out.println("Compra exitosa");
		} else {
			enviar(id,episicoin,monto);
		}
		WAIT();
		menu(id,episicoin,monto,ns,compra);
	}

	public static void outro(SIN_TIPO id) throws IOException {
		int opc2;
		WAIT();
		System.out.println("|====== ¿No ves tu token? ======|");
		System.out.print("1.Actualizar lista"+"   ");
		System.out.println("2.Agregar activo");
		opc2 = Integer.parseInt(bufEntrada.readLine());
		switch (opc2) {
		case 1:
			WAIT();
			// menu
			break;
		case 2:
			System.out.println("Agregar activo");
			AGREGARACTIVO();
			System.out.println("======= Activo agregado =======");
			WAIT();
			// menu
			break;
		}
		menu(id,episicoin,monto,ns,compra);
	}

	public static void agregaractivo() throws IOException {
		int a;
		int i;
		String token[];
		double x;
		WAIT();
		token = new String[3];
		// Bitcoin
		token[0] = "BTC";
		// Ethereum 
		token[1] = "ETH";
		// Solana 
		token[2] = "SOL";
		for (i=0;i<=2;i++) {
			x = x+1;
			System.out.println(x+"."+token[i]);
		}
		for (i=0;i<=0;i++) {
			System.out.print("Selecciona activo:");
			a = bufEntrada.readLine();
		}
		for (i=0;i<=0;i++) {
			System.out.println("Agregaste el activo:"+token[a-1]);
		}
		WAIT();
		menu(id,episicoin,monto,ns,compra);
	}

	// Cerrar :v
	public static void cerrarsesion() {
		WAIT();
		System.out.println("Cerrando Sesion..............");
		WAIT();
		System.out.println("Gracias");
	}

	public static void main(String args[]) {
		double episicoin;
		String id;
		// Bilitera digital para el token EPISIcoin
		episicoin = 100;
		// episicoin=100*ns
		login(id);
		INICIARSESION();
		menu(id,episicoin,monto,ns,compra);
	}


}

