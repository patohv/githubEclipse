package artefactos;

public class Television extends Electrodomestico {
	/**
	* Clase Television
	* @author Patricio Herrera V.
	* {@version 2020/02/28
	* 
	*/
	
	double resolucion;
	static final double RESOLUCION = 20;

	boolean sintonizadorTDT;
	static final boolean SINTONIZADOR = false;

	/**
	* Constructor por defecto 
	*/
	public Television() {
		super(PRECIO, PESO, COLOR, CONSUMO);
		this.resolucion = RESOLUCION;
		this.sintonizadorTDT = SINTONIZADOR;
	}

	/**
	* Constructor por defecto parametros double precio, double peso
	*/
	public Television(double precio, double peso) {
		super(precio, peso, COLOR, CONSUMO);
		this.resolucion = RESOLUCION;
		this.sintonizadorTDT = SINTONIZADOR;
	}

	/**
	* Constructor con todos los parametros
	*/
	public Television(double precio, double peso, String color, char consumo, double resolucion,
			boolean sintonizador) {
		super(PRECIO, PESO, COLOR, CONSUMO);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizador;
	}

	/**
	* Metodo para obtener resolucion
	*/
	public double getResolucion() {
		return resolucion;
	}

	/**
	* Metodo para obtener sintonizador
	*/
	public boolean getSintonizador() {
		return sintonizadorTDT;
	}

	/**
	* Metodo para obtener todos los parametros
	*/
	public void getTodo() {
		System.out.println(precioBase);
		System.out.println(peso);
		System.out.println(color);
		System.out.println(consumo);
		System.out.println(resolucion);
		System.out.println(sintonizadorTDT);

	}

	/**
	* Metodo para obtener precio final
	*/
	public double precioFinal() {
		double precioFinal = super.precioFinal();

		if (resolucion > 40) {
			precioFinal = precioBase * 1.3;
		}

		if (sintonizadorTDT) {
			precioFinal = precioBase * 1.5;
		}
		return precioFinal;
	}
}

