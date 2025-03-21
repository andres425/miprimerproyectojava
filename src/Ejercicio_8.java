import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese el numero de preguntas que se le realizaron");
        int numero_preguntas = input.nextInt();
        System.out.println("ingrese el numero de preguntas que contesto bien");
        int preguntas_bien =input.nextInt();
        if (preguntas_bien>numero_preguntas) {
            System.out.println("el numero de preguntas que contesto bien no puede ser mayor al numero de preguntas que se le realizaron");
            input.close();
            return;
        }
        float porcentaje = (float) preguntas_bien/numero_preguntas*100;
        if (porcentaje>=90) {
            System.out.println("nivel maximo");
        }else if (porcentaje>=75 && porcentaje< 90) {
            System.out.println("nivel medio");
        }else if (porcentaje>=50 && porcentaje<75 ) {
            System.out.println("nivel regular");
        }else
        System.out.println("fuera de nivel");
        input.close();
    }
}
