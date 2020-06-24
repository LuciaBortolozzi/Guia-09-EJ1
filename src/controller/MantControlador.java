package controller;

import java.util.Calendar;

import model.Autos;
import model.DAO.MantenimientosDAO;
import view.FrameAgregarMantenimiento;

import javax.swing.*;

public class MantControlador {

    public static void agregarMantenimiento(FrameAgregarMantenimiento vistaFM) {

        String error = "";
        double costoMantenimiento;
        String partes;

        try {
            String patente = vistaFM.getTextPatente().getText();

            if (patente.length() == 7 && patente.matches("[A-Z]{2}\\d{3}[A-Z]{2}")) {

                Autos autoEncontrado = AutosControlador.buscarAuto(patente);

                if (autoEncontrado != null) {
                    Calendar fechaActual = Calendar.getInstance();

                    costoMantenimiento = Double.parseDouble(vistaFM.getTextCosto().getText());

                    if (costoMantenimiento > 0){
                        if (vistaFM.getRadioButtonReparacion().isSelected()) {

                            partes = vistaFM.getTextComentario().getText();
                            autoEncontrado.setMantenimientos(fechaActual, costoMantenimiento, partes);
                            MantenimientosDAO.grabarReparacionesTXT(autoEncontrado);

                        } else {
                            autoEncontrado.setMantenimientos(fechaActual, costoMantenimiento);
                            MantenimientosDAO.grabarMantenimientoTXT(autoEncontrado);
                        }
                    } else {
                        error = "El costo de mantenimiento debe ser mayor a 0 \n";
                        throw new Exception();
                    }

                } else {
                    error = "No existe el auto \n";
                    throw new Exception();
                }

            } else {
                error = "Error al ingresar patente (el formato debe ser XX123XX) \n";
                throw new Exception();
            }

        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error en los datos ingresados\n" + error);
        }
    }
}
