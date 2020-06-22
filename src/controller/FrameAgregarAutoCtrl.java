package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.FrameAgregarAuto;

public class FrameAgregarAutoCtrl implements ActionListener {

    private FrameAgregarAuto vistaFA;

    public FrameAgregarAutoCtrl() {
        vistaFA = new FrameAgregarAuto(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vistaFA.getButtonAgregar()) {

            AutosControlador.agregarAuto(vistaFA);

            vistaFA.limpiar(false);
        }

    }

    public void setVista(FrameAgregarAuto vistaFA) {
        this.vistaFA = vistaFA;
    }
}
