package Act1;

import java.io.*;

/**
 * Lee el archivo "entrada.txt" y muestra su contenido línea por línea.
 * Si no existe, muestra un error.
 * Punto de entrada de la aplicación.
 * @param @args No se usan.
 */

public class LectorTexto {
    public static void main(String[] args) {

        try (InputStream is = LectorTexto.class.getResourceAsStream("/entrada.txt");
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            if (is==null) {
                System.err.println("Error: el archivo 'entrada.txt' no existe.");
                return;
            }
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
