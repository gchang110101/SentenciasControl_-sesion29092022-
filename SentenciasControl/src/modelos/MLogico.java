/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author labc205
 */
public class MLogico {
    /**
     * verifica si dos numeros enteros son iguales
     * @param num1
     * @param num2
     * @return 
     */
    public boolean sonIguales(int num1, int num2) {
        return num1 == num2;
    }
    
    /**
     * verifica si dos numeros reales son iguales
     * @param num1
     * @param num2
     * @return 
     */
    public boolean sonIguales(double num1, double num2) {
        return num1 == num2;
    }
    
    public double numeroMayor (double num1, double num2) {
        if (num1 > num2) return num1;
        return num2;
    }
    
    public double numeroMenor (double num1, double num2) {
        if (num1 < num2) return num1;
        return num2;
    }
    
    public boolean esMayorIgual (double num1, double num2) {
        if (num1 >= num2) return true;
        return false;
    }
    
    public boolean esMenorIgual (double num1, double num2) {
        if (num1 <= num2) return true;
        return false;
    }
    
    public boolean caracteresIguales (String char1, String char2) {
        return char1.equals(char2);
    }
    
     public boolean caracteresDistintos (String char1, String char2) {
        return char1.equals(char2);
    }
}
