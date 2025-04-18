import interfaces.Comunicable;

public class Calamar extends CriaturasMarinas implements Comunicable{

    int tentáculos;

    Calamar (String nombre, int tamaño, int tentáculos){
        super(nombre, tamaño);
        this.tentáculos = tentáculos;
    }


    @Override
    public void nadar(){
        System.out.println(nombre + " gigante de " + tamaño + " metros");
    }

    @Override
    public void comunicarse(){
        System.out.println("Saluda con sus " + tentáculos + " tentáculos" );
    }

}
