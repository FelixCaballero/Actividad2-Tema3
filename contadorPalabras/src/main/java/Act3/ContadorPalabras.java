package Act3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *Cuenta el total de palabras de las líneas recibidas por la entrada estándar.
 * Punto de entrada de la aplicación.
 * @param @args No se usan.
 */
public class ContadorPalabras {
    public static void main(String[] args) {
        int totalPalabras = 0;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Dividir por espacios en blanco (uno o más)
                String[] palabras = linea.trim().split("\\s+");
                if (!linea.trim().isEmpty()) {
                    totalPalabras += palabras.length;
                }
            }
            System.out.println("Número total de palabras: " + totalPalabras);
        } catch (IOException e) {
            System.err.println("Error al leer la entrada: " + e.getMessage());
        }
    }
}
