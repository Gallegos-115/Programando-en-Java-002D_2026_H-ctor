package Abtsraccion_y_encapsulamiento;

class Character {
    private String name = "";
    private int hit_point;
    private int magic_points;
    private boolean is_ally;

    public Character(String Name, int hit_point, int magic_points, boolean is_ally){
        this.name = Name;
        this.hit_point = hit_point;
        this.magic_points = magic_points;
        this.is_ally = is_ally;
    }

    public String getName(){
        return name;
    }

    public int gethit_point(){
        return hit_point;
    }

    public int getmagic_points(){
        return magic_points;
    }

    public boolean getis_ally(){
        return is_ally;
    }    
}

