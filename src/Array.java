public class Array {
    public static void main(String[] args) {

        String[] alumnos =  new String[6];

        alumnos[0] = "Martin";
        alumnos[1] = "Héctor";
        alumnos[2] = "Alexander";
        alumnos[3] = "Proyectadas";
        alumnos[4] = "Rocket league";
        alumnos[5] = "Call of duty: Warzone";

        Integer[] edades = new Integer[6];
        edades[0] = 18;
        edades[1] = 19;
        edades[2] = 18;
        edades[3] = 67;
        edades[4] = 99;
        edades[5] = 15;

        //Forma Básico//
        //System.out.println("El estudiante: " + alumnos[0] + " tiene " + edades[0] + " años." );//
        //Forma deida//
        
        //Forma peligrosa//
        for (int i = 0; i < edades.length -1; i++){
        System.out.println("El estudiante: " + alumnos[i] + " tiene " + edades[i] + " años." );
            
        }
    }
}
