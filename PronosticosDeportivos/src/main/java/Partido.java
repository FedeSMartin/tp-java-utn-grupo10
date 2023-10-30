
public class Partido {
	
	private String id;
	private int golesEquipo1;
	private int golesEquipo2;
	
	Equipo equipo1 = new Equipo("Cualquiera", "no se que poner");
	
	Equipo equipo2 = new Equipo("Esteesotro", "no se que poner2");
	
	public Partido(String id, int golesEquipo1, int golesEquipo2) {
		
		this.id = id;
		this.golesEquipo1 = golesEquipo1;
		this.golesEquipo2 = golesEquipo2;
		
	}
	
	public void resultado(Equipo equipo) {
		
		this.equipo1 = equipo; // esto es una prueba
		
	}

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
