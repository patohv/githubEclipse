package estaciones;

import java.io.File;
import java.util.Scanner;

public class buscaRutas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String archivoLinea1;
//		String linea1[];
//		String linea2[];
//		String linea3[];
//		String linea4[];
//		String linea5[];
//		String linea6[];

		int contador = 0;
		int contador2 = 0;
		int largo = 0;
		int i = 0;
		int j = 0;
		String origen = "";
		String destino = "";
		String parte1 = "";
		String parte2  = "";

//		String [] arrlinea1 = new String[2];
		String [] origenlineas = new String[2];
		String [] destinolineas = new String[2];
		String [][] arrlinea1b = new String[27][2];
		
//Cargo archivo línea 1
//
		contador = 0;
		try {
			Scanner input = new Scanner(new File("C:\\MIOS\\Pato\\educacion\\JAVA\\tareas\\lineasmetro\\archivo1.csv"));
			while (input.hasNextLine()) {
				String line = input.nextLine();
				
				String[] arrlinea1 = line.split(";");

				parte1 = arrlinea1[0];
				parte2 = arrlinea1[1];

				arrlinea1b[contador][0] = parte1;
				arrlinea1b[contador][1] = parte2;

				contador = contador+1;
			}
			input.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		

		
		Scanner entrada = new Scanner(System.in); // Create a Scanner object

		System.out.println("Ingrese Estacion de Origen...: ");
		origen = entrada.nextLine();
		System.out.println(" ");

		System.out.println("Ingrese Estacion de Destino..: ");
		destino = entrada.nextLine();
		
//		Verifico existencia de estaciones en cada línea
//		Verifico linea1
		largo = 0;
		largo = arrlinea1b.length;
		contador2 = 0;
		i = 0;
		for (i=0; i<largo; i++) {

			if (arrlinea1b[i][1].contentEquals(origen)) {
				origenlineas[contador2] = "1";
				System.out.println("origenlinea  "+origenlineas[contador2]);
				contador2 = contador2+1;
				
			}
		}

		contador2 = 0;
		i = 0;
		for (i=0; i<largo; i++) {
			if (arrlinea1b[i][1].contentEquals(destino)) {
				destinolineas[contador2] = "1";
				System.out.println("destinolinea  "+destinolineas[contador2]);
				contador2 = contador2+1;
			}
		}
		
//		Verifico Línea 2
		
	}
}
