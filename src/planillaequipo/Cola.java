/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planillaequipo;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Estuardo
 */
public class Cola{
    
    LinkedList<Jugador> cola = new LinkedList<Jugador>();
    
    Jugador j1 = new Jugador("Carlo Pinsoglio", 5200);
    Jugador j2 = new Jugador("Jose Slobotzky", 4800);
    Jugador j3 = new Jugador("Carlos Ruiz", 6500);
    Jugador j4 = new Jugador("Wojciech Szczęsny", 8300);
    Jugador j5 = new Jugador("Alex Sandro", 5000);
    Jugador j6 = new Jugador("Leonardo Bonucci", 7200);
    Jugador j7 = new Jugador("Martín Cáceres", 5600);
    Jugador j8 = new Jugador("Mattia De Sciglio", 5100);
    Jugador j9 = new Jugador("João Cancelo", 6800);
    Jugador j10 = new Jugador("Daniele Rugani", 5850);
    Jugador j11 = new Jugador("Rodrigo Bentancur", 7150);
    Jugador j12 = new Jugador("Emre Can", 6500);
    Jugador j13 = new Jugador("Paulo Dybala", 8400);
    Jugador j14 = new Jugador("Sami Khedira", 6900);
    Jugador j15 = new Jugador("Blaise Matuidi", 7780);
    Jugador j16 = new Jugador("Miralem Pjanić", 8800);
    Jugador j17 = new Jugador("Simone Muratore", 6100);
    Jugador j18 = new Jugador("Leonardo Spinazzola", 6500);
    Jugador j19 = new Jugador("Federico Bernardeschi", 8450);
    Jugador j20 = new Jugador("Cristiano Ronaldo", 9800);
    Jugador j21 = new Jugador("Juan Cuadrado", 8900);
    Jugador j22 = new Jugador("Douglas Costa", 7300);
    Jugador j23 = new Jugador("Moise Kean", 8000);
    Jugador j24 = new Jugador("Mario Mandžukić", 8400);
    Jugador j25 = new Jugador("Pablo Moreno", 6200);
    
    
    
    
    
    public void Encolar(){
        
        cola.addFirst(j1);
        cola.addFirst(j2);
        cola.addFirst(j3);
        cola.addFirst(j4);
        cola.addFirst(j5);
        cola.addFirst(j6);
        cola.addFirst(j7);
        cola.addFirst(j8);
        cola.addFirst(j9);
        cola.addFirst(j10);
        cola.addFirst(j11);
        cola.addFirst(j12);
        cola.addFirst(j13);
        cola.addFirst(j14);
        cola.addFirst(j15);
        cola.addFirst(j16);
        cola.addFirst(j17);
        cola.addFirst(j18);
        cola.addFirst(j19);
        cola.addFirst(j20);
        cola.addFirst(j21);
        cola.addFirst(j22);
        cola.addFirst(j23);
        cola.addFirst(j24);
        cola.addFirst(j25);
        
    }
     
    //eliminar dato de la cola
    public void Desencolar(){
        
        while(cola.size() > 0){
            System.out.println("Jugador: "+cola.getLast().getNombre());
            System.out.println("Salario: Q"+cola.getLast().getSalario()+"\n");
            cola.removeLast();
        }
    }
}
