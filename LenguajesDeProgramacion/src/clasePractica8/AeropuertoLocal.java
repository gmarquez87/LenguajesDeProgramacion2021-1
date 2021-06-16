package clasePractica8;

/**
*
* @author JuanDMeGon
*/
public class AeropuertoLocal extends Aeropuerto {
   
   public AeropuertoLocal(Avion[] aviones){
       super(aviones);
   }
   
   public AeropuertoLocal(Avion avion){
       super(avion);
   }
   
   public AeropuertoLocal(Avion avion, int cantidad){
       super(avion, cantidad);
   }
   
   public AeropuertoLocal(int cantidad){
       super(cantidad);
   }
}