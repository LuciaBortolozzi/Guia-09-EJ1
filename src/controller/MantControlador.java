package controller;

import java.util.ArrayList;
import java.util.Calendar;

import model.Autos;
import model.Modelos;
import model.DAO.AutosDAO;
import model.DAO.MantenimientosDAO;
import view.FrameAgregarMantenimiento;

public class MantControlador {
	
		static ArrayList<Autos> autos = AutosDAO.bajarAutosTXT(Controlador.devolverModelos());
	
	  public static void agregarMantenimiento(FrameAgregarMantenimiento vistaFM) {

		  	Autos autoEncontrado = AutosControlador.buscarAuto(vistaFM.getTextPatente().toString() , autos);
		  	Calendar fechaActual = Calendar.getInstance();
		  	
		  	
		  	if(vistaFM.getRadioButtonReparacion().isSelected()) {
		  		
		  		autoEncontrado.setMantenimientos(autoEncontrado.getMantenimientos().size()-1 ,fechaActual, Double.parseDouble(vistaFM.getTextCosto().toString()), vistaFM.getTextComentario().toString());
		  		MantenimientosDAO.grabarReparacionesTXT(autoEncontrado);
		  	}else {
		  		
		  		autoEncontrado.setMantenimientos(autoEncontrado.getMantenimientos().size()-1, fechaActual, Double.parseDouble(vistaFM.getTextCosto().toString()));
		  		MantenimientosDAO.grabarMantenimientoTXT(autoEncontrado);
		  	}
		  	
		  	
		  	
	        

	    }

}
