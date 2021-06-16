package clasePractica8;

/**
*
* @author JuanDMeGon
*/
public class Piloto {
	
   private String nombre;
   private int edad;
   private String identificacion;
   
   public final String comunicarse(String mensaje){
       System.out.println(mensaje);
       
       return mensaje;
   }
   
   public void setNombre(String nombre){
       this.nombre = nombre;
   }
   
   public String getNombre(){
       return this.nombre;
   }
   
   public int getEdad(){
       return this.edad;
   }
}
