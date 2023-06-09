package Eljuegodelavida.dominio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Tablero {
    private static int DIMENSION = 30;
    private int[][] estadoActual;
    private int[][] estadoSiguiente = new int[DIMENSION][DIMENSION];

    public void leerEstadoActual() {

        int fila = 0;
        int columnas = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/Eljuegodelavida/dominio/matriz.txt"))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                if (columnas == 0) {
                    columnas = linea.length();
                    estadoActual = new int[columnas][columnas];
                }
                for (int columna = 0; columna < columnas; columna++) {
                    char c = linea.charAt(columna);
                    estadoActual[fila][columna] = c == '1' ? 1 : 0;
                }
                fila++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void generarEstadoActualPorMontecarlo() {
    }

    public void transitarAlEstadoSiguiente() {
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int fila = 0; fila < DIMENSION; fila++) {
            for (int columna = 0; columna < DIMENSION; columna++) {
                if (estadoActual[fila][columna] == 1) {
                    sb.append("* ");
                } else {
                    sb.append(". ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
