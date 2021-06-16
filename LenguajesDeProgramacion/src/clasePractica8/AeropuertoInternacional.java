package clasePractica8;

/**
*
* @author JuanDMeGon
*/
public class AeropuertoInternacional extends Aeropuerto {
   
   public AeropuertoInternacional(Avion[] aviones){
       super(aviones);
   }
   
   public AeropuertoInternacional(Avion avion){
       super(avion);
   }
   
   public AeropuertoInternacional(Avion avion, int cantidad){
       super(avion, cantidad);
   }
   
   public AeropuertoInternacional(int cantidad){
       super(cantidad);
   }
}
