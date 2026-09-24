public abstract class Vehiculo {
    private String Patente;
    private String Marca;
    private String Modelo;
    private double PrecioBase;
    protected boolean EnServicio;

    Vehiculo(String patente, String marca, String modelo, double preciobase){
        this.Patente = patente;
        this.Marca = marca;
        this.Modelo = modelo;
        this.PrecioBase = preciobase;
    }

    public String getPatente(){
        return this.Patente;
    }

    public void setPatente(String patente){
        if(Patente == null || Patente.isBlank()){
            throw new IllegalArgumentException("Error: Ingrese una patente valida.");
        }else{
            this.Patente = patente;
        }
    }

    public String getMarca(){
        return this.Marca;
    } 

    public void setMarca(String marca){
        if(Marca == null || Marca.isBlank()){
            throw new IllegalArgumentException("Error: Ingrese una Marca valida.");
        }else{
            this.Marca = marca;
        }
    }

    public String getModelo(){
        return this.Modelo;
    }


    public void setModelo(String modelo){
        if(Modelo == null || Modelo.isBlank()){
            throw new IllegalArgumentException("Error: Ingrese un Modelo valido.");
        }else{
            this.Modelo = modelo;
        }
    }

    public double getPrecioBase(){
        return this.PrecioBase;
    }

    public void setPreciobase(double preciobase){
        if(PrecioBase < 0){
            throw new IllegalArgumentException("Error: Ingrese un entero positivo.");
        }else{
            this.PrecioBase = preciobase;
        }
    }

    public boolean getIsEnServicio(boolean EnServicio){
        return this.EnServicio;
    }

    public abstract double CalcularPrecioAlquiler();

    public String MostrarDetalles(){
        return "Patente: " + this.Patente + " | " + "Marca: " + this.Marca + " | " + "Modelo: " + this.Modelo + " | " + "Precio: " + this.PrecioBase + " | " + "Disponible: " + this.EnServicio;
    }
}
