import java.util.Scanner;
public class ejercicio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = input.next();
        System.out.print("Ingrese su edad: ");
        byte edad = input.nextByte();
        System.out.println("Hola, " + nombre + ". Tienes " + edad + " años.");  
        input.close(); 
    }
}
