
public class Ronda {
	
	private String nro;

	public Ronda(String nro) {
		this.nro = nro;
	}

	public String getNro() {
		return nro;
	}	
	
	public static void main(String[] args) {
		
		Partido[] partidos = new Partido[2];
		
		// Agregar logica para tomar los datos de los equipos y cargarlos en el vector
		
		partidos[0] = new Partido("P1", equipo1, equipo2, 2, 1);
	    partidos[1] = new Partido("P2", equipo3, equipo4, 0, 0);
	    
	    Partido parti2 = new Partido("nro", null, null, 0, 0);
		
	}

}
