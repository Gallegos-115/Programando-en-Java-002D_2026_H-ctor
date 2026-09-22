public class Main {
    public static void main(String[] args) {
        GestorCentro gestor = new GestorCentro();

        // 1. Instanciar clases con la información provista
        ClasePersonal yogaPersonal = new ClasePersonal("Yoga", 1, 60, "Camila Rojas", false);
        ClasePersonal pilatesPersonal = new ClasePersonal("Pilates", 1, 50, "Diego Soto", true);
        ClaseSemiPersonal yogaSemi = new ClaseSemiPersonal("Yoga", 4, 60, 5);
        ClaseSemiPersonal spinningSemi = new ClaseSemiPersonal("Spinning", 3, 45, 2);

        // 2. Marcar la clase Personal 'Yoga' con cancelación activa
        yogaPersonal.activarCancelacion();

        // 3. Registrar todas las clases
        gestor.registrarClase(yogaPersonal);
        gestor.registrarClase(pilatesPersonal);
        gestor.registrarClase(yogaSemi);
        gestor.registrarClase(spinningSemi);

        // 4. Búsqueda por nombre 'Yoga'
        gestor.buscarPorNombre("Yoga");

        // 5. Listar clases registradas mediante toString()
        gestor.listarTodas();
    }
}