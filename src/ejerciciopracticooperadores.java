import java.util.Scanner;
public class ejerciciopracticooperadores {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        System.out.println("ingrese el primer numero");
        int num1 = input.nextInt();
        System.out.println("ingrese el segundo numero");
        int num2 = input.nextInt();
        System.out.println("ingrese el tercer numero");
        int num3 = input.nextInt();
        System.out.println( " ¿el primer numero es mayor que el segundo y menor que el tercero? "+ (num1>num2 && num1<num3  ));
        
    }
}
