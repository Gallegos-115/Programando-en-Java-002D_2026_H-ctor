package Tragamonedas;

import java.util.Scanner;

public class Tragamonedas {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Premios juegoConfig = new Premios();

        System.out.println("=== BIENVENIDO AL TRAGAMONEDAS DE CONSOLA ===");
        System.out.println("Aquí podras apostar sin la necesidad de perder tu casa.");
        System.out.println("Pero antes debes de registrarte...");

        System.out.println("Ingresa tu nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Ahora diganos su edad.");
        int edad = scanner.nextInt();

        if (edad < 18){
            System.out.println("Lo siento, usted no cumple con el mínimo de edad recomendado.");
            System.out.println("Edad registrada: " + edad );
            scanner.close();
            return;
        }

        System.out.println("Bienvenido " + nombre + " ¿Cúantas fichas deseá comprar para empezar?");
        System.out.println("Dato importante: Cada ficha tiene un costo $" + Premios.Costo_por_fichas + "):");
        int fichasiniciales = scanner.nextInt();
        double costoinicial = fichasiniciales * Premios.Costo_por_fichas;

        Usuarios usuarios = new Usuarios(nombre, edad, fichasiniciales);
        usuarios.agregarfichas(0, costoinicial);

        int opcion = 0;
        Premios premiologica = new Premios();

        do {
            System.out.println("---- MENÚ PRINCIPAL ----");
            System.out.println("1. Jugar un ronda");
            System.out.println("2. Comprar más fichas");
            System.out.println("3. Ver estadisticas (Fichas, Dinero gastado)");
            System.out.println("4. Salir");
            System.out.print("Elige una opción");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    if (usuarios.getfichas() < Premios.Limite_de_fichas) {
                        System.out.println("¡No tienes suficientes fichas! Compra más en la opción 2.");
                        break;
                    }

                    usuarios.restarfichas(Premios.Limite_de_fichas);

                    System.out.println("\nGirando los tambores...");
                    String s1 = premiologica.obtenersimbolosrandoms();
                    String s2 = premiologica.obtenersimbolosrandoms();
                    String s3 = premiologica.obtenersimbolosrandoms();

                    System.out.println("*******************");
                    System.out.println("* " + s1 + " | " + s2 + " | " + s3 + " *");
                    System.out.println("*******************");

                    int ganado = premiologica.calcularPremio(s1, s2, s3, Premios.Limite_de_fichas);
                    if (ganado > 0) {
                        System.out.println("¡Felicidades! Has ganado " + ganado + " fichas.");
                        usuarios.sumarfichas(ganado);
                    } else {
                        System.out.println("¡Suerte la próxima! Perdiste la apuesta.");
                    }
                    break;
                
                case 2:
                    System.out.print("¿Cuántas fichas deseas comprar?: ");
                    int extraFichas = scanner.nextInt();
                    double costoExtra = extraFichas * Premios.Costo_por_fichas;
                    usuarios.agregarfichas(extraFichas, costoExtra);
                    System.out.println("¡Compra exitosa! Has gastado $" + costoExtra + " en total hasta ahora.");
                    break;

                case 3:
                    System.out.println("\n--- ESTADÍSTICAS DE " + usuarios.getNombre().toUpperCase() + " ---");
                    System.out.println("Edad: " + usuarios.getedad());
                    System.out.println("Fichas actuales: " + usuarios.getfichas());
                    System.out.println("Dinero total gastado: $" + usuarios.getgastardinero());
                    break;

                case 4:
                    System.out.println("Gracias por jugar. ¡Hasta pronto, " + usuarios.getNombre() + "!");
                    break;

                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        } while (opcion != 4);
        
        scanner.close();
    }
}
