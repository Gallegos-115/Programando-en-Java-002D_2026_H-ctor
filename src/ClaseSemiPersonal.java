public class ClaseSemiPersonal extends ClaseDeportiva {
    private int CantidadParticipantes;
    
    public ClaseSemiPersonal(String Nombre, int CupoMaximo, int Duracion, int CantidadParticipantes){
        super(Nombre, CupoMaximo, Duracion);
        setCantidadParticipantes(CantidadParticipantes);
    }

    @Override 
    public double CalculaPrecio(){
        int CosoBase = 18000;
        if(CantidadParticipantes > 3){
            CosoBase *= 1.10;
        }

        return CosoBase;
    }

    public int getCantidadParticipantes(){
        return this.CantidadParticipantes;
    }

    public void setCantidadParticipantes(int participantes){
        if(CantidadParticipantes <= 0){
            throw new IllegalArgumentException("Error: Ingrese una cantidad valida.");
        }else{
            this.CantidadParticipantes = participantes;
        }
    }



}
