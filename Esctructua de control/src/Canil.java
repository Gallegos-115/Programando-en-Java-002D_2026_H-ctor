public class Canil {
    public static void main(String[] args) {
        System.out.println("***Bienvenido al Canil***");

        Perro perro_del_profe = new Perro();

        perro_del_profe.nombre = "Gimli";
        perro_del_profe.edad = 6;
        perro_del_profe.peso = 40.5;
        perro_del_profe.tiene_vacuna = false;

        Perro perro_del_gallego = new Perro();

        perro_del_gallego.nombre = "Sofia";
        perro_del_gallego.edad = 14;
        perro_del_gallego.peso = 25;
        perro_del_gallego.tiene_vacuna = true;

    
        if (perro_del_profe.edad > 5) {
            System.out.println("El perro del profe es mayor");

        } else {
            System.out.println("El perro del profe es mejor");
        }

        if (perro_del_profe.peso > 40){
            System.out.println("El perro del profesor esta gordito");
        }else {
            System.out.println("El perro del profe no esta tan gordito");
        }
        

        if (perro_del_profe.tiene_vacuna && perro_del_gallego.tiene_vacuna == true) {
            System.out.println("Los perros estan totalmente vacunados");
        }else {
            System.out.println("Los perros no se encuentra vacunados");
        }   


        System.out.println("Gracias por visitar");
    }
}
