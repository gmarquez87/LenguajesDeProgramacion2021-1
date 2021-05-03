package clasePractica4.aeropuerto;

public class Avion {
	double peso;
    int cantCombustible;
    double alturaDeVuelo;
    String identificador;      

    public Avion(double peso, int cantCombustible, double alturaDeVuelo, String identificador) {
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
    
    public void setPeso(double peso){
        this.peso = peso;        
    }
    
    public void setIdentificador(String identificador){
        this.identificador = identificador;        
    }
    
    public boolean despegar(int costoCombustible, double alturaMinima){
        this.cantCombustible = this.cantCombustible - costoCombustible;
        this.alturaDeVuelo = this.alturaDeVuelo + alturaMinima;
        return this.cantCombustible > 0;
    }

}
