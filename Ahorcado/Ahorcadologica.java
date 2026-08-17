package Ahorcado;

public class Ahorcadologica {
    // Lista de palabras que el jugador deberá adivinar en orden
    private String[] palabras = {"JAVA", "CONSOLA", "CODIGO", "VARIABLE", "BUCLE"};
    private int indiceActual = 0;
    
    private String palabraSecreta;
    private char[] estadoActual;
    private int intentosMaximos = 6;
    private int intentosFallidos;

    public boolean cargarSiguientePalabra() {
        if (indiceActual >= palabras.length) {
            return false;
        }
        
        this.palabraSecreta = palabras[indiceActual];
        this.intentosFallidos = 0;

        this.estadoActual = new char[palabraSecreta.length()];
        for (int i = 0; i < estadoActual.length; i++) {
            estadoActual[i] = '_';
        }

        return true;
    }

    public boolean intentarLetra(char letra) {
        letra = Character.toUpperCase(letra);
        boolean acierto = false;

        for (int i = 0; i < palabraSecreta.length(); i++) {
            if (palabraSecreta.charAt(i) == letra) {
                estadoActual[i] = letra;
                acierto = true;
            }
        }

        if (!acierto) {
            intentosFallidos++;
        }

        return acierto;
    }

    public boolean estaJuegoTerminado() {
        return hasGanado() || hasPerdido();
    }

    public boolean hasGanado() {
        String actual = new String(estadoActual);
        return actual.equals(palabraSecreta);
    }

    public boolean hasPerdido() {
        return intentosFallidos >= intentosMaximos;
    }

    public String getEstadoActualFormateado() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < estadoActual.length; i++) {
            sb.append(estadoActual[i]).append(" ");
        }
        return sb.toString().trim();
    }

    public int getIntentosRestantes() {
        return intentosMaximos - intentosFallidos;
    }

    public String getPalabraSecreta() {
        return palabraSecreta;
    }
}
  



