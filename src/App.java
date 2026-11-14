import java.util.Scanner;

public class App {
    // CONSTANTES
    static final int CANTIDAD_ALUMNOS = 4;
    static final int CANTIDAD_NOTAS = 3;

    static final double NOTA_MINIMA = 0;
    static final double NOTA_MAXIMA = 10;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // MATRICES Y ARRAYS
        double[][] notasAlumnos = new double[CANTIDAD_ALUMNOS][CANTIDAD_NOTAS];
        double[] promedios = new double[CANTIDAD_ALUMNOS];
        double[] sumaTotal = new double[CANTIDAD_ALUMNOS];

        // ENCABEZADO
        System.out.println("""

                =========================================================
                              SISTEMA DE GESTION ACADEMICA
                                      REGISTRO DE NOTAS
                =========================================================
                """);

        // INGRESO DE NOTAS
        for (int f = 0; f < notasAlumnos.length; f++) {
            System.out.printf("%n--------------- ALUMNO N° %02d ---------------%n", f + 1);
            for (int c = 0; c < notasAlumnos[f].length; c++) {
                notasAlumnos[f][c] = ingresarNota(sc, c + 1);
                // ACUMULAR NOTAS
                sumaTotal[f] += notasAlumnos[f][c];
            }
            // CALCULAR PROMEDIO
            promedios[f] = sumaTotal[f] / notasAlumnos[f].length;
            System.out.printf("Registro completado. Promedio: %.2f%n", promedios[f]);
        }

        // PRESENTACION DE RESULTADOS
        System.out.println("""

                =========================================================
                              INFORME DE CALIFICACIONES
                =========================================================
                """);

        System.out.printf("%-12s %8s %8s %8s %10s %10s%n",
                "ALUMNO", "NOTA 1", "NOTA 2", "NOTA 3", "TOTAL", "PROMEDIO");

        System.out.println("-----------------------------------------------------------------");

        for (int f = 0; f < notasAlumnos.length; f++) {
            System.out.printf("%-12s", "Alumno " + (f + 1));
            for (int c = 0; c < notasAlumnos[f].length; c++) {
                System.out.printf("%8.2f", notasAlumnos[f][c]);
            }
            System.out.printf("%10.2f %10.2f%n",
                    sumaTotal[f], promedios[f]);
        }

        System.out.println("-----------------------------------------------------------------");

        // ESTADISTICAS GENERALES
        double sumaPromedios = 0;

        for (int i = 0; i < promedios.length; i++) {
            sumaPromedios += promedios[i];
        }

        double promedioGeneral = sumaPromedios / promedios.length;

        System.out.println("\n--------------- ESTADISTICAS GENERALES ---------------");

        System.out.println("Cantidad de alumnos registrados: " + CANTIDAD_ALUMNOS);

        System.out.printf("Promedio general del curso: %.2f%n", promedioGeneral);

        System.out.println("=========================================================");
        System.out.println("              FIN DEL INFORME ACADEMICO");
        System.out.println("=========================================================");

        sc.close();
    }

    // METODO PARA INGRESAR Y VALIDAR NOTAS
    static double ingresarNota(Scanner sc, int numeroNota) {

        while (true) {

            System.out.printf("Ingrese la nota N° %d (0-10): ", numeroNota);

            try {

                double nota = Double.parseDouble(sc.nextLine().trim());

                if (nota < NOTA_MINIMA || nota > NOTA_MAXIMA) {
                    System.out.println("Error: la nota debe estar entre 0 y 10.");
                    continue;
                }

                return nota;

            } catch (NumberFormatException e) {

                System.out.println("Error: debe ingresar un valor numerico.");
            }
        }
    }
}
