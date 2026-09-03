package Tarea_de_java;

public class Historia extends Publicacion{
    private int duracion_horas = 24;
    private boolean es_mejor_amigo;
    private int vistas;

    public Historia(String id, String autor, boolean mejoresamigos){
        super(id, autor);

        this.es_mejor_amigo = mejoresamigos;
        this.vistas = 0;
    }

    @Override
    public void mostrardetalles(){
        System.out.println("-- Historia --");
        System.out.println("Duración: " + duracion_horas + " Horas");
        System.out.println("Mejores amigos: " + es_mejor_amigo);
        System.out.println("Visualizaciones " + vistas);


    }

    public void  registrarvistas(){
        vistas++;
    }

    public void nodisponible(){
        caducar();
    }

}
