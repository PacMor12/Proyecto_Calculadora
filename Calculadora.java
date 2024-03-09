/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;
/**
 * Esta clase representa una calculadora simple que realiza operaciones básicas
 *
 * @author lopez
 */
public class Calculadora {
    /**
     * Este método suma dos números enteros.
     * @param num1 El primer número a sumar.
     * @param num2 El segundo número a sumar.
     * devuelve la suma de los dos números.
     */
    public static void sumar (int num1, int num2){
        int res;
        res = num1+num2;
        System.out.println("El resultado es: "+res);
    }
    
    /**
     * Este método resta dos números enteros.
     * @param num1 El primer número a restar.
     * @param num2 El segundo número a restar.
     * devuelve la diferencia de los dos números.
     */
    public void restar (int num1, int num2){
        int res;
        res = num1-num2;
        System.out.println("El resultado es: "+res);
    }
    
    /**
     * Este método multiplica dos números enteros.
     * @param num1 El primer número a multiplicar.
     * @param num2 El segundo número a multiplicar.
     * devuelve la multiplicacion de los dos números.
     */
    public void multiplicar (int num1, int num2){
        int res;
        res = num1*num2;
        System.out.println("El resultado es: "+res);
    }
    
    /**
     * Este método divide dos números enteros.
     * @param num1 El primer número a dividir.
     * @param num2 El segundo número a dividir.
     * devuelve la division de los dos números.
     */
        public void dividir (int num1, int num2){
        int res;
        res = num1/num2;
        System.out.println("El resultado es: "+res);
    }
}
