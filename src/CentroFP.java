public class CentroFP {
    Alumno[] alumnos;
    private final int MAX_ALUMNOS;

    public CentroFP(int cantidad_maxima_alumnos) {
        if (cantidad_maxima_alumnos <= 0) {
            this.MAX_ALUMNOS = 20;
        } else {
            this.MAX_ALUMNOS = cantidad_maxima_alumnos;
        }
        alumnos = new  Alumno[MAX_ALUMNOS];
    }

    //creamos la clase buscar alumno
    public Alumno buscarAlumno(int id) {
        for (int i = 0; i < MAX_ALUMNOS; i++) {
            if (alumnos[i] != null && alumnos[i].getId() == id) {
                return alumnos[i];
            }
        }
        return null;
    }

    // creamos la clase buscar primer hueco libre
    private int buscarPrimerHuecoLibre(){
        int posicionLibre = -1;
        boolean seguirBuscando = true;

        for (int i = 0; i < MAX_ALUMNOS && seguirBuscando; i++) {
            if(alumnos[i] == null){
                posicionLibre = i;
                seguirBuscando = false;
            }
        }
        return posicionLibre;
    }
    //creamos la clase registrar alumno
    public boolean registrarAlumno(Alumno alumno){
        boolean alumnoAnadido = false;
        int posicion;

        if (buscarAlumno(alumno.getId()) == null) {
            posicion = buscarPrimerHuecoLibre();
            if (posicion >= 0) {
                alumnos[posicion] = alumno;
                alumnoAnadido = true;
            }
        }
        return alumnoAnadido;
    }

    //creamos la clase mostrar alumno
    public String mostrarAlumno(){
        StringBuilder sb = new StringBuilder("Alumnos : \n");
        for (int i = 0; i < MAX_ALUMNOS; i++) {
            if (alumnos[i] != null) {
                sb.append(alumnos[i].toString());
            }
        }
        sb.append("\n");

        return sb.toString();
    }
    //creamos la clase contar Alumnos;
    public int contarAlumnos(){
        int contador = 0 ;
        for (int i = 0; i < MAX_ALUMNOS; i++) {
            if (alumnos[i] != null) {
                contador++;
            }
        }
        return contador;
    }
}




