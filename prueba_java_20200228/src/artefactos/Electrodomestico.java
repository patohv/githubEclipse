package artefactos;

import java.util.Arrays;

//import artefactos.Electrodomestico.Lavadora;

public class Electrodomestico {
/**
* Clase Electrodomestico
* @author Patricio Herrera V.
* {@version 2020/02/28
* 
*/
	double precioBase;
	String color;
	char consumo;
	double peso;

	static final double PRECIO = 100000;
	static final String COLOR = "blanco";
	static final char CONSUMO = 'F';
	static final double PESO = 5;

/**
* Constructor por defecto 
*/
// constructor por defecto
	public Electrodomestico() {
		precioBase = PRECIO;
		color = COLOR;
		consumo = CONSUMO;
		peso = PESO;
	}

	// constructor con precio y peso, el resto por defecto

	/**
	* Constructor por defecto parametros double precio, double peso
	*/

	public Electrodomestico(double pprecio, double ppeso) {
		precioBase = pprecio;
		peso = ppeso;
		this.color = COLOR;
		this.consumo = CONSUMO;
	}

	/**
	* Constructor por defecto todos los parametros
	*/
	public Electrodomestico(double pprecio, double ppeso, String pcolor, char pconsumo) {
		precioBase = pprecio;
		peso = ppeso;
		color = pcolor;
		consumo = pconsumo;
	}

	/**
	* Metodo get todos los valores
	*/

	public void getTodo() {
		System.out.println(precioBase);
		System.out.println(peso);
		System.out.println(color);
		System.out.println(consumo);

		return;
	}

	
	/**
	* Metodo comprobar consumo energetico
	*/
	public char comprobarConsumoEnergetico(char letra) {

		String[] consumo = { "A", "B", "C", "D", "E", "F" };

		String letraL = String.valueOf(letra);

		if (Arrays.asList(consumo).contains(letraL)) {
			return letra;
		} else {
			return CONSUMO;
		}
	}

	/**
	* Metodo comprobar color
	*/
	public String comprobarColor(String color) {

		String[] colores = { "negro", "rojo", "azul", "gris" };

		if (Arrays.asList(colores).contains(color)) {
			return color;
		} else {
			return COLOR;
		}
	}

	/**
	* Metodo calculo precio final
	*/

	public double precioFinal() {

		double precioTotal = 0;

		switch (consumo) {
		case 'A':
			precioTotal = precioTotal + 100;
			break;
		case 'B':
			precioTotal = precioTotal + 80;
			break;
		case 'C':
			precioTotal = precioTotal + 60;
			break;
		case 'D':
			precioTotal = precioTotal + 50;
			break;
		case 'E':
			precioTotal = precioTotal + 30;
			break;
		case 'F':
			precioTotal = precioTotal + 10;
			break;
		}

		if (peso >= 0 && peso < 19) {
			precioTotal = precioTotal + 10;
		}

		if (peso >= 20 && peso < 49) {
			precioTotal = precioTotal + 50;
		}

		if (peso >= 50 && peso <= 79) {
			precioTotal = precioTotal + 80;
		}

		if (peso >= 80) {
			precioTotal = precioTotal + 100;
		}

		return precioBase + precioTotal;
	}

}
