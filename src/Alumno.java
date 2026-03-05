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
}
