package Tarea_de_java;

public class Publicacion {
    private String id;
    private String autor;
    private String fecha_de_creacion;
    private int like;
    protected boolean esta_activa;


    public Publicacion(String id, String autor){
        this.id = id;
        this.autor = autor;
    }

    public void darlike(int like){
        this.like += 1;
    }

    public void mostrardetalles(){
        System.out.println("La ID de la publicación es: " + id);
        System.out.println("El autor de la publicación es: " + autor);
        System.out.println("La fecha de creación de la publicación es: " + fecha_de_creacion);
        System.out.println("La cantidad de likes de la publicación es: " + like);
        System.out.println("La publicación se encuentra disponible: " + esta_activa);

    }

    public boolean Validarautor(String autor){
        return autor != null && !autor.isEmpty();
    }


    public String getId(String id){
        return id;
    }

    public int getlike(int like){
        return like;
    }


    public boolean isEsta_activa(boolean esta_activa){
        return esta_activa;
    }

    public void caducar(){
        esta_activa = false;
    }

}
