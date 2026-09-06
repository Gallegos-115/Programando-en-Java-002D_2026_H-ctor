public class Perro extends Animal{
    //Una vez creamos nuestra clase debemos de continuar avanzando en nuestra clase principal.  

    //Una ves que estemos aquí debemos de tomar encuenta la siguiente palabra y es la que nos permite heredar.
    //Esa palabra es 'Extends'.
    //Esta nos habre paso a traves de nuestra clase principal.
    //Para poder extraer o dicho de la manera tecnica, heredar atributos o comportamientos de nuestra clase principal.

    //Aquí si queremos podemos saltarnos la idea de encapsulamiento y abstracción.
    //Pero no es recomendable, ya que en ninguna parte se hace así.
    //Pero como esto es una ejemplo.
    //De igual forma debemos de tomar encuenta que las clases 'Hijas (clases que hereden de la clase principal)'.
    //Deben de tener sus correspondientes atributos, tanto como unicos como los que puedan llegar a heredar.
    //Así que cuidado y ojo con todo esto.

    //Ahora deberemos de crear lo siguiente
    //Esto nos ayudara a enteder la herenica.
    public Perro(String nombre, int edad){
        super(nombre, edad);    
    //Una vez creamos la clase perro, debemos de escribir lo siguiente'super'
    //Esto es un metodo constructor y es la clave que nos permite heredar directamente de la clase 'Animal'
    //En este caso como solo pusimos nombre y edad en la clase void de 'Animal'.
    //Solo se el otorgo nombre y edad a 'super'.
    }    
    //Bien, una vez dicho esto, debemos de crear un comportamiento propio de nuesta clase 'Hija'.

    //En este caso usaremos esto.
    public void ladrar(){
        System.out.println("Gua Gua.");
    }

    //Una vez creamos nuestro comportamiento, pasamos al cuarto paso.
    //Que es crear una clase principal, donde ocurra todo básicamente.
    //Crearemos la clase hogar(Main).
}
