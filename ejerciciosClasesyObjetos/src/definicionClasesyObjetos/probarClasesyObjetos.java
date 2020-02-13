package definicionClasesyObjetos;

import java.util.Scanner;

public class probarClasesyObjetos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Clase Scanner
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Ingrese un número...: ");
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
		
//		char charAt(int index): Devuelve el carácter que está en esa posición
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
		
		
//		Clase especial que contiene funciones y constantes matemáticas.
//		Se usa poniendo Math.<metodo>
//		Atributos: Math.E y Math.PI
//		static int abs(int a): Devuelve el valor absoluto del número pasado como parámetro. También se puede usar con cualquier otro tipo numérico (si le damos un double devolverá un double, etc.)
//		static long round(double a): Redondea el número pasado como parámetro. Si el número es double devuelve long, si es float devuelve int.
//		static double ceil(double a): Trunca el número hacia arriba (Math.ceil(3.2) devuelve 4.0), ¡ojo devuelve un double!
//		static double floor(double a): Trunca el número, ¡ojo devuelve un double!
//		static double sin(double a): Devuelve el seno del ángulo a (a debe estar en radianes). También hay cos, tan, asin, acos, atan,sinh, cosh, tanh
//		static int max (int a,int b): Devuelve el máximo de los dos números. También hay versiones para los otros tipos numéricos. También existe min (int a, int b).
//		static double log(double a): Devuelve el logaritmo neperiano de a, para el logaritmo decimal se usa log10(double a)
//		static double pow(double a, double b): Eleva a a b
//		static double exp(double a): Eleva el número e a a
//		static double sqrt(double a): Raíz cuadrada
//		static double cbrt(double a): Raíz cúbica
//		static double random(): Devuelve un número aleatorio entre 0.0 (incluido) y 1.0 (no incluido)	

	}

}
