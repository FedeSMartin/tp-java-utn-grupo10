import com.opencsv.bean.CsvBindByPosition;

public class ArchivoResultados {
	
	@CsvBindByPosition(position = 0)
    private String ronda;
    @CsvBindByPosition(position = 1)
    private String equipo1;
    @CsvBindByPosition(position = 2)
    private int cantidadGoles1;
    @CsvBindByPosition(position = 3)
    private int cantidadGoles2;
    @CsvBindByPosition(position = 4)
    private String equipo2;
    
    public String getRonda() {
		return ronda;
	}
	public void setRonda(String ronda) {
		this.ronda = ronda;
	}
	
	public String getEquipo1() {
		return equipo1;
	}
	public void setEquipo1(String equipo1) {
		this.equipo1 = equipo1;
	}
	
	public int getCantidadGoles1() {
		return cantidadGoles1;
	}
	public void setCantidadGoles1(int cantidadGoles1) {
		this.cantidadGoles1 = cantidadGoles1;
	}
	
	public int getCantidadGoles2() {
		return cantidadGoles2;
	}
	public void setCantidadGoles2(int cantidadGoles2) {
		this.cantidadGoles2 = cantidadGoles2;
	}
	
	public String getEquipo2() {
		return equipo2;
	}
	public void setEquipo2(String equipo2) {
		this.equipo2 = equipo2;
	}
	
	////    ////    ¡CUIDADO, SIRVE PARA SABER SI LEE ARCHIVO!    ////    ////
	
//	@Override
//	public String toString() {
//	    return "ArchivoResultados{" +
//	    	"ronda='" + ronda + '\'' +
//	    	"equipo1='" + equipo1 + '\'' +
//			", cantidadGoles1=" + cantidadGoles1 +
//			", cantidadGoles2=" + cantidadGoles2 +
//			", equipo2='" + equipo2 + '\'' +
//			'}';
//	}
	
	/// EN LA PARTE DE ABAJO DE MUESTRAN LOS GOLES COMO STRINGS ///
	
//	@Override
//    public String toString() {
//        return "ArchivoResultados{" +
//               "equipo1='" + equipo1 + '\'' +
//               ", cantidadGoles1='" + cantidadGoles1 + '\'' +
//               ", cantidadGoles2='" + cantidadGoles2 + '\'' +
//               ", equipo2='" + equipo2 + '\'' +
//               '}';
//    }
	
	////	////    ////    ////    ////    ////    ////	////	////	////
	
}