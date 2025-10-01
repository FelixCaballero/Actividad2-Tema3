# Tarea PSP01:GESTIÓN DE PROCESOS 1

Este repositorio contiene tres aplicaciones Java que trabajan en conjunto para leer, filtrar y contar palabras de un archivo de texto. Cada aplicación puede ejecutarse de forma independiente o en conjunto mediante tuberías.

## Estructura del proyecto

```
├── lectorTexto.java         # Carpeta aplicacion java LectorTexto
├── filtraLineas.java        # Carpeta aplicacion java FiltrarLineas
├── contadorPalabras.java    # Carpeta aplicacion java ContadorPalabras
├── lectorTexto.jar          # Archivo ejecutable del lector
├── filtraLineas.jar         # Archivo ejecutable del filtrador
└── contadorPalabras.jar     # Archivo ejecutable del contador
```

---

## Descripción de las aplicaciones

### 1. `lectorTexto`
Lee un archivo llamado `entrada.txt` y muestra su contenido línea por línea en la salida estándar.  
Si el archivo no existe, muestra un mensaje de error.

### 2. `filtraLineas`
Lee líneas desde la entrada estándar y muestra únicamente aquellas que tengan **más de 20 caracteres**.

### 3. `contadorPalabras`
Cuenta el número total de palabras de todas las líneas que recibe desde la entrada estándar.

---

### 1. Ejecutar individualmente

java -jar lectorTexto.jar
java -jar filtraLineas.jar
java -jar contadorPalabras.jar

### 2. Ejecutar en conjunto (pipeline)

java -jar lectorTexto.jar | java -jar filtraLineas.jar | java -jar contadorPalabras.jar

La salida de lectorTexto se convierte en la entrada de filtraLineas, y luego su salida va a contadorPalabras.

