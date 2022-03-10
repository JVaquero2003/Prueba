package practica1;

import java.util.Scanner;

public class Main {
	/**
	 * Pre:---
	 * Post: Este programa ejecuta un bucle en el que puedes elegir ver 
	 * la clasificacion de una liga de futbol, los pichichis, los más expulsados
	 * y los equipos más goleadores, el bucle solo parara cuendo el usuario le de al 0 
	 * para salir de el.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nombre = "";
		Equipo[] clasificacion;
		nombre = "LIGA SANTANDER";
		clasificacion = generadorEquipos();
		Liga liga1 = new Liga(nombre, clasificacion);
		System.out.println("HOLA A TODOS OS PRESENTO A LA " + nombre);
		System.out.println("1- CLASIFICACION ORDENADA POR PUNTOS");
		System.out.println("2- MAXIMOS 5 GOLEADORES");
		System.out.println("3- 5 JUGADORES CON MAS EXPULSIONES");
		System.out.println("4- LOS 3 EQUIPOS MAS GOLEADORES");
		System.out.println("5- PARA SALIR DEL MENU");
		System.out.println("-----------------------------------------------------------");
		while (true) {
			int opcion = entrada.nextInt();
			if (opcion == 5) {
				System.out.println("GRACIAS POR CONSULTAR LA " + nombre);
				break;
			} else if (opcion == 1) {
				liga1.ordenarClasificacion();
			} else if (opcion == 2) {
				liga1.maxGoleadores();
			} else if (opcion == 3) {
				liga1.maxExpulsones();
			} else if (opcion == 4) {
				liga1.maxEquiposGoleadores();
			}
		}
	}
	
	/**
	 * Pre:---
	 * Post: En este método se generan los jugadores.
	 */
	public static Jugador[] generadorNombres() {
		Jugador[] jugadores = new Jugador[11];
		String nombre = "";
		int dorsal = 0;
		int goles = 0;
		int tarjetasRojas = 0;
		int tarjetasAmarillas = 0;
		String[] nombres = { "Andrea", "David", "Baldomero", "Lionel", "Blaster", "Baltasar", "Barrilete", "Bartolo",
				"Bartolomé", "Benito", "Javier", "Jose Alfonso", "Campana", "Carlos", "Canela", "Lucas", "Cariño",
				"Clara", "Cristina", "Carlota", };
		String[] apellidos = { "Gomez", "Vaquero", "Guerrero", "Cardenas", "Seron", "Sanagustin", "Gaspar", "Marco",
				"Carrillo", "Carrion", "Murillo", "Lopez", "Castro", "Grande", "Camela", "Garris", "Gracia",
				"Ruiz", "Grivaldo" };
		int contador = 0;
		for (int i = 0; i < jugadores.length; i++) {
			nombre = nombres[(int) (Math.floor(Math.random() * ((nombres.length - 1) - 0 + 1) + 0))] + " "
					+ apellidos[(int) (Math.floor(Math.random() * ((apellidos.length - 1) - 0 + 1) + 0))];
			dorsal = (int) Math.round(Math.random() * 100);
			goles = (int) Math.round(Math.random() * 165);
			tarjetasRojas = (int) Math.round(Math.random() * 30);
			tarjetasAmarillas = (int) Math.round(Math.random() * 20);
			jugadores[i] = new Jugador(nombre, dorsal, goles, tarjetasRojas, tarjetasAmarillas);
		}
		return jugadores;
	}
	
	/**
	 * Pre:---
	 * Post: En este método se generan los equipos con 11 jugadores cada uno.
	 */
	public static Equipo[] generadorEquipos() {
		Equipo[] equipos = new Equipo[15];
		String nombre = "";
		String estadio = "";
		int fundacion = 0;
		Jugador[] jugadores;
		int puntos = 0;
		int partidosGanados = 0;
		int partidosPerdidos = 0;
		int partidosEmpatados = 0;
		String[] nombreEquipos = { "FC Barcelona", "Real Madrid", "Granada", "Alavés", "Athletic", "Atletico de Madrid",
				"Betis", "Celta", "Elche", "Espanyol", "Getafe", "Levante", "Mallorca", "Osasuna", "Rayo Vallecano" };
		String[] nombresEstadios = { "Camp Nou", "Santiago Bernabéu", "Los Carmenes", "Mendizorrotza", "San Mames",
				"Wanda Metropolitano", "Benito Villamarín", "Balaídos", "Manuel Martinez Valero", "RCDE Stadium",
				"Coliseum Alfonso Perez", "Ciutat de Valencia", "Son Moix", "El sadar", "Campo de Futbol de Vallecas" };
		for (int i = 0; i < equipos.length; i++) {
			nombre = nombreEquipos[i];
			estadio = nombresEstadios[i];
			fundacion = (int) Math.round(Math.random() * (2022 - 1850) + 1850);
			partidosGanados = (int) Math.round(Math.random() * 50);
			partidosPerdidos = (int) Math.round(Math.random() * (50 - partidosGanados));
			partidosEmpatados = 50 - (partidosGanados + partidosPerdidos);
			puntos = (int) Math.round(Math.random() * (partidosGanados * 3) + partidosEmpatados);
			jugadores = generadorNombres();
			equipos[i] = new Equipo(nombre, estadio, fundacion, jugadores, partidosGanados, partidosPerdidos,
					partidosEmpatados, puntos);
		}
		return equipos;
	}
}
