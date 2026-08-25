package Abtsraccion_y_encapsulamiento;

public class Character {
    private String Name;
    private int hit_points;
    private int magic_point;
    boolean it_ally;
    private int Age;

    public Character(String Name){
        setName(Name);
    }

    public String mostrarnombre(String Name){
        return this.Name;
    }
    
    public void setName(String Name){
        String[] palabrasprohibidas = {
            "weon",
            "nigga",
            "tonto",
            "imbecil",
            "retrasado",
            "Hijo de perra",
            "hijo de puta",
            "puta",
            "zorra",
            "perra",
            "coño",
        };


        for (String palabra : palabrasprohibidas){
            Name = Name.replaceAll("(?i)" +  palabra, "****");
        }

        this.Name = Name;
    }

    public void Validaredad(int Age){
        if(Age < 0){
            System.out.println("La edad ingresada es menor a 0, vuelva a intentarlo");
        }else{
            this.Age = Age; 
        }
    }

    public int mostraredad(){
        return this.Age;
    }

    public void Asignarsalud(int hit_points){
        if(hit_points < 0){
            this.hit_points = 0;
        }else{
            this.hit_points = hit_points;
        }
    }

    public int Mostrarvida(){
        return this.hit_points;
    }

    public void Asignarmana(int magic_point){
        if(magic_point < 0){
            System.out.println("Ingrece un mana valido, vuelva a intentar");
        }else{
            this.magic_point = magic_point;
        }
    }

    public int mostrarmana(){
        return this.magic_point;
    }

}




