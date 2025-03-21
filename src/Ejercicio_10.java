import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese el sueldo del empleado");
        int sueldo = input.nextInt();
        System.out.println("ingrese el numero de años del trabajador ");
        int años_antiguedad = input.nextInt();
        if (sueldo<500 && años_antiguedad>=10) {
            double aumento = sueldo*0.20 + sueldo;
            System.out.print("el nuevo salario del empleado es de " + aumento);
        } else if (sueldo<500 && años_antiguedad<10) {
            double aumento = sueldo*0.05 + sueldo;
            System.out.print("el nuevo salario del empleado es de " + aumento);
        }else 
        System.out.println("el seldo es "+ sueldo);
        input.close();
    }
}
