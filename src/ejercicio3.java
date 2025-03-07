import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        System.out.println("1 es sumar , 2 es restar , 3 es multiplicar , 4 es dividir");
Scanner imput = new Scanner(System.in);
System.out.print("ingrese la operacion que desea realizar: ");
int operacion = imput.nextInt();
System.out.print("ingrese el primer numero: ");
int num1 = imput.nextInt();
System.out.print("ingrese el segundo numero: ");
int num2 = imput.nextInt();
switch (operacion) {
        case 1 : 
        System.out.println("la suma es: " + (num1 + num2));
        case 2 : 
        System.out.println("la resta es: " + (num1 - num2));
        case  3:
        System.out.println("la multiplicacion es: " + (num1 * num2));
        case  4:
        System.out.println("la division es: " + (num1 / num2));
        if(num2 !=0){
            }else {
            System.out.println("no se puede dividir por 0");
            }
        break;
    default:
    System.out.println("la operacion no es valida");
        throw new AssertionError();
        }
    }  
}
    
