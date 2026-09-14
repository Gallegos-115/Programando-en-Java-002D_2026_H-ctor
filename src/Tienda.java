import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {
    static ArrayList<ProductoFisico> Coleccion_juego_fisicos =new ArrayList<>();
    static ArrayList<ProductoDigital> juegoa_Digitales = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        MostrarMenu();
    }

    static void MostrarMenu(){
        boolean MostrarMenu = true;

        while (MostrarMenu) {
            System.out.println("-------- Menú --------");
            System.out.println("1. Registrar producto");
            System.out.println("2. Listar inventario");
            System.out.println("3. Buscar producto por nombre");
            System.out.println("4. Vender producto");
            System.out.println("5. Resumen del inventario");
            System.out.println("6. Salir");
            System.out.println("Seleccione una opción:");
            System.out.println("---------------------");


            String OpcionUsuario = sc.nextLine();

            switch (OpcionUsuario) {
                case "1":
                    RegistrarProducto();
                    break;

                case "2":
                    ListarInventario();
                    break;

                case "3":
                    BuscarProducto();
                    break;

                case "4":
                    VenderJuegos();
                    break;

                case "5":
                    MostrarResumendeInventario();
                    break;

                case "6":
                    System.out.println("Graciar por visitarnos, vuelva pronto. <3");
                    MostrarMenu = false;
                    break;
            
                default:
                    break;
            }
        }
    }

    static  void RegistrarProducto(){
        boolean mostrarMenu = true;

        while (mostrarMenu) {
            System.out.println("1. Producto Físico");
            System.out.println("2. producto Digital");
            System.out.println("3. Volver a menú");

            System.out.println("Escoga una opción.");
            
            String opcion_de_registro = sc.nextLine();

            switch (opcion_de_registro) {
                case "1":
                    RegistrarProductoFisico();
                    break;
            
                case "2":
                    RegistrarProductoDigital();
        
                    break;

                case "3":
                    mostrarMenu = false;
                    break;
                default:
                    break;
            }
        }
    }


    static void RegistrarProductoFisico(){
        System.err.println("1. Ingrese el Nombre del juego.");
        String nombre = sc.nextLine();

        System.err.println("2. Ingrese el Precio base del juego.");
        int PrecioBase = Integer.parseInt(sc.nextLine());

        System.err.println("3. Ingrese el Stock del juego.");
        int Stock = Integer.parseInt(sc.nextLine());

        System.err.println("4. Ingrese el Costo de envio al juego.");
        int CostodeEnvio = Integer.parseInt(sc.nextLine());

        ProductoFisico juego = new ProductoFisico(nombre, PrecioBase, Stock, CostodeEnvio);

        if (Coleccion_juego_fisicos.add(juego)) {
           System.out.println("El Juego Agregado exitosamente."); 
        }else{
            System.err.println("El juego no se agrego de manera correcta.");
        }
    }


    static void RegistrarProductoDigital(){
        System.err.println("1. Ingrese el Nombre del juego.");
        String nombre = sc.nextLine();

        System.err.println("2. Ingrese el Precio base del juego.");
        int PrecioBase = Integer.parseInt(sc.nextLine());

        System.err.println("3. Ingrese el Stock del juego.");
        int Stock = Integer.parseInt(sc.nextLine());

        System.err.println("4. Ingrese el descuento del juego.");
        int descuento = Integer.parseInt(sc.nextLine());

        System.out.println("5. ingrece la plataforma del juego.");
        String plataforma = sc.nextLine();

        ProductoDigital juego = new ProductoDigital(nombre, PrecioBase, Stock, descuento, plataforma);

        if (juegoa_Digitales.add(juego)) {
           System.out.println("El Juego Agregado exitosamente."); 
        }else{
            System.err.println("El juego no se agrego de manera correcta.");
        }
    }

    static public void ListarInventario(){
        System.out.println(" --- Bodega --- ");

        for (ProductoDigital productoDigital : 
            juegoa_Digitales) {
            System.out.println(productoDigital.MostrarInfo());
        }

        for (ProductoFisico productoFisico : Coleccion_juego_fisicos) {
            System.out.println(productoFisico.MostrarInfo());
        }
    }

    static public void BuscarProducto(){
        System.out.println(" --- Buscador --- ");

        System.out.println("Ingrece el nombre del producto que deseá buscar.");
        String buscar = sc.nextLine().toLowerCase();

        boolean encontrado = false;

        for (ProductoFisico producto : Coleccion_juego_fisicos){
            if(producto.getNombre().toLowerCase().contains(buscar)){
                System.out.println("Producto Físico encontrado: " + producto.getNombre());

                encontrado = true;
            }
        }

        for (ProductoDigital producto : juegoa_Digitales){
            if(producto.getNombre().toLowerCase().contains(buscar)){
                System.out.println("Producto Dígital encontrado: " + producto.getNombre());

                encontrado = true;
            }
        }

        if(!encontrado){
            System.out.println("No se han encontrado productos.");
        }
    }

    static public void VenderJuegos(){
        int totalFisicos = Coleccion_juego_fisicos.size();
        int totalDigitales = juegoa_Digitales.size();
        int totalProductos = totalDigitales + totalFisicos;

        if (totalProductos == 0) {
           System.out.println("No hay productos registrados.");
                return;
        }

        System.out.println(" --- Venta de juegos --- ");
        int indiceGlobla = 1;
        for (ProductoFisico productoFisico : Coleccion_juego_fisicos){
            System.out.println("[" + indiceGlobla + "] " + productoFisico.getNombre() + " | Stock: " + productoFisico.getStock());
            indiceGlobla++;
        }

        for (ProductoDigital productodigital : juegoa_Digitales){
            System.out.println("[" + indiceGlobla + "] " + productodigital.getNombre() + " | Stock: " + productodigital.getStock());
            indiceGlobla++;
        }

        int indice = -1;
        try {
            System.out.print("\nIngrese el número (índice) del producto a vender: ");
            indice = Integer.parseInt(sc.nextLine());

            if (indice < 0 || indice >= totalProductos) {
                System.out.println("Error: El índice ingresado no existe.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Debe ingresar un número entero.");
            return;
        }

        int cantidad = 0;
        try {
            System.out.print("Ingrese la cantidad a vender: ");
            cantidad = Integer.parseInt(sc.nextLine());

            if (cantidad <= 0) {
                System.out.println("Error: La cantidad debe ser mayor a 0.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Debe ingresar un número entero para la cantidad.");
            return;
        }

        if (indice < totalFisicos) {
            ProductoFisico productoFisico = Coleccion_juego_fisicos.get(indice);
            if (cantidad > productoFisico.getStock()) {
                System.out.println("Error: Stock insuficiente. Disponible: " + productoFisico.getStock());
                return;
            }
            productoFisico.setStock(productoFisico.getStock() - cantidad);
            System.out.printf("¡Venta exitosa! Total: ", cantidad * productoFisico.Calcularprecio());
        } else {
            ProductoDigital productoDigital = juegoa_Digitales.get(indice - totalFisicos);
            if (cantidad > productoDigital.getStock()) {
                System.out.println("Error: Stock insuficiente. Disponible: " + productoDigital.getStock());
                return;
            }
            productoDigital.setStock(productoDigital.getStock() - cantidad);
            System.out.printf("¡Venta exitosa! Total: " + cantidad * productoDigital.Calcularprecio());
        }
    }

    static public void MostrarResumendeInventario(){
        int productosFisicos = 0;
        int productosDigitales = 0;
        double valorTotalInventario = 0.0;

        for (ProductoFisico productoFisico : Coleccion_juego_fisicos) {
            if (productoFisico instanceof ProductoFisico) {
                productosFisicos++;
            }
            valorTotalInventario += productoFisico.Calcularprecio() * productoFisico.getStock();
        }

        for (ProductoDigital productoDigital : juegoa_Digitales) {
            if (productoDigital instanceof ProductoDigital) {
                productosDigitales++;
            }
            valorTotalInventario += productoDigital.Calcularprecio() * productoDigital.getStock();
        }

        int totalProductos = productosFisicos + productosDigitales;

        System.out.println("=== RESUMEN DEL INVENTARIO ===");
        System.out.println("Total de productos registrados: " + totalProductos);
        System.out.println("Cantidad de productos físicos: " + productosFisicos);
        System.out.println("Cantidad de productos digitales: " + productosDigitales);
        System.out.printf("Valor total del inventario: ", valorTotalInventario);
    }
} 
