public class Hogar {
    //Esta es nuestra clase hogar(Main).
    //Qué quiere decir Main?
    //Main hace referencia del ingles, principal.
    //En este caso es donde sucedera todo y se ejecutara todo.

    //Dicho esto.

    //Paso 5: Aprendiendo Herencía.

    //Antes de empezar debemos de crear lo siguiente.
    //Para esto solo escriban main y se autocompletara.
    //¿Qué es esto?
    //Esto es el ejecutador, o mejor dicho, el que va a hacer que nuestro programa corra. 
    //Dentro de ella podemos hacer de todo, crear situaciones, crear nuevas instancias y muchas cosas.
    //Pero en este caso crearemos una situación.
    //Así que empecemos.


    public static void main(String[] args) {
        System.out.println("--- Hogar de perritos.");
        //Aquí debemos de instanciar una clase nueva de Perro.
        //¿Comó se hace eso?
        //Pues es sencillo.
        //Solo debemos de hacer lo siguiente.
        Animal perro = new Perro("Firualis", 5);
        //¿Comó funciona?
        //Funciona de la siguiente manera, es básicamente lo siguiente:
        //1. De nuestra clase principal creamos una variable, en este caso perro.
        //2. La variable puede tener cualquier nombre.
        //3. La palabra 'new' hace referencia del ingles, nuevo o nueva.
        //4. Al escribir 'new' y luego agregar la clase 'Perro'.
        //5. Hacemos saber al programa que queremos una nueva clase, que obtenga el nombre de 'perro' en minuscula.

        //Dicho esto, ahora debemos de crear lo siguiente.
        System.out.println(perro.getNombre());
        System.out.println(perro.getEdad());

        //En este caso 'perro.comer' es la clase Animal.
        //Y la clase 'perro.dormir' es la clase Perro.
        perro.comer();
        perro.dormir();

        //Y listo.
        //La herencía completada.
        //GG EZ.
    }
}
