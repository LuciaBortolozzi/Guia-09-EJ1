package controller;

import java.util.ArrayList;
import java.util.Calendar;

import model.Autos;
import model.Mantenimientos;
import model.Modelos;
import model.DAO.AutosDAO;
import model.DAO.MantenimientosDAO;
import view.FrameAgregarMantenimiento;

public class MantControlador {

    static ArrayList<Autos> autos = AutosDAO.bajarAutosTXT(Controlador.devolverModelos());

    public static void agregarMantenimiento(FrameAgregarMantenimiento vistaFM) {

        String patente = vistaFM.getTextPatente().getText();
        Autos autoEncontrado = AutosControlador.buscarAuto(patente, autos);

        if (autoEncontrado != null) {
            Calendar fechaActual = Calendar.getInstance();


            if (vistaFM.getRadioButtonReparacion().isSelected()) {

                autoEncontrado.setMantenimientos(fechaActual, Double.parseDouble(vistaFM.getTextCosto().getText()), vistaFM.getTextComentario().getText());
                MantenimientosDAO.grabarReparacionesTXT(autoEncontrado);

            } else {
                autoEncontrado.setMantenimientos(fechaActual, Double.parseDouble(vistaFM.getTextCosto().getText()));
                MantenimientosDAO.grabarMantenimientoTXT(autoEncontrado);
            }
        }
    }
}
