package votaciones;

public class Huevo {

	int fila;
	int columna;
	int puntaje;

	
	public Huevo (int fil, int colum, int punt) {
		fila = fil;
		columna = colum;
		puntaje = punt;

	}
//////////////////////////////////////////////////
// Metodo Obtener puntaje
//
	public int getPuntaje() {
		return puntaje;
	}
//////////////////////////////////////////////////
// Metodo Obtener Fila
//
	public int getFila() {
		return fila;
	}
//////////////////////////////////////////////////
// Metodo Obtner Columna
//
	public int getColumna() {
		return columna;
	}
}

//public class Huevo extends UsoCarro {
//
//	private String fila ;        //parametros
//	private String columna ;	        //parametros
//	private	String puntaje ;
//	
//	public Huevo (String fila) {
//	super();
//}
//}