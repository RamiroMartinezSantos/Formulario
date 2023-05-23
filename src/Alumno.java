public class Alumno {
    String nombre;
    String apellidos;
    String telefono;
    String ine;
    public Alumno(String nombre, String apellidos, String telefono, String ine){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.ine = ine;
    }

    public static void clear() {
    }

    @Override
    public String toString(){
        return nombre + "nomrbe" + apellidos + "apellidos" + telefono + "telefono" + ine + "ine";
    }
}

