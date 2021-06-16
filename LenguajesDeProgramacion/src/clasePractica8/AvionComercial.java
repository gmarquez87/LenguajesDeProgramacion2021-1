package clasePractica8;

/**
*
* @author JuanDMeGon
*/
public class AvionComercial extends Avion {
   public AvionComercial(double peso, int cantCombustible, double alturaDeVuelo, String identificador){
       super(peso, cantCombustible, alturaDeVuelo, identificador);
       
       System.out.println("Creando...");        
   }
}
