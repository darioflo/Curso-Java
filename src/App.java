public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        Circulo circulo = new Circulo(2);
        Rectangulo rectangulo = new Rectangulo(5, 6);

        circulo.imprimirInformacion();
        System.out.println("El área del círculo es: " + circulo.calcularArea());
        rectangulo.imprimirInformacion();
        System.out.println("El área del rectángulo es: " + rectangulo.calcularArea());


        Ballena ballena = new Ballena("Willy", 30);
        Calamar calamar = new Calamar("Kraken", 20, 8);

        ballena.nadar();
        calamar.nadar();
        calamar.comunicarse();
    }
}
