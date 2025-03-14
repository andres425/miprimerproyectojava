
import java.util.Scanner;
public class ejercicio5 {
public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
    System.out.println("ingrese la tabla de multiplicar que desea ver");
    int tabla = input.nextInt();
    for (int i= 1; i <= 10; i++) {
      System.out.println(tabla + " x " + i + " = " + tabla * i);
    }
    input.close();
 }
}