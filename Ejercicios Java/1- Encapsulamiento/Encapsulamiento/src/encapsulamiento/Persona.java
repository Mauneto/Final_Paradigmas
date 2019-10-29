package encapsulamiento;

public class Persona {
    private int dni;
    private String nombre;
    private String apellido;
    private String domicilio;

    public int getDni() {
        return dni;
    }    
    public void setDni(int dni) {
        this.dni = dni;
    }    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }  
    public String getNombre(){
        return nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public String getApellido(){
        return apellido;
    }
    public void setDomicilio(String domicilio){
        this.domicilio = domicilio;
    }
    public String getDomicilio(){
        return domicilio;
    }
    /*EL CONSTRUCTOR NO LLEVA VOID*/
    public Persona(int dni){
        this.dni = dni;
    }
    public Persona(String nombre, String apellido, String domicilio){
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
    }
    /*No hay necesidad de pasar el nombre si ya lo tiene guardado el objeto */
    public void Saludar(){
        System.out.println("Hola me llamo " + getNombre());
    }
}
