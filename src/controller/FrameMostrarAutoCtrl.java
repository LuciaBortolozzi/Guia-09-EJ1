package controller;

import model.Autos;
import model.DAO.AutosDAO;
import view.FrameAgregarAuto;
import view.FrameMostrarAuto;
import view.FrameMostrarDataAuto;

import javax.swing.*;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FrameMostrarAutoCtrl implements ActionListener {


    private FrameMostrarAuto vistaFV;

    public FrameMostrarAutoCtrl() {
        vistaFV = new FrameMostrarAuto(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vistaFV.getButtonConsultar()) {
            String patente = vistaFV.getTextPatente().getText();
        
            try {
                Autos auto = AutosControlador.buscarAuto(patente);
              
                if (auto == null) {
                    
                    JOptionPane.showMessageDialog(null, "ERROR: No existe el auto");

                } else {
                	FrameMostrarDataAutoCtrl FrameMostrarDataAutoCtrl = new FrameMostrarDataAutoCtrl();
                	FrameMostrarDataAuto dialog = new FrameMostrarDataAuto(FrameMostrarDataAutoCtrl);
      
            
                    dialog.getTextPatente().setText(auto.getPatente());
                    String anio = String.valueOf(auto.getAnioPatentamiento());
                    dialog.getTextAnioPatente().setText(anio);
                    String precio = String.valueOf(auto.getPrecioCompra());
                    dialog.getTextPrecioAuto().setText(precio);
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "ERROR: Debe ingresar un id valido");
            }

        } else if (e.getSource() == vistaFV.getButtonSalir()) {
            vistaFV.dispose();
        }

    }

    public void setVista(FrameMostrarAuto vistaFV) {
        this.vistaFV = vistaFV;
    }
}
