
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        int num1 = input.nextInt();
        System.out.println("ingrese el segundo numero");
        int num2 = input.nextInt();
        System.out.println("ingrese el tercer numero");
        int num3 = input.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println("el numero mayor es: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("el numero mayor es: " + num2);
        } else {
            System.out.println("el numero mayor es: " + num3);
        }
        input.close();
    }
}