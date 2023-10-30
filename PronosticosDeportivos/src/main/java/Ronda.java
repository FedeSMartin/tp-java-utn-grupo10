
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
		
		 partidos[0] = new Partido("P1", 2, 1);
	     partidos[1] = new Partido("P2", 0, 0);
		
	}

}
