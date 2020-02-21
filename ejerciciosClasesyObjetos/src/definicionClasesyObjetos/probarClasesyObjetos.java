package definicionClasesyObjetos;

import java.util.ArrayList;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class probarClasesyObjetos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	Clase Scanner
//
		Scanner s = new Scanner(System.in);

		String[] maeletras = new String[18];
		int[] maenumero = new int[18];
		String[][] matletras = new String[18][2];
		int[][] matnumero = new int[18][2];

//####################################################

//	ArrayList
//
		ArrayList listaNums = new ArrayList();
		listaNums.add(8);
		listaNums.add(3);
		listaNums.add(5);
		System.out.println("Lista de numeros: " + listaNums);
		System.out.println("Numero posicion 2:" + listaNums.get(2));
		System.out.println("Numero posicion 1:" + listaNums.get(1));
		listaNums.set(0, 15);
		System.out.println("Lista de numeros: " + listaNums);
		
		// Declaraci�n de un ArrayList de "String". Puede ser de cualquier otro Elemento u Objeto (float, Boolean, Object, ...)
		ArrayList<String> nombreArrayList = new ArrayList<String>();
		// A�ade el elemento al ArrayList
		nombreArrayList.add("Elemento");
		// A�ade el elemento al ArrayList en la posici�n 'n'
		int n = 4;
		nombreArrayList.add(n, "Elemento 2");
		// Devuelve el numero de elementos del ArrayList
		nombreArrayList.size();
		// Devuelve el elemento que esta en la posici�n '2' del ArrayList
		nombreArrayList.get(2);
		// Comprueba se existe del elemento ('Elemento') que se le pasa como parametro
		nombreArrayList.contains("Elemento");
		// Devuelve la posici�n de la primera ocurrencia ('Elemento') en el ArrayList  
		nombreArrayList.indexOf("Elemento");
		// Devuelve la posici�n de la �ltima ocurrencia ('Elemento') en el ArrayList   
		nombreArrayList.lastIndexOf("Elemento");
		// Borra el elemento de la posici�n '5' del ArrayList   
		nombreArrayList.remove(5); 
		// Borra la primera ocurrencia del 'Elemento' que se le pasa como parametro.  
		nombreArrayList.remove("Elemento");
		//Borra todos los elementos de ArrayList   
		nombreArrayList.clear();
		// Devuelve True si el ArrayList esta vacio. Sino Devuelve False   
		nombreArrayList.isEmpty();  
		// Copiar un ArrayList 
		ArrayList arrayListCopia = (ArrayList) nombreArrayList.clone();  
		// Pasa el ArrayList a un Array 
		Object[] array = nombreArrayList.toArray(); 

		// ####################################################

//		Burbuja

		int arreglo[] = { 8, 6, 7, 2, 1, 8, 6, 8, 7, 1, 9, 10, 2, 1 };

		for (int i = 0; i < arreglo.length; i++) {
			for (int j = 0; j < arreglo.length - 1; j++) {
				if (arreglo[j] > arreglo[j + 1]) {
					int tmp = arreglo[j + 1];
					arreglo[j + 1] = arreglo[j];
					arreglo[j] = tmp;
				}
			}
		}
		for (int i = 0; i < arreglo.length; i++) {
			System.out.print(arreglo[i] + "\n");
		}

//##################################################
		String par2 = "S";
		int opcion = 0;
		while (par2.contentEquals("S")) {
			opcion = 0;
			try {
				opcion = 2;
			} catch (InputMismatchException e) {
				opcion = 5;
				System.out.println(" ");
			}

			switch (opcion) {
			case 1:
				System.out.println("Calculando digito verificador personas");
				System.out.println(" ");

//				validaRutPersona llamada1 = new validaRutPersona();
//				llamada1.validaRutPersona();
				break;

			case 2:
				System.out.println("Opci�n 2: Calculando digito verificador Patentes antiguas.");
				System.out.println(" ");

//				validaPatenteAntigua llamada2 = new validaPatenteAntigua();
//				llamada2.validaPatenteAntigua();
				par2 = "N";
				break;

			case 3:
				System.out.println("Opci�n 3: Calcula digito verificador Patentes nuevas.");
				System.out.println(" ");

//				validaPatenteNueva llamada3 = new validaPatenteNueva();
//				llamada3.validaPatenteNueva();
				par2 = "N";

				break;

			case 4:
				System.out.println("Opci�n 4: Pruebas.");
				System.out.println(" ");

//				pruebas llamada4 = new pruebas();
//				llamada4.pruebas();
				par2 = "N";

				break;
			default:
				System.out.println(" ");
				if (opcion == 9) {
					System.out.println("Fin del proceso...");
					par2 = "N";
				} else {
					System.out.println("No se pudo determinar opci�n. Elija otra...: ");
//					entrada.next();
					par2 = "S";
				}
				break;
			}
		}
