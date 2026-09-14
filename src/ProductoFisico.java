public class ProductoFisico extends Producto {
    private int CostoEnvio;

    ProductoFisico(String Nombre, int PrecioBase, int CostoEnvio, int Stock){
        super(Nombre, Stock, PrecioBase);
        this.CostoEnvio = CostoEnvio;
    }

    @Override
    public int Calcularprecio() {
        return this.getPrecioBase() + this.CostoEnvio;
    }

    public int getCostoEnvio(){
        return this.CostoEnvio;
    }

    @Override
    public String MostrarInfo() {
        return super.MostrarInfo() + " , Costo de envío " + this.CostoEnvio;
    }
}
