public class Equipo {
    private String nombre;
    private String descripcion;
    public Equipo() {
        String nombre;
        String descripcion;
    }
    //public void Equipo(String nombre, String descripcion){
     //   setNombre(nombre);
    //    setDescripcion(descripcion);
    //}
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public String getNombre () {
        return nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public String getToString(){
        return ("El eqipo se llama: "+getNombre()+" y su descripciòn es: "+ getDescripcion());
    }
}
