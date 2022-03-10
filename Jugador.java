package practica1;

public class Jugador {
	private String nombre;
	private int dorsal;
	private int goles;
	private int tarjetasRojas;
	private int tarjetasAmarillas;

	public Jugador(String nombre, int dorsal, int goles, int tarjetasRojas, int tarjetasAmarillas) {
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.goles = goles;
		this.tarjetasRojas = tarjetasRojas;
		this.tarjetasAmarillas = tarjetasAmarillas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}

	public int getTarjetasRojas() {
		return tarjetasRojas;
	}

	public void setTarjetasRojas(int tarjetasRojas) {
		this.tarjetasRojas = tarjetasRojas;
	}

	public int getTarjetasAmarillas() {
		return tarjetasAmarillas;
	}

	public void setTarjetasAmarillas(int tarjetasAmarillas) {
		this.tarjetasAmarillas = tarjetasAmarillas;
	}
}
