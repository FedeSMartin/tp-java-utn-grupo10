
public class Participante {
	
	private String nombre;
	private int puntos;
	
	public Participante(String nombre, int puntos) {
	
		this.nombre = nombre;
		this.puntos = puntos;
	}
	
	public Participante(String nombre) {
		
		this.nombre = nombre;

	}

	public String getNombre() {
		return nombre;
	}

	public int getPuntos() {
		return puntos;
	}

	@Override
	public String toString() {
		return nombre;
	}
	
	
	
}
