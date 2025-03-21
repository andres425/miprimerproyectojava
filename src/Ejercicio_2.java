import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese la primera nota ");
        float nota1 = input.nextFloat();
        System.out.println("ingrese la segunda nota ");
        float nota2 = input.nextFloat();
        System.out.println("ingrese la tercera nota ");
        float nota3 = input.nextFloat();
        if (nota1 < 0 || nota2 < 0 && nota3 < 0 )  {
            System.out.println("la nota tiene que ser mayor que cero");
            input.close();
            return;
        }
     
        
        float resultado = nota1 + nota2 + nota3 / 3;
        int promedio = 7;
        if (resultado >= promedio) {
            System.out.println("promocionado");
        } else {
            System.out.println("reprobado");
        }
        input.close();
    }
}
