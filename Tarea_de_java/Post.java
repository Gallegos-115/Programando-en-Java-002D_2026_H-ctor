package Tarea_de_java;

public class Post extends Publicacion {

    private String pieDeFoto;
    private boolean comentariosHabilitados;
    private String ubicacion;

    public Post(String id, String autor, String pieDeFoto, boolean comentariosHabilitados, String ubicacion){
        super(id, autor);

        if (!validarPieDeFoto(pieDeFoto)) {
            throw new IllegalArgumentException(
                "El pie de foto no puede superar los 2200 caracteres"
            );
        }

        this.pieDeFoto = pieDeFoto;
        this.comentariosHabilitados = comentariosHabilitados;
        this.ubicacion = validarUbicacion(ubicacion);
    }

    private boolean validarPieDeFoto(String pieDeFoto) {

        if (pieDeFoto == null) {
            return false;
        }

        if (pieDeFoto.length() > 2200) {
            return false;
        }

        return true;
    }

    private String validarUbicacion(String ubicacion) {

        if (ubicacion == null || ubicacion.isEmpty()) {
            return "Sin ubicación";
        }

        return ubicacion;
    }

    @Override
    public void mostrardetalles() {

        System.out.println("Pie de foto: " + pieDeFoto);
        System.out.println("Ubicación: " + ubicacion);

        if (!comentariosHabilitados) {
            System.out.println("Comentarios desactivados");
        }
    }
}