import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        int num1 = input.nextInt();
        System.out.println("ingrese el segundo numero");
        int num2 = input.nextInt();
        if (num1>num2) {
            int suma =num1+ num2;
            int diferencia = num1-num2;
          System.out.println("la suma de los numeros es: "+suma+" y la diferencia es: "+diferencia) ;
        }else if (num2>num1) {
            int producto =num1* num2;
            float divicionf = num1/num2;
          System.out.println("el producto de los numeros es: "+producto+" y la divicion: "+divicionf) ;
            
        }
        input.close();
    }
}
