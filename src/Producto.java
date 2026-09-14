public abstract class Producto {
    private String Nombre;
    private int PrecioBase;
    private int Stock; 

    public Producto(String nombre, int stock, int preciobase){
        this.Nombre = nombre;
        this.PrecioBase = preciobase;
        this.Stock = stock;
    }

    public String getNombre(){
        return this.Nombre;
    }

    public int getPrecioBase(){
        return this.PrecioBase;
    }

    public int getStock(){
        return this.Stock;
    }

    public void setStock(int stock){
        this.Stock = stock;
    }

    public abstract int Calcularprecio();

    public String MostrarInfo(){
        return "El juego " + this.Nombre + " Tiene un precio base de " + this.PrecioBase + " y un Stock de: " + this.Stock + " Unidades";
        
    }

}