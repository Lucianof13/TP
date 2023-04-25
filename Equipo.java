public class Equipo {
    public String nombre;
    public String Descripcion;
    public void setNombre (String nombre){
        nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getDescripcion() {
        return Descripcion;
    }
    public void Equipo(String nombre, String descripcion){
        setNombre(nombre);
        setDescripcion(descripcion);
    }
}
