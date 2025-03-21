import java.util.Scanner;

public class Ejercicio_7 {
   public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    System.out.println("ingrese un numero");
    int numero = input.nextInt();
    if (numero<0 || numero >999) {
        System.out.println(" el numero no puede ser negativo ni mayor a tres cifras");
        input.close();
        return;
    }
    if (numero<10) {
        System.out.println("su numero es de un solo digito");
    }else if (numero>=10 && numero<=99) {
        System.out.println("su numero es de dos digitos" );
    }else 
    System.out.println("su numero es de tres digitos");
    input.close();
   } 
}
