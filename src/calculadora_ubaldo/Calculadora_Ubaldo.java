/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora_ubaldo;
import Modelo.ModeloCalculadora;
import Vista.FrmCalculadora;
import Controlador.ControladorCalculadora;

/**
 *
 * @author toor
 */
public class Calculadora_Ubaldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FrmCalculadora objVista = new FrmCalculadora();
        ModeloCalculadora objModelo = new ModeloCalculadora();
        objVista.setVisible(true);
        ControladorCalculadora objControlador = new ControladorCalculadora(objVista, objModelo);
    }
    
}
