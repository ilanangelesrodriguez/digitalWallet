/*
 * @ilanangelesrodriguez
 */
import java.util.Scanner;
public class billeteraDigital {
    public static void main(String[] args) {
        int  id,password, episicoin;
        episicoin=100;
        /*Direcciones*/
        int [] direccion=new int[5];
        direccion[0]=12345678;
        direccion[1]=23456789;
        direccion[2]=34567891;
        direccion[3]=45678912;
        direccion[4]=56789123;
        /*Contraseñas*/
        int [] contraseña=new int[5];
        contraseña[0]=1234;
        contraseña[1]=2345;
        contraseña[2]=3456;
        contraseña[3]=5678;
        contraseña[4]=6789;

        System.out.println("-----------------------------------");
	    System.out.println("|=== Red principal de Ethereum ===|");
	    System.out.println("-----------------------------------");
        System.out.println("=== Bienvenido a la EPISIwallet ===");
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce tu direccion:");
        id=teclado.nextInt();
        int elemento=busqueda(direccion,id);
        if (elemento == -1){
            System.out.println("No existe");
        }else {
            System.out.println("Bienvenido");
            System.out.print("Introduce tu clave:");
            password=teclado.nextInt();
            wait(2);
            iniciarsesion();
            wait(2);
            menu(episicoin);
        }
    }
    public static void iniciarsesion(){
        System.out.println("Iniciando Sesion ..............");
    }
    public static int busqueda(int[] direccion, int busc){
        for (int x=0; x<direccion.length;x++){
            if(direccion[x]==busc){
                return x;
            }
        }
        return -1;
    }
    public static void wait(int segundos){
        try {
            Thread.sleep(segundos * 1000);
         } catch (Exception e) {
            System.out.println(e);
         }
    }
    public static void menu(int episicoin){
        int opc,id2,ns,monto, z, compra, i, x=0, a=1, opc2;
        /*episicoin=episicoin-monto+compra/100;*/
	    ns=episicoin*100;
        /*System.out.println("          ID:" + id);*/
        System.out.println("|========= " + episicoin + " EPISIcoin =========|");
        System.out.println(" ----------- S/." + ns + " -------------");
        System.out.print("  " + "1.Enviar" + "     ");
	    System.out.print("2.Comprar" + "     ");
        System.out.println("3.Activos" + "     ");
        System.out.print("4.Actividad" + "     ");
        System.out.print("5.Otro" + "     ");
	    System.out.println("6.Cerrar Sesion");
        System.out.println("Seleccionar:");
        Scanner teclado = new Scanner(System.in);
	    opc=teclado.nextInt();
        switch(opc) {
            case 1:
                System.out.println("------------- Enviar a ------------");
                System.out.print("introduce la direccion:");
	            id2=teclado.nextInt();
	        /*wait(2)*/
                System.out.println("Buscando....");
                /*wait(2)*/
                /*System.out.println("Activo:" + episicoin + " EPSIcoins");*/
                System.out.println("Importe:");
                monto=teclado.nextInt();
                System.out.println(monto + " EPISIcoins");
                System.out.println("Confirmar:");
                System.out.println("1. Si");
                System.out.println("2. No");
                z=teclado.nextInt();
                if(z==1){
                    System.out.println("Envio exitoso");
                }
                if(z==0){
                    System.out.println("Accion cancelada");
                    /*enviar(id, episicoin, monto)*/
                }
	        /*menu(id, episicoin ,monto, ns, compra)*/
                break;
            case 2:
                System.out.println("-------- Comprar EPISIcoin --------");
                /*System.out.println("Activo: S/." + ns);*/
                System.out.print("Importe:");
                compra=teclado.nextInt();
                System.out.println("S/." + compra + " == " + compra/100 + " EPISIcoins");
                System.out.println(" ");
                System.out.println("Confirmar");
                System.out.println("1. Si");
                System.out.println("2. No");
                z=teclado.nextInt();
                if(z==1){
                    System.out.println("Compra exitoso");
                }
                if(z==0){
                    System.out.println("Accion cancelada");
                    /*enviar(id, episicoin, monto)*/
                }
                /*menu(id, episicoin, monto, ns, compra)*/
                break;
            case 3:
                String [] token= new String[3];
                token[0]="BTC";
                token[1]="ETH";
                token[2]="SOL";
                
                for (i=0;i<=2;i++) {
			x=x+1;
			System.out.println(x+"."+token[i]);
		}
		for (i=0;i<=0;i++) {
			System.out.print("Selecciona activo:");
			a=teclado.nextInt();
		}
		for (i=0;i<=0;i++) {
			System.out.println("Agregaste el activo:" + token[a-1]);
		}
                break;
            case 4:
                System.out.println("En proceso...........");
                break;
            case 5:
                System.out.println("|====== ¿No ves tu token? ======|");
                System.out.print("1.Actualizar lista" + "   ");
                System.out.println("2.Agregar activo");
                opc2=teclado.nextInt();
                switch (opc2) {
                    case 1: /*wait*/
                        break;
                    case 2: System.out.println("Agregar activo");
                            //case 3
                        System.out.println("======= Activo agregado =======");
                    default:
                        throw new AssertionError();
                }
                break;    
            default:
                System.out.println("Selecciona la opcion correcta");
        } while(opc != 0);
        System.out.println("Se termino el programa........");
    }
}