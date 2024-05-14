/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import calculadora_ubaldo.Calculadora;
import calculadora_ubaldo.Division;
import calculadora_ubaldo.Multiplicacion;
import calculadora_ubaldo.Resta;
import calculadora_ubaldo.Suma;

/**
 *
 * @author toor
 */
public class ModeloCalculadora {

    public double suma(int num1, int num2) {
        Calculadora objCalculadora = new Suma(num1, num2);
        return (objCalculadora.calcular());
    }

    public double resta(int num1, int num2) {
        Calculadora objCalculadora = new Resta(num1, num2);
        return (objCalculadora.calcular());
    }

    public double multiplicacion(int num1, int num2) {
        Calculadora objCalculadora = new Multiplicacion(num1, num2);
        return (objCalculadora.calcular());
    }

    public double division(int num1, int num2) {
        Calculadora objCalculadora = new Division(num1, num2);
        return (objCalculadora.calcular());
    }
}
