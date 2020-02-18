package estaciones;

import java.io.File;
import java.util.Scanner;

public class buscaRutas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int contador = 0;
		int contador2 = 0;
		int largo = 0;
		int i = 0;
		int j = 0;
		String origen = "";
		String destino = "";
		String parte1 = "";
		String parte2 = "";
		String parte3 = "";
		String buscaorig = "";
		String buscadest = "";
		String conresultado = "";
		String primera = "";
		String primeraok = "";
		String archivoLinea1;

//		String [] arrlinea1 = new String[2];
		String[] origenlineas = new String[6];
		String[] destinolineas = new String[6];

		String[][] comblinea = new String[28][3];
		String[][] arrlinea1b = new String[27][2];
		String[][] arrlinea2b = new String[26][2];
		String[][] arrlinea3b = new String[21][2];
		String[][] arrlinea4b = new String[26][2];
		String[][] arrlinea5b = new String[30][2];
		String[][] arrlinea6b = new String[27][2];

//		
//		llenaarchivos llamada = new llenaarchivos();
//		llamada.llenaarchivos();
		Scanner entrada = new Scanner(System.in); // Create a Scanner object

//		Cargo archivo de combinaciones
//
		parte1 = "";
		parte2 = "";
		parte3 = "";
//		
		contador = 0;
		try {
			Scanner input = new Scanner(new File("C:\\pato\\IDE_Eclipse_Des\\tarea\\lineasmetro\\combinaciones.csv"));
			while (input.hasNextLine()) {
				String line = input.nextLine();

				String[] arrlinea2 = line.split(";");

				parte1 = arrlinea2[0];
				parte2 = arrlinea2[1];
				parte3 = arrlinea2[2];

//				System.out.println("parte1 "+parte1);
//				System.out.println("parte2 "+parte2);
//				System.out.println("parte3 "+parte3);
//				System.out.println("contador "+contador);
				comblinea[contador][0] = parte1;
				comblinea[contador][1] = parte2;
				comblinea[contador][2] = parte3;

				contador = contador + 1;
			}
			input.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		i = 0;
//		for (i = 0; i < 28; i++) {
//			System.out.println("comblinea " + comblinea[i][0]);
//			System.out.println("comblinea " + comblinea[i][1]);
//			System.out.println("comblinea " + comblinea[i][2]);
//		}

//		Cargo archivo línea 1
//
		contador = 0;
		try {
			Scanner input = new Scanner(new File("C:\\pato\\IDE_Eclipse_Des\\tarea\\lineasmetro\\archivo1.csv"));
			while (input.hasNextLine()) {
				String line = input.nextLine();

				String[] arrlinea1 = line.split(";");

				parte1 = arrlinea1[0];
				parte2 = arrlinea1[1];

				arrlinea1b[contador][0] = parte1;
				arrlinea1b[contador][1] = parte2;

				contador = contador + 1;
			}
			input.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

//		Leo Estaciones para evaluar
//
		System.out.println("Ingrese Estacion de Origen...: ");
		origen = entrada.nextLine();
		System.out.println(" ");
		System.out.println("origen " + origen);

		System.out.println("Ingrese Estacion de Destino..: ");
		destino = entrada.nextLine();
		System.out.println(" ");
		System.out.println("destino " + destino);

//		Cargo archivo línea 2
//
		contador = 0;
		parte1 = "";
		parte2 = "";
		try {
			Scanner input = new Scanner(new File("C:\\pato\\IDE_Eclipse_Des\\tarea\\lineasmetro\\archivo2.csv"));
			while (input.hasNextLine()) {
				String line = input.nextLine();

				String[] arrlinea2 = line.split(";");

				parte1 = arrlinea2[0];
				parte2 = arrlinea2[1];

				arrlinea2b[contador][0] = parte1;
				arrlinea2b[contador][1] = parte2;

				contador = contador + 1;
			}
			input.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

//		Cargo archivo línea 3
//
		contador = 0;
		parte1 = "";
		parte2 = "";
		try {
			Scanner input = new Scanner(new File("C:\\pato\\IDE_Eclipse_Des\\tarea\\lineasmetro\\archivo3.csv"));
			while (input.hasNextLine()) {
				String line = input.nextLine();

				String[] arrlinea3 = line.split(";");

				parte1 = arrlinea3[0];
				parte2 = arrlinea3[1];

				arrlinea3b[contador][0] = parte1;
				arrlinea3b[contador][1] = parte2;

				contador = contador + 1;
			}
			input.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		i = 0;
//		for (i=0; i<21; i++) {
//			System.out.println("recorro arrlinea3b "+arrlinea3b[i][1]);
//		}

//		Cargo archivo línea 4
//
		contador = 0;
		parte1 = "";
		parte2 = "";
		try {
			Scanner input = new Scanner(new File("C:\\pato\\IDE_Eclipse_Des\\tarea\\lineasmetro\\archivo4.csv"));
			while (input.hasNextLine()) {
				String line = input.nextLine();

				String[] arrlinea4 = line.split(";");

				parte1 = arrlinea4[0];
				parte2 = arrlinea4[1];

				arrlinea4b[contador][0] = parte1;
				arrlinea4b[contador][1] = parte2;

				contador = contador + 1;
			}
			input.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

//		Cargo archivo línea 5
//
		contador = 0;
		parte1 = "";
		parte2 = "";
		try {
			Scanner input = new Scanner(new File("C:\\pato\\IDE_Eclipse_Des\\tarea\\lineasmetro\\archivo5.csv"));
			while (input.hasNextLine()) {
				String line = input.nextLine();

				String[] arrlinea5 = line.split(";");

				parte1 = arrlinea5[0];
				parte2 = arrlinea5[1];

				arrlinea5b[contador][0] = parte1;
				arrlinea5b[contador][1] = parte2;

				contador = contador + 1;
			}
			input.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

//		Cargo archivo línea 6
//
//		contador = 0;
//		parte1 = "";
//		parte2 = "";
//		try {
//			Scanner input = new Scanner(new File("C:\\pato\\IDE_Eclipse_Des\\tarea\\lineasmetro\\archivo6.csv"));
//			while (input.hasNextLine()) {
//				String line = input.nextLine();
//				
//				String[] arrlinea6 = line.split(";");
//
//				parte1 = arrlinea6[0];
//				parte2 = arrlinea6[1];
//
//				arrlinea6b[contador][0] = parte1;
//				arrlinea6b[contador][1] = parte2;
//
//				contador = contador+1;
//			}
//			input.close();
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}

//#########################################################################

//		Verifico existencia de estaciones en cada línea
//		Verifico linea1
//		System.out.println("Verificando linea 1...");
		largo = 0;
		largo = arrlinea1b.length;
//		System.out.println("largo(1)  " + largo);
		contador2 = 0;
		i = 0;
		for (i = 0; i < largo; i++) {

			if (arrlinea1b[i][1].contentEquals(origen)) {
				origenlineas[1] = "1";
				buscaorig = "1";
//				System.out.println("origenlinea  " + origenlineas[1]);
//				contador2 = contador2 + 1;

			}
		}

		contador2 = 0;
		i = 0;
		for (i = 0; i < largo; i++) {
			if (arrlinea1b[i][1].contentEquals(destino)) {
				destinolineas[1] = "1";
				buscadest = "1";
//				System.out.println("destinolinea  " + destinolineas[1]);
//				System.out.println("contador(1)  " + contador2);
//				contador2 = contador2 + 1;
			}
		}

//		Verifico Línea 2		
//		Verifico existencia de estaciones en cada línea
//		Verifico linea1
//		System.out.println("Verificando linea 2...");
		largo = 0;
		largo = arrlinea2b.length;
//		System.out.println("largo(2)  " + largo);
		contador2 = 0;
		i = 0;
		for (i = 0; i < largo; i++) {

			if (arrlinea2b[i][1].contentEquals(origen)) {
				origenlineas[2] = "1";
				buscaorig = "2";
//				System.out.println("origenlinea  " + origenlineas[2]);
//				contador2 = contador2 + 1;

			}
		}

		contador2 = 0;
		i = 0;
		for (i = 0; i < largo; i++) {
			if (arrlinea2b[i][1].contentEquals(destino)) {
				destinolineas[2] = "1";
				buscadest = "2";
//				System.out.println("destinolinea  " + destinolineas[2]);
//				System.out.println("contador(2)  " + contador2);
//				contador2 = contador2 + 1;
			}
		}

////		Verifico Línea 3		
////		Verifico existencia de estaciones en cada línea
////		Verifico linea1
//		System.out.println("Verificando linea 3...");
		largo = 0;
		largo = arrlinea3b.length;
//		System.out.println("largo(3) " + largo);
		contador2 = 0;
		i = 0;
		for (i = 0; i < largo; i++) {
			if (arrlinea3b[i][1].contentEquals(origen)) {
				origenlineas[3] = "1";
				buscaorig = "3";
//				System.out.println("origenlinea  " + origenlineas[3]);
//				contador2 = contador2 + 1;

			}
		}

		contador2 = 0;
		i = 0;
		for (i = 0; i < largo; i++) {
			if (arrlinea3b[i][1].contentEquals(destino)) {
				destinolineas[3] = "1";
				buscadest = "3";
//				System.out.println("destinolinea  " + destinolineas[3]);
//				System.out.println("contador(5)  " + contador2);
//				contador2 = contador2 + 1;
			}
		}

//		Verifico Línea 4		
//		Verifico existencia de estaciones en cada línea
//		Verifico linea1
//		System.out.println("Verificando linea 4...");
		largo = 0;
		largo = arrlinea4b.length;
//		System.out.println("largo(4)  " + largo);
		contador2 = 0;
		i = 0;
		for (i = 0; i < largo; i++) {

			if (arrlinea4b[i][1].contentEquals(origen)) {
				origenlineas[4] = "1";
				buscaorig = "4";
//				System.out.println("origenlinea  " + origenlineas[4]);
//				contador2 = contador2 + 1;
			}
		}

		contador2 = 0;
		i = 0;
		for (i = 0; i < largo; i++) {
			if (arrlinea4b[i][1].contentEquals(destino)) {
				destinolineas[4] = "1";
				buscadest = "4";
//				System.out.println("destinolinea  " + destinolineas[4]);
//				System.out.println("contador(4)  " + contador2);
//				contador2 = contador2 + 1;
			}
		}

//		Verifico Línea 5		
//		Verifico existencia de estaciones en cada línea
//		Verifico linea1
//		System.out.println("Verificando linea 5...");
		largo = 0;
		largo = arrlinea5b.length;
//		System.out.println("largo(5)  " + largo);
		contador2 = 0;
		i = 0;
		for (i = 0; i < largo; i++) {

			if (arrlinea5b[i][1].contentEquals(origen)) {
				origenlineas[5] = "1";
				buscaorig = "5";
//				System.out.println("origenlinea  " + origenlineas[5]);
//				contador2 = contador2 + 1;
			}
		}

		contador2 = 0;
		i = 0;
		for (i = 0; i < largo; i++) {
			if (arrlinea5b[i][1].contentEquals(destino)) {
				destinolineas[5] = "1";
				buscadest = "5";
//				System.out.println("destinolinea  " + destinolineas[5]);
//				System.out.println("contador(5)  " + contador2);
//				contador2 = contador2 + 1;
			}
		}

//		Verifico Línea 6		
//		Verifico existencia de estaciones en cada línea
//		Verifico linea1
//		System.out.println("Verificando linea 6...");
//		largo = 0;
//		largo = arrlinea6b.length;
//		contador2 = 0;
//		i = 0;
//		for (i=0; i<largo; i++) {
//
//			if (arrlinea6b[i][1].contentEquals(origen)) {
//				origenlineas[6] = "1";
//				buscaorig = "6";
//				System.out.println("origenlinea  "+origenlineas[6]);
//				contador2 = contador2+1;
//				
//			}
//		}
//
//		contador2 = 0;
//		i = 0;
//		for (i=0; i<largo; i++) {
//			if (arrlinea6b[i][1].contentEquals(destino)) {
//				destinolineas[6] = "1";
//				buscadest = "6";
//				System.out.println("destinolinea  "+destinolineas[6]);
//				contador2 = contador2+1;
//			}
//		}

//		Busco combinaciones para Origen y Destino
//

//		Voy a buscar Estaciones de coincidencia en tabla Combinaciones
//		
		String combinacion = "";
		i = 0;
		for (i = 0; i < 28; i++) {
			if ((buscaorig.contentEquals(comblinea[i][1])) && (buscadest.contentEquals(comblinea[i][2]))) {
				combinacion = comblinea[i][0];

			}
		}

		System.out.println("combinacion ");
		System.out.println("origen  " + buscaorig);
		System.out.println("origen  " + origen);
		System.out.println("destino " + buscadest);
		System.out.println("destino " + destino);
		System.out.println("combinacion " + combinacion);

		if (origen.contentEquals(destino)) {
			System.out.println("Estación Origen: " + origen + " y Destino: " + destino + " , son iguales...");
			conresultado = "S";
		}

//		String[][] arrlinea1b = new String[27][2];
//		String[][] arrlinea2b = new String[26][2];
//		String[][] arrlinea3b = new String[21][2];
//		String[][] arrlinea4b = new String[26][2];
//		String[][] arrlinea5b = new String[30][2];
//		String[][] arrlinea6b = new String[27][2];

		primera = "";
		if (buscaorig.contentEquals(buscadest) && conresultado != "S") {
			System.out.println("Estaciones Origen: " + origen + " y Destino: " + destino + " , en la misma línea...");
			conresultado = "S";
		}


		switch (buscaorig) {
		case "1":
			primeraok = "";
			primera = "";
			for (i = 0; i < 27; i++) {
				System.out.println("Estaciones Origen: "+ origen);
				System.out.println("arreglo "+arrlinea1b[i][1]);
				if (origen.contentEquals(arrlinea1b[i][1]) 
					&& primeraok != "S") {
					primeraok = "S";
					primera = "O";
				}
				if (origen.contentEquals(arrlinea1b[i][1])
				&& primeraok != "S") {
						primeraok = "S";
						primera = "D";
				}

			}
			System.out.println("primera " + primera);

			conresultado = "S";
			break;

		case "2":
			conresultado = "S";
			break;

		case "3":
			conresultado = "S";
			break;

		case "4":
			conresultado = "S";
			break;

		case "5":
			conresultado = "S";
			break;

		case "6":
			conresultado = "S";
			break;

		}

	}

//		Ahora busco las rutas para arriba y para abajo de la linea
//		
//		Switch{
//			Case: buscaorig = "1"
//					largo = 0;
//					largo = arrlinea1b.length;
//					i = 0;
//					do {
//						i++;
//						while (!(arrlinea1b[i][1].contentEquals(origen))
//								&& !(arrlinea1b[i][1].contentEquals(destino)))
//					}
//					
//						if ((arrlinea1b[i][1].contentEquals(origen))
//							|| (arrlinea1b[i][1].contentEquals(destino))){
//							buscaorig = "4";
//							System.out.println("origenlinea  " + origenlineas[4]);
//							contador2 = contador2 + 1;
//						}
//					break;
//		}
}
