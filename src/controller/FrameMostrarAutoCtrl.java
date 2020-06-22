package controller;

import model.Autos;
import model.DAO.AutosDAO;
import view.FrameAgregarAuto;
import view.FrameMostrarAuto;

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

            AutosControlador.mostrarAuto(vistaFV, patente);
           /* int propId;
            try {
                propId = Integer.parseInt(strId);

                Propiedad propiedad = PropiedadTXT.leer(propId);
                if (propiedad == null) {
                    // No se encontró una propiedad con el id indicado
                    JOptionPane.showMessageDialog(null, "ERROR: No existe propiedad con el id indicado");

                } else {
                    IngresoOEdicionCtrl ingresoOEdicionCtrl = new IngresoOEdicionCtrl();
                    IngresoOEdicionDialog dialog = new IngresoOEdicionDialog(ingresoOEdicionCtrl, false);
                    dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                    ingresoOEdicionCtrl.mostrarPropiedad(propiedad);
                    dialog.setEditable(false);
                    dialog.setVisible(true);
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "ERROR: Debe ingresar un id válido");
            }*/

        } else if (e.getSource() == vistaFV.getButtonSalir()) {
            vistaFV.dispose();
        }

    }

    public void setVista(FrameMostrarAuto vistaFV) {
        this.vistaFV = vistaFV;
    }
}
