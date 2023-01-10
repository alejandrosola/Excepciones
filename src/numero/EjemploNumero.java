package numero;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjemploNumero {

    public static void main(String[] args) {
        // Creo un scanner para pedir un numero al usuario
        Scanner scanner = new Scanner(System.in);

        int numero;
        System.out.println("Ingrese un número");

        try {
            // El método nextInt de la clase Scanner lanz una excepción
            // al ingresarle algo que no es un número
            numero = scanner.nextInt();
        } catch(Exception e) {
            // Si se lanza la excepción, indicarle al usuario que
            // ingresó un número inválido
            System.out.println("Número inválido");
        }

    }



}
