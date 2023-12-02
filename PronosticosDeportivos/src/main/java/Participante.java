public class Participante implements Comparable<Participante>{

    private String nombre;
    private int puntos;
    private int aciertos;

    public Participante(String nombre, int puntos) {
    	
        this.nombre = nombre;
        this.puntos = puntos;
    }

    public Participante(String nombre) {
    	
        this.nombre = nombre;
    }

    public String getNombre() {
    	
        return nombre;
    }

    public int getPuntos() {
    	
        return puntos;
    }

    public int getAciertos() {
    	
        return aciertos;
    }

    @Override
    public String toString() {
    	
        return nombre;
    }
    
    @Override
    public int compareTo(Participante otroParticipante) {
        // Comparar por la cantidad de puntos en orden descendente
        return Integer.compare(otroParticipante.getPuntos(), this.getPuntos());
    }

    public void sumarPuntos(int puntosASumar) {
    	
        this.puntos += puntosASumar;
        
        if (puntosASumar > 0) {
        	
            // si se están sumando puntos, se incrementa el contador de aciertos
            aciertos++;
            
        }
    }
}