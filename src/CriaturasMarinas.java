public abstract class CriaturasMarinas {

    String nombre;
    int tamaño;

    CriaturasMarinas(String nombre, int tamaño){
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    abstract void nadar();

}
