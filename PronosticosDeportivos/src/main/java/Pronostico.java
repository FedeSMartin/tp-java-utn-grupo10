
public class Pronostico {
	
	private String ronda;
	private Participante participante;
	private Partido partido;
	private Equipo equipo;
	
	private ArchivoPronosticos pronostico;
	
	private ResultadoEnum estado;
	
	public Pronostico(String ronda, Participante participante, Partido partido, Equipo equipo, ResultadoEnum estado) {
		
		this.ronda = ronda;
		
		//----------------
		
		this.participante = participante;
		this.partido = partido;
		this.equipo = equipo;
		
		//----------------
		
		this.setEstado(estado);
	}
	
	public Pronostico(String ronda, Participante participante, Partido partido, Equipo equipo) {
		
		this.ronda = ronda;
		this.participante = participante;
		this.partido = partido;
		this.equipo = equipo;
	}
	
	public Pronostico(String ronda, Participante participante) {
		
		this.ronda = ronda;
		this.participante = participante;

	}
	
	// RONDA
	public String getRonda() {
		return ronda;
	}
	
	public void setRonda(String ronda) {
		this.ronda = ronda;
	}
	//-----------------------------
	
	// PARTICIPANTE
	public Participante getParticipante() {
		return participante;
	}

	public void setParticipante(Participante participante) {
		this.participante = participante;
	}
	
	//-----------------------------
	
	// PARTIDO
	public Partido getPartido() {
		return partido;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
	}
	
	//-----------------------------
	
	// EQUIPO
	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
	//-----------------------------
	
	// RESULTADO DEL PARTIDO	
	public ResultadoEnum getEstado() {
		return estado;
	}

	public void setEstado(ResultadoEnum estado) {
		this.estado = estado;
	}
	//-----------------------------
	
	public ResultadoEnum estado() {
		
        if (partido.getGolesEquipo1() > partido.getGolesEquipo2() || pronostico.getGana1().equals("X")) {
        	
            return ResultadoEnum.GANA_EQUIPO1;
            
        } else if (partido.getGolesEquipo1() < partido.getGolesEquipo2() || pronostico.getGana2().equals("X")) {
  
            return ResultadoEnum.GANA_EQUIPO2;
            
        } else if (pronostico.getEmapata().equals("X")) {
        	
            return ResultadoEnum.EMPATE;
            
        }
        
		return estado;
    }
	
	//-----------------------------

	public static int puntos() {
		
	    // Aca podes colocar la lógica para calcular los puntos y devolver un valor entero.
		
	    int puntosCalculados = 0;
	    
	    
	    
		return puntosCalculados; // puntosCalculados es un ejemplo, tenes que reemplazarlo con la lógica real.
	}
}
