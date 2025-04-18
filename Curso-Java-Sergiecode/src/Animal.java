public class Animal {

    String nombre;
    int edad;
    static int cantidadAnimales = 0;

    public Animal(String nombre , int edad){
        this.nombre = nombre;
        this.edad = edad;
        cantidadAnimales++;
    }


    public String Sonido(){
        return "Sonido genérico";
    }

    public static int cantAnimales (){
        return cantidadAnimales;
    }
}
