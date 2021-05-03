package clasePractica4;

public class Animal {
    String nombre;
    String raza;
    int edad;
    
    public Animal(){
    	
    }
    
    public Animal(String nombre){
        this.nombre = nombre;
    }
    
    public Animal(String nombre, String raza){
        this.nombre = nombre;
        this.raza = raza;
    }
  
    public Animal(String nombre, String raza, int edad){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }
    
    
    public static void main(String[] args) {
        Animal animal1;
        Animal animal2;
        animal1 = new Animal("Tomas", "poodle",9);//estan creando el objeto
        animal2 = new Animal("Kena", "labradora");
        
        
        System.out.println(animal1.nombre);
        System.out.println(animal2.raza);
    }
}
