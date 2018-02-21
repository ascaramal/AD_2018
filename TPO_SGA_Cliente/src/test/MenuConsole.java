package test;

import java.util.Scanner;

public class MenuConsole {

	public static void main(String[] args) {

		System.out.println("Ingrese la Opción: ");
		System.out.println("1: Alta de Pedido");
		System.out.println("2: Recibir Orden de Compra");
		System.out.println("3: Actualizar Stock por Ajuste");
		System.out.println("4: Generar Cobranza");
		System.out.println("?: Ver Menu");
		System.out.println("q: Quit");
		Scanner scan = new Scanner(System.in);
		String opc = scan.nextLine();
		
		do {
		switch (opc){
		    case "1":
		        //alta de pedido;
		        System.out.println("ALTA DE PEDIDO:");
		        System.out.println("----------------------------------");

	        	//Agregar Pedido(int cliente, Pedido pedido);
		    	
		        break;
		    case "2":
		        //Recibir Orden de Compra;
		        System.out.println("RECEPCION DE ORDEN DE COMPRA:");
		        System.out.println("----------------------------------");


		        //recibirOC (int codigoOC);
		        
		    	break;
		    case "3":
		        System.out.println("ACTUALIZACION DE STOCK POR AJUSTE:");
		        System.out.println("----------------------------------");
		        System.out.println("Ingrese el Codigo del Articulo:");
		        int opCodArt = scan.nextInt();
		        System.out.println("Ingrese la cantidad Modificada: (incluyendo signo +/-) ");
		        int opCantMod = scan.nextInt();
		        System.out.println("Ingrese el Numero de Lote");
		        int opNroLote = scan.nextInt();
		        System.out.println("Ingrese la Ubicacion:");
		        int opUbic = scan.nextInt();
		        System.out.println("Ingrese el Numero de Legajo");
		        int opLegajo = scan.nextInt();
		        System.out.println("Ingrese el Motivo del Ajuste");
		        String opMotivo = scan.nextLine();
		        
		        //Si es mayor a cero
		        if (opCantMod > 0)
		        {	
		        //	modificarStockPorAjusteSalida(int opCodArt, int opCantMod, int opLegajo, String opMotivo, int nroUbic, int nroLote);
		        	break;
		        }
		        else
		        	//modificarStockPorAjusteEntrada(int opCodArt, int opCantMod, int opLegajo, String opMotivo, int nroUbic, int nroLote);
		            break;
			    
		    case "4":
		        //Generar Cobranza;
		        System.out.println("GENERACION DE COBRANZA:");
		        System.out.println("----------------------------------");
		        System.out.println("Ingrese el Codigo del Cliente:");
		        int opCodCl = scan.nextInt();
		        System.out.println("Ingrese el monto a Cobrar");
		        float opMonto = scan.nextFloat();
		        
		        //generar cobranza (int opCodCl; float opMonto);
		        
		    	break;
		        
		    	case "?":
					System.out.println("Ingrese la Opción: ");
					System.out.println("1: Alta de Pedido");
					System.out.println("2: Recibir Orden de Compra");
					System.out.println("3: Actualizar Stock por Ajuste");
					System.out.println("4: Generar Cobranza");
					System.out.println("?: Ver Menu");
					System.out.println("q: Quit");
					break;
		        }
		}
	while (opc != "q");
	}
}