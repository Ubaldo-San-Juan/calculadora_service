/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.FrmCalculadora;
import Modelo.ModeloCalculadora;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author toor
 */
public class ControladorCalculadora implements ActionListener {

    FrmCalculadora _view;
    ModeloCalculadora _model;
    String leyenda;
    double resultado;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == _view.btn_suma) {
            resultado = _model.suma(Integer.parseInt(_view.campo_num1.getText()), Integer.parseInt(_view.campo_resultado.getText()));
            leyenda = String.valueOf(resultado);
            _view.campo_resultado.setText(leyenda);
            System.out.println(resultado);
        }

        if (e.getSource() == _view.btn_resta) {

        }

        if (e.getSource() == _view.btn_mult) {

        }

        if (e.getSource() == _view.btn_div) {

        }
    }

}
