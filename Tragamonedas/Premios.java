package Tragamonedas;

public class Premios {
    
    public static final int Limite_de_fichas = 1;
    public static final double Costo_por_fichas= 10.0;

    private final String[] simbolos = {"🍋", "🍒", "🍓", "🍉", "⭐", "💎"};

    public String obtenersimbolosrandoms(){
        int indice = (int) (Math.random() * simbolos.length);
        return simbolos[indice];
    }

    public int calcularPremio(String s1, String s2, String s3, int apuesta) {
        if (s1.equals(s2) && s2.equals(s3)) {
            if (s1.equals("💎")) {
                return apuesta * 50;
            } else if (s1.equals("⭐")) {
                return apuesta * 20;
            } else {
                return apuesta * 10;
            }
        } else if (s1.equals(s2) || s2.equals(s3) || s1.equals(s3)) {
            return apuesta * 2;
        }
        return 0;
    }
}

