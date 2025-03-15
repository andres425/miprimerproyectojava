import java.util.Scanner;
public class numerosamigos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese el numero de inicio");
        int inicio = input.nextInt();
        System.out.println("ingrese el numero fin");
        int fin = input.nextInt();
        if (inicio > fin) {
            System.out.println("el rango no es valido el inicio tiene que ser menor o igual al fin");
            input.close();
            return;
        }
        boolean encontrado = false;
        
        for (int i = inicio; i < fin; i++) {
            int contadorDivisores = 0;
            int primerDivisor = 0;
            int segundoDivisor = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    contadorDivisores++;
                    if (contadorDivisores == 1) {
                        primerDivisor=j;
                    } else if (contadorDivisores == 2) {
                        segundoDivisor=j;
                    } else {
                        break;
                    }
                }
            }
           if (contadorDivisores==2) {
            encontrado = true;
            System.out.println(i +" "+ "es un numero amigo "+ primerDivisor +","+ segundoDivisor);
           }
        }
        if (!encontrado) {
            System.out.println("No se encontraron números amigos en el rango especificado.");
        }
        input.close();
    }
}