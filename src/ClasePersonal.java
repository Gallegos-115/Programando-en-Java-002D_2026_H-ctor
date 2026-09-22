public class ClasePersonal extends ClaseDeportiva {
    private String instructor;
    private boolean tieneEvaluacionPrevia;
    private boolean cancelacionActiva;

    public ClasePersonal(String nombre, int cupoMaximo, int duracion, String instructor, boolean tieneEvaluacionPrevia) {
        super(nombre, cupoMaximo, duracion);
        setInstructor(instructor);
        setTieneEvaluacionPrevia(tieneEvaluacionPrevia);
        this.cancelacionActiva = false; // Inicialmente inactiva
    }

    @Override
    public double CalculaPrecio() {
        double costoBase = 35000;
        if (!tieneEvaluacionPrevia) {
            costoBase *= 1.20;
        }
        return costoBase;
    }

    @Override
    public boolean tieneCancelacionActiva() {
        return cancelacionActiva;
    }

    @Override
    public void activarCancelacion() {
        this.cancelacionActiva = true;
    }

    public String getInstructor() { return instructor; }
    public void setInstructor(String instructor) {
        if (instructor == null || instructor.trim().isEmpty()) {
            throw new IllegalArgumentException("El instructor no puede ser nulo o vacío.");
        }
        this.instructor = instructor;
    }

    public boolean isTieneEvaluacionPrevia() { return tieneEvaluacionPrevia; }
    public void setTieneEvaluacionPrevia(boolean tieneEvaluacionPrevia) {
        this.tieneEvaluacionPrevia = tieneEvaluacionPrevia;
    }
}
