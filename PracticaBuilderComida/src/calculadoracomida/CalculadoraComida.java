/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoracomida;



import calculadoracomida.InformacionComida.ComidaBuilder;

/**
 *
 * @author maguero Refactor:egonzalezp
 */
public class CalculadoraComida {


    public static void main(String[] args) {
    	
    	
    	
        InformacionComida porcionOllaDeCarne;
        ComidaBuilder builder = new InformacionComida.ComidaBuilder("Olla De Carne", Medida.ML);
        
        builder = builder.porciones(2).calorias(3).grasa(200).sodio(20).carbohidratos(23);
        
        porcionOllaDeCarne = builder.createComida();
		System.out.println(porcionOllaDeCarne.toString());
        
       
    }
    
}



