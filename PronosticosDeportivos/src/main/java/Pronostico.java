
public class Pronostico {
	
	private Partido partido;
	private Equipo equipo;
	private Participante participante;
	
	public Pronostico(Partido partido, Equipo equipo, Participante participante) {

		this.partido = partido;
		this.equipo = equipo;
		this.participante = participante;
	}
		

	public Partido getPartido() {
		return partido;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
	}


	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}


	public Participante getParticipante() {
		return participante;
	}

	public void setParticipante(Participante participante) {
		this.participante = participante;
	}


	public int puntos() {
		
	    // Aca podes colocar la lógica para calcular los puntos y devolver un valor entero.
		// Logica:
		// Si un participante predice correctamente al ganador, obtiene 3 puntos.
		// Si un participante predice correctamente al perdedor, obtiene 1 punto.
		// Si un participante predice correctamente un empate, obtiene 2 puntos.
		
	    int puntosCalculados = 0;
		return puntosCalculados; // puntosCalculados es un ejemplo, debes reemplazarlo con la lógica real.
	}

}