//##################################################

//	      Ingreso de textos
//
		System.out.println("Ingrese un n�mero...: ");
		int b = 0;
		while (!s.hasNextInt())
			s.next();

		b = s.nextInt();
		System.out.println(b);

		System.out.println("Ingrese un texto...: ");
		String c = "";
		while (!s.hasNext())
			s.next();

		c = s.next();
		System.out.println(c);

		System.out.println("Ingrese un double...: ");
		double d = 0;
		while (!s.hasNextDouble())
			s.nextDouble();

		d = s.nextDouble();
		System.out.println(d);

//		System.out.println("Ingrese un boolean...: ");
//		boolean e = true;
//		while (!s.hasNextBoolean())
//			s.nextBoolean();
//				
//		e = s.nextBoolean();
//		System.out.println(e);

// Manejo de String

//		char charAt(int index): Devuelve el car�cter que est� en esa posici�n
		String primero = "primero";
		String segundo = "segundo";
		int dif = primero.compareTo(segundo);
		if (dif == 0) {
			System.out.println("primero " + primero + " gual a " + segundo);
		} else {
			System.out.println("primero " + primero + " distinto a " + segundo);
		}

		primero = "primero";
		segundo = "PriMEo";
		dif = primero.compareToIgnoreCase(segundo);
		if (dif == 0) {
			System.out.println("primero " + primero + " gual a " + segundo);
		} else {
			System.out.println("primero " + primero + " distinto a " + segundo);
		}

		primero = "    hola como estas ...todo bien???     ";
		segundo = primero.trim();
		System.out.println("asi es primero " + primero);
		System.out.println("primero quedo como: " + segundo);

		primero = "33";
		int a = Integer.parseInt(primero); // a vale 33
		System.out.println("primero es numerico...: : " + a);

//		Clase Math

//		Clase especial que contiene funciones y constantes matem�ticas.
//		Se usa poniendo Math.<metodo>
//		Atributos: Math.E y Math.PI
//		static int abs(int a): Devuelve el valor absoluto del n�mero pasado como par�metro. Tambi�n se puede usar con cualquier otro tipo num�rico (si le damos un double devolver� un double, etc.)
//		static long round(double a): Redondea el n�mero pasado como par�metro. Si el n�mero es double devuelve long, si es float devuelve int.
//		static double ceil(double a): Trunca el n�mero hacia arriba (Math.ceil(3.2) devuelve 4.0), �ojo devuelve un double!
//		static double floor(double a): Trunca el n�mero, �ojo devuelve un double!
//		static double sin(double a): Devuelve el seno del �ngulo a (a debe estar en radianes). Tambi�n hay cos, tan, asin, acos, atan,sinh, cosh, tanh
//		static int max (int a,int b): Devuelve el m�ximo de los dos n�meros. Tambi�n hay versiones para los otros tipos num�ricos. Tambi�n existe min (int a, int b).
//		static double log(double a): Devuelve el logaritmo neperiano de a, para el logaritmo decimal se usa log10(double a)
//		static double pow(double a, double b): Eleva a a b
//		static double exp(double a): Eleva el n�mero e a a
//		static double sqrt(double a): Ra�z cuadrada
//		static double cbrt(double a): Ra�z c�bica
//		static double random(): Devuelve un n�mero aleatorio entre 0.0 (incluido) y 1.0 (no incluido)	

		double num1 = 5;
		double num2 = 7;
		double num3 = 0;

		System.out.println(" ");

		num3 = Math.exp(num1);
		System.out.println("exponencial " + num3);

		num3 = Math.sqrt(num1);
		System.out.println("raiz " + num3);

		num3 = Math.random();
		System.out.println("random " + num3);

