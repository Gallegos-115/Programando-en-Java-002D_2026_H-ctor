package Ahorcado;

public class Jugadores {

    private String Nombre = "";
    private int PartidasGanadas;

    public Jugadores(String Nombre) {
        this.Nombre = Nombre;
        this.PartidasGanadas = 0;
    }

    public String getNombre(){
        return Nombre;
    }
    public int getPartidasGanadas(){
        return  PartidasGanadas;
    }

    public void racha_de_victorias(){
        this.PartidasGanadas++;
    }
}
