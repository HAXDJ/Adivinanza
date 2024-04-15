import java.util.Scanner;

class JuegoAdivinanzas {
    public static void main(String[] args) {
        // Generar un número aleatorio entre 0 y 100
        int numeroAleatorio = (int) (Math.random() * 101);

        // Crear un objeto Scanner para la entrada de usuario
        Scanner scanner = new Scanner(System.in);

        // Variables para contar los intentos del usuario
        int intentos = 0;
        final int MAX_INTENTOS = 5;

        // Mostrar instrucciones al usuario
        System.out.println("Bienvenido al juego de adivinanzas.");
        System.out.println("Intenta adivinar un número entre 0 y 100 en un máximo de 5 intentos.");

        // Ciclo para que el usuario realice sus intentos
        while (intentos < MAX_INTENTOS) {
            // Pedir al usuario que ingrese un número
            System.out.print("Intento #" + (intentos + 1) + ": Ingresa un número: ");
            int numeroUsuario = scanner.nextInt();

            // Incrementar el contador de intentos
            intentos++;

            // Verificar si el número ingresado es igual al número aleatorio
            if (numeroUsuario == numeroAleatorio) {
                System.out.println("¡Felicidades! ¡Has adivinado el número!");
                break; // Salir del ciclo si el usuario adivinó el número
            } else if (numeroUsuario < numeroAleatorio) {
                System.out.println("El número ingresado es menor que el número aleatorio.");
            } else {
                System.out.println("El número ingresado es mayor que el número aleatorio.");
            }
        }

        // Si el usuario no adivinó el número en 5 intentos, mostrar el número aleatorio
        if (intentos == MAX_INTENTOS) {
            System.out.println("Lo siento, has agotado tus intentos. El número era: " + numeroAleatorio);
        }

        // Cerrar el scanner
        scanner.close();
    }
}
