/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planillaequipo;

/**
 *
 * @author Estuardo
 */
public class PlanillaEquipo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pila pila = new Pila();
        Cola cola = new Cola();
        
        System.out.println("********** PILA **********\n");
        pila.Apilar();
        pila.Desapilar();
        
        System.out.println("\n\n********** COLA **********\n");
        cola.Encolar();
        cola.Desencolar();
    }
    
}
