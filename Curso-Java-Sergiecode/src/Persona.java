public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private boolean esEstudiante;


    public Persona (){  
       this.nombre = "";
       this.apellidos = "";
       this.edad = 0;
       this.esEstudiante = false;
    }

    public String darNombreCompleto () {
        return  apellidos + ", " + nombre;
    }
        
    public String saludo (String saludado) {
        return "Hola " + saludado + " como estas";
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellidos(){
        return this.apellidos;
    }

    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public boolean getEsEstudiante (){
        return this.esEstudiante;
    }

    public void setEsEstudiante(){
        this.esEstudiante = !this.esEstudiante;
    }
}
