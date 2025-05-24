import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese el numero de conductores");
        int numero_conductores= input.nextInt();
        input.nextLine();
        String [] nombre = new String[numero_conductores];
        int [] [] kilometros = new int [numero_conductores] [7];
        int [] total_kilometro = new int[numero_conductores];

        for (int i = 0; i < numero_conductores; i++) {
            System.out.println("ingrese el nombre del conductor"+ (i+1));
            nombre[i]=input.nextLine();

            System.out.println("Ingrese los kilómetros recorridos por " + nombre[i] + " cada día de la semana:");
            for (int j = 0; j < 7; j++) {
                System.out.println("dia "+ (j+1) + " :" );
                kilometros[i] [j]=input.nextInt();
            }
                    input.nextLine();
        }

           for (int i = 0; i < numero_conductores; i++) {
            int suma = 0;
            for (int j = 0; j < 7; j++) {
                suma += kilometros[i][j];
            }
            total_kilometro[i] = suma;
        }

          for (int i = 0; i < numero_conductores; i++) {
            System.out.println(nombre[i] + ": " + total_kilometro[i] + " kms");
        }
        input.close();
    }
}
