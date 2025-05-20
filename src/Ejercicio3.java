import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double [] notas = new double[5];
        

        for (int i = 0; i < notas.length; i++) {
              double  nota;
         do {
           
            System.out.print("introduce la nota "+(i+1)+":");
            nota =input.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println("nota no valida");
                
            }
         } while (nota < 0 || nota > 10);
         notas[i]= nota;
        }

        for (int i = 0; i < notas.length; i++) {
            System.out.println("la "+(i+1)+" nota es:"+ notas[i]);
            
        }

        double suma =0;
        double maxima =notas[0];
        double minima = notas[0];

           for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
          
            if (notas[i] > maxima) maxima = notas[i];
            if (notas[i] < minima) minima = notas[i];
        }

        double media = suma /notas.length;

      System.out.println("la nota media fue:"+media);
      System.out.println("la nota maxima fue:"+maxima);
      System.out.println("la nota minima fue:"+minima);
      input.close();
    }
}
