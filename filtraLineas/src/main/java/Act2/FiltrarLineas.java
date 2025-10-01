package Act2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
    * Muestra solo las líneas de entrada con más de 20 caracteres.
    * Punto de entrada de la aplicación.
    * @param @args No se usan.
 */
public class FiltrarLineas {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.length() > 20) {
                    System.out.println(linea);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer la entrada: " + e.getMessage());
        }
    }
}
