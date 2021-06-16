package clasePractica8;

/**
*
* @author JuanDMeGon
*/

public class Aeropuerto {
	
   private static Avion[] aviones;
   private static int cantAviones;
   
   public Aeropuerto(Avion[] aviones){
       this.aviones = aviones;
       cantAviones = aviones.length;
   }
   
   public Aeropuerto(Avion avion){
       this.aviones = new Avion[50];
       
       this.aviones[0] = avion;
       cantAviones = 1;
   }
   
   public Aeropuerto(Avion avion, int cantidad){
       this.aviones = new Avion[cantidad];
       
       this.aviones[0] = avion;
       cantAviones = 1;
   }
   
   public Aeropuerto(int cantidad){
       this.aviones = new Avion[cantidad];
       cantAviones = 0;
   }
   
   public Avion[] agregarAvion(Avion avion){
       aviones[cantAviones] = avion;
       cantAviones++;
       return aviones;
   }

}
