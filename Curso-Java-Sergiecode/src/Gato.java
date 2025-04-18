public class Gato extends Animal{

    public Gato (String nombre , int edad) {
        //el super asigna los valores heredados
        super(nombre, edad);
    }

    @Override
    public String Sonido (){
        return "Miau miau";
    }
}
