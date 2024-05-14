/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.FrmCalculadora;
import Modelo.ModeloCalculadora;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

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
            resultado = _model.suma(Integer.parseInt(_view.campo_num1.getText()), Integer.parseInt(_view.campo_num2.getText()));
            leyenda = String.valueOf(resultado);
            _view.campo_resultado.setText(leyenda);
            System.out.println(_view.campo_num1.getText() + " " + _view.campo_num2.getText());
            System.out.println(resultado);
            JOptionPane.showMessageDialog(null, leyenda);
            limpiar();
        }

        if (e.getSource() == _view.btn_resta) {
            resultado = _model.resta(Integer.parseInt(_view.campo_num1.getText()), Integer.parseInt(_view.campo_num2.getText()));
            leyenda = String.valueOf(resultado);
            _view.campo_resultado.setText(leyenda);
            JOptionPane.showMessageDialog(null, leyenda);
            limpiar();
        }

        if (e.getSource() == _view.btn_mult) {
            resultado = _model.multiplicacion(Integer.parseInt(_view.campo_num1.getText()), Integer.parseInt(_view.campo_num2.getText()));
            leyenda = String.valueOf(resultado);
            _view.campo_resultado.setText(leyenda);
            JOptionPane.showMessageDialog(null, leyenda);
            limpiar();
        }

        if (e.getSource() == _view.btn_div) {
            resultado = _model.division(Integer.parseInt(_view.campo_num1.getText()), Integer.parseInt(_view.campo_num2.getText()));
            leyenda = String.valueOf(resultado);
            _view.campo_resultado.setText(leyenda);
            JOptionPane.showMessageDialog(null, leyenda);
            limpiar();
        }
    }
    
    public ControladorCalculadora(FrmCalculadora view, ModeloCalculadora model){
        this._model = model;
        this._view = view;
        this._view.btn_suma.addActionListener(this);
        this._view.btn_resta.addActionListener(this);
        this._view.btn_mult.addActionListener(this);
        this._view.btn_div.addActionListener(this);
    }
    
    public void limpiar(){
        _view.campo_num1.setText(null);
        _view.campo_num2.setText(null);
        _view.campo_resultado.setText(null);
    }
}
