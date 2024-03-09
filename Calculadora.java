/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_calculadora;

/**
 *
 * @author lopez
 */
public class Calculadora {
    //atributo
    private static int Resultado;
    
    public static void Sumar(int Cantidad1, int Cantidad2){
        Resultado = Cantidad1+Cantidad2;
        System.out.println(Resultado);
    }
    
    public static void Restar(int Cantidad1, int Cantidad2){
        Resultado = Cantidad1-Cantidad2;
        System.out.println(Resultado);
    }
    
    public static void Multiplicar(int Cantidad1, int Cantidad2){
        Resultado = Cantidad1*Cantidad2;
        System.out.println(Resultado);
    }
    
    @Override
    public String toString(){
        return "El resultado es: "+Resultado;
    }
}

