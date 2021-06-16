package clasePractica8;

/**
*
* @author JuanDMeGon
*/
public class Avion {
	
   private double peso;
   private int cantCombustible;
   private double alturaDeVuelo;
   private final String identificador;   
   private Piloto piloto;

   public Avion(double peso, int cantCombustible, double alturaDeVuelo, String identificador){
       this.peso = peso;
       this.cantCombustible = cantCombustible;
       this.alturaDeVuelo = alturaDeVuelo;
       this.identificador = identificador;
   }
   
   public double getPeso(){
       return peso;
   }
   
   public String getIdentificador(){
       return identificador;
   }

   public int getCantCombustible(){
       return cantCombustible;
   }

   public double getAlturaDeVuelo(){
       return alturaDeVuelo;
   }
   
   public void setPeso(double peso){
       this.peso = peso;        
   }

   public void setCantCombustible(int cantCombustible){
       this.cantCombustible = cantCombustible;
   }

   public void setAlturaDeVuelo(double alturaDeVuelo){
       this.alturaDeVuelo = alturaDeVuelo;
   }
   
   public boolean despegar(int costoCombustible, double alturaMinima){
       this.cantCombustible = this.cantCombustible - costoCombustible;
       this.alturaDeVuelo = this.alturaDeVuelo + alturaMinima;
       
       return this.cantCombustible > 0;
   }
   
   public void aterrizar(double pesoABordo){
       this.alturaDeVuelo = 0;
       this.peso = this.peso - pesoABordo;        
   }
   
   public void aterrizar(double pesoEquipaje, double pesoPasajeros){
       this.alturaDeVuelo = 0;
       this.peso = this.peso - pesoEquipaje - pesoPasajeros; 
   }
   
}
