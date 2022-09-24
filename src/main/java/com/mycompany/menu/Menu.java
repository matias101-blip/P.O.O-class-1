/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.menu;
import javax.swing.*;
import java.lang.Math;
import java.io.*;




public class Menu {
    
    public static void sumar(){
        int n1, n2, result;
        JOptionPane.showMessageDialog(null, "Ingrese los siguientes valores para sumar: ");
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 1"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero 2"));
        result = n1 + n2;
        JOptionPane.showMessageDialog(null, "El resultado es: " + result);
    }

    public static void restar(){
	    int n1, n2, result;
	    JOptionPane.showMessageDialog(null, "Ingrese los valores para realizar la restar: ");
	    n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 1: "));
	    n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 2: "));
	    result = n1 - n2;
	    JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + result);
    }

    public static void multiplicar(){
	    int n1, n2, result;
	    JOptionPane.showMessageDialog(null, "Ingrese los valores para realizar la restar: ");
	    n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 1: "));
	    n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 2: "));
	    result = n1 * n2;
	    JOptionPane.showMessageDialog(null, "El resultado de la Multiplicacion es: " + result);
    }
 
   
    public static void dividir(){
	    double n1, n2, result;
	    JOptionPane.showMessageDialog(null, "Ingrese los valores para realizar la restar: ");
	    n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero 1: "));
	    n2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero 2: "));
	    result = n1 / n2;
	    JOptionPane.showMessageDialog(null, "El resultado de la Division es: " + result);
    }


    public static void modulo(){
	    int n1, n2, mod;
	    JOptionPane.showMessageDialog(null, "Ingrese los valores para realizar la restar: ");
	    n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 1: "));
	    n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 2: "));
	    mod = Math.floorMod(n1 ,n2);
	    JOptionPane.showMessageDialog(null, "El resultado de la Division es: " + mod);
    }






    public static void main(String[] args) {
        int opcion;
        
        try{
            opcion=Integer.parseInt(JOptionPane.showInputDialog("1.Sumar" +
                    "\n2.restar" +
                    "\n3.Multiplicar" +
                    "\n4.Dividir"+
		    "\n5.Modulo"+
                    "\n12.Salir"+
                    "\n\nElija la opcion"));
            switch(opcion){
                case 1:
                    JOptionPane.showMessageDialog(null, "Ingreso a la opcion suma: ");
                    sumar();
                    break;
		case 2:
		    JOptionPane.showMessageDialog(null, "Ingreso la opcion de restar");
		    restar();
		    break;
		case 3:
		    JOptionPane.showMessageDialog(null, "Ingreso a la opcion Multiplicar");
		    multiplicar();
		    break;
		case 4:
		    JOptionPane.showMessageDialog(null, "Ingreso la opcion de dividir");
		    dividir();
		    break;
		case 5:
		    JOptionPane.showMessageDialog(null, "Ingreso la opcion de modulo");
		    modulo();
		    break;
                    case 12:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion no valida");
                        
                        
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error");
        }
        System.exit(0);
    }
}
