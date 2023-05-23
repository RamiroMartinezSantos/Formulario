import java.util.ArrayList;
public class IngresarAlumno {
    public ArrayList<Alumno> alumnos;
    public IngresarAlumno(){alumnos = new ArrayList<>();}
    public void ingresar(ArrayList<Alumno> alumnos,String nombre,String apellido,String telefono,String ine){
        alumnos.add(new Alumno(nombre,apellido,telefono,ine));
    }
    public ArrayList<Alumno> getAlumnos() {return alumnos;}
}
