import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int numero = input.nextInt();
        if (numero>0) {
            System.out.println("su numero es positivo");
        }else if (numero<0) {
            System.out.println("su numero es negativo" );
        } else
        System.out.println("su numero es 0");
        input.close();
    }
}
