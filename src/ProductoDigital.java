public class ProductoDigital extends Producto {
    private int Descuento;
    private String Plataforma;
    
    ProductoDigital(String Nombre, int PrecioBase, int Stock, int Descuento, String Plataforma){
        super(Nombre, Stock, PrecioBase);
    }

    public int getDescueto(){
        return this.Descuento;
    }

    public String getPlataforma(){
        return this.Plataforma;
    }

    @Override
    public String MostrarInfo() {
        return super.MostrarInfo() + ", descuento de: " + this.Descuento + " % " + "[Plataforma]" ;
    }

    @Override
    public int Calcularprecio() {
         return this.getPrecioBase() - (this.getPrecioBase() * this.Descuento )/ 100;
    }
}
