import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int dias = 5;
        double[] temperatura_maxima = new double[dias];
        double[] temperatura_minima = new double[dias];

        for (int i = 0; i < dias; i++) {

            System.out.println("dia " + (i + 1));
            System.out.println("ingrese la temperatura minima");
            temperatura_minima[i] = input.nextDouble();
            System.out.println("ingrese la temperatura maxima");
            temperatura_maxima[i] = input.nextDouble();

        }
        System.out.println("temperatura media de cada dia");
        for (int i = 0; i < dias; i++) {
            double temperatura_media = ((temperatura_maxima[i] + temperatura_minima[i]) / 2);
            System.out.println(" la temperatura media del dia " + (i + 1) + " es " + temperatura_media);
        }

        double menor_temperatura = temperatura_minima[0];
        for (int i = 0; i < dias; i++) {
            if (temperatura_minima[i] < menor_temperatura) {
                menor_temperatura = temperatura_minima[i];
            }
        }
        System.out.println("dias con la menor temperatura minima " + menor_temperatura);
        for (int i = 0; i < dias; i++) {
            if (temperatura_minima[i] < menor_temperatura) {
                System.out.println("Día " + (i + 1));
            }
        }
        System.out.println("introduce una temperatura maxima para buscar los dias ");
        double buscar_temperatura = input.nextDouble();
        boolean encontrado = false;

        for (int i = 0; i < dias; i++) {
            if (temperatura_maxima[i] == buscar_temperatura) {
                System.out.println("Día " + (i + 1) + " tiene esa temperatura máxima.");
                encontrado = true;
            }
        }
        if (!encontrado) {
             System.out.println("Ningún día tiene esa temperatura máxima.");
        }
        input.close();
    }
}
