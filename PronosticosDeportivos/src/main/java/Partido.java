public class Partido {
	
	private String ronda;
    private Equipo equipo1;
    private Equipo equipo2;
    private int golesEquipo1;
    private int golesEquipo2;
   
    public Partido(String ronda, String nombreE1, String nombreE2, int golesEquipo1, int golesEquipo2) {
    	
    	this.ronda = ronda;
        this.equipo1 = new Equipo(nombreE1);
        this.equipo2 = new Equipo(nombreE2);
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
        
    }
    
    public Partido(String nombreE1, String nombreE2, int golesEquipo1, int golesEquipo2) {
    	    	
    	this.equipo1 = new Equipo(nombreE1);
        this.equipo2 = new Equipo(nombreE2);
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
    	
    }
    
    public Partido(String ronda, String nombreE1, String nombreE2) {
    	
    	this.ronda = ronda;
        this.equipo1 = new Equipo(nombreE1);
        this.equipo2 = new Equipo(nombreE2);
        
    }
    
	public String getRonda() {
		return ronda;
	}
	
	public Equipo getEquipo1() {
		return equipo1;
	}

	public Equipo getEquipo2() {
		return equipo2;
	}

	public int getGolesEquipo1() {
		return golesEquipo1;
	}

	public int getGolesEquipo2() {
		return golesEquipo2;
	}
		
	public ResultadoEnum resultado() {
		
        if (this.golesEquipo1 > this.golesEquipo2) {
        	
            return ResultadoEnum.GANA_EQUIPO1;
            
        } else if (this.golesEquipo1 < this.golesEquipo2) {
  
            return ResultadoEnum.GANA_EQUIPO2;
            
        } else {
        	
            return ResultadoEnum.EMPATE;
            
        }
    }
	


//	public resultadoEnum resultado(Equipo equipo) {
//		
//	// Aca lee el archivo de resultados, extrae lo que necesita, ronda, los equipos y los goles
//	// Tambien lee el archivo de pronosticos, extrae los datos necesarios para comparar los datos
//	
//	// Si equipo1 tiene mas goles que equipo2, equipo1 "GANA", equipo2 "PIERDE". 
//	// Si equipo 1 tiene mismos o ningun gol mas que equipo2, equipo1 y equipo2, "EMPATA"
//	
//	// La logica tiene que comparar los resultados y verificarlos en el Enum "ResultadosEnum"
//			
//	// Retorna un Enum
//	
//}
}
