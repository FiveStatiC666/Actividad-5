//Librerias utiles para lector de los numeros
import java.util.*;

public class OpBasicas {

        public static void main(String[] args) {
            //Escaner de datos
            Scanner EscanerNumeros = new Scanner(System.in);

            //Variables de numeros enteros
            int numero1;
            int numero2;

            //Impresion de pantalla de solicitar numeor y escaner que recibe el numero
            System.out.println("Ingresa el primer numero: ");
            numero1 = EscanerNumeros.nextInt();
            System.out.println("Ingresa le segundo numero: ");
            numero2 = EscanerNumeros.nextInt();

            //Variables de operaciones basicas
            int suma = numero1 + numero2;
            int resta = numero1 - numero2;
            int multiplicacion = numero1 * numero2;
            int division = numero1 / numero2;

            System.out.println("\nLos resultados son los siguientes: \n");
            System.out.println("Suma: " + suma);
            System.out.println("Resta: " + resta);
            System.out.println("Multiplicacion: " + multiplicacion);
            System.out.println("Division: " + division);
        }
}
