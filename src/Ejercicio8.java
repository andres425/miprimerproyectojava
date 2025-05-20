import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         Scanner input2 = new Scanner(System.in);
        System.out.print("ingrese la cantidad de alumnos:");
        int cantidad = input.nextInt();
        String []nombres = new String[cantidad]; 
        int [] edad = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("ingrese el nombre del alumno:");
            nombres[i]= input2.nextLine();

            System.out.print("ingrese la edad del alumno:");
            edad[i] = input.nextInt();
            if (nombres[i].equalsIgnoreCase("*")) {
                System.out.println("programa finalizado");
                break;
                
            }
        }

        if (edad[i]>=18) {
            
        }
    }
}
 