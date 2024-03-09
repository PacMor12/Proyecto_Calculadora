/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author lopez
 */
public class Calculadora {
    //Metodo para sumar dos enteros
    public void sumar (int num1, int num2){
        int res;
        res = num1+num2;
        System.out.println("El resultado es: "+res);
    }
    public void restar (int num1, int num2){
        int res;
        res = num1-num2;
        System.out.println("El resultado es: "+res);
    }
    
    public void multiplicar (int num1, int num2){
        int res;
        res = num1*num2;
        System.out.println("El resultado es: "+res);
    }
    
    public void dividir (int num1, int num2){
        int res;
        res = num1/num2;
        System.out.println("El resultado es: "+res);
    }
}
