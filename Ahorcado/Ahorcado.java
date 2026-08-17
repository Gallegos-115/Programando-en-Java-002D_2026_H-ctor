package Ahorcado;

import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ahorcadologica juego = new Ahorcadologica();

        System.out.println("=== ¡BIENVENIDO AL JUEGO DEL AHORCADO! ===");
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        Jugadores jugador = new Jugadores(nombre);

        System.out.println("\n¡Hola, " + jugador.getNombre() + "! Vamos a adivinar las palabras una por una.");
        while (juego.cargarSiguientePalabra()) {
            System.out.println("\n----------------------------------------");
            System.out.println("¡Nueva palabra cargada! A adivinar:");

            while (!juego.estaJuegoTerminado()) {
                System.out.println("\nPalabra: " + juego.getEstadoActualFormateado());
                System.out.println("Intentos restantes: " + juego.getIntentosRestantes());
                System.out.print("Ingresa una letra: ");
                
                String entrada = scanner.next();
                char letra = entrada.charAt(0);

                boolean acierto = juego.intentarLetra(letra);

                if (acierto) {
                    System.out.println("¡Bien hecho! La letra está en la palabra.");
                } else {
                    System.out.println("¡Fallaste! Esa letra no está.");
                }
            }

            if (juego.hasGanado()) {
                System.out.println("\n¡FELICIDADES! Has completado la palabra: " + juego.getPalabraSecreta());
                jugador.racha_de_victorias();
                System.out.println("Palabras completadas hasta ahora: " + jugador.getPartidasGanadas());
            } else {
                System.out.println("\n¡TE HAS QUEDADO SIN INTENTOS! Perdiste esta ronda.");
                System.out.println("La palabra secreta era: " + juego.getPalabraSecreta());
                break;
            }
        }

        System.out.println("\n=== JUEGO TERMINADO ===");
        System.out.println("Gracias por participar, " + jugador.getNombre() + ". Total de palabras completadas: " + jugador.getPartidasGanadas());
        scanner.close();
    }
}
