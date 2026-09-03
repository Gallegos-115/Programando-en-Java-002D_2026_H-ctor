package Tarea_de_java;

import java.util.Scanner;
import java.util.ArrayList;

public class Instagram {
    static ArrayList<Publicacion> publicaciones = new ArrayList<>();
    public static void main(String[] args){
        mostrar_menu();
    }

    static void mostrar_menu(){
        Scanner sc = new Scanner(System.in);
        Publicacion publicacion = new Publicacion("", "");

        boolean bandera  = true;

        while (bandera) {
            System.out.println("Bienvenido a Instagram de Consola :3");
            System.out.println("1. Crear publicación");
            System.out.println("2. Ver Feed completo");
            System.out.println("3. Dar like a una publicación");
            System.out.println("4. Filtrar por publicación");
            System.out.println("5. Salir");
            System.out.println(" --- Seleccione una de las siguientes opciones --- ");

            String opcion_usuario = sc.nextLine();

            switch (opcion_usuario) {
                case "1":
                    System.out.println("Eliga el tipo de publicación");
                    System.out.println("1. Historia");
                    System.out.println("2. Reel");
                    System.out.println("3. Post");

                    String opcion_de_publicacion = sc.nextLine();

                    switch (opcion_de_publicacion) {
                        case "1":
                            crearHistoria(sc);
                            break;

                        case "2":
                            crearReel(sc);
                            break;                            
                        case "3":
                            crearPost(sc);
                            break;
                        default:
                            System.out.println("Opción invalida.");
                            break;
                    }
                    break;

                case "2":
                    listarfeed();
                    break;

                case "3":
                    interactuarPublicaciones(sc);
                    break;

                case "4":
                    filtrarPublicaciones(sc);
                    break;

                case "5":
                    System.out.println("Cerrando el Intagram de consola, gracias por probar");
                    bandera = false;
                    break;

                default:
                    System.out.println("Opción invalida");
                    break;
            }
        }
    }

    static void crearHistoria(Scanner sc){
        System.out.println(" --- CREAR HISTORIA --- ");

        System.out.println("Ingrece el ID: ");
        String id = sc.nextLine();
        
        System.out.println("Bien, ahora ingrece el autor: ");
        String autor = sc.nextLine();

        System.out.println("Excelente, ahora, ¿Su historia es para mejores amigos? (true/false)");
        boolean es_mejor_amigo = sc.nextBoolean();

        Historia historia = new Historia(id, autor, es_mejor_amigo);

        System.out.println(" === Historia creada con exito === ");
        historia.mostrardetalles();
        publicaciones.add(historia);
    }

    static void crearReel(Scanner sc){
        System.out.println(" --- CREAR REEL ---");

        System.out.println("Ingrece el ID: ");
        String id = sc.nextLine();

        System.out.println("Ahora ingrece el autor: ");
        String autor = sc.nextLine();

        System.out.println("Excelente, ¿Cúanto desea que dure? (Min 3s y Max 90s)");
        int duracion_segundos = Integer.parseInt(sc.nextLine());

        System.out.println("¿Deseá agregar una canción? ");
        String audioNombre = sc.nextLine();

        System.out.println(" === Su Reel se ha creado con exitó === ");

        Reel reel = new Reel(id, autor, duracion_segundos, audioNombre);
        reel.mostrardetalles();
        publicaciones.add(reel);
    }

    static void crearPost(Scanner sc){
        System.out.println(" --- CREAR POST ---");

        System.out.println("Ingrece el ID: ");
        String id = sc.nextLine();

        System.out.println("Bien, Ahora ingrece el autor");
        String autor = sc.nextLine();

        System.out.println("¿Cúantos caracteres cuenta su post?");
        String piedefoto = sc.nextLine();

        System.out.println("¿Deseá agregar una ubicació?");
        String ubicacion = sc.nextLine();

        System.out.println("¿Deseá habilitar los comentarios? (true/false)");
        boolean comentariosHabilitados = sc.nextBoolean();

        System.out.println(" === Su Post se ha creado con exitó === ");

        Post post = new Post(id, autor, piedefoto, comentariosHabilitados, ubicacion);
        post.mostrardetalles();
        publicaciones.add(post);
    }

    static void listarfeed(){
        System.out.println("===== FEED COMPLETO =====");
        for (Publicacion p : publicaciones){
            p.mostrardetalles();

            System.out.println("---------------------");
        }
    }

    static void interactuarPublicaciones(Scanner sc){
        System.out.println("Ingrece la ID de la publicación: ");
        String id = sc.nextLine();

        boolean encontrada = false;

            for(Publicacion p : publicaciones){
                if(p.getId(id).equals(id));

                p.darlike(0);

                if (p instanceof Reel){
                    Reel reel = (Reel)p;
                    reel.registrarreproducciones();;
                }

                encontrada = true;

                System.out.println("Interacción realizada.");
                break;
            }

            if(!encontrada){
                System.out.println("No se encontró la publicación.");
        }
    }

    static void filtrarPublicaciones(Scanner sc) {

    System.out.println("===== FILTRAR PUBLICACIONES =====");
    System.out.println("1. Historias activas");
    System.out.println("2. Reels");
    System.out.println("3. Posts tradicionales");
    System.out.print("Seleccione una opción: ");

    int opcion = sc.nextInt();
    sc.nextLine();

    for (Publicacion p : publicaciones) {

        switch (opcion) {

            case 1:
                if (p instanceof Historia && p.isEsta_activa(false)) {
                    p.mostrardetalles();
                }
                break;

            case 2:
                if (p instanceof Reel) {
                    p.mostrardetalles();
                }
                break;

            case 3:
                if (p instanceof Post) {
                    p.mostrardetalles();
                }
                break;

            default:
                System.out.println("Opción inválida.");
                return;
        }
    }
    }
}
