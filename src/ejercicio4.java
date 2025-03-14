
import java.util.Scanner;

public class ejercicio4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int numero = input.nextInt();
        int factorial = 1;
        int i = 1;
        while (i <= numero) {
            factorial *= i;
            i++;
        }
        System.out.println("El factorial de " + numero + " es " + factorial);
        input.close();
    }
}