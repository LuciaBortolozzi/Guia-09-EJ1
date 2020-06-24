package controller;

import java.util.ArrayList;
import java.util.Iterator;

import model.Autos;
import model.Modelos;
import model.DAO.AutosDAO;
import view.FrameAgregarAuto;

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

        Autos auto = new Autos();
        
        String error = "";
        String patente;
        int anioPatentamiento;
        double precioCompra;
        
        try {

            patente = vistaFP.getTextPatente().getText();

            if ( patente.length() == 7 && patente.matches("[A-Z]{2}\\d{3}[A-Z]{2}")){
        	    auto.setPatente(patente);
            } else {
                error = "Error al ingresar patente (el formato debe ser XX123XX) \n";
                throw new Exception();
            }

            anioPatentamiento = Integer.parseInt(vistaFP.getTextAnioPatente().getText());

            if (anioPatentamiento >= 2014 && anioPatentamiento <= 2020){
                auto.setAnioPatentamiento(anioPatentamiento);
            } else {
                error = "Error al ingresar anio de patentamiento (debe ser mayor a 2014) \n";
                throw new Exception();
            }

            precioCompra = Double.parseDouble(vistaFP.getTextPrecioAuto().getText());

            if (precioCompra > 0){
                auto.setPrecioCompra(precioCompra);
            } else {
                error = "Error al ingresar el precio de compra (debe ser mayor a 0) \n";
                throw new Exception();
            }

            if (vistaFP.getRadioButtonNafta().isSelected()) {

                auto.setTipoCombustible('N');

            } else if (vistaFP.getRadioButtonDiesel().isSelected()) {

                auto.setTipoCombustible('D');

            } else {
                error = "No selecciono un tipo de combustible \n";
                throw new Exception();
            }

            auto.setEquipoMultimedia(vistaFP.getBoxMultimedia().isSelected());

            auto.setAireAcondicionado(vistaFP.getBoxAire().isSelected());

            auto.setGps(vistaFP.getBoxGps().isSelected());

            String modeloAuto = vistaFP.getComboModelo().getSelectedItem().toString();

            Modelos model = Controlador.buscarModelo(modeloAuto);

            auto.setModelos(model);

            AutosDAO.grabarAutosTXT(auto);
        	
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error en los datos ingresados\n" + error);
        }
    }
}
