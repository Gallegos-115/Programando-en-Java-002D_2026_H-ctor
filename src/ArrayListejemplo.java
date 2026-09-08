import java.util.ArrayList;

public class ArrayListejemplo {
    
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Pera");
        frutas.add("Frutillas");
        frutas.add("Sandía");
        frutas.add("Platanos");
        System.out.println("Las frutas disponibles: " + frutas);
        System.err.println("Una de las frutas se ha acabado.");
        frutas.remove("Manzana");
        System.out.println("Ahora las frutas disponible son: " + frutas);
        System.out.println("La primera fruta es: "  + frutas.get(0));
        System.out.println("La segunda fruta es: "  + frutas.get(1));
        System.out.println("La tercera fruta es: "  + frutas.get(2));
        System.out.println("La cuarta fruta es: "  + frutas.get(3));

        for (String por_cada_fruta : frutas) {
            System.out.println(por_cada_fruta);
        }

    }

    }

