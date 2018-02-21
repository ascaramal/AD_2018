package test;

import java.util.Scanner;

public class ClienteMain {

	public static void main(String[] args) {

		System.out.println("Ingrese la Opción: ");
		System.out.println("1: Alta de Pedido");
		System.out.println("2: Recibir Orden de Compra");
		System.out.println("3: Actualizar Stock por Ajuste");
		System.out.println("4: Generar Cobranza");
		System.out.println("?: Ver Menu");
		System.out.println("q: Quit");
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		
		do {
		switch (choice){
		    case "1":
		        //alta de pedido;
		        break;
		    case "2":
		        //Recibir Orden de Compra;
		        break;
		    case "3":
		        System.out.println("ACTUALIZACION DE STOCK POR AJUSTE:");
		        System.out.println("----------------------------------");
		        System.out.println("Ingrese el Codigo del Articulo:");
		        int opCodArt = scan.nextInt();
		        System.out.println("Ingrese la cantidad Modificada:");
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
		        //	modificarStockPorAjusteEntrada(int opCodArt, int opCantMod, int opLegajo, String opMotivo, int nroUbic, int nroLote);
		        	break;
		        }
		        else
		        	//modificarStockPorAjusteEntrada(int opCodArt, int opCantMod, int opLegajo, String opMotivo, int nroUbic, int nroLote);
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
		}while (choice != "q");
	}
}