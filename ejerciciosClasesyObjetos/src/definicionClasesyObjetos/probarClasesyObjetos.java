package definicionClasesyObjetos;

import java.util.Scanner;

public class probarClasesyObjetos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Clase Scanner
		
		Scanner s = new Scanner(System.in);
		
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
			System.out.println("primero "+primero+" gual a "+segundo);
		} else {
			System.out.println("primero "+primero+" distinto a "+segundo);
		}
		
		primero = "primero";
		segundo = "PriMEo";
		dif = primero.compareToIgnoreCase(segundo);
		if (dif == 0) {
			System.out.println("primero "+primero+" gual a "+segundo);
		} else {
			System.out.println("primero "+primero+" distinto a "+segundo);
		}
		
		primero = "    hola como estas ...todo bien???     ";
		segundo = primero.trim();
		System.out.println("asi es primero "+primero);
		System.out.println("primero quedo como: "+segundo);
		

		primero = "33";
		int a = Integer.parseInt(primero); //a vale 33
		System.out.println("primero es numerico...: : "+a);
		
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

	}

}
