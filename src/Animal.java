public class Animal {
    //Para poder enterder la herencía debemos de tomar encuenta que de que queremos que nuestra clase tome.
    //De nuestra clase principal.
    //En este caso tenemos crear una clase llamada animal o una clase princiapl.
    //De aquí las demas clases deben de heredar comportamientos o acciones de esta misma clase.
    //Así que comencemos.

    //Paso 1: Planteamiento.

    //Para comenzar con la herencía debemos plantearnos lo siguientes.
    //¿Qué queremos que nuestra nueva clase herede?
    //Evidentemente algo similar, en este caso puede ser ladrar, comer o alguna otra que ustedes deseén.
    //Debemos de pensar en la vida real
    //Cuando una nace, suele heredar ciertos rasgos de tus padres o abuelos y etc.
    //Entonces debe ser algo heredable, ya que uno no hace con 45 años.
    //Entonces tenemos que plantearnos que queremos heredar.

    //Paso 2: Acción.

    // Para poder continuar debemos de crear nuesta clase nueva.
    //Esta clase puede ser cualquiera aunque depende de que estes haciendo.
    //En este caso creamos una nueva clase llamada 'Perro'.
    //Esta va a heredar de animal.

    //Con esto dicho empecemos a replicar los anteriores pasos.

    //Encapsulamiento abstracción.

    //Abstracción y encapsulamiento.
    //Adémas algo importante.
    //Debemos de crear lo siguiente.

    public Animal(String nombre, int edad){
        this.Nombre = nombre;
        this.Edad = edad;
        //Esto nos ayudara a que nuestra clase perro herede, tanto el nombre como la edad.
    }
    private String Nombre;
    private int Edad;  

    //Gettter Nombre
    public String getNombre(){
        return Nombre;
    }

    //Setter
    public void setNombre(String nombre){
        if(nombre == null || nombre.isEmpty()){
            System.err.println("El nombre no puede estar vacío.");
        }else{
            this.Nombre = nombre;
        }
    }

    //Getter Edad
    public int getEdad(){
        return Edad;
    }

    //Setter Edad
    public void setEdad(int edad){
        if(edad < 0){
            System.err.println("La edad no puede ser negativa"); 
        }else{
            this.Edad = edad;
        }
    }

    //Una vez tengamos todo en su respectivo encapsulamiento
    //Debemos de crear un metodo que debe de heredar.

    //Paso 3: Herencía
    //Esto es una ejemplo básico para poder entender la herencia.
    //Aquí creamos un comportamiento que nuestra clase 'Animal'.
    //Y aunque no lo creas esto es heredable
    public void comer(){
        System.out.println("El animla esta comiendo");
    }

    //Así que creamos otra más
    public void dormir(){
        System.out.println("El animal está duerme.");
    }
    
    //Con esto hecho dirígamosnos a nuestra clase perro.
    //Aquí ya hemos terminado.
    
}
