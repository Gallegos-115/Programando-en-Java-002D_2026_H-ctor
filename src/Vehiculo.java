public abstract class Vehiculo {
    private String Patente;
    private String Marca;
    private String Modelo;
    private int Año;
    private double Costo;
    
    Vehiculo(String patente){
        this.Patente = patente;
    }

    public String getPatente(){
        return this.Patente;
    }

    public void setPatente(String patente){
        if(patente.isEmpty()){
            System.out.println("Error: Patente vacía.");
        }else{
            this.Patente = patente;
        }
    }

    public String getMarca(){
        return this.Marca;
    }

    public void setMarca(){
        
    }
    
}