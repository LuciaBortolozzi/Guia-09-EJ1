package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import controller.FrameAgregarAutoCtrl;
import controller.FrameMenuCtrl;

public class FrameMenu extends JFrame{
	
	private FrameMenuCtrl FMControlador;
	JMenuItem opcion1 = new JMenuItem("Auto");
	JMenuItem opcion2= new JMenuItem("Mantenimiento");
	JMenuItem opcion3= new JMenuItem("Info auto");
	
	public FrameMenu(FrameMenuCtrl FMControlador) {
		
		 this.FMControlador = FMControlador;
	     this.FMControlador.setFrameMenu(this);

	     this.setTitle("MENU PRINCIPAL");
		
		JMenu solapaAgregar = new JMenu("Agregar");
		opcion1.addActionListener(FMControlador);
		opcion2.addActionListener(FMControlador);

		solapaAgregar.add(opcion1);
		solapaAgregar.add(opcion2);
		
		JMenu solapaInfoAuto = new JMenu("Informacion");
		opcion3.addActionListener(FMControlador);
	
		solapaInfoAuto.add(opcion3);
		
		JMenuBar barraMenu = new JMenuBar();
		setJMenuBar(barraMenu);
		barraMenu.add(solapaAgregar);
		barraMenu.add(solapaInfoAuto);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,200);
		setVisible(true);

	}
	
	 public JMenuItem getOpcion1() {
	    return opcion1;
	   }

    public JMenuItem getOpcion2() {
        return opcion2;
    }
	

}
