package controller;

import java.util.ArrayList;
import java.util.Iterator;

import model.Autos;
import model.Modelos;
import view.FramePrincipal;

public class AutosControlador {

	public static Autos buscarAuto(String patenteauto, ArrayList<Autos> autos) {

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
	
	public static void agregarAuto(FramePrincipal vistaFP) {
		
		Autos auxAutos = new Autos();
		
		auxAutos.setPatente(vistaFP.getTextPatente().getText());
		auxAutos.setAnioPatentamiento(Integer.parseInt(vistaFP.getTextAnioPatente().getText()));
		auxAutos
		//(String patente, int anioPatentamiento, double precioCompra, char tipoCombustible,
		//boolean equipoMultimedia, boolean aireAcondicionado, boolean gps, Modelos modelos)
		
	}
}
