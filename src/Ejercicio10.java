import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        System.out.println("ingrese los valores de la matriz 5x5");

        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                System.out.println("elemento [" + fila + " ][ " + columna + "]:");
                matriz[fila][columna] = input.nextInt();
            }
        }

        System.out.println("suma de cada fila");
        for (int fila = 0; fila < 5; fila++) {
            int suma_fila = 0;
            for (int columna = 0; columna < 5; columna++) {

                suma_fila += matriz[fila][columna];

            }
            System.out.println("fila " + fila + ":" + suma_fila);
        }

        System.out.println("suma de cada columna");
        for (int columna = 0; columna < 5; columna++) {
            int suma_columna = 0;
            for (int fila = 0; fila < 5; fila++) {

                suma_columna += matriz[fila][columna];

            }
            System.out.println("fila " + columna + ":" + suma_columna);
        }
        input.close();
    }
}
