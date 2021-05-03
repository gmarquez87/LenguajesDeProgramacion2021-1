package clasePractica4.hogar;

import java.util.ArrayList;

/**
 *
 * @author kiriost
 */
public class Familia {
    private ArrayList<Persona> personas;

    public Familia() {
        personas = new ArrayList();
        personas.add( new Persona("Casado") );
    }
    
    public Familia(Persona p) {
        personas = new ArrayList();
        personas.add(p);
    }   

    public void agregarMiembro(Persona p) {
        personas.add(p);
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }
}
