package votaciones;

import java.util.ArrayList;
import java.util.Random;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Tablero {

	int i = 0;
	int j = 0;
	int fila = 0;
	int columna = 0;
	int pos = 0;
	int h = 0;
	int k = 0;
	int puntaje = 0;

	Carro[][] matrizCarros;
	ArrayList<Huevo> listaHuevos = new ArrayList<Huevo>();

	Random r = new Random();
//////////////////////////////////////////////////////////////
//	Crear Tablero 																					
//
	Tablero(int nfilas, int ncolumnas) {
		i = 0;
		j = 0;

		matrizCarros = new Carro[nfilas][ncolumnas];
	}

	public void crearCarro() {

		int fila = 0;
		int columna = 0;
		int pos = 0;
		int h = 0;
//////////////////////////////////////////////////////////////
// Crear Kromi
//
		int contador = 0;
		for (h = 0; h <= 2; h++) {  //Se crean 3 Kromi
			do {
				fila = r.nextInt(13) + 1;
				columna = r.nextInt(13) + 1;
				if (fila < 13) {
					if ((matrizCarros[fila][columna] == null) 
							&& (matrizCarros[fila + 1][columna] == null)
							&& (matrizCarros[fila + 2][columna] == null)) {
						matrizCarros[fila][columna] = new Carro("K", fila, columna, 5, 2015, "BalaK", 0, "", 4, "");
						matrizCarros[fila + 1][columna] = new Carro("K", fila + 1, columna, 5, 2015, "BalaK", 0, "", 4, "");
						matrizCarros[fila + 2][columna] = new Carro("K", fila + 2, columna, 5, 2015, "BalaK", 0, "", 4, "");
						// System.out.println("Se han creado 3 Kromi nuevos...");
						pos = 1;
					}
				}
			} while (pos == 0);
		}
//////////////////////////////////////////////////////////////
// Crea Coguana
//
		fila = 0;
		columna = 0;
		pos = 0;
		h = 0;

		for (h = 0; h <= 4; h++) { // Se crean 5 Coguana

			fila = r.nextInt(13) + 1;
			columna = r.nextInt(13) + 1;

			do {
				fila = r.nextInt(13) + 1;
				columna = r.nextInt(13) + 1;
				if (columna < 14) {
					if (matrizCarros[fila][columna] == null && matrizCarros[fila][columna + 1] == null) {
						matrizCarros[fila][columna] = new Carro("C", fila, columna, 5, 0, "", 2000, "Rojo", 0, "");
						matrizCarros[fila][columna + 1] = new Carro("C", fila, columna, 5, 0, "", 2000, "Rojo", 0, "");
						pos = 1;
						// System.out.println("Se han creado 5 Coguana nuevos ...");
					}
				}
			} while (pos == 0);
		}
//////////////////////////////////////////////////////////////
// Crea Trupalla
//
		fila = 0;
		columna = 0;
		pos = 0;
		int conta = 0;
		h = 0;

		for (h = 0; h <= 10; h++) { //Se crean 10 Trupalla
			do {
				fila = r.nextInt(13) + 1;
				columna = r.nextInt(13) + 1;
				if (fila < 15) {
					if ((matrizCarros[fila][columna] == null) 
					   && (conta <= 10)){
						matrizCarros[fila][columna] = new Carro("T", fila, columna, 5, 0, "", 0, "", 0, "");
						pos = 1;
//														System.out.println("Se han creado "+conta+" Trupalla nuevos...");
					}
				}
			} while (pos == 0);
		}
	}
//////////////////////////////////////////////////////////////
// Lanzar Huevos
//
	public void lanzarHuevo(int fil, int colum) {

		int fila = fil;
		int columna = colum;
//		System.out.println("fila   : "+fila);
//		System.out.println("colum  : "+columna);
		
		if (matrizCarros[fila - 1][columna - 1] != null) {

			if (matrizCarros[fila - 1][columna - 1].getDimeNombre() == "K") {
				Huevo huevo = new Huevo(fila, columna, 3);
				listaHuevos.add(huevo);
				matrizCarros[fila - 1][columna - 1].setNombre("h");
			}

			if (matrizCarros[fila - 1][columna - 1].getDimeNombre() == "C") {
				Huevo huevo = new Huevo(fila, columna, 2);
				listaHuevos.add(huevo);
				matrizCarros[fila - 1][columna - 1].setNombre("h");
			}

			if (matrizCarros[fila - 1][columna - 1].getDimeNombre() == "T") {
				Huevo huevo = new Huevo(fila, columna, 1);
				listaHuevos.add(huevo);
				matrizCarros[fila - 1][columna - 1].setNombre("h");
			}

		} else {
			// matrizCarros[fila][columna].setNombre("H");
			matrizCarros[fila - 1][columna - 1] = new Carro("H", fila, columna, 5, 0, "", 0, "", 0, "");

		}
	}
////////////////////////////////////////////////////////////////
// Calcular puntaje
//	
	public void calcularPuntaje() {
		int i = 0;
		int puntaje = 0;
		for (i = 0; i < listaHuevos.size(); i++) {
			puntaje = listaHuevos.get(i).getPuntaje() + puntaje;
		}
		System.out.println("El puntaje total es: " + puntaje);
	}
//////////////////////////////////////////////////////////////
// Mostrar matriz
//
	public void mostrarMatriz() {
		int x = 0;
		int y = 0;

		for (x = 0; x < matrizCarros.length; x++) {
			System.out.print("[");
			for (y = 0; y < matrizCarros[x].length; y++) {
				if (matrizCarros[x][y] != null) {
					String nombre = matrizCarros[x][y].getDimeNombre();
					System.out.print(nombre);
				} else {
					System.out.print("-");
				}
				if (y != matrizCarros[x].length - 1)
					System.out.print("] [");
			}
			System.out.println("]");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		tablero.mostrarMatriz();
//		
//		tablero.lanzarHuevo(2, 8);
//	
//		tablero.mostrarMatriz();
//		
//		tablero.calcularPuntaje();
//		
//		tablero.mostrarMatriz();

		Tablero tablero = new Tablero(15, 15);
		tablero.crearCarro();
		tablero.mostrarMatriz();
		System.out.println(" ");
		
		// Create objeto Scanner para lecturas
		Scanner entrada = new Scanner(System.in);
//////////////////////////////////////////////////////////////
// Generacion Menu Principal
//
		System.out.println("Menu Principal");
		System.out.println("*============*");
//		System.out.println("1 : Crear Tablero con Carros.");
		System.out.println("1 : Lanzar Huevos");
		System.out.println("2 : Calcular Puntaje");
		System.out.println("3 : Mostrar Matriz");
		System.out.println(" ");
		System.out.println("Ingrese Opcion del 1 al 3...(para salir digite [5]): ");

		int opcionTeclado = 0;

//		boolean ok = false;
//		try {
//			Integer.parseInt(opcionTeclado);
//			ok = true;
//		} catch (NumberFormatException nfe){
//			ok = false;
//		}
			
		while (opcionTeclado < 1 && opcionTeclado > 5) {
			System.out.println(" ");
//			System.out.println("Ingrese Opcion del 1 al 3...(para salir digite 5): ");
		}

		String param = "S";

		while (param.contentEquals("S")) {
			opcionTeclado = 0;
			try {
				opcionTeclado = entrada.nextInt();
			} catch (InputMismatchException e) {
				opcionTeclado = 5;
				System.out.println(" ");
			}

			switch (opcionTeclado) {

			case 1:
				System.out.println("Lanzar huevos");
				System.out.println(" ");
				System.out.println("Ingrese fila    [1 - 15]:");
				int filaTeclado = entrada.nextInt();
				System.out.println("Ingrese columna [1 - 15]:");
				int columnaTeclado = entrada.nextInt();
				tablero.lanzarHuevo(filaTeclado, columnaTeclado);
				tablero.mostrarMatriz();
				break;

			case 2:
				System.out.println("Calcular Puntaje");
				System.out.println(" ");
				tablero.calcularPuntaje();
				break;

			case 3:
				System.out.println("Mostrar Matriz");
				System.out.println(" ");
				tablero.mostrarMatriz();
				break;
				
			default:
				System.out.println(" ");
				if (opcionTeclado == 5) {
					System.out.println("Fin del proceso...");
					param = "N";
				} else {
					System.out.println("No se pudo determinar opcion. Elija otra...: ");
					entrada.next();
					param = "S";
				}
				break;
			}

		}
	}
}
