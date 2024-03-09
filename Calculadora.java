/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author lopez
 */
public class Calculadora {
    /**
     * Este método suma dos números enteros.
     * @param num1 El primer número a sumar.
     * @param num2 El segundo número a sumar.
     * devuelve la suma de los dos números.
     * @return el resultado de la suma de los dos números
     */
    public int sumar (int num1, int num2){
        int res;
        res = num1+num2;
        System.out.println("El resultado es: "+res);
        return res;
    }
    
    /**
     * Este método resta dos números enteros.
     * @param num1 El primer número a restar.
     * @param num2 El segundo número a restar.
     * @return devuelve la diferencia de los dos números.    */
    public int restar (int num1, int num2){
        int res;
        res = num1-num2;
        System.out.println("El resultado es: "+res);
        return res;
    }
    
    /**
     * Este método multiplica dos números enteros.
     * @param num1 El primer número a multiplicar.
     * @param num2 El segundo número a multiplicar.
     * @return devuelve la multiplicacion de los dos números.
     */
    public int multiplicar (int num1, int num2){
        int res;
        res = num1*num2;
        System.out.println("El resultado es: "+res);
        return res;
    }
    
    /**
     * Este método divide dos números enteros.
     * @param num1 El primer número a dividir.
     * @param num2 El segundo número a dividir.
     * @return devuelve la division de los dos números.
     */
        public int dividir (int num1, int num2){
        int res;
        res = num1/num2;
        System.out.println("El resultado es: "+res);
        return res;
    }
}
