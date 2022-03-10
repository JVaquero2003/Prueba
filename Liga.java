package practica1;

public class Liga {
	private String nombre;
	private Equipo[] clasificacion;

	public Liga(String nombre, Equipo[] equipo) {
		this.nombre = nombre;
		this.clasificacion = equipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Equipo[] getEquipo() {
		return clasificacion;
	}

	public void setEquipo(Equipo[] equipo) {
		this.clasificacion = equipo;
	}
	
	/**
	 * Pre:---
	 * Post: En este método se le mandan la tabla de equipos, te la ordena por puntos
	 * y la muestra por pantalla.
	 */
	public void ordenarClasificacion() {
		Equipo[] clasificacion = this.clasificacion;
		int posicion = 0;
		int golesFavor = 0;

		for (int i = 0; i < clasificacion.length; i++) {
			for (int j = i + 1; j < clasificacion.length - 1; j++) {
				if (clasificacion[i].getPuntos() < clasificacion[j].getPuntos()) {
					Equipo nombreEquipos = clasificacion[j];
					clasificacion[j] = clasificacion[j + 1];
					clasificacion[j + 1] = nombreEquipos;
				}
			}
		}
		System.out.println("POS " + "   EQUIPO" + "           GF" + "     PG" + "    PP" + "     PE" + "    PUNTOS");
		for (int i = 0; i < clasificacion.length; i++) {
			posicion++;
			for (int j = 0; j < clasificacion[i].getJugadores().length; j++) {
				golesFavor = golesFavor + clasificacion[i].getJugadores()[j].getGoles();
			}
			System.out.print(posicion);
			System.out.print("  |  ");
			System.out.print(clasificacion[i].getNombre());
			System.out.print("  |  ");
			System.out.print(golesFavor);
			System.out.print("  |  ");
			System.out.print(clasificacion[i].getPartidosGanados());
			System.out.print("  |  ");
			System.out.print(clasificacion[i].getPartidosPerdidos());
			System.out.print("  |  ");
			System.out.print(clasificacion[i].getPartidosEmpatados());
			System.out.print("  |  ");
			System.out.println(clasificacion[i].getPuntos());
			golesFavor = 0;
		}
		System.out.println("-----------------------------------------------------------");
	}
	
	/**
	 * Pre:---
	 * Post: En este método se le mandan la tabla de equipos, te almacena en
	 * otra tabla todos los jugadores y te la ordena por goles de los jugadores
	 * y te muestra los 5 máximos goleadores.
	 */
	public void maxGoleadores() {
		Jugador[] jugadores = new Jugador[165];
		Equipo[] nombreEquipo = this.clasificacion;
		int contador = 0;
		for (int i = 0; i < nombreEquipo.length; i++) {
			for (int j = 0; j < nombreEquipo[i].getJugadores().length; j++) {
				jugadores[contador] = nombreEquipo[i].getJugadores()[j];
				contador++;
			}
		}
		for (int i = 0; i < jugadores.length; i++) {
			for (int j = i + 1; j < jugadores.length; j++) {
				if (jugadores[i].getGoles() < jugadores[j].getGoles()) {
					Jugador nombreJugador = jugadores[i];
					jugadores[i] = jugadores[j];
					jugadores[j] = nombreJugador;
				}
			}
		}

		for (int i = 0; i < 5; i++) {
			System.out.print(jugadores[i].getNombre());
			System.out.print("  |  ");
			System.out.print(jugadores[i].getGoles());
			System.out.println("  |  ");
		}
		System.out.println("-----------------------------------------------------------");
	}
	/**
	 * Pre:---
	 * Post: En este método se le mandan la tabla de equipos, te almacena en
	 * otra tabla todos los jugadores y te la ordena por expulsiones de los jugadores
	 * y te muestra los 3 máximos.
	 */
	public void maxExpulsones() {
		Jugador[] jugadores = new Jugador[165];
		Equipo[] nombreEquipo = this.clasificacion;
		int contador = 0;
		for (int i = 0; i < nombreEquipo.length; i++) {
			for (int j = 0; j < nombreEquipo[i].getJugadores().length; j++) {
				jugadores[contador] = nombreEquipo[i].getJugadores()[j];
				contador++;
			}
		}
		for (int i = 0; i < jugadores.length; i++) {
			for (int j = i + 1; j < jugadores.length; j++) {
				if (jugadores[i].getTarjetasRojas() < jugadores[j].getTarjetasRojas()) {
					Jugador nombreJugador = jugadores[i];
					jugadores[i] = jugadores[j];
					jugadores[j] = nombreJugador;
				}
			}
		}

		for (int i = 0; i < 5; i++) {
			System.out.print(jugadores[i].getNombre());
			System.out.print("  |  ");
			System.out.print(jugadores[i].getTarjetasRojas());
			System.out.println("  |  ");
		}
		System.out.println("-----------------------------------------------------------");
	}
	
	/**
	 * Pre:---
	 * Post: En este método se le mandan la tabla de equipos, te almacena y suma en
	 * otra tabla todos los goles de los jugadores de cada equipo
	 *  y te la ordena por goles de los jugadores
	 * y te muestra los 3 máximos.
	 */
	public void maxEquiposGoleadores() {
		Equipo[] clasificacion = this.clasificacion;
		int posicion = 0;
		int[] golesFavor = new int[15];
		
		for (int i = 0; i < clasificacion.length; i++) {
			posicion++;
			for (int j = 0; j < clasificacion[i].getJugadores().length; j++) {
				golesFavor[i] = golesFavor[i] + clasificacion[i].getJugadores()[j].getGoles();
			}
		}
		for (int i = 0; i < golesFavor.length; i++) {
			for(int j = i + 1; j < golesFavor.length; j++) {
				if (golesFavor[i] < golesFavor[j]) {
					int totalgoles = golesFavor[i];
					golesFavor[i] = golesFavor[j];
					golesFavor[j] = totalgoles;
					Equipo nombreEquipo = clasificacion[i];
					clasificacion[i] = clasificacion[j];
					clasificacion[j] = nombreEquipo;
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			System.out.print(clasificacion[i].getNombre());
			System.out.print("  |  ");
			System.out.print(golesFavor[i]);
			System.out.println("  |  ");
		}
		System.out.println("-----------------------------------------------------------");
	}

}
