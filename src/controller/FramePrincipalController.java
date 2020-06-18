package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.FramePrincipal;

public class FramePrincipalController implements ActionListener{

	private FramePrincipal vistaFP;
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == vistaFP.getButtonAgregar()) {
			
			AutosControlador.agregarAuto(vistaFP);
			
			vistaFP.limpiar(false);
		}
		
	}

}