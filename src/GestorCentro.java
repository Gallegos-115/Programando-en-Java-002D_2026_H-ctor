import java.util.ArrayList;
import java.util.List;

public class GestorCentro {
    private List<ClaseDeportiva> listaClases;

    public GestorCentro() {
        this.listaClases = new ArrayList<>();
    }

    public void registrarClase(ClaseDeportiva clase) {
        listaClases.add(clase);
        System.out.println(clase.getNombre() + " (" + clase.getClass().getSimpleName() + ") registrada correctamente.");
    }

    public void buscarPorNombre(String nombre) {
        System.out.println("\n=== BUSQUEDA POR NOMBRE: \"" + nombre + "\" ===");
        for (ClaseDeportiva c : listaClases) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                if (c instanceof ClasePersonal) {
                    ClasePersonal cp = (ClasePersonal) c;
                    System.out.println("Tipo: ClasePersonal | Nombre: " + cp.getNombre() + 
                        " | Cupo: " + cp.getCupoMaximo() + 
                        " | Duracion: " + cp.getDuracion() + " min | Instructor: " + cp.getInstructor() + 
                        " | Evaluacion previa: " + (cp.isTieneEvaluacionPrevia() ? "Si" : "No") + 
                        " | Cancelacion activa: " + (cp.tieneCancelacionActiva() ? "Si" : "No") + 
                        " | Costo clase: $" + (int)cp.CalculaPrecio());
                } else if (c instanceof ClaseSemiPersonal) {
                    ClaseSemiPersonal cs = (ClaseSemiPersonal) c;
                    System.out.println("Tipo: ClaseSemipersonal | Nombre: " + cs.getNombre() + 
                        " | Cupo: " + cs.getCupoMaximo() + 
                        " | Duracion: " + cs.getDuracion() + " min | Participantes: " + cs.getCantidadParticipantes() + 
                        " | Costo clase: $" + (int)cs.CalculaPrecio());
                }
                System.out.println("- -");
            }
        }
    }

    public void listarTodas() {
        System.out.println("\n=== LISTADO DE CLASES ===");
        for (ClaseDeportiva c : listaClases) {
            System.out.println(c.toString());
        }
    }
}
