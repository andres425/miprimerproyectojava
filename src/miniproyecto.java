import java.util.Scanner;
public class miniproyecto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese el primer numero ");
      int numero1 = input.nextInt();
      System.out.println("ingrese el segundo numero ");
      int numero2 = input.nextInt();
      System.out.println("ingrese el tercer numero ");
      int numero3 = input.nextInt();
      float medio = (numero1+numero2+numero3)/3;
        System.out.println("la media de los numeros es: "+ medio);
   } 
}