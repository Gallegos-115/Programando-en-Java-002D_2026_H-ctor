public abstract class Vehiculo {
    private String Patente;
    private String Marca;
    private String Modelo;
    private int Año;
    private double Costo_Base;
    
    Vehiculo(String patente, String marca, String modelo, int año, double costo_base){
        this.Patente = patente;
        this.Marca = marca;
        this.Modelo = modelo;
        this.Año = año;
        this.Costo_Base = costo_base;
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

    public void setMarca(String marca){
        if(Marca.isEmpty()){
            System.out.println("Error: Patente vacía.");
        }else{
            this.Marca = marca;
        }
    }


    public String getModelo(){
        return this.Modelo;
    }

    public void setModelo(String modelo){
        if(modelo.isEmpty()){
            System.out.println("Error: Modelo vacío.");
        }else{
            this.Modelo = modelo;
        }
    }

    public int getAño(){
        return this.Año;
    }

    public void setAño(int años){
        if(Año < 0){
            System.out.println("Error: Dígitos negativos.");
        }else{
            this.Año = años;
        }
    } 

    public double getCosto_Base(){
        return this.Costo_Base;
    }

    public void setCosto_base(double costo_base){
        if(Costo_Base < 0){
            System.out.println("Error: Digítos negativos");
        }else{
            this.Costo_Base = costo_base;
        }
    }

    public abstract int CalcularPrecio();

    public String MostrarInformacion(){
        return "La patente es: " + this.Patente + "| " + " Modelo : " + this.Modelo + "| " + " Marca" + this.Marca + "| " + "Año " + this.Año + "| Precio Base: " + this.Costo_Base;        
    }
    
}