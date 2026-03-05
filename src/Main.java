import java.lang.classfile.instruction.NewMultiArrayInstruction;

public class Main {
    public static void main(String[] args) {
        CentroFP centroFP = new CentroFP(20);

        Alumno alumno1 = new Alumno(1, "Alejandro", "DAM", 23);
        Alumno alumno2 = new Alumno(2, "Pepe", "ASIR", 18);
        Alumno alumno3 = new Alumno(3, "Pedro", "DAM", 19);

        centroFP.buscarAlumno(4) ;
        //System.out.println(centroFP.buscarAlumno(4) ) ;

        System.out.println(centroFP.registrarAlumno(alumno1));
        System.out.println(centroFP.registrarAlumno(alumno2));
        System.out.println(centroFP.registrarAlumno(alumno3));

        System.out.println(centroFP.mostrarAlumno());

        System.out.println(centroFP.contarAlumnos());




    }
}