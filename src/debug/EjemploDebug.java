package debug;

import java.util.Scanner;

public class EjemploDebug {

    public static void main(String[] args) {
        // Crear un scanner para pedir input del usuario
        Scanner scanner = new Scanner(System.in);

        int n;
        int suma = 0;

        System.out.println("Este programa calcula el promedio de las notas ingresadas por el usuario");

        // Pedir la cantidad de notas
        System.out.println("Cuantas notas quiere ingresar?");
        try {
            n = scanner.nextInt();
        } catch (Exception e){
            System.out.println("Numero invalido");
            return;
        }
        // Crear un array para guardar las notas
        int[] notas = new int[n];

        // Leer las notas
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la " + i + "° nota");
            try {
                notas[i] = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Numero invalido");
            }
        }

        // Calcular el promedio
        for (int i = 0; i < notas.length; i++) {
            suma = suma + notas[i];
        }

        int promedio = suma / notas.length;

        System.out.println("El promedio de las notas ingresadas es: " + promedio);
    }

}
