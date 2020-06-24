package controller;

import model.Autos;
import model.Mantenimientos;
import view.FrameMostrarAuto;
import view.FrameMostrarDataAuto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;


public class FrameMostrarAutoCtrl implements ActionListener {

    private FrameMostrarAuto vistaFV;

    public FrameMostrarAutoCtrl() {
        vistaFV = new FrameMostrarAuto(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        boolean errorIngreso = false;

        if (e.getSource() == vistaFV.getButtonConsultar()) {

            try {
                String patente = vistaFV.getTextPatente().getText();

                if (patente.length() == 7 && patente.matches("[A-Z]{2}\\d{3}[A-Z]{2}")) {

                    Autos autoEncontrado = AutosControlador.buscarAuto(patente);

                    if (autoEncontrado != null) {

                        FrameMostrarDataAutoCtrl FrameMostrarDataAutoCtrl = new FrameMostrarDataAutoCtrl();
                        FrameMostrarDataAuto dialog = new FrameMostrarDataAuto(FrameMostrarDataAutoCtrl);

                        dialog.getTextPatente().setText(autoEncontrado.getPatente());
                        String anio = String.valueOf(autoEncontrado.getAnioPatentamiento());
                        dialog.getTextAnioPatente().setText(anio);
                        String precio = String.valueOf(autoEncontrado.getPrecioCompra());
                        dialog.getTextPrecioAuto().setText(precio);

                        String total = String.valueOf(autoEncontrado.costoTotal());
                        dialog.getTextPrecioTotal().setText(total);
                        Mantenimientos mantenimientoMayorImporte = autoEncontrado.mayorImporte();
                        int indice = autoEncontrado.getMantenimientos().indexOf(mantenimientoMayorImporte);
                        String fecha = autoEncontrado.getMantenimientos().get(indice).getFechaMantenimiento().get(Calendar.DAY_OF_MONTH) + "/" +
                                (autoEncontrado.getMantenimientos().get(indice).getFechaMantenimiento().get(Calendar.MONTH) + 1) + "/" +
                                autoEncontrado.getMantenimientos().get(indice).getFechaMantenimiento().get(Calendar.YEAR);
                        dialog.getTextFechaDeMantenimiento().setText(fecha);
                        String costo = String.valueOf(autoEncontrado.getMantenimientos().get(indice).getCostoMantenimiento());
                        dialog.getTextCostoMantenimiento().setText(costo);

                    } else {
                        throw new Exception();
                    }

                } else {
                    errorIngreso = true;
                    throw new Exception();
                }

            } catch (Exception ex) {
                if (errorIngreso)
                    JOptionPane.showMessageDialog(null, "Error al ingresar patente (el formato debe ser XX123XX) \n");
                else
                    JOptionPane.showMessageDialog(null, "No existe el auto \n");
            }

        }
    }

    public void setVista(FrameMostrarAuto vistaFV) {
        this.vistaFV = vistaFV;
    }
}
