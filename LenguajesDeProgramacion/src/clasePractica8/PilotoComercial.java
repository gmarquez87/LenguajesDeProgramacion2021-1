package clasePractica8;

/**
*
* @author JuanDMeGon
*/
public class PilotoComercial extends Piloto {
   
   public String saludarPasajeros(){
       return super.comunicarse("Bienvenidos pasajeros");
   }
   
   public String despedirPasajeros(){
       return this.comunicarse("gracias por usar nuestra aerolínea");
   }
}
