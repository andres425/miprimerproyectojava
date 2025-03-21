import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mayoresoiguales_7 =0;
        int menores_7 = 0;
        for (int i = 1; i <=10; i++) {
            System.out.println("ingrese la nota del estudiante");
            int nota = input.nextInt();   
            if (nota>=7) {
                mayoresoiguales_7++;
            }else
            menores_7++;   
        }
        System.out.println("el numero de notas mayores o iguales a 7 son:"+mayoresoiguales_7);
        System.out.println("el numero de notas menores a 7 es:"+ menores_7);
        input.close();
    }
}
