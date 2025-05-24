import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.print("ingrese la cantidad de alumnos:");
        int cantidad = input.nextInt();
        String[] nombres = new String[cantidad];
        int[] edades = new int[cantidad];
        int contador = 0;

        while (contador < cantidad) {
            System.out.println("ingrese el nombre del alumno o * para terminar");
            String nombre = input2.nextLine();
            if (nombre.equals("*")) {
                break;

            }
            System.out.println("introduce la edad");
            int edad = input.nextInt();

            nombres[contador] = nombre;
            edades[contador] = edad;
            contador++;

        }

        System.out.println("alumnos mayores de edad ");
        for (int i = 0; i < contador; i++) {
            if (edades[i] >= 18) {
                System.out.println(nombres[i] + " ( " + edades[i] + " años)");

            }

        }

        int edad_maxima = 0;
        for (int i = 0; i < contador; i++) {
            if (edades[i] > edad_maxima) {
                edad_maxima = edades[i];
            }
        }
        System.out.println("\nAlumnos con la mayor edad (" + edad_maxima + " años):");
        for (int i = 0; i < contador; i++) {
            if (edades[i] == edad_maxima) {
                System.out.println(nombres[i] + " ( " + edades[i] + " años)");
            }
        }
        input.close();
        input2.close();
    }
}
