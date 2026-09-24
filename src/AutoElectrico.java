public class AutoElectrico extends Vehiculo{
    private int CapacidadBateriaKw;
    private int AutonomiaKm;
    private int NivelCarga;

    AutoElectrico(String patente, String modelo, String Marca, double preciobase, boolean enservicio, int capacidadbateriaKw, int autonomiakm, int nivelcarga){
        super(patente, Marca, modelo, preciobase);
        this.CapacidadBateriaKw = capacidadbateriaKw;
        this.AutonomiaKm = autonomiakm;
        this.NivelCarga = nivelcarga;
    }

    @Override 
    public double CalcularPrecioAlquiler(){
        return this.getPrecioBase() * 2;
    }

    @Override 
    public String MostrarDetalles(){
        return super.MostrarDetalles() + " | " + "Capacidad de Batería: " + this.CapacidadBateriaKw + " | " + "Kilometros: " + this.AutonomiaKm + " | " + "Nivel de batería: " + this.NivelCarga;
    }

    public int getCapacidadBateraKm(){
        return this.CapacidadBateriaKw;
    }

    public int getAutonomiaKm(){
        return this.AutonomiaKm;
    }

    public int getNivelCarga(){
        return this.NivelCarga;
    }

}
