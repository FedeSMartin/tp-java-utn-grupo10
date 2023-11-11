import com.opencsv.bean.CsvBindByPosition;

public class ArchivoPronosticos {
		
	@CsvBindByPosition(position = 0)
    private String participante;
    @CsvBindByPosition(position = 1)
    private String equipo1;
    @CsvBindByPosition(position = 2)
    private String gana1;
    @CsvBindByPosition(position = 3)
    private String emapata;
    @CsvBindByPosition(position = 4)
    private String gana2;
    @CsvBindByPosition(position = 5)
    private String equipo2;
    
    public String getParticipante() {
		return participante;
	}
	public void setParticipante(String participante) {
		this.participante = participante;
	}
	
	public String getEquipo1() {
		return equipo1;
	}
	public void setEquipo1(String equipo1) {
		this.equipo1 = equipo1;
	}
	
	public String getGana1() {
		return gana1;
	}
	public void setGana1(String gana1) {
		this.gana1 = gana1;
	}
	
	public String getEmapata() {
		return emapata;
	}
	public void setEmapata(String emapata) {
		this.emapata = emapata;
	}
	
	public String getGana2() {
		return gana2;
	}
	public void setGana2(String gana2) {
		this.gana2 = gana2;
	}
	
	public String getEquipo2() {
		return equipo2;
	}
	public void setEquipo2(String equipo2) {
		this.equipo2 = equipo2;
	}
	
	////	////    ¡CUIDADO, SIRVE PARA SABER SI LEE ARCHIVO!    ////    ////
	
//	 @Override
//	    public String toString() {
//	        return "ArchivoPronosticos{ " +
//	        		"participante='" + participante + '\'' +
//					"equipo1='" + equipo1 + '\'' +
//					", gana1='" + gana1 + '\'' +
//					", emapata='" + emapata + '\'' +
//					", gana2='" + gana2 + '\'' +
//					", equipo2='" + equipo2 + '\'' +
//					'}';
//	    }
	 
	 ////	////    ¡CUIDADO, SIRVE PARA SABER SI LEE ARCHIVO!    ////    ////
	
}