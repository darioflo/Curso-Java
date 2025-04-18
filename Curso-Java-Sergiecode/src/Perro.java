public class Perro extends Animal {

    public Perro (String nombre , int edad) {
        //el super asigna los valores heredados
        super(nombre, edad);
    }

    @Override
    public String Sonido (){
        return "Jau jau";
    }
}
