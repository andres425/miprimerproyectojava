import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nombre_meses = { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto",
                "septiempre", "octubre", "noviembre", "diciembre" };
        int[] diasMeses = {
                31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
        };
        System.out.println("ingrese el numero del mes");
        int numero_mes = input.nextInt();
        if (numero_mes >= 1 && numero_mes <= 12) {
            int indice = numero_mes - 1;
            System.out.println("el mes " + nombre_meses[indice] + " tiene " + diasMeses[indice] + " dias");

        } else {
            System.out.println("numero invalido");
        }
        input.close();
    }
}
