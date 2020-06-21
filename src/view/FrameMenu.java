package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import controller.FrameAgregarAutoCtrl;

public class FrameMenu extends JFrame{
	
	FrameAgregarAutoCtrl fp = new FrameAgregarAutoCtrl();
	
	public FrameMenu() {
		
		super("MENU PRINCIPAL");
		
		JMenu solapaAgregar = new JMenu("Agregar");
		JMenuItem auto = new JMenuItem("Auto");
		JMenuItem mantenimiento = new JMenuItem("Mantenimiento");
		
		solapaAgregar.addActionListener(new ActionListener() 
			{public void actionPerformed (ActionEvent event)
				{new FrameAgregarAuto(fp); }});
		solapaAgregar.add(auto);
		
		/*solapaAgregar.addActionListener(new ActionListener() 
		{public void actionPerformed (ActionEvent event)
			{new FramePrincipalController(); }});*/
		solapaAgregar.add(mantenimiento);
		
		JMenu solapaInfoAuto = new JMenu("Informacion");
		JMenuItem infoAuto = new JMenuItem("Auto");
		/*solapaAgregar.addActionListener(new ActionListener() 
		{public void actionPerformed (ActionEvent event)
			{new FramePrincipalController(); }});*/
		solapaInfoAuto.add(infoAuto);
		
		JMenuBar barraMenu = new JMenuBar();
		setJMenuBar(barraMenu);
		barraMenu.add(solapaAgregar);
		barraMenu.add(solapaInfoAuto);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,200);
		setVisible(true);

	}
	
	

}
