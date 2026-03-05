public class CentroFP {
    Alumno[] alumnos;
    private final int MAX_ALUMNOS;

    public CentroFP(int cantidad_maxima_alumnos) {
        // Validación de número positivo
        if (cantidad_maxima_alumnos <= 0) {
            this.MAX_ALUMNOS = 20;
        } else {
            this.MAX_ALUMNOS = cantidad_maxima_alumnos;
        }
        alumnos = new  Alumno[MAX_ALUMNOS];
    }


    public Alumno buscarAlumno(int id) {
        for (int i = 0; i < MAX_ALUMNOS; i++) {
            // CORRECCIÓN: Comprobar que la POSICIÓN no sea null
            if (alumnos[i] != null && alumnos[i].getId() == id) {
                return alumnos[i];
            }
        }
        return null;
    }

}




