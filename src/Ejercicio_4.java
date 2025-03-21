import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese su sueldo");
        int sueldo = input.nextInt();
        int SUELDO_MAXIMO = 3000;
        if (sueldo > SUELDO_MAXIMO) {
            System.out.println("debe abonar impuestos");
        } else {
            System.out.println("no debe abonar impuestos");
        }
        input.close();
    }
}
