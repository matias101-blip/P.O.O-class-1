/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.menu;
import javax.swing.*;




public class Menu {
    
    public static void sumar(){
        int n1, n2, result;
        JOptionPane.showMessageDialog(null, "Ingrese los siguientes valores para sumar: ");
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 1"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 2"));
        result = n1 + n2;
        JOptionPane.showMessageDialog(null, "El resultado es: " + result);
    }
    
    
    
    
    
    public static void main(String[] args) {
        
    }
}