public class Ballena extends CriaturasMarinas{



    Ballena(String nombre, int tamaño){
        super(nombre, tamaño);

    }
    @Override
    public void nadar(){
        System.out.println(nombre + ", animal marino");
    }


}
