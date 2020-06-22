package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.FrameAgregarMantenimiento;

public class FrameAgregarMantCtrl implements ActionListener {
	
	private FrameAgregarMantenimiento vistaFM;

    public FrameAgregarMantCtrl() {
        vistaFM = new FrameAgregarMantenimiento(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vistaFM.getButtonAgregar()) {

        	MantControlador.agregarMantenimiento(vistaFM);

            vistaFM.limpiar(false);
        }

    }

    public void setVista(FrameAgregarMantenimiento vistaFM){this.vistaFM=vistaFM;}
	
}
