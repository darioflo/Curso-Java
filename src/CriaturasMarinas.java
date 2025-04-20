public abstract class CriaturasMarinas {

    String nombre;
    int tamaño;
    String lugar;

    CriaturasMarinas(String nombre, int tamaño){
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.lugar = lugar;
    }

    abstract void nadar();

}
