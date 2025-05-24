import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int ARTICULOS = 5;
        final int SUCURSALES = 4;

        double[] precios = new double[ARTICULOS];
        int[][] cantidades = new int[ARTICULOS][SUCURSALES];
        double[] recaudacionSucursal = new double[SUCURSALES];

      
        System.out.println("Ingrese los precios de los 5 artículos:");
        for (int i = 0; i < ARTICULOS; i++) {
            System.out.print("Precio del artículo " + (i + 1) + ": ");
            precios[i] = input.nextDouble();
        }

        System.out.println("\nIngrese las cantidades vendidas por cada sucursal:");
        for (int i = 0; i < ARTICULOS; i++) {
            for (int j = 0; j < SUCURSALES; j++) {
                System.out.print("Cantidad del artículo " + (i + 1) + " en la sucursal " + (j + 1) + ": ");
                cantidades[i][j] = input.nextInt();
            }
        }

      
        System.out.println("\nCantidad total por artículo:");
        for (int i = 0; i < ARTICULOS; i++) {
            int total = 0;
            for (int j = 0; j < SUCURSALES; j++) {
                total += cantidades[i][j];
            }
            System.out.println("Artículo " + (i + 1) + ": " + total);
        }

      
        int totalSucursal2 = 0;
        for (int i = 0; i < ARTICULOS; i++) {
            totalSucursal2 += cantidades[i][1]; 
        }
        System.out.println("\nCantidad total de artículos en la sucursal 2: " + totalSucursal2);

        System.out.println("Cantidad del artículo 3 en la sucursal 1: " + cantidades[2][0]); 

        double totalEmpresa = 0;
        System.out.println("\nRecaudación por sucursal:");
        for (int j = 0; j < SUCURSALES; j++) {
            double subtotal = 0;
            for (int i = 0; i < ARTICULOS; i++) {
                subtotal += cantidades[i][j] * precios[i];
            }
            recaudacionSucursal[j] = subtotal;
            totalEmpresa += subtotal;
            System.out.println("Sucursal " + (j + 1) + ": $" + subtotal);
        }

     
        System.out.println("\nRecaudación total de la empresa: $" + totalEmpresa);

        int sucursalMayor = 0;
        double mayorRecaudacion = recaudacionSucursal[0];
        for (int j = 1; j < SUCURSALES; j++) {
            if (recaudacionSucursal[j] > mayorRecaudacion) {
                mayorRecaudacion = recaudacionSucursal[j];
                sucursalMayor = j;
            }
        }
        System.out.println("La sucursal con mayor recaudación es la Sucursal " + (sucursalMayor + 1) + " con $" + mayorRecaudacion);

        input.close();
    }
}
