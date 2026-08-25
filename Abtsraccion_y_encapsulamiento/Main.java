package Abtsraccion_y_encapsulamiento;

import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Showmenu();

    }
    static void Showmenu(){
        Scanner sc = new Scanner(System.in);
        Character player_Character = new Character();

        boolean flag_menu = true;

        System.out.println(" *** Bienvenido a los siete reinos ***");
        System.out.println("Tú deber ahora mismo, es crear a tu personaje");

        while(flag_menu){
            System.out.println("1. Crea a tu personaje");
            System.out.println("2. Ver caracteristicas del personaje");
            System.out.println("3. Salir");

            System.out.println("Escoge una de las siguientes opciones 1-3");

            String opcion_escogida = sc.nextLine();

            switch (opcion_escogida) {
                case "1":
                    createCharacter(player_Character, sc);
                    break;
                    visualizarCharacter(player_Character);
                case "2":

                    break;

                case "3":
                    System.out.println("Gracias por jugar.");
                    flag_menu = false;
                    break;
            
                default:
                    System.out.println("Opción invalida");
                    break;
            }     
        }
    }


    static void createCharacter(Character player_Character, Scanner sc){

     
        EnderMan enderman = new EnderMan();
        Creeper creeper = new Creeper();
        Zombie zombie = new Zombie();
        Dragon dragon = new Dragon();

        System.out.println("Crea a tu personaje");
        System.out.println("Ingrece el nombre de su personaje");
        System.out.println("Eliga entre los siguientes personajes");
        System.out.println("1. EnderMan");
        System.out.println("2. Creeper");
        System.out.println("3. Zombie");
        System.out.println("4. Dragón");
        System.out.println("5. Salir");

        String escogeropcion = sc.nextLine();

        switch (escogeropcion) {
            case "1":
                System.out.println("Has escogido la siguiente clase 'EnderMan'");
                System.out.println("Ingrece la salud de su personaje");
                enderman.Asignarsalud(Integer.parseInt(sc.nextLine()));

                System.out.println("Excelente, ahora ingrece la fuerza");
                enderman.Asignarmana(Integer.parseInt(sc.nextLine()));

                break;

            case "2":
                System.out.println("Has escogido la siguiente clase 'Creeper'");
                System.out.println("Ingrece la salud de su personaje");
                creeper.Asignarsalud(Integer.parseInt(sc.nextLine()));

                System.out.println("Excelente, ahora ingrece la fuerza");
                enderman.Asignarmana(Integer.parseInt(sc.nextLine()));

            
            case "3":
                System.out.println("Has escogido la siguiente clase 'Zombie'");
                System.out.println("Ingrece la salud de su personaje");
                zombie.Asignarsalud(Integer.parseInt(sc.nextLine()));

                System.out.println("Excelente, ahora ingrece la fuerza");
                enderman.Asignarmana(Integer.parseInt(sc.nextLine()));

            case "4":
                System.out.println("Has escogido la siguiente clase 'Dragón'");
                System.out.println("Ingrece la salud de su personaje");
                dragon.Asignarsalud(Integer.parseInt(sc.nextLine()));

                System.out.println("Excelente, ahora ingrece la fuerza");
                enderman.Asignarmana(Integer.parseInt(sc.nextLine()));

            default:            
            System.out.println("Elección no valida.");
            System.out.println("Elección esocogida: " + escogeropcion);
            break;
        }

    }
       
    static void visualizarCharacter (Character player_Character){
    System.out.println("*** Caracteristicas de tu personaje ***");

    System.out.println("1. Nombre: " + player_Character.mostrarnombre());
    System.out.println("2. Maná: " + player_Character.mostrarmana());
    System.out.println("3. Vida: " + player_Character.Mostrarvida());
    System.out.println("4. Edad: " + player_Character.mostraredad());
    }
}
