/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoracomida;



/**
 *
 * @author maguero  refactor: egonzalezp
 */
public class InformacionComida {
    private String nombre; 
    private int cantidadPorcion;
    private Medida unidadDeMedida;
    private int porciones;
    private int calorias;
    private int grasa;
    private int sodio;
    private int carbohidratos;

    public InformacionComida(String pNombre, int pCantidadPorcion, Medida pMedida, 
                              int pPorciones, int pCalorias, int pGrasa, int pSodio, int pCarbohidratos){
        this.nombre = pNombre;
        this.cantidadPorcion = pCantidadPorcion;
        this.unidadDeMedida = pMedida;
        this.porciones = pPorciones;
        this.calorias = pCalorias;
        this.grasa = pGrasa;
        this.sodio = pSodio;
        this.carbohidratos = pCarbohidratos;
    }
    
    
   

	@Override
	public String toString() {
		return "InformacionComida [nombre=" + nombre + ", cantidadPorcion=" + cantidadPorcion + ", unidadDeMedida="
				+ unidadDeMedida + ", porciones=" + porciones + ", calorias=" + calorias + ", grasa=" + grasa
				+ ", sodio=" + sodio + ", carbohidratos=" + carbohidratos + "]";
	}
 public static class ComidaBuilder{
	 	
	 	private String nestedNombre; 
	    private int nestedCantidadPorcion;
	    private Medida nestedUnidadDeMedida;
	    private int nestedPorciones;
	    private int nestedCalorias;
	    private int nestedGrasa;
	    private int nestedSodio;
	    private int nestedCarbohidratos;
	    
	    
	    
		public ComidaBuilder(final String newNombre, final Medida newUnidadMedida) {
			this.nestedNombre = newNombre;
			this.nestedUnidadDeMedida = newUnidadMedida;
	 
		}
		
		public ComidaBuilder cantidadPorcion(int newCantidadPorcion) {
			this.nestedCantidadPorcion = newCantidadPorcion;
			return this;
		}
		
		public ComidaBuilder porciones(int newPorciones) {
			this.nestedPorciones = newPorciones;
			return this;
		}
		
		public ComidaBuilder calorias(int newCalorias) {
			this.nestedCalorias = newCalorias;
			return this;
		}
		
		public ComidaBuilder grasa(int newGrasa) {
			this.nestedGrasa = newGrasa;
			return this;
		}
		
		public ComidaBuilder sodio(int newSodio) {
			this.nestedSodio = newSodio;
			return this;
		}
		
		public ComidaBuilder carbohidratos(int newCarbohidratos) {
			this.nestedCarbohidratos = newCarbohidratos;
			return this;
		}
		

		
		public InformacionComida createComida() {
			return new InformacionComida(nestedNombre, nestedCantidadPorcion, nestedUnidadDeMedida, nestedPorciones, nestedCalorias,
					nestedGrasa, nestedSodio, nestedCarbohidratos);
		}
    
    
}
 
}
