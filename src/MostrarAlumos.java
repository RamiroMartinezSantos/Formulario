import java.util.ArrayList;

public class MostrarAlumos {
    public void mostrar(ArrayList<Alumno>alumnos){
        for (Alumno alumno : alumnos) {
            System.out.println("Nombre del alumno: " + alumno.nombre);
            System.out.println("Nombre del alumno: " + alumno.apellidos);
            System.out.println("Nombre del alumno: " + alumno.telefono);
            System.out.println("Nombre del alumno: " + alumno.ine);
            System.out.println("\n\n");
        }
        Alumno.clear();
    }
}
