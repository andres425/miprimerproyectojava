
import java.util.Random;

public class Ejercicio5 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }
        System.out.println("vector original");

        for (int num : numeros) {
            System.out.print(num + " ");

        }

        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int intercambio = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = intercambio;
                }
            }
        }
        System.out.println(" ");
        System.out.println("vector ordenado ");
        for (int num: numeros) {
            System.out.print(num+" ");
        }
    }
}
