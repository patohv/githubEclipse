package artefactos;
/**
* Clase Lavadora
* @author Patricio Herrera V.
* {@version 2020/02/28
* 
*/
public class Lavadora extends Electrodomestico {

	int carga;
	static final int CARGA = 5;

	/**
	* Constructor por defecto
	*/
	public Lavadora() {
		super(PRECIO, PESO, COLOR, CONSUMO);
		this.carga = CARGA;
	}

	/**
	* Constructor parametros double precio, double peso
	*/
	public Lavadora(double precio, double peso) {
		super(precio, peso, COLOR, CONSUMO);
		this.carga = CARGA;
	}

	/**
	* Constructor con todos los parámetros
	*/
	public Lavadora(double precio, double peso, String color, char consumo, int carga) {
		super(PRECIO, PESO, COLOR, CONSUMO);
		this.carga = carga;
	}

	/**
	* Metodo get de carga
	*/
	public int getCarga() {
		return carga;
	}

	/**
	* Metodo para obtener todos los parametros
	*/
	public void getTodo() {
		System.out.println(precioBase);
		System.out.println(peso);
		System.out.println(color);
		System.out.println(consumo);
		System.out.println(carga);
	}
    
	/**
	* Metodo para calcular precio final
	*/
	public double precioFinal(){
        //Invocamos el método precioFinal del método padre
        double precioFinal=super.precioFinal();
  
        //añadimos el código necesario
        if (carga>30){
            precioFinal= precioBase + 50;
        }
        return precioFinal;
    }
}