//		JOption
//		#################################################
		System.out.println("aqui voy ");

		JOptionPane.showMessageDialog(null, "Pruebas JOption");

		String[] optionsX = { "Opcion A", "Opcion B", "Opcion C", "Opcion D" };
		int seleccion = JOptionPane.showOptionDialog(null, "Es necesario que seleccione una opcion", "Titulo",
				JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, optionsX, optionsX[0]);

		System.out.println("Seleccion " + seleccion);

		JOptionPane.showMessageDialog(null, "Operaci�n realizada correctamente");

		JOptionPane.showMessageDialog(null, "Hello World");

		try {
			String firstNumber = JOptionPane.showInputDialog("Input <First Integer>");
			String secondNumber = JOptionPane.showInputDialog("Input <Second Integer>");

			num1 = Integer.parseInt(firstNumber);
			num2 = Integer.parseInt(secondNumber);
			double sum = num1 + num2;
			JOptionPane.showMessageDialog(null, "Sum is " + sum, "Sum of two Integers", JOptionPane.PLAIN_MESSAGE);
		} catch (Exception e) {
			Object[] options = { "OK", "CANCEL" };
			JOptionPane.showOptionDialog(null, "Debe ingresar valores numericos", "Warning", JOptionPane.DEFAULT_OPTION,
					JOptionPane.WARNING_MESSAGE, null, options, options[0]);
		}

		JOptionPane.showMessageDialog(null, "Hello World");

		String name = JOptionPane.showInputDialog("Type your name please");
		JOptionPane.showMessageDialog(null, "Hello " + name);

		JOptionPane.showConfirmDialog(null, "Desea comentar??", "Seleccion camino", JOptionPane.YES_NO_OPTION);

		Object[] options = { "OK", "CANCEL" };
		JOptionPane.showOptionDialog(null, "Debe ingresar toda la informaci�n solicitada", "Warning",
				JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);

		String inputValue = JOptionPane.showInputDialog("Ingrese un valor");
		inputValue = inputValue.toUpperCase();
		JOptionPane.showMessageDialog(null, inputValue);

		Object[] possibleValues = { "Valida Rut", "Patante Antigua", "Patente Nueva" };
		Object selectedValue = JOptionPane.showInputDialog(null, "Seleccione", "Menu principal",
				JOptionPane.INFORMATION_MESSAGE, null, possibleValues, possibleValues[0]);

//		Show an error dialog that displays the message, 'alert':
		JOptionPane.showMessageDialog(null, "alert", "alert", JOptionPane.ERROR_MESSAGE);

//			Show an internal information dialog with the message, 'information':
//			JOptionPane.showInternalMessageDialog(frame, "information",
//			"information", JOptionPane.INFORMATION_MESSAGE);

		String msj = "prueba de mensaje";
		JOptionPane.showMessageDialog(null, msj, // Mensaje
				"Mensaje Plano", // T�tulo
				JOptionPane.PLAIN_MESSAGE); // Tipo de mensaje

		JOptionPane.showMessageDialog(null, msj, // Mensaje
				"Mensaje Informativo", // T�tulo
				JOptionPane.INFORMATION_MESSAGE); // Tipo de mensaje

		JOptionPane.showMessageDialog(null, msj, // Mensaje
				"Mensaje de Pregunta", // T�tulo
				JOptionPane.QUESTION_MESSAGE); // Tipo de mensaje

		JOptionPane.showMessageDialog(null, msj, // Mensaje
				"Mensaje de Error", // T�tulo
				JOptionPane.ERROR_MESSAGE); // Tipo de mensaje

		JOptionPane.showMessageDialog(null, msj, // Mensaje
				"Mensaje de Advertencia", // T�tulo
				JOptionPane.WARNING_MESSAGE); // Tipo de mensaje

		String nl = System.getProperty("line.separator");
		// Lanzamos el mensaje:
		JOptionPane.showMessageDialog(null,
				"Soy un mensaje" + nl + "de varias l�neas..." + nl + "Y esto es todo .....");

	}
//	}
}
