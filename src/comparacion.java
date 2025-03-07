import java.util.Scanner;

public class comparacion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese el primer numero ");
        int num1 = input.nextInt();
        System.out.println("ingrese el segundo numero ");
        int num2 = input.nextInt();
        System.out.println("¿numero1 es igual a numero2? " + (num1 == num2));
        System.out.println("¿numero1 es diferente de numero2? " + (num1 != num2));
        System.out.println("¿numero1 es mayor que numero2? " + (num1 > num2));
        System.out.println("¿numero1 es menor que numero2? " + (num1 < num2));
        System.out.println("¿numero1 es mayor o igual que numero2? " + (num1 >= num2));
        System.out.println("¿numero1 es menor o igual que numero2? " + (num1 <= num2));
        input.close();
    }
}
