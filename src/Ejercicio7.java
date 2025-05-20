import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        int[] suma = new int[vector1.length];
        int vueltas = 5;

        for (int i = 0; i < vueltas; i++) {
            System.out.println("ingrese el " + (i + 1) + " valor del vector 1 ");
            vector1[i] = input.nextInt();
        }

        for (int i = 0; i < vueltas; i++) {
            System.out.println("ingrese el " + (i + 1) + " valor del vector 2 ");
            vector2[i] = input.nextInt();
        }

        for (int i = 0; i < vueltas; i++) {
            suma[i] = vector1[i] + vector2[i];
        }
        System.out.print("Resultado de la suma: ");
        for (int num : suma) {
            System.out.print(num + " ");
        }
        input.close();
    }
}
