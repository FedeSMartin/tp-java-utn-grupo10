
public class Pronostico {
	
	private Participante participante;
	private Partido partido;
	private Equipo equipo;
	private String ganaEquipo1, empate, ganaEquipo2;
	private int idPronostico, ronda, idPartidoFK;
	
	private ArchivoPronosticos pronostico;
	
	private int puntaje;
	
	//private ResultadoEnum estado;
	
	public Pronostico(int rondaPronostico, String nombreParticipante, int puntos, int rondaPartido, String nombreE1, String nombreE2, int golesEquipo1, int golesEquipo2, String NombreEqGanador, ResultadoEnum estado) {
		
		this.ronda = rondaPronostico;
		
		//----------------
		
		this.participante = new Participante(nombreParticipante, puntos);
		this.partido = new Partido(rondaPartido, nombreE1, golesEquipo1, golesEquipo2, nombreE2);
		this.equipo = new Equipo(NombreEqGanador);
		
		//----------------
		
		//this.setEstado(estado);
	}
	
	
	public Pronostico(int idDePronostico, int rondaPronostico, String nombreParticipante, 
						String nombreE1, String ganaEquipo1, String empate, String ganaEquipo2, 
						String nombreE2, int idPartidoFK) {
		
		this.idPronostico = idDePronostico;
		this.ronda = rondaPronostico;
		
		//----------------
		
		this.participante = new Participante(nombreParticipante);
		this.partido = new Partido(idPartidoFK, nombreE1, nombreE2);
		
		//----------------
		
		this.ganaEquipo1 = ganaEquipo1;
		this.empate = empate;
		this.ganaEquipo2 = ganaEquipo2;
		
	}
	
	// RONDA
	public int getRonda() {
		return ronda;
	}
	
	public void setRonda(int ronda) {
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
	
	//
	public Equipo getEquipo() {
		return equipo;
	}


	public String getGanaEquipo1() {
		return ganaEquipo1;
	}


	public String getEmpate() {
		return empate;
	}


	public String getGanaEquipo2() {
		return ganaEquipo2;
	}


	public int getIdPronostico() {
		return idPronostico;
	}


	public int getIdPartidoFK() {
		return idPartidoFK;
	}


	public ArchivoPronosticos getPronostico() {
		return pronostico;
	}
	
	public int getPuntaje() {
		return puntaje;
	}


	@Override
	public String toString() {
		return "Pronostico [participante=" + participante + ", partido=" + partido + ", ganaEquipo1=" + ganaEquipo1
				+ ", empate=" + empate + ", ganaEquipo2=" + ganaEquipo2 + ", idPronostico=" + idPronostico + ", ronda="
				+ ronda + ", idPartidoFK=" + idPartidoFK + "]";
	}


	public static int puntos() {
		
	    // Aca podes colocar la lógica para calcular los puntos y devolver un valor entero.
		
		
		int puntosCalculados = 0;
	       
		return puntosCalculados; // puntosCalculados es un ejemplo, tenes que reemplazarlo con la lógica real.
	}


	public void setPuntaje(int puntaje) {
		
		this.puntaje = puntaje++;
		
	}
	
	
	//-----------------------------
	
	//-----------------------------
	
	// RESULTADO DEL PARTIDO	
//	public ResultadoEnum getEstado() {
//		return estado;
//	}
//
//	public void setEstado(ResultadoEnum estado) {
//		this.estado = estado;
//	}
	//-----------------------------
	
//	public ResultadoEnum estado() {
//		
//        if (partido.getGolesEquipo1() > partido.getGolesEquipo2() || pronostico.getGana1().equals("X")) {
//        	
//            return ResultadoEnum.GANA_EQUIPO1;
//            
//        } else if (partido.getGolesEquipo1() < partido.getGolesEquipo2() || pronostico.getGana2().equals("X")) {
//  
//            return ResultadoEnum.GANA_EQUIPO2;
//            
//        } else if (pronostico.getEmapata().equals("X")) {
//        	
//            return ResultadoEnum.EMPATE;
//            
//        }
//        
//		return estado;
//    }
	
	//-----------------------------
}
