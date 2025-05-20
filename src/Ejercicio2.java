import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] vectorOriginal = new String[5];
        String[] vectorInvertido = new String[5];

        System.out.println("Introduce 5 cadenas de texto:");
        for (int i = 0; i < vectorOriginal.length; i++) {
            System.out.print("Cadena " + (i + 1) + ": ");
            vectorOriginal[i] = input.nextLine();
        }

    
        for (int i = 0; i < vectorOriginal.length; i++) {
            vectorInvertido[i] = vectorOriginal[vectorOriginal.length - 1 - i];
        }

     
        System.out.println("\nVector en orden inverso:");
        for (int i = 0; i < vectorInvertido.length; i++) {
            System.out.println("Cadena " + (i + 1) + ": " + vectorInvertido[i]);
        }

        input.close();
    }
}
