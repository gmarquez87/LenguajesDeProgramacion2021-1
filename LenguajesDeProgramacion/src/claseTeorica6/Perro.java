package claseTeorica6;

/*Fuente: https://github.com/Gamis214/Herencia-Java*/

public class Perro extends Animal {

    private String raza;

    public Perro(String nombre, String tipo_alimentacion, String raza){
        super(nombre,tipo_alimentacion);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void mostrar(){
        System.out.println(getNombre() + "-"+getTipo_alimentacion()+"-"+getEdad()+"-"+getRaza());
    }
}
