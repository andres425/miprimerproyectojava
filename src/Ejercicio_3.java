import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num1 = input.nextInt();
    if (num1<0 || num1>99) {
        System.out.println("el numero debe ser positivo y de dos dijitos");;
        input.close();
        return;
    }
    if (num1>=10) {
       System.out.println("el numero "+num1 +" es de dos digitos ");
    }else {
    System.out.println("el numero "+num1 + " es de un solo digito");
    }
   input.close();

    }
}
