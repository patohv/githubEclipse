package votaciones;

import java.util.*;

class Carro {
/**
 * Esta es la clase carro 
 * @author Grupo Karen, PAto, Camilo
 * {@version 2020/02/26
 * 
 */

//	Trupallas mitrupalla = new Trupallas()
	String nombre = "";
	int fila = 0;
	int columna = 0;
	int ocupantes = 0;
	int agno = 0;
	String marca = "";
	int tiro = 0;
	String confetti = "";
	int armadura = 0;
	String nombre2 = "";
	int anio = 0;
	int mes = 0;
	int dia = 0;
	Date fechaIngreso = new Date();

/** Carro
 * setNombre:
Permite registrar el nombre o tipo de vehículo (K, C, T).

getDimeNombre:
Permite obtener el nombre o tipo de vehículo (K, C, T).

Carro
	Es el objeto que contrila la información de los vehículos generados
 * @param nom
 * @param fila
 * @param columna
 * @param ocupan
 * @param ag
 * @param marc
 * @param tir
 * @param confe
 * @param arma
 * @param nomb
 */
	public Carro(String nom, int fila, int columna, int ocupan, 
			int ag, String marc, int tir, String confe, int arma, 
			String nomb) {

		nombre = nom;
		fila = fila;
		columna = columna;
		ocupantes = ocupan;
		agno = ag;
		marca = marc;
		tiro = tir;
		confetti = confe;
		armadura = arma;
		nombre2 = nomb;
		GregorianCalendar calendario = new GregorianCalendar(anio, mes - 1, dia);
		fechaIngreso = calendario.getTime();
	}

	public void setNombre(String nom) {
		nombre = nom;
	}

	public String getDimeNombre() {
		return nombre;
	}

//	 public String getNombre() {
//		 return nombre;
//	 }
////
////	public String getDimePosicion() {
////			return posicion;
////		}
////		public void setCambiaPosicion(String posicion) {
////			this.posicion = posicion;
////		}
////		public int getDimeOcupantes() {
////			return ocupantes;
////		}
////		public void setCambiaOcupantes(int ocupantes) {
////			this.ocupantes = ocupantes;
////		}
////		public Date getDimeFecha_ingreso() {
////			return fecha_ingreso;
////		}
////		public void setCambiaFecha_ingreso(Date fecha_ingreso) {
////			this.fecha_ingreso = fecha_ingreso;
////		}
////	
////	 public final String nombre ;	// VARIABLE FINAL PARA EVITAR CAMBIAR EL NOMBRE DADO EN EL CONSTRUCTOOR
////	 public String posicion ;
////	 public int ocupantes ;
////	 public Date fecha_ingreso ;
//	
}
