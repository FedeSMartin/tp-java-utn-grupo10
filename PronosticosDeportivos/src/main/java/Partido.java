public class Partido {
	
	private String id;
    private Equipo equipo1;
    private Equipo equipo2;
    private int golesEquipo1;
    private int golesEquipo2;
   

    public Partido(String id, String nombreE1, String nombreE2, int golesEquipo1, int golesEquipo2) {
    	
    	this.id = id;
        this.equipo1 = new Equipo(nombreE1);
        this.equipo2 = new Equipo(nombreE2);
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
        
    }
    
    
	
	public void resultado(Equipo equipo) {
		
//		Scanner myLector = new Scanner("ruta de archivo");
		
		
	
		
		
		// Aca lee el archivo de resultados, extrae lo que necesita, ID, los equipos y los goles
		// Tambien lee el archivo de pronosticos, extrae los datos necesarios para comparar los datos
		
		// Si equipo1 tiene mas goles que equipo2, equipo1 "GANA", equipo2 "PIERDE". 
		// Si equipo 1 tiene mismos o ningun gol mas que equipo2, equipo1 y equipo2, "EMPATA"
		
		// La logica tiene que comparar los resultados y verificarlos en el Enum "ResultadosEnum"
				
		//this.equipo1 = equipo; // esto es una prueba
		// Retorna un Enum
	}
	
	// getters

	public String getId() {
		return id;
	}

	public int getGolesEquipo1() {
		return golesEquipo1;
	}

	public int getGolesEquipo2() {
		return golesEquipo2;
	}

	public Equipo getEquipo1() {
		return equipo1;
	}

	public Equipo getEquipo2() {
		return equipo2;
	}
	
}
