package practica1;

import java.util.Arrays;

public class Equipo {
	private String nombre;
	private String estadio;
	private int fundacion;
	private Jugador[] jugadores;
	private int puntos;
	private int partidosGanados;
	private int partidosPerdidos;

	private int partidosEmpatados;

	public Equipo(String nombre, String estadio, int fundacion, Jugador[] jugadores, int puntos, int partidoGanados,
			int partidosPerdidos, int partidosEmpatados) {
		this.nombre = nombre;
		this.estadio = estadio;
		this.fundacion = fundacion;
		this.jugadores = jugadores;
		this.puntos = puntos;
		this.partidosGanados = partidoGanados;
		this.partidosPerdidos = partidosPerdidos;
		this.partidosEmpatados = partidosEmpatados;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstadio() {
		return estadio;
	}

	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}

	public int getFundacion() {
		return fundacion;
	}

	public void setFundacion(int fundacion) {
		this.fundacion = fundacion;
	}

	public Jugador[] getJugadores() {
		return jugadores;
	}

	public void setJugadores(Jugador[] jugadores) {
		this.jugadores = jugadores;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public int getPartidosGanados() {
		return partidosGanados;
	}

	public void setPartidosGanados(int partidosGanados) {
		this.partidosGanados = partidosGanados;
	}

	public int getPartidosPerdidos() {
		return partidosPerdidos;
	}

	public void setPartidosPerdidos(int partidosPerdidos) {
		this.partidosPerdidos = partidosPerdidos;
	}

	public int getPartidosEmpatados() {
		return partidosEmpatados;
	}

	public void setPartidosEmpatados(int partidosEmpatados) {
		this.partidosEmpatados = partidosEmpatados;
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", estadio=" + estadio + ", fundacion=" + fundacion + ", jugadores="
				+ Arrays.toString(jugadores) + ", puntos=" + puntos + ", partidosGanados=" + partidosGanados
				+ ", partidosPerdidos=" + partidosPerdidos + ", partidosEmpatados=" + partidosEmpatados + "]";
	}
}
