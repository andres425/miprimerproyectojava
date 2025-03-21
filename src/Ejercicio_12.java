import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingresa el numero de empleados ");
        int numero_empleados = input.nextInt();
        int numero_emplados_100y300 =0;
        int numero_empleados_mas300 =0;
        for (int i = 1; i <= numero_empleados; i++) {
            System.out.println("ingrese el sueldo de los empleados" );
            short sueldo = input.nextShort();
            if (sueldo>100 && sueldo<300) {
                numero_emplados_100y300++;
            }else
            numero_empleados_mas300++;
        }
        System.out.println("el numero de empleados que cobran entre 100 y 300 es "+ numero_emplados_100y300);
        System.out.println("el numero de empleados que cobran mas de 300 es "+ numero_empleados_mas300);
        input.close();
    }
}
