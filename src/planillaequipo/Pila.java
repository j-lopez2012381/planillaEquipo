/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planillaequipo;

import java.util.Stack;

/**
 *
 * @author Estuardo
 */
public class Pila {
    
    Stack<Jugador> pila = new Stack<Jugador>();
    
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
    
    public void Apilar(){
    
    pila.push(j1);
    pila.push(j2);
    pila.push(j3);
    pila.push(j4);
    pila.push(j5);
    pila.push(j6);
    pila.push(j7);
    pila.push(j8);
    pila.push(j9);
    pila.push(j10);
    pila.push(j11);
    pila.push(j12);
    pila.push(j13);
    pila.push(j14);
    pila.push(j15);
    pila.push(j16);
    pila.push(j17);
    pila.push(j18);
    pila.push(j19);
    pila.push(j20);
    pila.push(j21);
    pila.push(j22);
    pila.push(j23);
    pila.push(j24);
    pila.push(j25);
    
    
    
    }
    
    public void Desapilar(){
        // MOSTRAR TODA LA PILA
        while (!pila.isEmpty()) { 
            System.out.println("Jugador: "+pila.peek().getNombre()); // extrae un elemento de la pila
            System.out.println("Salario: Q"+pila.pop().getSalario()+"\n");
        }
    }
    
}
