package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.FrameMostrarDataAuto;

public class FrameMostrarDataAutoCtrl implements ActionListener{
	
    private FrameMostrarDataAuto vistaDataAuto;

    public FrameMostrarDataAutoCtrl() {
    	vistaDataAuto = new FrameMostrarDataAuto(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {



    }

    public void setVista(FrameMostrarDataAuto vistaDataAuto) {
        this.vistaDataAuto = vistaDataAuto;
    }
	

}
