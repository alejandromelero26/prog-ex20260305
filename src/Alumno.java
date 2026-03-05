public class Alumno {
    int id;
    String nombre;
    String tituloFP;
    int edad;

    public Alumno(int id, String nombre, String tituloFP, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.tituloFP = tituloFP;
        this.edad = edad;
    }
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getTituloFP() {
        return tituloFP;
    }
    public int getEdad() {
        return edad;
    }
    @Override
    public String toString() {
        return String.format("id: %d %s - Titulo FP: %s %d anios\n ",
                id, nombre, tituloFP, edad  );
    }

}
