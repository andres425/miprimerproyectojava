    import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int PARTIDOS = 15;

        String[][] equipos = new String[PARTIDOS][2];
        int[][] resultados = new int[PARTIDOS][2];


        System.out.println("Ingrese los equipos para los 15 partidos:");
        for (int i = 0; i < PARTIDOS; i++) {
            System.out.println("\nPartido " + (i + 1) + ":");
            System.out.print("Equipo local: ");
            equipos[i][0] = input.nextLine();
            System.out.print("Equipo visitante: ");
            equipos[i][1] = input.nextLine();
        }

        
        System.out.println("\nIngrese los resultados (goles) de cada partido:");
        for (int i = 0; i < PARTIDOS; i++) {
            System.out.println("\n" + equipos[i][0] + " vs " + equipos[i][1]);
            System.out.print("Goles de " + equipos[i][0] + ": ");
            resultados[i][0] = input.nextInt();
            System.out.print("Goles de " + equipos[i][1] + ": ");
            resultados[i][1] = input.nextInt();
        }

      
        System.out.println("\nRESULTADOS DE LA QUINIELA:");
        for (int i = 0; i < PARTIDOS; i++) {
            String equipo1 = equipos[i][0];
            String equipo2 = equipos[i][1];
            int goles1 = resultados[i][0];
            int goles2 = resultados[i][1];

            System.out.print((i + 1) + ". " + equipo1 + " " + goles1 + " - " + goles2 + " " + equipo2 + " --> ");

            if (goles1 > goles2) {
                System.out.println("Gana " + equipo1 + " (1)");
            } else if (goles1 < goles2) {
                System.out.println("Gana " + equipo2 + " (2)");
            } else {
                System.out.println("Empate (X)");
            }
        }

        input.close();
    }
}


