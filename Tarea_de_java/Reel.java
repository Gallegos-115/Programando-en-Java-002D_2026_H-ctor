package Tarea_de_java;

public class Reel extends Publicacion{

    private int duracion_segundos;
    private String audioNombre;
    private int reproducciones; 

    public Reel(String id, String autor, int duracion_segundos, String audioNombre){
        super(id, autor);

        this.duracion_segundos = duracion_segundos;
        this.audioNombre = (validar_audio(audioNombre, autor));
        this.reproducciones = 0;


    }

    @Override
    public void mostrardetalles(){
        System.out.println(" --- Reel --- ");
        System.out.println("Duración:" + duracion_segundos + "Segundos.");
        System.out.println("Nombre del audio: " + audioNombre + ".");
        System.out.println("Reproducciones: " + reproducciones);
    }

    public void registrarreproducciones(){
        reproducciones ++;
    }

    public void validar_duracion(){
        duracion_segundos= Math.max(3, Math.min(90, duracion_segundos));
    }

    private String validar_audio(String audioNombre, String autor){
        if(audioNombre == null || audioNombre.isEmpty()){
            return "Audio original de " + autor;
        }
        return audioNombre;
    }
}
