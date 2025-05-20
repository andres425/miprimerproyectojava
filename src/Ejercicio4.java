import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vector = new int[10];

        for (int i = 0; i < vector.length; i++) {
            System.out.print("ingrese el numero " + (i + 1)+":");
            vector[i] = input.nextInt();
            if (vector[i] < 0) {
                System.out.println("numero no valido");
            break;
                  
            }
           
        }

        for (int i = 0; i < vector.length; i++) {
            System.out.println("el " + (i + 1) + " que ingreso es:" + vector[i]);
           
        }
        input.close();
    }
}
