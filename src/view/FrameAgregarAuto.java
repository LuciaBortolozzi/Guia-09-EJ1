package view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import controller.Controlador;
import controller.FrameAgregarAutoCtrl;

public class FrameAgregarAuto extends JFrame{
	
	private JFrame ventana = new JFrame("Ingreso autos");
	private JTextArea textArea = new JTextArea("Complete con los datos del auto");
	private JLabel labelPatente = new JLabel("Patente");
	private JLabel labelAnioPatente = new JLabel("Anio patentamiento");
	private JTextField textPatente = new JTextField(20);
	private JTextField textAnioPatente = new JTextField(10);
	private JLabel labelPrecioAuto = new JLabel("Precio de compra");
	private JTextField textPrecioAuto = new JTextField(10);
	private JRadioButton radioButtonNafta = new JRadioButton("Nafta");
	private JRadioButton radioButtonDiesel = new JRadioButton("Diesel");
	private ButtonGroup groupCombustible = new ButtonGroup();
	private JCheckBox boxMultimedia = new JCheckBox("Dispositivo Multimedia");
	private JCheckBox boxAire = new JCheckBox("Aire Acondicionado");
	private JCheckBox boxGps = new JCheckBox("GPS");
	private JButton buttonAgregar = new JButton("Agregar");
	private JButton buttonLimpiar = new JButton("Limpiar");

	private final ArrayList<String> modelosST = Controlador.obtenerModelos();
	private JLabel labelModelo = new JLabel("Modelo");
	private JComboBox comboModelo; 
	
	public FrameAgregarAuto(FrameAgregarAutoCtrl controlador) {
		
		ventana.setSize(300,500);
		ventana.setLayout(new FlowLayout());
		
		buttonLimpiar.addActionListener(new ActionListener() 	
				{ public void actionPerformed(ActionEvent e) 
					{ limpiar(true); }} );
		
		buttonAgregar.addActionListener(controlador);

		//comboModelo = new JComboBox((ComboBoxModel) modelosST);
		comboModelo = new JComboBox(modelosST.toArray());
		comboModelo.setMaximumRowCount(10);

/*		ItemListener itemListener = new ItemListener() {

		      public void itemStateChanged(ItemEvent e){

		    	  if (comboModelo.getSelectedIndex()!=-1)
		    		  if (e.getStateChange() ==  ItemEvent.SELECTED) {
		    			  labelModelo.setText("Modelo: " + modelosST.get(comboModelo.getSelectedIndex()));
		    			  //labelModelo.setText("Modelo: " + comboModelo.getSelectedItem().toString());
		    		  }
		    	  }
		};
		comboModelo.addItemListener(itemListener);*/
		textArea.setEditable(false);
		ventana.add(textArea);
		ventana.add(labelPatente);
		ventana.add(textPatente);
		ventana.add(labelAnioPatente);
		ventana.add(textAnioPatente);
		ventana.add(labelPrecioAuto);
		ventana.add(textPrecioAuto);
		groupCombustible.add(radioButtonNafta);
		groupCombustible.add(radioButtonDiesel);
		ventana.add(radioButtonNafta);
		ventana.add(radioButtonDiesel);
		ventana.add(boxMultimedia);
		ventana.add(boxAire);
		ventana.add(boxGps);
		ventana.add(labelModelo);
		ventana.add(comboModelo);
		ventana.add(buttonAgregar);
		ventana.add(buttonLimpiar);
		ventana.setVisible(true);
	}
	
	public void limpiar(boolean conf){
		int rta=!(conf)?0:(JOptionPane.showConfirmDialog(null, "Los datos no fueron guardados. Confirma?", "Confirmacion", JOptionPane.YES_NO_OPTION));
		if (rta==JOptionPane.YES_OPTION){
			textPatente.setText("");
			textAnioPatente.setText("");
			textPrecioAuto.setText("");
			radioButtonNafta.setSelected(false);
			radioButtonDiesel.setSelected(true);
			boxMultimedia.setSelected(false);
			boxAire.setSelected(false);
			boxGps.setSelected(false);
		}
	}

	public JFrame getVentana() {
		return ventana;
	}

	public void setVentana(JFrame ventana) {
		this.ventana = ventana;
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}

	public JLabel getLabelPatente() {
		return labelPatente;
	}

	public void setLabelPatente(JLabel labelPatente) {
		this.labelPatente = labelPatente;
	}

	public JLabel getLabelAnioPatente() {
		return labelAnioPatente;
	}

	public void setLabelAnioPatente(JLabel labelAnioPatente) {
		this.labelAnioPatente = labelAnioPatente;
	}

	public JTextField getTextPatente() {
		return textPatente;
	}

	public void setTextPatente(JTextField textPatente) {
		this.textPatente = textPatente;
	}

	public JTextField getTextAnioPatente() {
		return textAnioPatente;
	}

	public void setTextAnioPatente(JTextField textAnioPatente) {
		this.textAnioPatente = textAnioPatente;
	}

	public JRadioButton getRadioButtonNafta() {
		return radioButtonNafta;
	}

	public void setRadioButtonNafta(JRadioButton radioButtonNafta) {
		this.radioButtonNafta = radioButtonNafta;
	}

	public JRadioButton getRadioButtonDiesel() {
		return radioButtonDiesel;
	}

	public void setRadioButtonDiesel(JRadioButton radioButtonDiesel) {
		this.radioButtonDiesel = radioButtonDiesel;
	}

	public ButtonGroup getGroupCombustible() {
		return groupCombustible;
	}

	public void setGroupCombustible(ButtonGroup groupCombustible) {
		this.groupCombustible = groupCombustible;
	}

	public JCheckBox getBoxMultimedia() {
		return boxMultimedia;
	}

	public void setBoxMultimedia(JCheckBox boxMultimedia) {
		this.boxMultimedia = boxMultimedia;
	}

	public JCheckBox getBoxAire() {
		return boxAire;
	}

	public void setBoxAire(JCheckBox boxAire) {
		this.boxAire = boxAire;
	}

	public JCheckBox getBoxGps() {
		return boxGps;
	}

	public void setBoxGps(JCheckBox boxGps) {
		this.boxGps = boxGps;
	}

	public JButton getButtonAgregar() {
		return buttonAgregar;
	}

	public void setButtonAgregar(JButton buttonAgregar) {
		this.buttonAgregar = buttonAgregar;
	}

	public JButton getButtonLimpiar() {
		return buttonLimpiar;
	}

	public void setButtonLimpiar(JButton buttonLimpiar) {
		this.buttonLimpiar = buttonLimpiar;
	}

	public JLabel getLabelPrecioAuto() {
		return labelPrecioAuto;
	}

	public void setLabelPrecioAuto(JLabel labelPrecioAuto) {
		this.labelPrecioAuto = labelPrecioAuto;
	}

	public JTextField getTextPrecioAuto() {
		return textPrecioAuto;
	}

	public void setTextPrecioAuto(JTextField textPrecioAuto) {
		this.textPrecioAuto = textPrecioAuto;
	}

	public JLabel getLabelModelo() {
		return labelModelo;
	}

	public void setLabelModelo(JLabel labelModelo) {
		this.labelModelo = labelModelo;
	}

	public JComboBox getComboModelo() {
		return comboModelo;
	}

	public void setComboModelo(JComboBox comboModelo) {
		this.comboModelo = comboModelo;
	}

	public ArrayList<String> getModelosST() {
		return modelosST;
	}
	
	
	
	
	
	
}
