public abstract class ClaseDeportiva {
    private String Nombre;
    private int CupoMaximo;
    private int Duracion;

    public ClaseDeportiva(String nombre, int cupomaximo, int duracion){
        this.CupoMaximo = cupomaximo;
        this.Duracion = duracion;
        this.Nombre = nombre;
    }

    public String getNombre(){
        return this.Nombre;
    }

    public void setNombre(String nombre){
        if(Nombre == null || Nombre.isBlank()){
            throw new IllegalArgumentException("Error: Ingrese un nombre valido.");
        }else{
            this.Nombre = nombre;
        }
    }

    public int getCupoMaximo(){
        return this.CupoMaximo;
    }

    public void setCupoMaximo(int cupomaximo){
        if(CupoMaximo < 1 && CupoMaximo > 30){
            throw new IllegalArgumentException("Error: El rango es de 1 a 30.");
        }else{
            this.CupoMaximo = cupomaximo;
        }
    }

    public int getDuracion(){
        return this.Duracion;
    }

    public void setDuracion(int duracion){
        if(Duracion < 0){
            throw new IllegalArgumentException("Error: La duración debe ser un entero positivo.");
        }else{
            this.Duracion = duracion;
        }
    }

    public abstract double CalculaPrecio();

    public String toString(){
        return "Nombre del Ejercicio: " + this.Nombre + " | " + " Cupos Usados: " + this.CupoMaximo;
    }

}
