
package Main;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        Animal perro = new Perro("Nasus","Carne",8,"Boxer");
        Animal perro2 = new Perro("Draven","Lechuga",7,"Labrador");
        Animal gato = new Gato("Yuumi","Atún",5,"Siames");
        Animal caballo = new Caballo("Rell","Pasto",3,"Purasangre");
        
        perro.seAlimenteDe();
        perro2.seAlimenteDe();
        gato.seAlimenteDe();
        caballo.seAlimenteDe();
        
    }
}
