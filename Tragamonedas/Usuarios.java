package Tragamonedas;

public class Usuarios{
    private String Nombre;
    private int edad;
    private int fichas;
    private double dinerogastado;

    public Usuarios(String Nombre, int edad, int fichasiniciales){
        this.Nombre = Nombre;
        this.edad = edad;
        this.fichas = fichasiniciales;
        this.dinerogastado = 0.0;

    }

    public String getNombre(){
        return Nombre;
    }

    public int getedad(){
        return edad;
    }

    public int getfichas(){
        return fichas;
    }

    public void agregarfichas(int cantidad, double costo){
        this.fichas += cantidad;
        this.dinerogastado += costo;
    }

    public void restarfichas(int cantidad){
        this.fichas -= cantidad;

    }

    public void sumarfichas(int cantidad){
        this.fichas += cantidad;
    }

    public double getgastardinero(){
        return dinerogastado;
    }
}
