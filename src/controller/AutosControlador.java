package controller;

import java.util.ArrayList;
import java.util.Iterator;

import model.Autos;
import model.Modelos;
import model.DAO.AutosDAO;
import view.FrameAgregarAuto;
import view.FrameMostrarAuto;

import javax.swing.*;

public class AutosControlador {

    static ArrayList<Autos> autos = AutosDAO.bajarAutosTXT(Controlador.devolverModelos());

    public static Autos buscarAuto(String patenteauto) {

        Autos auto;
        Iterator<Autos> iteratorAudiovisuales = autos.iterator();
        while (iteratorAudiovisuales.hasNext()) {
            auto = iteratorAudiovisuales.next();

            if (auto.getPatente().equals(patenteauto)) {
                return auto;
            }
        }
        return null;
    }

    public static void agregarAuto(FrameAgregarAuto vistaFP) {

        Autos auxAutos = new Autos();

        auxAutos.setPatente(vistaFP.getTextPatente().getText());
        auxAutos.setAnioPatentamiento(Integer.parseInt(vistaFP.getTextAnioPatente().getText()));
        auxAutos.setPrecioCompra(Double.parseDouble(vistaFP.getTextPrecioAuto().getText()));

        if (vistaFP.getRadioButtonNafta().isSelected()) {

            auxAutos.setTipoCombustible('N');

        } else if (vistaFP.getRadioButtonDiesel().isSelected()) {

            auxAutos.setTipoCombustible('D');
        }

        if (vistaFP.getBoxMultimedia().isSelected()) {

            auxAutos.setEquipoMultimedia(true);
        } else {

            auxAutos.setEquipoMultimedia(false);
        }

        if (vistaFP.getBoxAire().isSelected()) {

            auxAutos.setAireAcondicionado(true);
        } else {

            auxAutos.setAireAcondicionado(false);
        }

        if (vistaFP.getBoxGps().isSelected()) {

            auxAutos.setGps(true);
        } else {

            auxAutos.setGps(false);
        }

        String modeloAuto = vistaFP.getComboModelo().getSelectedItem().toString();

        Modelos model = Controlador.buscarModelo(modeloAuto);

        auxAutos.setModelos(model);

        AutosDAO.grabarAutosTXT(auxAutos);

    }
}
