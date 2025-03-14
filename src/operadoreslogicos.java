import java.util.Scanner;

public class operadoreslogicos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese el numero a");
        int a = input.nextInt();
        System.out.println("ingrese el numero b");
        int b = input.nextInt();
        System.out.println("ingrese el numero c");
        int c = input.nextInt();
        System.out.println("a > b && b < c: " + (a > b && b < c)); // true
        System.out.println("a < b || b > c: " + (a < b || b > c)); // false
        System.out.println("!(a > b): " + !(a > b)); // false
        input.close();
    }
}
