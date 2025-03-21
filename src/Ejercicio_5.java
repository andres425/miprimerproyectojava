import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        int num1 = input.nextInt();
        System.out.println("ingrese el primer numero");
        int num2 = input.nextInt();
        if (num1 > num2) {
            System.out.println("el numero mayor es:" + num1);
        } else if (num2 > num1) {
            System.out.println("el numero mayor es:" + num2);
        } else {
            System.out.println("los numeros no pueden ser iguales");
        }
        input.close();
    }

}
