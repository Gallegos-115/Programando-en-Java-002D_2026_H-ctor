public class Padre {
    //Encapsular se refire a la manera en la cual una clase puede conservar sus datos y que ninguna otra clase.
    //La pueda modificar, esto quiere decir que, la unica capaz de modifar algo es la misma clase.
    //Para poder implementar esto se debe de usar la palabra 'Private' al inicio de cada atributo que desees a tu clase.
    //Ejemplo: Private String nombre;
    
    private String Nombre;
    private int Edad;

    //Una ves tenemos nuestros atributos personalizados y privatizados (Esto depende de cuantos de cuantos atributos desees poner)
    //Ya que tenemos estos dos atributos debes de continuar por asignarles sus getters y setters.
    //¿Qué son los Getters y Setter?
    //Son básicamente para validar como para retornar parametros.
    //En esto caso, al tener nuestros atributos privatizados a la hora de crear un main y llamarlos no apareceran.
    //Esto a causa de que estan privados.
    //Para solucionar esto debemos de usar los getters y setters.
    //Ejemplo Getter: Un getter es el unico que recibe información y la retorna.
    //Esto en codigo es algo asi:

    public String getNombre(){
        return this.Nombre;
    }

    //Y el setter es que asigna y verifica la información que recibe nuestro programa.
    //Ejemplo de setter: El setter verfica tu información y no retorna.
    //Esto en codigo es algo asi:

    public void setValidarnombre(String nombre){
        if(nombre == null){
            System.err.println("Lo sentimos pero el nombre de padre no puede estar vacío");
        }else{
           this.Nombre = nombre;
        }
    }

    //Ahora es lo mismo para los demas atributos :3

    //Nuestro getter
    public int getEdad(){
        return this.Edad;
    }

    //Nuestro setter
    public void validarEdad(int edad){
        if(edad < 0){
            System.err.println("Lo sentimos pero la edad no puede ser menor a 0");
        }else{
            this.Edad = edad;
        }
    }

    //Con esto cumplimos lo basico del encapsulamiento.
    //Notas: Los getter y setters no siempre es necesarios que sean get o set al inico, pueden tener todo tipos de nombres.
    //Pero lo recomendable es que usen get y set para tomar en cuenta que estan haciendo, y si no prefieren ese metodo.
    //Tomen encuenta que desean hacer, si desean devolver un dato(getter) o solo guardarlo, validarlo o transformarlo(setter).
}
