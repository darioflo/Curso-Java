import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola Mundo!");
        /*byte:
        Tamaño: 8 bits.
        Rango: de -128 a 127.
        Uso: Ideal para ahorrar memoria en grandes cantidades de datos pequeños.
        
        short:
        Tamaño: 16 bits.
        Rango: de -32,768 a 32,767.
        Uso: Similar a byte, pero con un rango mayor.
        
        int:
        Tamaño: 32 bits.
        Rango: de -2,147,483,648 a 2,147,483,647.
        Uso: Es el tipo de dato entero más común.
        
        long:
        Tamaño: 64 bits.
        Rango: de -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807.
        Uso: Para valores enteros muy grandes. */

        int numero = 5;
        double decimal = 5.5;
        char letra = 'a';
        boolean verdadero = true;
        String cadena = "uno dos tres cuatro";

        int longitud = cadena.length();
        String subString = cadena.substring(0, 7);
        int indice = cadena.indexOf("tres");
        String reemplazo = cadena.replace("uno", "1");
        boolean contiene = cadena.contains("tres");

        System.out.println(numero + 1);
        System.out.println(decimal);
        System.out.println(letra);
        System.out.println(verdadero);
        System.out.println(cadena);
        System.out.println(longitud);
        System.out.println(subString);
        System.out.println(indice);
        System.out.println(reemplazo);
        System.out.println(contiene);



        int numero1 = 10;
        int numero2 = 5;

        int resultado = numero1 - numero2;

        System.out.println(resultado);


        int edad = 12;

        String mensaje = edad >= 18 ?  "Eres mayor de edad" : "Eres meor de edad";

        System.out.println(mensaje);


        
        //Entrada de datos 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escoge una opcion");
        System.out.println("1-Café");
        System.out.println("2-Coca Cola");
        System.out.println("3-Cerveza");
        //int opcion = scanner.nextInt();
        int opcion = 1;
        
        switch (opcion) {
            case 1:
                System.out.println("No me gusta el café");
                break;
            case 2:
            System.out.println("Sabroso");
                break;
            case 3:
            System.out.println("Todavía");
                break; 
        }

        scanner.close();


        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int i = 0; i< arreglo.length; i++){
            if (arreglo[i] % 2 == 0) System.out.println(arreglo[i]);
        }

        int contador = 1;
        while (contador <= arreglo.length) {
            System.out.println(contador);
            contador++;
        }

        for(int i = 0; i< arreglo.length ;i++){
            System.out.println(i);
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("Otro arreglo");
        int[] otroArreglo = new int [5];
        
        for(int i = 0; i< otroArreglo.length; i++){
            otroArreglo[i]=contador++;
            System.out.println(otroArreglo[i]);
        }
    }
}
